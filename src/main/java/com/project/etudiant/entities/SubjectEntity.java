package com.project.etudiant.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.DynamicUpdate;

@Table(name = "subject_table")
@Data
@NoArgsConstructor
@DynamicUpdate
@Entity
public class SubjectEntity {
    @Id
    int subjectId;

    @NonNull
    String subjectName;
}
