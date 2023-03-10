package com.project.etudiant.dao;

import com.project.etudiant.entities.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, String> {
    public AdminEntity findByAdminIdAndPassword(String adminId, String password);
}
