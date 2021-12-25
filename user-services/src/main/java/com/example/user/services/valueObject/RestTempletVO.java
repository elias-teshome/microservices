package com.example.user.services.valueObject;

import com.example.user.services.model.Department;
import com.example.user.services.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestTempletVO {

    private User user;
    private Department department;

}
