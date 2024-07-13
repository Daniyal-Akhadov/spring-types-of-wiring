package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Duck5 {

    private final Egg6 egg6;

    public Duck5(Egg6 egg) {
        this.egg6 = egg;
    }

    @Override
    public String toString() {
        return ", в утке яйцо " + egg6;
    }
}
