package com.sagar.springMultipleSecurity3JwtInterceptor.service;

import com.sagar.springMultipleSecurity3JwtInterceptor.entity.TicketImage;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface TicketImageService {

    void saveTicketImage(TicketImage ticketImage);

    void getTicketImageById(int imageId, HttpServletResponse httpServletResponse) throws IOException;
}
