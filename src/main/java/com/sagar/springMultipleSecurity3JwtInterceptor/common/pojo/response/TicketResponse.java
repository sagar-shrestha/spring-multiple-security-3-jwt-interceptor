package com.sagar.springMultipleSecurity3JwtInterceptor.common.pojo.response;

import com.sagar.springMultipleSecurity3JwtInterceptor.entity.TicketCategory;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TicketResponse {
    private Long id;
    private TicketCategory ticketCategory;
    private String description;
    private List<Integer> imageId;
}
