package com.vsoft.user.service;

import com.vsoft.user.entity.UserCompositeKeyEntity;
import com.vsoft.user.repository.UserRepository;
import com.vsoft.user.entity.UserRegisterEntity;
import com.vsoft.user.model.UserRegister;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLIntegrityConstraintViolationException;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public String registerUser(UserRegister userRegister) {

        UserRegisterEntity entity = modelMapper.map(userRegister, UserRegisterEntity.class);
        UserCompositeKeyEntity compEntity = new UserCompositeKeyEntity(userRegister.getEmail(), userRegister.getMobile());
        entity.setKey(compEntity);
        try{
            UserRegisterEntity resp = userRepository.save(entity);
        }catch(RuntimeException e){
            throw new RuntimeException("Mobile/Email already exist.");
        }
        return "User Registration completed.";
    }
}
