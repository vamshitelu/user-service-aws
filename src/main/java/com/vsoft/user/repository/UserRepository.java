package com.vsoft.user.repository;

import com.vsoft.user.entity.UserRegisterEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserRegisterEntity, Long> {
}
