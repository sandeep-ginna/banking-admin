package com.prowesssoft.admin.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class BankDTO {

    private Long id;
    private String bankName;
    private AddressDTO address;
    private List<BranchDTO> branches;
}
