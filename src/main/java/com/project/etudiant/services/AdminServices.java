package com.project.etudiant.services;

import com.project.etudiant.dao.*;
import com.project.etudiant.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServices {
    @Autowired
    BatchRepository batchRepository;

    @Autowired
    ScheduleRepository scheduleRepository;

    @Autowired
    NotificationRepository notificationRepository;

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    SubjectRepository subjectRepository;

    @Autowired
    AdminRepository adminRepository;

    //This method is checking whether admin exists or not/ whether password is correct or not
    public void adminLogin(String adminId, String password){
        AdminEntity admin= null;
        admin=adminRepository.findByAdminIdAndPassword(adminId, password);
        if(admin!=null)
            System.out.println("Successful login!!!");
        else
            System.out.println("Admin not found!!!!!");
    }

    public void addAdmin(AdminEntity admin){

        adminRepository.save(admin);
    }
   public void addBatch(BatchEntity batch){
       batch.setBatchId(batch.getCourseName()+batch.getCourseYear());
       batchRepository.save(batch);
   }

   public List<BatchEntity> getBatches(){
       List<BatchEntity> batches= new ArrayList<>();
       batches= batchRepository.findAll();
       return batches;
   }

   public BatchEntity searchBatch(String id){
       BatchEntity batch= new BatchEntity();
       batch=batchRepository.findByBatchId(id);
       return batch;
   }



   public void addNotification(NotificationEntity notification){
       notificationRepository.save(notification);
   }

   public NotificationEntity searchNotification(String title){
       NotificationEntity notification;
       notification= notificationRepository.findByNotificationTitle(title);
       return notification;
   }

   public List<NotificationEntity> showAllNotifications(){
       List<NotificationEntity> notifications = new ArrayList<>();
       notifications= notificationRepository.findAll();
       return notifications;
   }

    public void addSchedules(ScheduleEntity schedule){
        schedule.setScheduleId(schedule.getCommonId()+schedule.getDay());
        scheduleRepository.save(schedule);
    }

   public void updateSchedule(ScheduleEntity schedule){
        schedule.setScheduleId(schedule.getCommonId()+schedule.getDay());
        scheduleRepository.save(schedule);
   }

   public void addTeacher(TeacherEntity teacher){
       teacherRepository.save(teacher);
   }

   public List<TeacherEntity> getAllTeacher(){
       List<TeacherEntity> allTeachers = new ArrayList<>();
       allTeachers=teacherRepository.findAll();
       return allTeachers;
   }

   public void removeTeacher(int teacherId){
//       TeacherEntity teacher= teacherRepository.findByTeacherId(teacherId);
//       teacherRepository.delete(teacher);
       teacherRepository.deleteById(teacherId);
   }

   public void updateTeacherSalary(int teacherId, String salary){
       TeacherEntity teacher=teacherRepository.findByTeacherId(teacherId);
       teacher.setSalary(salary);
       teacherRepository.save(teacher);
   }

   public void addSubjects(SubjectEntity subject){
       subjectRepository.save(subject);
   }

   public List<SubjectEntity> allSubjects(){
       List<SubjectEntity> subjectList= new ArrayList<>();
       subjectList=subjectRepository.findAll();
       return subjectList;
   }

   public void removeSubject(int subjectId){
       subjectRepository.deleteById(subjectId);
   }


}
