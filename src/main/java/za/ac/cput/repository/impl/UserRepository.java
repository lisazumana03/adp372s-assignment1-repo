package za.ac.cput.repository.impl;
// User UserRepository  class
//Author: Bonga Velem (220052379)
//Date: 28 March 2025
import za.ac.cput.domain.User;
import za.ac.cput.repository.IRepository;

import java.util.List;

public interface UserRepository extends IRepository<User, Integer> {
    List<User> getAll();
}
