package sokolov.spring;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public void processPayment(double amount) {
        System.out.println("Обработка платежа на сумму: " + amount + "₽");
        if (amount < 0) {
            throw new IllegalArgumentException("Сумма не может быть отрицательной");
        }
    }

    public String checkStatus() {
        return "Платёж успешно обработан";
    }
}
