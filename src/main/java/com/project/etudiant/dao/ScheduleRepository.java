package com.project.etudiant.dao;

import com.project.etudiant.entities.ScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends JpaRepository<ScheduleEntity,String > {
    public ScheduleEntity findByScheduleId(String schedule_id);
}
