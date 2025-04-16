package com.vsoft.user.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_tbl")
@Entity
public class UserRegisterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(sequenceName = "user_seq", name = "user-seq", allocationSize = 1)
    private Long id;

    private String userName;
    private String firstName;
    private String lastName;
 //   private String email;
 //   private String mobile;
    private UserCompositeKeyEntity key;

}
