package com.ticket_booking.project.service;

import com.ticket_booking.project.entity.TicketEntity;

import java.util.List;

public interface TicketService {
    TicketEntity createTicket(TicketEntity ticketEntity);

    TicketEntity getTicketById(Long ticketId);

    List<TicketEntity> getAllTicket();

    TicketEntity updateTicket(TicketEntity ticketEntity);

    void deleteTicket(Long ticketId);
}
