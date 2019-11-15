package com.cgi.paris.fs.comex.white.application.spring;

import com.cgi.paris.fs.comex.white.core.spring.CoreConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        CoreConfiguration.class,
})
@ComponentScan({
        "com.cgi.paris.fs.comex.white.application.web"
})
public class ApplicationConfiguration {
}
