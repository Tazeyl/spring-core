package sokolov.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Main.class, args);
        PaymentService paymentService = context.getBean(PaymentService.class);

        paymentService.processPayment(1500);
        System.out.println(paymentService.checkStatus());

        // Искусственно вызовем ошибку
        try {
            paymentService.processPayment(-500);
        } catch (Exception ignored) {}

    }
}