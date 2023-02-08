package com.project.etudiant.entities;


import lombok.NonNull;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Entity
@DynamicUpdate
public class BatchModel {
    @Id
    String batchId;
    @NonNull
    String year;

    @NonNull
    String course;
    @NonNull
    String batch_duration;

    public BatchModel(String year, String course, String batch_duration) {
        this.year = year;
        this.course = course;
        this.batch_duration = batch_duration;
        batchId=course+year;
    }

    public BatchModel() {
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getBatch_duration() {
        return batch_duration;
    }

    public void setBatch_duration(String batch_duration) {
        this.batch_duration = batch_duration;
    }
}
