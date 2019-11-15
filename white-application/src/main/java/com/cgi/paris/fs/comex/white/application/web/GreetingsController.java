package com.cgi.paris.fs.comex.white.application.web;

import com.cgi.paris.fs.comex.white.core.bean.Greeting;
import com.cgi.paris.fs.comex.white.core.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/greetings")
public class GreetingsController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/{name}")
    public ResponseEntity<Greeting> hello(@PathVariable final String name) {
        return ResponseEntity.ok(this.greetingService.hello(name));
    }

    @PostMapping
    public ResponseEntity<Greeting> hello(@RequestBody final Greeting greeting) {
        this.greetingService.hello(greeting);
        return ResponseEntity.ok(greeting);
    }

}
