package com.sagar.springMultipleSecurity3JwtInterceptor.common.pojo.request;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TicketTopicRequest implements Serializable {

    private String topic;
}
