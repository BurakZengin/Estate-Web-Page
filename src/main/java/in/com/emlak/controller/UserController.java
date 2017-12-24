/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.com.emlak.controller;

import in.com.emlak.command.AramaCommand;
import in.com.emlak.domain.Emlak;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import in.com.emlak.service.EmlakService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ELIDOR
 */
@Controller
public class UserController {

    @Autowired
    private EmlakService emlakService;

    @RequestMapping(value = {"/", "/HouseForSale"})
    public String HouseForSale(Model m) {
        m.addAttribute("command", new AramaCommand());
        return "HouseForSale"; //JSP - /WEB-INF/view/index.jsp
    }
    
    @RequestMapping(value = { "/RentalHome"})
    public String RentalHome(Model m) {
        m.addAttribute("command", new AramaCommand());
        return "RentalHome"; //JSP - /WEB-INF/view/index.jsp
    }

    @RequestMapping(value = "/Homes")
    public String Homes(@RequestParam String Type, AramaCommand cmd, Model m) {
        m.addAttribute("homeList", emlakService.arama(Type, cmd.getBolge(), cmd.getKonum()));
        return "Homes";
    }

    @RequestMapping(value = {"/HomeDetail/{evlerId}"})
    public String HomeDetail(Model m, @PathVariable("evlerId") int evlerId) {
        m.addAttribute("homeDetail", emlakService.findByAttribute("" + evlerId));
        return "HomeDetail";
    }

    @RequestMapping(value = {"/About"})
    public String About() {
        return "About";
    }

    @ModelAttribute("konum")
    public List<String> Konum() {
        List<String> liste = new ArrayList<>();
        List<Emlak> list = emlakService.konumArama();
        for (int i = 0; i < list.size(); i++) {
            if (!liste.contains(list.get(i).getKonum())) {
                liste.add(list.get(i).getKonum());
            }
        }
        return liste;
    }
}
