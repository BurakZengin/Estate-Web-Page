
import in.com.emlak.config.SpringRootConfig;
import in.com.emlak.domain.Emlak;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.com.emlak.dao.EmlakDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ELIDOR
 */
public class aramaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        EmlakDAO emlakDAO = ctx.getBean(EmlakDAO.class);
        //TODO: the user details will be taken from User-Reg-Form
        Emlak e = new Emlak();
        e.setKonum("Istanbul");
        e.setFiyat("1000");
        e.setTip("Kiralik");

        emlakDAO.save(e);
        System.out.println("--------Data Saved------");
    }

}
