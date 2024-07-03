package com.sagar.springMultipleSecurity3JwtInterceptor.helper;

import com.sagar.springMultipleSecurity3JwtInterceptor.common.util.GenericFileUtil;
import com.sagar.springMultipleSecurity3JwtInterceptor.entity.TicketImage;
import com.sagar.springMultipleSecurity3JwtInterceptor.repository.TicketImageRepository;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.MalformedURLException;

@Component
@RequiredArgsConstructor
public class TicketImageHelper {

    private final TicketImageRepository ticketImageRepository;
    private final GenericFileUtil genericFileUtil;

    public void getTicketImageById(int imageId, HttpServletResponse httpServletResponse) throws IOException {
        TicketImage ticketImage = ticketImageRepository.findById(imageId)
                .orElseThrow(() -> new MalformedURLException("Image not found"));
        genericFileUtil.getFileAsResource(ticketImage.getImage(), httpServletResponse);
    }
}
