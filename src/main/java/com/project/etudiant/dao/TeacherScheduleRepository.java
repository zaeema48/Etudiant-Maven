package com.project.etudiant.dao;

import com.project.etudiant.entities.ScheduleEntity;
import com.project.etudiant.entities.TeacherScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherScheduleRepository extends JpaRepository<TeacherScheduleEntity, Integer> {
    @Query(value = "SELECT * FROM teacher_schedule WHERE teacher_id=:teacherId AND day=:day", nativeQuery = true)
    public TeacherScheduleEntity findByBatchIdAndDay(@Param("teacherId")int teacher_id, @Param("day") String day);
}
