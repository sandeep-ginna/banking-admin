package com.prowesssoft.admin.entity;


import com.prowesssoft.admin.enums.TransactionStatus;
import com.prowesssoft.admin.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    private String referenceNumber;

    private String transactionId;

    @Enumerated(EnumType.STRING)
    private TransactionStatus transactionStatus;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    private Account account;

}
