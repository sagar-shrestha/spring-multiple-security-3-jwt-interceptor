package com.sagar.springMultipleSecurity3JwtInterceptor.controller.rest;

import com.sagar.springMultipleSecurity3JwtInterceptor.common.annotation.CustomRestController;
import com.sagar.springMultipleSecurity3JwtInterceptor.common.pojo.response.GlobalApiResponse;
import com.sagar.springMultipleSecurity3JwtInterceptor.service.TicketImageService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@CustomRestController
@RequestMapping("rest/")
@RequiredArgsConstructor
public class TicketImageController {

    private final TicketImageService ticketImageService;

//    @PreAuthorize("hasAnyRole('SUPER_ADMIN')")
    @GetMapping(value = "getImageById/{id}", produces = MediaType.MULTIPART_MIXED_VALUE)
    public ResponseEntity<?> getTicketImageById(@PathVariable("id") int imageId,
                                                HttpServletResponse httpServletResponse) throws IOException {
        ticketImageService.getTicketImageById(imageId, httpServletResponse);
        return ResponseEntity.ok(GlobalApiResponse
                .builder()
                .code(HttpStatus.OK.value())
                .data(null)
                .message("Ticket Saved Successfully.")
                .build());
    }
}
