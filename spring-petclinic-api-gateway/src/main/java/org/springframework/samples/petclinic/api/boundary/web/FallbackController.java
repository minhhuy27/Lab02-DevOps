package org.springframework.samples.petclinic.api.boundary.web;

import org.apache.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @RequestMapping(path = "/fallback", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<String> fallback() {
        return ResponseEntity.status(HttpStatus.SC_SERVICE_UNAVAILABLE)
                .body("Chat is currently unavailable. Please try again later.");
    }
}
