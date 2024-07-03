package com.sagar.springMultipleSecurity3JwtInterceptor.service;

import com.sagar.springMultipleSecurity3JwtInterceptor.common.pojo.request.TicketTopicRequest;
import com.sagar.springMultipleSecurity3JwtInterceptor.entity.TicketTopic;
import org.springframework.data.domain.Page;

public interface TicketTopicService {

void saveTicketTopic(TicketTopicRequest ticketTopicRequest);

TicketTopic updateTicketTopic(TicketTopicRequest ticketTopicRequest, int id);

TicketTopic getTopicById(int id);

Page<TicketTopic> getAllTopic(int pageNo, int pageSize);


}
