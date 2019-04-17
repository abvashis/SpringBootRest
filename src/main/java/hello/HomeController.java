package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

	@Autowired
	GreetingService greetingService;

	@RequestMapping("/greet")
	public String home() {
		return greetingService.greet();
	}
    

    @RequestMapping("/hello")
    public String home2() {
        return "Hello";
    }
}
