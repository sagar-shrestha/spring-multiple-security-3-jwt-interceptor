package com.sagar.springMultipleSecurity3JwtInterceptor.service;

import com.sagar.springMultipleSecurity3JwtInterceptor.entity.TicketImage;
import com.sagar.springMultipleSecurity3JwtInterceptor.helper.TicketImageHelper;
import com.sagar.springMultipleSecurity3JwtInterceptor.repository.TicketImageRepository;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class TicketImageServiceImpl implements TicketImageService {

    private final TicketImageRepository ticketImageRepository;
    private final TicketImageHelper ticketImageHelper;

    @Override
    public void saveTicketImage(TicketImage ticketImage) {
         ticketImageRepository.save(ticketImage);
    }

    @Override
    public void getTicketImageById(int imageId, HttpServletResponse httpServletResponse) throws IOException {
        ticketImageHelper.getTicketImageById(imageId, httpServletResponse);
    }
}
