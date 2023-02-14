package com.project.etudiant.controllers;

import com.project.etudiant.entities.BatchEntity;
import com.project.etudiant.entities.ScheduleEntity;
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

    @PostMapping("/add_schedule")
    public void addSchedule(@RequestBody ScheduleEntity schedule){adminServices.addSchedules(schedule);}
}
