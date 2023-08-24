package kr.sanus.bankapp.customer;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import kr.sanus.bankapp.common.entity.BaseEntity;
import lombok.Getter;

@Entity
@Getter
public class Customer extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String grade;
  private int age;
  private String email;
  private String organization;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
}
