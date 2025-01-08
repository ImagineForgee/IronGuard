package com.github.ImagineForgee.Backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendController {

    @GetMapping("/api/data")
    public String getData() {
        return "Hello from the Backend!";
    }
}
