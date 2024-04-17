package info.thedreamweb.nuts;

import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class NutsController {
    @GetMapping("user")
    public String user(Principal principal) { // @RequestParam String param
        return new String("User is");
    }

    @GetMapping("login")
    public String login() {
        return new String("click to login");
    }

}
