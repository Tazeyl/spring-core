package sokolov.spring;

import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService{

    @Override
    public String sayHello() {
        return "Hello, Spring!";

    }
}
