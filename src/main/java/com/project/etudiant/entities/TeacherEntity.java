package com.project.etudiant.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "Teacher_table")
@Data
@DynamicUpdate
@NoArgsConstructor
public class TeacherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int teacherId;

    @NonNull
    String teacherPassword;

    @NonNull
    String teacherName;

    @NonNull
    String specialization;

    @NonNull
    String salary;

}
