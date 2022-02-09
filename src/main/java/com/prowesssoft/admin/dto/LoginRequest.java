package com.prowesssoft.admin.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginRequest {

    private String userId;
    private String password;
}
