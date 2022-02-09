package com.prowesssoft.admin.dto;


import com.prowesssoft.admin.entity.Bank;
import com.prowesssoft.admin.enums.AccountStatus;
import com.prowesssoft.admin.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {

    private Long id;
    private String accountNum;
    private String accountType;
    private AccountStatus status;
    private BigDecimal accountBalance;
//    private BigDecimal actualBalance;
    private UserDTO user;
    private BranchDTO branch;
    private String ifscCode;

    private List<TransactionDTO> transactionDTOList;

}
