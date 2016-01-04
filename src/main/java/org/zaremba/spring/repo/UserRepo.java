package org.zaremba.spring.repo;

import org.springframework.data.repository.CrudRepository;
import org.zaremba.spring.entities.User;

/**
 * @author Gorkhover D.
 * @since 2016-01-25
 */
public interface UserRepo extends CrudRepository<User, Integer> {
}
