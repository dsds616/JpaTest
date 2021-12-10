package com.test.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@SpringBootApplication
@ComponentScan(basePackages = {"com.test"},
        excludeFilters = {
                @ComponentScan.Filter(value = Repository.class, type = FilterType.ANNOTATION),
                @ComponentScan.Filter(value = Entity.class, type = FilterType.ANNOTATION)
        }
)
@EntityScan(basePackages = {"com.test"})
@EnableJpaRepositories(basePackages = {"com.test.domain"}) //확장된 JPA 구현체를 등록한다.
public class TestApplication {

    @PersistenceContext
    EntityManager entityManager;

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
