package com.vsoft.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegister {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    private String mobile;
}
