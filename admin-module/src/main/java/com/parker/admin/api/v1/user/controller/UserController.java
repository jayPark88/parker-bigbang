package com.parker.admin.api.v1.user.controller;

import com.parker.admin.api.v1.user.service.UserService;
import com.parker.admin.common.CommonResponse;
import com.parker.admin.dto.UserDto;
import com.parker.admin.exception.CustomException;
import com.parker.jpa.entity.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static com.parker.admin.exception.enums.ResponseErrorCode.FAIL_401;
import static com.parker.admin.exception.enums.ResponseErrorCode.FAIL_404;

/**
 * com.parker.admin.api.v1.user.controller
 * ㄴ UserController
 *
 * <pre>
 * description :
 * </pre>
 *
 * <pre>
 * <b>History:</b>
 *  parker, 1.0, 12/25/23  초기작성
 * </pre>
 *
 * @author parker
 * @version 1.0
 */
@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final MessageSource messageSource;

    @PostMapping("/signup")
    public CommonResponse<User> signup(
            @Valid @RequestBody UserDto userDto, BindingResult bindingResult
    ) {
        if(bindingResult.hasErrors()){
            throw new CustomException(FAIL_404.code(), messageSource.getMessage("http.status.bad.request", null, Locale.getDefault()), HttpStatus.BAD_REQUEST);
        }
        return new CommonResponse<>(userService.signUp(userDto));
    }

    @GetMapping("/user")
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public CommonResponse<User> getMyUserInfo() {
        return new CommonResponse<>(userService.getMyUserWithAuthorities().get());
    }

    @GetMapping("/user/{username}")
    @PreAuthorize("hasAnyRole('ADMIN')")
    public CommonResponse<User> getUserInfo(@PathVariable String username) {
        return new CommonResponse<>(userService.getUserWithAuthorities(username).get());
    }
}