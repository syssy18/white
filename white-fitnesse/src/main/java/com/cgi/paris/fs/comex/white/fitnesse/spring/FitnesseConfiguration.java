package com.cgi.paris.fs.comex.white.fitnesse.spring;

import com.cgi.paris.fs.comex.white.core.spring.CoreConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
        CoreConfiguration.class
})
public class FitnesseConfiguration {

}
