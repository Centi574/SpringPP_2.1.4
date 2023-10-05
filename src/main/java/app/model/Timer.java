package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Timer {

    public static Timer timer = new Timer();

    private Timer() {

    }
    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
