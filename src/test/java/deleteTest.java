
import in.com.emlak.config.SpringRootConfig;
import in.com.emlak.dao.EmlakDAO;
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
public class deleteTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        EmlakDAO emlakDAO = ctx.getBean(EmlakDAO.class);
        
        emlakDAO.delete(4);
        
        System.out.println("------- Delete ---------");
    }
    
}
