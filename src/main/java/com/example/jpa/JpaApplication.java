package com.example.jpa;

import com.example.jpa.service.restaurantService.RestaurantQueryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }
    @Bean
    public CommandLineRunner run(ApplicationContext context) {
        return args -> {
            RestaurantQueryService storeService = context.getBean(RestaurantQueryService.class);

            // 파라미터 값 설정
            String name = "요아정";
            Double score = 4.0d;

            // 쿼리 메서드 호출 및 쿼리 문자열과 파라미터 출력
            System.out.println("Executing findStoresByNameAndScore with parameters:");
            System.out.println("Name: " + name);
            System.out.println("Score: " + score);

            storeService.findStoresByNameAndScore(name, score)
                    .forEach(System.out::println);
        };
    }
}
