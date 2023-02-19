package com.project.etudiant.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Data
@DynamicUpdate
@Table(name = "student_table")
public class StudentEntity {
    @Id
    @Column(name ="studentID")
    @GeneratedValue(strategy = GenerationType.AUTO) //autogen can not be string it gives int value
    int studentId;

    @NonNull
    String password;

    @NonNull
    String studentName;

    @NonNull
    String batchId;

    @NonNull
    String studentEmail;

    @NonNull
    String parentsEmail;

    @NonNull
    Boolean feesPaid;


    public StudentEntity() {
        feesPaid = true;
    }
}
