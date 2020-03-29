package com.bfans.user.api.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author lwb
 * @date 2020-3-24
 */
@Data
@Builder
public class UserInfoDTO {

    private Long id;

    private String name;

    private String code;

    private String describe;

}
