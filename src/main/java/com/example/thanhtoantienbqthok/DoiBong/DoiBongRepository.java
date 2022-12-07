package com.example.thanhtoantienbqthok.DoiBong;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoiBongRepository extends CrudRepository<DoiBong, Integer> {

    @Query(
            value = "SELECT * FROM tbldoibong", nativeQuery = true)
    List<DoiBong> getAllDoiBong();

    @Query(
            value = "SELECT * FROM tbldoibong WHERE id = 1",
            nativeQuery = true)
    DoiBong test();
//    TypedQuery<Department> query
//            = entityManager.createQuery(
//            "SELECT d FROM Employee e, Department d WHERE e.department = d", Department.class);
//    List<Department> resultList = query.getResultList();
}
