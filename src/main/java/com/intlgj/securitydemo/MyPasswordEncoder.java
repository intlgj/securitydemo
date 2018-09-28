package com.intlgj.securitydemo;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Auther: huangguoji
 * @Date: 2018/9/28 16:26
 * @Description:
 */
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}
