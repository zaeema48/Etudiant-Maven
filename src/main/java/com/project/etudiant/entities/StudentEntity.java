package com.project.etudiant.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "student_table")
@Data
@DynamicUpdate
public class StudentEntity {
    @Id
    @Column(name ="studentID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_id_generator")
    @SequenceGenerator(name = "student_id_generator",initialValue = 2000,allocationSize = 1,sequenceName = "student_id_sequence")
    int studentId;

    @NonNull
    String password;

    @NonNull
    String studentName;

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
