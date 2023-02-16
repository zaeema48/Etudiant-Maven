package com.project.etudiant.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "admin_table")
@Data
@DynamicUpdate
@NoArgsConstructor
public class AdminEntity {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    String adminId;
    @NonNull
    String password;


}
