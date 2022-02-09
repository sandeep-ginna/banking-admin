package com.prowesssoft.admin.entity;

import com.prowesssoft.admin.enums.AccountStatus;
import com.prowesssoft.admin.enums.AccountType;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Data
@Getter
@Entity
@Table(name = "account")
public class Account {
    @Id
    @Column(name = "account_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "account_number", unique = true)
    private String accountNum;

    @Column(name = "account_type")
    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    @Column(name = "account_status")
    @Enumerated(EnumType.STRING)
    private AccountStatus status;

    @Column(name = "account_balance")
    private BigDecimal accountBalance;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

    @OneToMany(mappedBy = "account")
    private List<Transaction> transactionList;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
