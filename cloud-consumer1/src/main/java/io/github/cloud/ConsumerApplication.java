package io.github.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@RestController
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class);
    }

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/index")
    public String index() {
        return restTemplate.getForObject("http://localhost:9999/index",String.class);
        //return "index";
    }
}
