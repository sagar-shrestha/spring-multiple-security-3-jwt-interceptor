package com.sagar.springMultipleSecurity3JwtInterceptor.service;

import com.sagar.springMultipleSecurity3JwtInterceptor.common.pojo.request.TicketRequest;
import com.sagar.springMultipleSecurity3JwtInterceptor.common.pojo.response.TicketResponse;

import java.net.MalformedURLException;

public interface TicketService {

    void saveTicket(TicketRequest ticketRequestPojo) throws Exception;

    void updateTicket(TicketRequest ticketRequestPojo, Long id) throws Exception;

    TicketResponse getTicketById(Long id) throws MalformedURLException;
}
