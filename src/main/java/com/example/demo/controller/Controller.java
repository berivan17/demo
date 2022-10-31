package com.example.demo.controller;
import com.example.demo.requestDto.SaveDtoToDo;
import com.example.demo.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/list")
public class Controller {

    @Autowired
    private Services services;


    @PostMapping("/saveToDo")
    @ResponseStatus(HttpStatus.CREATED)
    public String saveToDo(@RequestBody SaveDtoToDo saveToToDoList) {
        return this.services.saveToDo(saveToToDoList);
    }






}
