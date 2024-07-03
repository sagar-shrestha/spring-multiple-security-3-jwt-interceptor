package com.sagar.springMultipleSecurity3JwtInterceptor.security.repository;

import com.sagar.springMultipleSecurity3JwtInterceptor.security.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {


    UserInfo findByUsername(String username);
}
