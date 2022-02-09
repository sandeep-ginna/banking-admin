package com.prowesssoft.admin.mapper;



import com.prowesssoft.admin.dto.UserDTO;
import com.prowesssoft.admin.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UserMapper extends BaseMapper<User, UserDTO>{
    private BankAccountMapper bankAccountMapper = new BankAccountMapper();

    @Override
    public User convertToEntity(UserDTO dto, Object... args) {
        User entity = new User();
        if (dto != null) {
            BeanUtils.copyProperties(dto, entity, "accounts");
//            entity.setAccounts(bankAccountMapper.convertToEntityList(dto.getAccounts()));
        }
        return entity;
    }



    @Override
    public UserDTO convertToDto(User entity, Object... args) {
        UserDTO dto = new UserDTO();
        if (entity != null) {
            BeanUtils.copyProperties(entity, dto, "accounts");
//            dto.setAccounts(bankAccountMapper.convertToDtoList(entity.getAccounts()));
        }
        return dto;
    }
}