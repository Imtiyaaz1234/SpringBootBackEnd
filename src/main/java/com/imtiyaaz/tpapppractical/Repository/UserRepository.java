package com.imtiyaaz.tpapppractical.Repository;

import com.imtiyaaz.tpapppractical.Domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Imtiyaaz on 14 Aug 2017.
 */
@Repository
public interface UserRepository extends CrudRepository <User, Integer> {//extends JpaRepository<User, Integer> {
    //User findByEmployeeUsername(String employeeUsername);
   /* User create(User user);
    User read(String employeeUsername);
    User update(User user);
    void delete(String employeeUsername);

    */
   User findByEmployeeUsername(String employeeUsername);
}
