package com.prowesssoft.admin.mapper;

import com.prowesssoft.admin.dto.BankDTO;
import com.prowesssoft.admin.entity.Bank;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class BankMapper extends  BaseMapper<Bank, BankDTO>{
    @Override
    public Bank convertToEntity(BankDTO dto, Object... args) {

        Bank bank = new Bank();
        if(dto != null) {
            BeanUtils.copyProperties(dto, bank);
        }
        return bank;
    }

    @Override
    public BankDTO convertToDto(Bank entity, Object... args) {
        BankDTO bankDTO = new BankDTO();
        if(entity != null) {
            BeanUtils.copyProperties(entity, bankDTO);
        }
        return bankDTO;
    }
}
