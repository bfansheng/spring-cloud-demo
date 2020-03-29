package com.bfans.user.api;

import com.bfans.user.api.constant.UserApiConstant;
import com.bfans.user.api.dto.UserInfoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author lwb
 * @date 2020-3-24
 */
@FeignClient(UserApiConstant.SERVICE_NAME)
public interface IUserApi {

    @GetMapping("/user/{id}/info")
    UserInfoDTO getById(@PathVariable("id") Long id);

}
