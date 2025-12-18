package sokolov.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreetingPrinter {


    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    //    public GreetingPrinter(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }

    public void printHello(){
        System.out.println(greetingService.sayHello());
    }
}
