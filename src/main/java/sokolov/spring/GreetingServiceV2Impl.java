package sokolov.spring;

import org.springframework.stereotype.Component;

@Component

public class GreetingServiceV2Impl implements GreetingService{

    @Override
    public String sayHello() {
        return "Hello v2, Spring!";

    }
}
