package com.atguigu.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author panqiyi
 * @date 2021/11/12 - 10:01
 */
/*Bcrypt密码加密*/
public class BcryptUtils {
    public static String Bcrypt(String plainText){
        BCryptPasswordEncoder bpe = new BCryptPasswordEncoder();
        String encode = bpe.encode(plainText);
        return encode;
    }
}
