package com.POJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: people
 * @Description:
 * @Date: 2021/4/9 15:40
 * @Author: zt
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class people {
    private String name;
    private  char sex;
    private int age;
    public  void  sleep(){
        System.out.println("爱睡觉");
    }

}

