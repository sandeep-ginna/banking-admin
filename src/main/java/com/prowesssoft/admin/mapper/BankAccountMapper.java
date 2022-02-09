package com.prowesssoft.admin.mapper;


import com.prowesssoft.admin.entity.Account;
import com.prowesssoft.admin.dto.AccountDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class BankAccountMapper extends BaseMapper<Account, AccountDTO> {

    @Override
    public Account convertToEntity(AccountDTO dto, Object... args) {
        Account entity = new Account();
        if (dto != null) {
            BeanUtils.copyProperties(dto, entity, "user");
        }
        return entity;
    }

    @Override
    public AccountDTO convertToDto(Account entity, Object... args) {
        AccountDTO dto = new AccountDTO();
        if (entity != null) {
            BeanUtils.copyProperties(entity, dto, "user");
        }
        return dto;
    }
}
