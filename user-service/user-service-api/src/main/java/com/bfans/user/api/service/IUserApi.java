package com.bfans.user.api.service;

import com.bfans.user.api.dto.UserInfoDTO;

/**
 * @author lwb
 * @date 2020-3-24
 */
public interface IUserApi {

    UserInfoDTO getById(Long id);

}
