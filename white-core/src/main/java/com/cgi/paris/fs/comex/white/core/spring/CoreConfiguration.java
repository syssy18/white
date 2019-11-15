package com.cgi.paris.fs.comex.white.core.spring;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan({
        "com.cgi.paris.fs.comex.white.core.service",
})
@EnableJpaRepositories({
        "com.cgi.paris.fs.comex.white.core.jpa.repository"
})
@EntityScan({
        "com.cgi.paris.fs.comex.white.core.jpa.entity"
})
public class CoreConfiguration {
}
