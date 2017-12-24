
import in.com.emlak.config.SpringRootConfig;
import in.com.emlak.domain.Emlak;
import in.com.emlak.service.EmlakService;
import java.util.List;
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
public class emlakServiceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        EmlakService service = ctx.getBean(EmlakService.class);
        
        List<Emlak> list = service.konumArama();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getKonum());
            System.out.println(list.get(i).getAciklama());
            
        }
            
        
    }
    
}
