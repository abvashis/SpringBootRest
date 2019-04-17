package hello;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class EnglishGreetingService implements GreetingService {

    @Override
    public String greet() {
        return "Hello World!";
    }
}

