package com.example.demo.controller;

import com.example.demo.protobuf.role.RoleProtoBuffer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("role")
public class RoleController {
    @GetMapping
    public RoleProtoBuffer.RoleResponse index(RoleProtoBuffer.RoleRequest request) {
        return RoleProtoBuffer.RoleResponse.newBuilder().setName(request.getName()).build();
    }
}
