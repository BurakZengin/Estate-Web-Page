
import in.com.emlak.config.SpringRootConfig;
import in.com.emlak.dao.EmlakDAO;
import in.com.emlak.domain.Emlak;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ELIDOR
 */
public class updateTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        EmlakDAO emlakDAO = ctx.getBean(EmlakDAO.class);
        
        Emlak e=new Emlak();
        e.setEvlerId(3);
        e.setKonum("Izmir");
        e.setFiyat("2000");
        e.setTip("Kiralik");
        
        emlakDAO.update(e);
        System.out.println("--------Data Updated------");
        
    }

}
