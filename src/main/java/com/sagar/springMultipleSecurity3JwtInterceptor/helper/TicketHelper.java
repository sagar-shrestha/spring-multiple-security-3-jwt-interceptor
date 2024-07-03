package com.sagar.springMultipleSecurity3JwtInterceptor.helper;

import com.sagar.springMultipleSecurity3JwtInterceptor.common.pojo.response.TicketResponse;
import com.sagar.springMultipleSecurity3JwtInterceptor.entity.Ticket;
import com.sagar.springMultipleSecurity3JwtInterceptor.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TicketHelper {

    private final TicketRepository ticketRepository;

    public TicketResponse getTicketById(Long id) {
        Ticket ticket = ticketRepository.findById(id).orElseThrow(() -> new RuntimeException("Ticket Not Found."));
        return TicketResponse.builder()
                .id(id)
                .ticketCategory(ticket.getTicketCategory())
                .description(ticket.getDescription())
                .imageId(ticketRepository.getTicketById(id))
                .build();
    }
}
