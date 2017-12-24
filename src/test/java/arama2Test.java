
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
public class arama2Test {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        EmlakService emlakService = ctx.getBean(EmlakService.class);
        
        List<Emlak> list = emlakService.arama("Satılık", "Karşıyaka", "İzmir");
        System.out.println(list.get(0).getAdres());
        System.out.println("----- Başarılı ----");
        
    }

}
