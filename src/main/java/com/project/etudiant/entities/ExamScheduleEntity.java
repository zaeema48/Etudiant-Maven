package com.project.etudiant.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Data
@DynamicUpdate
@Table(name = "exam_schedule")
@NoArgsConstructor
public class ExamScheduleEntity {
    @Id
    String examId; //subject-batch

    @NonNull
    String date;

    @NonNull
    String subject;

    @NonNull
    String time;

    @NonNull
    String roomAllotted;

    @NonNull
    String batchId;
}
