package com.bfans.portal.controller;

import com.bfans.portal.api.UserApi;
import com.bfans.portal.controller.resp.UserResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author lwb
 * @date 2020-3-29
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private UserApi userApi;

    @GetMapping("/user/admin")
    public UserResp getAdmin() {
        return Optional.ofNullable(userApi.getById(1L))
                .map(UserResp::toResp)
                .orElse(null);
    }

}
