package com.ticket_booking.project.service;

import com.ticket_booking.project.entity.TicketEntity;
import com.ticket_booking.project.repository.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TicketServiceImpl implements TicketService {

    private TicketRepository ticketRepository;

    @Override
    public TicketEntity createTicket(TicketEntity ticketEntity) {
        return ticketRepository.save(ticketEntity);
    }

    @Override
    public TicketEntity getTicketById(Long ticketId) {
        Optional<TicketEntity> optionalTicketEntity = ticketRepository.findById(ticketId);
        return optionalTicketEntity.get();
    }

    @Override
    public List<TicketEntity> getAllTicket() {
        return ticketRepository.findAll();
    }

    @Override
    public TicketEntity updateTicket(TicketEntity ticketEntity) {
        TicketEntity existingTicket = ticketRepository.findById(ticketEntity.getId()).get();
        existingTicket.setCustomerName(ticketEntity.getCustomerName());
        existingTicket.setBookingDate(ticketEntity.getBookingDate());
        existingTicket.setSitNumber (ticketEntity.getSitNumber());
        existingTicket.setCost(ticketEntity.getCost());
        existingTicket.setCost(ticketEntity.getCost());
        existingTicket.setPaymentStatus(ticketEntity.getPaymentStatus());
        existingTicket.setPaymentMode(ticketEntity.getPaymentMode());
        return null;
    }

    @Override
    public void deleteTicket(Long ticketId) {
        ticketRepository.deleteById(ticketId);

    }
}
