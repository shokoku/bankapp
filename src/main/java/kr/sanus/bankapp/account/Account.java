package kr.sanus.bankapp.account;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import kr.sanus.bankapp.common.entity.BaseEntity;
import lombok.Getter;

@Entity
@Getter
public class Account extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String number;
  private String type;
  private boolean isFirst;
  private long balance; // BigDecimal
  private String password;
  private int employeeId;
  private int branchId;
  private long customerId;
}
