package vaadin.com.crudvaadinui;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByfirstNameStartsWithIgnoreCase(String firstName);
}