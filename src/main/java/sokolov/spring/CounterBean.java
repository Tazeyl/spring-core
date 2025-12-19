package sokolov.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CounterBean {

    private int count = 0;

    public int getCount(){
        return count;
    }

    public void increment(){
        count++;
    }
}
