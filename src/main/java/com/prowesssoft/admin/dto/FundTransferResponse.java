package com.prowesssoft.admin.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FundTransferResponse {

    private String message;
    private Long transactionId;

}
