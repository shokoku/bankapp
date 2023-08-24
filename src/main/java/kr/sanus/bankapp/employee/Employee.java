package kr.sanus.bankapp.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import kr.sanus.bankapp.common.entity.BaseEntity;
import lombok.Getter;

@Entity
@Getter
public class Employee extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private long branchId;
}
