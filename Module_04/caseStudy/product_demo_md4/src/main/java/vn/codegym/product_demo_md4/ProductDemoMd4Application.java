package vn.codegym.product_demo_md4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import vn.codegym.product_demo_md4.formatter.LocalDateFormatter;

@SpringBootApplication
public class ProductDemoMd4Application {

    public static void main(String[] args) {
        SpringApplication.run(ProductDemoMd4Application.class, args);
    }
    @Configuration
    static class MyConfig extends WebMvcConfigurerAdapter {
        @Override
        public void addFormatters(FormatterRegistry registry) {
            registry.addFormatter(new LocalDateFormatter("yyyy-MM-dd"));
        }
    }

}
