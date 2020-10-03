package payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log=LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository, OrderRepository orderRepository){
        return args -> {
            log.info("Preloading "+repository.save(new Employee("naveen","lastname", "student")));
            log.info("Preloading "+repository.save(new Employee("sundar","lastname", "teacher")));
            
            orderRepository.save(new Order("Macbook pro",Status.COMPLETED));
            orderRepository.save(new Order("iPhone",Status.IN_PROGRESS));
            orderRepository.findAll().forEach(order->{
                log.info("Preloading "+order);
            });
        };
    }
}
