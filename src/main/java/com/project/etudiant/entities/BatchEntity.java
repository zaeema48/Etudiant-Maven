package com.project.etudiant.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "BatchTable")
@Data
@Getter
public class BatchEntity {
  @Id
  @Column(name = "BatchID")
  String batchId;
  @NonNull
  String courseName;
  @NonNull
  String courseYear;
  @NonNull
  String courseDuration;
  @NonNull
  String feesAmount;

  String scheduleId;
}
