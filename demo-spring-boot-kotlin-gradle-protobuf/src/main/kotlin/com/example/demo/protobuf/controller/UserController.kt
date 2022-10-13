package com.example.demo.protobuf.controller

import com.example.demo.protobuf.entity.User
import com.example.demo.protobuf.entity.User.AddressBook
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("user")
class UserController {
    @GetMapping(produces = ["application/x-protobuf"])
    fun get(): AddressBook {
        return AddressBook.newBuilder()
            .addPeople(User.Person.newBuilder().addPhones(User.Person.PhoneNumber.newBuilder().setNumber("1111")))
            .build()
    }
}