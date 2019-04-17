package hello;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class FrenchGreetingService  implements GreetingService {

    @Override
    public String greet() {
    	System.out.println("Bonjour Monde!");
        return "Bonjour Monde!";
    }
}

