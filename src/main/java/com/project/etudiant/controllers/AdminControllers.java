package com.project.etudiant.controllers;

import com.project.etudiant.entities.BatchEntity;
import com.project.etudiant.entities.NotificationEntity;
import com.project.etudiant.entities.ScheduleEntity;
import com.project.etudiant.entities.TeacherEntity;
import com.project.etudiant.services.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminControllers {
    @Autowired
    AdminServices adminServices;
    @PostMapping("/add_batch")
    public void addBatch(@RequestBody BatchEntity batch){
    adminServices.addBatch(batch);
    }

    @GetMapping("/get_batches")
    public List<BatchEntity> getBatches(){
        return adminServices.getBatches();
    }

    @GetMapping("/search_batch")
    public BatchEntity searchBatch(@RequestParam String id){
        return adminServices.searchBatch(id);
    }

    @PostMapping("/add_notification")
    public void addNotification(@RequestBody NotificationEntity notification){
        adminServices.addNotification(notification);
    }

    @GetMapping("/search_notification")
    public NotificationEntity searchNotification(@RequestParam String title){
        return adminServices.searchNotification(title);
    }

    @GetMapping("/all_notifications")
    public List<NotificationEntity> allNotifications(){
        return adminServices.showAllNotifications();
    }

    @PostMapping("/add_schedule")
    public void addSchedule(@RequestBody ScheduleEntity schedule){
        adminServices.addSchedules(schedule);}
    @PutMapping("/update_schedule")
    public void updateSchedule(@RequestBody ScheduleEntity schedule){
        adminServices.updateSchedule(schedule);
    }

    @PostMapping("/add_teacher")
    public void addNewTeacher(@RequestBody TeacherEntity teacher){
        adminServices.addTeacher(teacher);
    }

    @GetMapping("/get_teacher")
    public List<TeacherEntity> getTeacher(){
            return adminServices.getAllTeacher();
    }
}
