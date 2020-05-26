package com.familiarAncestor.controller;

import com.familiarAncestor.entity.SuperAdmin;
import com.familiarAncestor.service.SuperAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SuperAdminController {

    @Autowired
    private SuperAdminService superAdminService;

    @PostMapping("/super-admin/register")
    public SuperAdmin registerSuperAdmin(@RequestBody SuperAdmin superAdmin) {
        return this.superAdminService.SaveSuperAdmin(superAdmin);
    }

    @GetMapping("/super-admin/list")
    public List<SuperAdmin> getAllSuperAdmin() {
        return superAdminService.getAllSuperAdmin();
    }
}
