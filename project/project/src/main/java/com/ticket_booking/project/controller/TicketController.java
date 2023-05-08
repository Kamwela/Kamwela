package com.ticket_booking.project.controller;

import com.ticket_booking.project.entity.TicketEntity;
import com.ticket_booking.project.service.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/ticketBooking")
public class TicketController {
    private TicketService ticketService;

    @PostMapping
    public ResponseEntity<TicketEntity> createTicket(TicketEntity ticketEntity){
        TicketEntity savedTicket = ticketService.createTicket(ticketEntity);
        return new ResponseEntity<>(ticketEntity, HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<TicketEntity>> getAllTicket(){
        List<TicketEntity> ticketEntities = ticketService.getAllTicket();
        return new ResponseEntity<>(ticketEntities, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<TicketEntity> updateTicketEntity(@PathVariable("id")Long ticketId,@RequestParam
    TicketEntity ticketEntity){
        ticketEntity.setId(ticketId);
        TicketEntity updateTicketEntity = ticketService.updateTicket(ticketEntity);
        return new ResponseEntity<>(updateTicketEntity, HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteTicketEntity(@PathVariable("id")Long ticketId)
    {
        ticketService.deleteTicket(ticketId);
        return new ResponseEntity<>( "Ticket Booking detail successifuly deleted", HttpStatus.OK);
    }

}
