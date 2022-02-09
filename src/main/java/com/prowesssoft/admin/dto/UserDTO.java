package com.prowesssoft.admin.dto;

import com.prowesssoft.admin.entity.Account;
import lombok.*;

import java.util.List;

@Data
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Long id;
        private String firstName;
    private String lastName;
    private String email;
    private Integer phoneNumber;
    private String identificationNumber;
    private String userId;
    private String password;
    private String ifscCode;
    private List<AccountDTO> accounts;

}
