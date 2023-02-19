package com.project.etudiant.controllers;

import com.project.etudiant.entities.*;
import com.project.etudiant.services.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminControllers {
    @Autowired
    AdminServices adminServices;

    @PostMapping("/add_admin")
    public void adding_admin(@RequestBody AdminEntity admin){
        adminServices.addAdmin(admin);
    }

    @GetMapping("/admin_login")
    public void check_admin_login(@RequestParam String adminId, @RequestParam String password){
        adminServices.adminLogin(adminId, password);
    }
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

    @DeleteMapping("/remove_teacher")
    public void removing_teacher(@RequestParam int teacherId){
        adminServices.removeTeacher(teacherId);
    }

    @PutMapping("/update_salary")
    public void updating_teacher_salary(@RequestParam int teacherId,@RequestParam String salary){
        adminServices.updateTeacherSalary(teacherId, salary);
    }

    @PostMapping("/add_subject")
    public void adding_subject(@RequestBody SubjectEntity subject){
        adminServices.addSubjects(subject);
    }

    @GetMapping("/fetch_subject_list")
    public List<SubjectEntity> subjectList(){
        return adminServices.allSubjects();
    }

    @DeleteMapping("/delete_subject")
    public void deleting_subject(@RequestParam int subjectId){
        adminServices.removeSubject(subjectId);
    }

    @PostMapping("/add_student")
    public void adding_student(@RequestBody StudentEntity student){
        adminServices.addStudent(student);
    }

    @GetMapping("/fetch_student_list")
    public List<StudentEntity> studentList (){
        return adminServices.fetchStudentList();
    }

    @GetMapping("/find_student")
    public StudentEntity findingStudent(@RequestParam int sId){
        return adminServices.fetchStudentById(sId);
    }

    @DeleteMapping("/remove_student")
    public void removeStudent(@RequestParam int id){
        adminServices.removeStudent(id);
    }

    @PutMapping("/update_fees_status")
    public void updateFees(@RequestParam int id){
        adminServices.updateFeesStatus(id);
    }

    @GetMapping("/fetch_batch")
    public List<StudentEntity> fetching_batch(@RequestParam String batchId){
        return adminServices.fetchStudentBatch(batchId);
    }

    @PostMapping("/add_exam_schedule")
    public void addingExamSchedule(@RequestBody List<ExamScheduleEntity> examSchedule){
        adminServices.addExamSchedule(examSchedule);
    }

    @GetMapping("/fetch_exam_schedule")
    public List<ExamScheduleEntity> fetchingExamSchedule(@RequestParam String batchId){
        return adminServices.fetchExamSchedule(batchId);
    }


}
