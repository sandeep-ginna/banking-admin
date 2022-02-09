package com.prowesssoft.admin.mapper;

import com.prowesssoft.admin.dto.BankDTO;
import com.prowesssoft.admin.dto.BranchDTO;
import com.prowesssoft.admin.entity.Bank;
import com.prowesssoft.admin.entity.Branch;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class BranchMapper extends  BaseMapper<Branch, BranchDTO>{
    @Override
    public Branch convertToEntity(BranchDTO dto, Object... args) {

        Branch branch = new Branch();
        if(dto != null) {
            BeanUtils.copyProperties(dto, branch);
        }
        return branch;
    }

    @Override
    public BranchDTO convertToDto(Branch entity, Object... args) {
        BranchDTO branchDTO = new BranchDTO();
        if(entity != null) {
            BeanUtils.copyProperties(entity, branchDTO);
        }
        return branchDTO;
    }
}
