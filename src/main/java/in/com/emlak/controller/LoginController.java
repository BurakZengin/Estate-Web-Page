/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.com.emlak.controller;

import in.com.emlak.command.EmlakCommand;
import in.com.emlak.command.LoginCommand;
import in.com.emlak.domain.Emlak;
import in.com.emlak.domain.User;
import in.com.emlak.service.UserService;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ELIDOR
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/Login"})
    public String Login(Model m) {
        m.addAttribute("command", new LoginCommand());
        return "Login";
    }

    @RequestMapping(value = {"/loginn"}, method = RequestMethod.POST)
    public String AdminPane(@ModelAttribute("command") LoginCommand cmd, Model m) {
        User loggedInUser = userService.login(cmd.getUsername(), cmd.getPassword());
        if (loggedInUser != null) {
            return "redirect:emlak/AdminPane";

        } else {
            return "Login";
        }
    }

    @RequestMapping(value = {"/AdminPane"})
    public String HomeDetail(@ModelAttribute("command") EmlakCommand cmd, Model m) {
        m.addAttribute("adresList", userService.konumAramaString());
        return "AdminPane";
    }

    @RequestMapping(value = "/SaveHome")
    public String SaveAd(EmlakCommand ecmd) {
        Emlak emlak = ecmd.getEmlak();
        userService.register(emlak);
        return "redirect:AdminPane";
    }

    @RequestMapping(value = "/Set/{evlerId}")
    public String SetHome(@RequestParam String Type, @ModelAttribute("command") Emlak e, @PathVariable("evlerId") int evlerId) throws FileNotFoundException, IOException {
        e.setEvlerId(evlerId);
        if (Type.equals("Delete")) {
            //byte[] array = Files.readAllBytes(Paths.get("C:\\Users\\ELIDOR\\Desktop\\" + file.getOriginalFilename() + ""));
            //e.setPhoto(array);
            userService.update(e);

        } else {
            userService.Delete(e);
        }
        return "redirect:../AdminPane";
    }

    @RequestMapping(value = {"/SetHome/{evlerId}"})
    public String HomeDetail(Model m, @PathVariable("evlerId") int evlerId) {
        Emlak e = userService.findByAttribute("" + evlerId);
        m.addAttribute("command", e);
        return "SetHome";
    }
}
