package com.cgi.paris.fs.comex.white.fitnesse.fixture;

import com.cgi.paris.fs.comex.white.core.bean.Greeting;
import com.cgi.paris.fs.comex.white.core.service.GreetingService;
import fit.ColumnFixture;

public class GreetsWithHello extends ColumnFixture {

    private final GreetingService greetingService = FitnesseSpring.getBean(GreetingService.class);

    private String name;

    private Greeting greeting;

    @Override
    protected void executeIfNeeded() {
        this.greeting = this.greetingService.hello(this.name);
    }

    public String message() {
        return this.greeting.getMessage();
    }

}
