package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.models.ToDoList;


import java.util.List;

@Repository
public interface ListRepo extends JpaRepository<ToDoList,Integer> {

    List<ToDoList> findAllByName(String name);

    List<ToDoList> findById(int id) ;

}
