package fr.emiage.agence.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("pages/mnuAgence");
        registry.addViewController("/pages/mnuAgence").setViewName("pages/mnuAgence");
        registry.addViewController("/pages/login").setViewName("pages/login");
        registry.addViewController("/pages/users").setViewName("pages/users");
        registry.addViewController("/pages/userform").setViewName("pages/userform");
        registry.addViewController("/pages/usershow").setViewName("pages/usershow");
    }

}