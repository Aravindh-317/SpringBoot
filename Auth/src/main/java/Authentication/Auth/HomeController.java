package Authentication.Auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome Everyone";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Welcome Admin";
    }

}

