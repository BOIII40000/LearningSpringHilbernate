package de.oette.course.H03;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * curl -XPOST localhost:8080/trigger-event
 */
@RestController
public class H03Controller {

    @PostMapping("/trigger-event")
    public void triggerEvent() {

    }
}
