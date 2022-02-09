package com.prowesssoft.admin.dto;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BranchDTO {

    private Long id;
    private String branchName;
    private String ifscCode;
    private AddressDTO address;
    private BankDTO bankDTO;
}
