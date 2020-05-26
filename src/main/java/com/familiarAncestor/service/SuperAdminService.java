package com.familiarAncestor.service;

import com.familiarAncestor.entity.SuperAdmin;
import com.familiarAncestor.repository.SuperAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperAdminService {

    @Autowired
    private SuperAdminRepository superAdminRepository;

    public List<SuperAdmin> getAllSuperAdmin(){
        return superAdminRepository.findAll();
    }

    public SuperAdmin SaveSuperAdmin(SuperAdmin superAdmin){
        return superAdminRepository.save(superAdmin);
    }
}
