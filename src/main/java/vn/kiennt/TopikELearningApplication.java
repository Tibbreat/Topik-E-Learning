package vn.kiennt;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TopikELearningApplication {

    @Value("${jwt.secretKey}")
    public String jwtSecret;

    public static void main(String[] args) {
        SpringApplication.run(TopikELearningApplication.class, args);
    }

    @PostConstruct
    public void init() {
        System.out.println(jwtSecret);
    }
}
