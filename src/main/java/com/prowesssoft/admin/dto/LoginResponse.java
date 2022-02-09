package com.prowesssoft.admin.dto;

import com.prowesssoft.admin.enums.AccountType;
import lombok.*;

import java.util.Map;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse {

    private String userName;
    private Map<AccountType, AccountDTO> accounts;

}
