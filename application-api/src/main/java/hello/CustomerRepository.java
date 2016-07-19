package hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

// <type of entity, id>
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    /*
    By extending CrudRepository, CustomerRepository inherits several methods
    for working with Customer persistence, including methods for saving, deleting,
    and finding Customer entities.
     */

    //works because of pojo has getters and setters
    List<Customer> findByLastName(String lastName);
}