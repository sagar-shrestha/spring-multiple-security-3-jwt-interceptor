package com.sagar.springMultipleSecurity3JwtInterceptor.service;

import com.sagar.springMultipleSecurity3JwtInterceptor.common.pojo.request.TicketCategoryRequest;
import com.sagar.springMultipleSecurity3JwtInterceptor.entity.TicketCategory;
import org.springframework.data.domain.Page;

public interface TicketCategoryService {
    void saveTicketCategory(TicketCategoryRequest ticketCategoryRequest);

    TicketCategory updateTicketCategory(TicketCategoryRequest ticketCategoryRequest, int id);

    TicketCategory getCategoryById(int id);

    Page<TicketCategory> getAllCategory(int pageNo, int pageSize);
}
