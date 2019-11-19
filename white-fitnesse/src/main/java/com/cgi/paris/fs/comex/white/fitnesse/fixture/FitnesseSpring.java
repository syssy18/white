package com.cgi.paris.fs.comex.white.fitnesse.fixture;

import com.cgi.paris.fs.comex.white.fitnesse.spring.FitnesseConfiguration;
import fitlibrary.DoFixture;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class FitnesseSpring extends DoFixture {

    private static ConfigurableApplicationContext context;

    public static <T> T getBean(final Class<T> clazz) {
        return context.getBean(clazz);
    }

    public synchronized void run() {
        if (context == null) {
            context = SpringApplication.run(FitnesseConfiguration.class, this.args);
        }
    }

    public synchronized void close() {
        if (context != null) {
            context.close();
            context = null;
        }
    }

}
