package com.bfans.portal.api.hystrix;

import com.bfans.portal.api.UserApi;
import com.bfans.user.api.dto.UserInfoDTO;
import org.springframework.stereotype.Component;

/**
 * @author lwb
 * @date 2020-3-29
 */
@Component
public class UserApiHystrix implements UserApi {

    @Override
    public UserInfoDTO getById(Long id) {
        return UserInfoDTO.builder().build();
    }
}
