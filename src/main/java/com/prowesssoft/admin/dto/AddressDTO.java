package com.prowesssoft.admin.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressDTO {

    private Long id;
    private String city;
    private String colony;
    private String pinCode;
}
