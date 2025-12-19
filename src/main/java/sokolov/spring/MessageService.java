package sokolov.spring;

import org.springframework.stereotype.Component;

@Component
public class MessageService {
    public void getMessage(){
        System.out.println("Привет из MessageService!");
    }
}
