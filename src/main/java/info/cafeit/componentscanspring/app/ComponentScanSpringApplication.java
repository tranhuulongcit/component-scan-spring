package info.cafeit.componentscanspring.app;

import info.cafeit.componentscanspring.bean.MariaOzawa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//multi scan package
//@SpringBootApplication(scanBasePackages = {"info.cafeit.componentscanspring.bean", "info.cafeit.componentscanspring.app"})
//scan base package
//@SpringBootApplication(scanBasePackages = {"info.cafeit.componentscanspring"})
//default
@SpringBootApplication
public class ComponentScanSpringApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ComponentScanSpringApplication.class, args);
        try {
            MariaOzawa maria = ctx.getBean(MariaOzawa.class);
            System.out.println("Instance: " + maria.toString());
        } catch (Exception e) {
            System.out.println("Instance Maria không tồn tại");
        }

        try {
            Minami minami = ctx.getBean(Minami.class);
            System.out.println("Instance: " + minami.toString());
        } catch (Exception e) {
            System.out.println("Instance Minami không tồn tại");
        }
    }
}
