package com.sagar.springMultipleSecurity3JwtInterceptor.repository;

import com.sagar.springMultipleSecurity3JwtInterceptor.entity.TicketTopic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketTopicRepository extends JpaRepository<TicketTopic, Integer> {
}
