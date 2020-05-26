package com.familiarAncestor.repository;

import com.familiarAncestor.entity.SuperAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperAdminRepository extends JpaRepository<SuperAdmin, Long> {

}
