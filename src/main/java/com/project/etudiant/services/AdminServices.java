package com.project.etudiant.services;

import com.project.etudiant.dao.BatchRepository;
import com.project.etudiant.dao.ScheduleRepository;
import com.project.etudiant.entities.BatchEntity;
import com.project.etudiant.entities.ScheduleEntity;
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

   public void addSchedules(ScheduleEntity schedule){
       scheduleRepository.save(schedule);
   }
}
