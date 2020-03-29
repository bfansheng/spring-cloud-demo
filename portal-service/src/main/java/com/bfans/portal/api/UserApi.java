package com.bfans.portal.api;

import com.bfans.user.api.IUserApi;
import com.bfans.user.api.constant.UserApiConstant;
import com.bfans.portal.api.hystrix.UserApiHystrix;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author lwb
 * @date 2020-3-29
 */
@FeignClient(value = UserApiConstant.SERVICE_NAME)
public interface UserApi extends IUserApi {
}
