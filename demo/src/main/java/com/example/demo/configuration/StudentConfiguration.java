package com.example.demo.configuration;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.JANUARY;
import static java.util.Calendar.MAY;

@Configuration
public class StudentConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository){
        return args -> {
            Student masha = new Student(
                    "Masha",
                    "mashkaMishkina@les.com",
                    LocalDate.of(2020, JANUARY,5),
                    21
            );

            Student misha = new Student(
                    "Misha",
                    "misha@les.com",
                    LocalDate.of(2010, MAY,4),
                    25
            );

            studentRepository.saveAll(
                    List.of(masha, misha)
            );
        };
    }

}
