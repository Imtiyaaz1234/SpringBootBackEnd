package com.imtiyaaz.tpapppractical.Repository;

import com.imtiyaaz.tpapppractical.Domain.Operations;
import com.imtiyaaz.tpapppractical.Domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Imtiyaaz on 14 Aug 2017.
 */
@Repository
public interface OperationsRepository extends CrudRepository <Operations, String> {//extends JpaRepository<Operations, java.security.Timestamp> {
    //Operations findByOperationName(String operationName);
    //List<Operations> findByUser(User user);
    /*Operations create(Operations operations);
    Operations read(String operationName);
    Operations update(Operations operations);
    void delete(String operationName);

    */
    Operations findByOperationName(String operationName);
    List<Operations> findByUser(User user);
}

