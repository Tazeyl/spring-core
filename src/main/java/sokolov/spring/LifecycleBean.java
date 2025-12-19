package sokolov.spring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LifecycleBean {

    @PostConstruct
    public void init(){
        System.out.println("Бин инициализирован");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Бин уничтожен");
    }
}
