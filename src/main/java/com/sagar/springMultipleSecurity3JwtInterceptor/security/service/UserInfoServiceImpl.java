package com.sagar.springMultipleSecurity3JwtInterceptor.security.service;

import com.sagar.springMultipleSecurity3JwtInterceptor.security.entity.UserInfo;
import com.sagar.springMultipleSecurity3JwtInterceptor.security.repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserInfoServiceImpl implements UserInfoService{


    private final UserInfoRepository userInfoRepository;

    @Override
    public void saveUserInfo(UserInfo userInfo) {

        userInfoRepository.save(userInfo);
    }
}
