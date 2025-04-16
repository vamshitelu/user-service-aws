package com.vsoft.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class UserCompositeKeyEntity implements Serializable {

    @Column(name="email",unique = true)
    private String email;
    @Column(name = "mobile", unique = true)
    private String mobile;
}
