package com.himanshubhatt;


import com.himanshubhatt.customer.Customer;
import com.himanshubhatt.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner runner(CustomerRepository customerRepository){
        return args -> {
            Customer alex = new Customer(
                    "Alex",
                    "alex@gmail.com",
                    21

            );

            Customer Bob = new Customer(
                    "Bob",
                    "bob@gmail.com",
                    23

            );

            List <Customer> customerList = List.of(alex, Bob);

            customerRepository.saveAll(customerList);
        };
    }
}
