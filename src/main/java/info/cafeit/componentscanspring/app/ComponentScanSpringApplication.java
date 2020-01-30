package info.cafeit.componentscanspring.app;

import info.cafeit.componentscanspring.bean.MariaOzawa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//multi scan package
//@SpringBootApplication(scanBasePackages = {"info.cafeit.componentscanspring.bean", "info.cafeit.componentscanspring.app"})
//scan package chưa tất cả component
@SpringBootApplication(scanBasePackages = {"info.cafeit.componentscanspring"})
public class ComponentScanSpringApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ComponentScanSpringApplication.class, args);
        try {
            MariaOzawa maria = ctx.getBean(MariaOzawa.class);
            System.out.println("Instance: " + maria.toString());
        } catch (Exception e) {
            System.out.println("Instance maria không tồn tại");
        }

        try {
            NgocTrinh ngoctrinh = ctx.getBean(NgocTrinh.class);
            System.out.println("Instance: " + ngoctrinh.toString());
        } catch (Exception e) {
            System.out.println("Instance NgocTrinh không tồn tại");
        }

    }

}
