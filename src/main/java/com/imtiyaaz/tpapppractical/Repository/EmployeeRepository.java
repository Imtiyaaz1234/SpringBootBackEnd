package com.imtiyaaz.tpapppractical.Repository;

import com.imtiyaaz.tpapppractical.Domain.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Imtiyaaz on 14 Aug 2017.
 */
@Repository
public interface EmployeeRepository extends CrudRepository <Employee, Integer>{ //extends JpaRepository<Employee, Integer> {

    //Employee findByEmployeeCnp(String employeeCnp);
    //Employee findByEmployeeName(String employeeName);
/*    Employee create(Employee employee);
    Employee read(String employeeName);
    Employee update(Employee employee);
    void delete(String employeeName);

    */
    Employee findByEmployeeCnp(String employeeCnp);
    Employee findByEmployeeName(String employeeName);
}
