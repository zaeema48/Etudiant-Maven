package com.project.etudiant.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "ScheduleTable")
@DynamicUpdate
@Data
public class ScheduleEntity {
    @Id
    String scheduleId;
    @NonNull
    String day;
    String slot1;
    String slot2;
    String slot3;
    String slot4;
    String slot5;

    public ScheduleEntity() {
        scheduleId=null;
    }
}
