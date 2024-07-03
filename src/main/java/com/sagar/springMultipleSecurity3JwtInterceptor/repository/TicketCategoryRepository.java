package com.sagar.springMultipleSecurity3JwtInterceptor.repository;

import com.sagar.springMultipleSecurity3JwtInterceptor.entity.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketCategoryRepository extends JpaRepository<TicketCategory, Integer> {
}
