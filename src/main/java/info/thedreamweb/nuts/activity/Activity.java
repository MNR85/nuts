package info.thedreamweb.nuts.activity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController("/activity")
public class Activity {
    @GetMapping()
    public String getActivities() {
        return "this is activitie";
    }
}
