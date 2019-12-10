package com.cgi.paris.fs.comex.white.core.service;

import com.cgi.paris.fs.comex.white.core.bean.Greeting;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    public Greeting hello(final String name) {
        final Greeting greeting = new Greeting();
        greeting.setName(name);
        this.hello(greeting);
        return greeting;
    }

    public void hello(final Greeting greeting) {
        greeting.setMessage("Hello " + greeting.getName());
    }

}
