package com.project.etudiant.services;

import com.project.etudiant.dao.BatchRepository;
import com.project.etudiant.dao.NotificationRepository;
import com.project.etudiant.dao.ScheduleRepository;
import com.project.etudiant.dao.TeacherRepository;
import com.project.etudiant.entities.BatchEntity;
import com.project.etudiant.entities.NotificationEntity;
import com.project.etudiant.entities.ScheduleEntity;
import com.project.etudiant.entities.TeacherEntity;
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
}
