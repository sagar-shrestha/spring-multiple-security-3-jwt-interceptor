package com.sagar.springMultipleSecurity3JwtInterceptor.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ticket_image")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TicketImage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String image;
    @ManyToOne
    @JoinColumn
    private Ticket ticket;
}