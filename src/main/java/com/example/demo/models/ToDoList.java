package com.example.demo.models;
import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name= "TO_DO_LIST")
@Data
public class ToDoList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @Column
    private boolean done;

    public ToDoList(){

    }
    public ToDoList(int id,String name,boolean done){
        this.setId(id);
        this.setName(name);
        this.setDone(done);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
