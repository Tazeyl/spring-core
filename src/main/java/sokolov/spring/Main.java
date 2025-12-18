package sokolov.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("sokolov.spring");
       // MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);

        //messagePrinter.printMessage();

        GreetingPrinter greetingPrinter = context.getBean(GreetingPrinter.class);
        greetingPrinter.printHello();

    }
}