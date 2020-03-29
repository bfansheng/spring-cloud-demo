package com.bfans.portal.controller.resp;

import com.bfans.user.api.dto.UserInfoDTO;
import lombok.Builder;
import lombok.Data;

/**
 * @author lwb
 * @date 2020-3-29
 */
@Data
@Builder
public class UserResp {

    private Long id;

    private String name;

    private String code;

    private String describe;

    public static UserResp toResp(UserInfoDTO dto) {
        return UserResp.builder()
                .id(dto.getId())
                .code(dto.getCode())
                .name(dto.getName())
                .describe(dto.getDescribe())
                .build();
    }

}
