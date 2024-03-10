package com.example.demo;

import com.example.demo.entities.Patient;
import com.example.demo.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
   private PatientRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Patient patient = new Patient(null, "Hassan", 25, true, null);
        productRepository.save(patient);
        productRepository.findAll().forEach(p -> {
            System.out.println(p.getName());
        });
    }
}
