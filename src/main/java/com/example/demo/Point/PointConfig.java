package com.example.demo.Point;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PointConfig {
    @Bean
    CommandLineRunner commandLineRunner(PointRepository pointRepository){
        return args -> {
            var p = new Point(0L,1L,2L);
            pointRepository.save(p);
        };
    }
}
