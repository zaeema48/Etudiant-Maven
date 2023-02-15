package com.project.etudiant.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="NotificationTable")
@Data
@DynamicUpdate
@NoArgsConstructor
public class NotificationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int notificationId;
    @NonNull
    String notificationTitle;
    @NonNull
    String notificationMessage;

}
