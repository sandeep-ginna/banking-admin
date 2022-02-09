package com.prowesssoft.admin.dto;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FundTransferRequest implements Serializable {
    private String fromAccount;
    private String toAccount;
    private BigDecimal amount;
    private Long referenceId;
    private String ifcsCode;
}
