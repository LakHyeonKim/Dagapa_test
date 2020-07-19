package com.kbds.controller;

import com.kbds.service.UserService;
import com.kbds.vo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"***Contract***"})
@RequiredArgsConstructor
@RestController
@Slf4j
public class ContractController {
    private final UserService userService;

    @ApiOperation(value = "계약서 조회", notes = "설명 붙이기 ~ [...]")
    @GetMapping("/contracts/{userno}")
    public User findByContractUserNo(@PathVariable int userno){
//        User search = userService.findUser(user);
//        if(user.getPw().equals(search.getPw())) {
//            log.info("[CONTROLLER] :: login()");
//            return search;
//        }
//        else return null;
        return null;
    }
}
