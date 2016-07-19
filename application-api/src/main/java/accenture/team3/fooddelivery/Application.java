package accenture.team3.fooddelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("Thyme greeting 1:\thttp://localhost:8080/thymegreeting");
        System.out.println("Thyme greeting 2 :\thttp://localhost:8080/thymegreeting?name=Ivan&surname=Ivanov");
    }

}