package kr.sanus.bankapp.transaction;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import kr.sanus.bankapp.common.entity.BaseEntity;
import lombok.Getter;

@Entity
@Getter
public class Transaction extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private long balance;
  private String type;
  private long balanceAfterTransaction;
  private String accountNumber;
}
