package com.kbds.controller;

import com.kbds.service.UserService;
import com.kbds.vo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"***User***"})
@RequiredArgsConstructor
@RestController
@Slf4j
public class UserController {
    private final UserService userService;

    @ApiOperation(value = "로그인", notes = "로그인을 할 경우[...]")
    @PostMapping("/sign_in")
    public User login(@RequestBody User user){
        User search = userService.findUser(user);
        if(user.getPw().equals(search.getPw())) {
            log.info("[CONTROLLER] :: login()");
            return search;
        }
        else return null;
    }
}
