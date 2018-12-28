package de.developerpat.springknative;

import java.util.function.Function;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringknativeApplication {

  @Bean
  public Function<String, String> hello(){
    return value -> new StringBuilder("Hello " + value).toString();
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringknativeApplication.class, args);
  }

}
