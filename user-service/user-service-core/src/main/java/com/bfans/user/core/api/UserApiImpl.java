package com.bfans.user.core.api;

import com.bfans.user.api.IUserApi;
import com.bfans.user.api.dto.UserInfoDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lwb
 * @date 2020-3-29
 */
@RestController
public class UserApiImpl implements IUserApi {

    @Value("${server.port}")
    private String port;

    @Override
    public UserInfoDTO getById(Long id) {
        try {
            Thread.sleep(60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return UserInfoDTO.builder().id(id).code("admin").name("admin")
                .describe(String.format("request from port: %s", port))
                .build();
    }
}
