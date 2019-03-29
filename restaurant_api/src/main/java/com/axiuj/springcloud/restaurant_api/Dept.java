package com.axiuj.springcloud.restaurant_api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)
@AllArgsConstructor
public class Dept implements Serializable {
    String user;
    String password;

}
