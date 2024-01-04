package com.parker.admin.jwt;

import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * com.parker.admin.jwt.config
 * ㄴ JwtSecurityConfig
 *
 * <pre>
 * description :TokenProvider를 주입받아서 jwtFilter를 통해 security로직에 등록한다..
 * 아니 어차피 securityConfig에 등록할 거면서 왜 config를 왜 여기서 등록하지...??
 * securityConfig에는
 * </pre>
 *
 * <pre>
 * <b>History:</b>
 *  parker, 1.0, 12/24/23  초기작성
 * </pre>
 *
 * @author parker
 * @version 1.0
 */
@RequiredArgsConstructor
public class JwtSecurityConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {
    private final TokenProvider tokenProvider;

    @Override
    public void configure(HttpSecurity httpSecurity){
        httpSecurity.addFilterBefore(
          new JwtFilter(tokenProvider), UsernamePasswordAuthenticationFilter.class
        );
    }

}