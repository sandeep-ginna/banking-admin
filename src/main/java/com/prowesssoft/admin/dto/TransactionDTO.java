package com.prowesssoft.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDTO {

    private Long id;
    private BigDecimal amount;
    private AccountDTO accountDTO;
    private String referenceNumber;

}
