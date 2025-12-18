package sokolov.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("sokolov.spring");

        CounterBean bean1 = context.getBean(CounterBean.class);
        CounterBean bean2 = context.getBean(CounterBean.class);

        System.out.println(bean1==bean2);

    }
}