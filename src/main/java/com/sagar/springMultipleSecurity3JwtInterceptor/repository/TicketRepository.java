package com.sagar.springMultipleSecurity3JwtInterceptor.repository;

import com.sagar.springMultipleSecurity3JwtInterceptor.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    @Query(value = "SELECT ti.id  FROM ticket_image AS ti INNER JOIN ticket AS t ON ti.ticket_id = t.id WHERE t.id = :id", nativeQuery = true)
    List<Integer> getTicketById(@Param("id") Long id);
}
