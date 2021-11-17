package com.atguigu.test;

import com.atguigu.util.BcryptUtils;

/**
 * @author panqiyi
 * @date 2021/11/12 - 10:05
 */
public class TestBcrypt {
    public static void main(String[] args) {
        String password = BcryptUtils.Bcrypt("123");
        System.out.println(password);
    }
}
