package com.ticket_booking.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

import static jakarta.persistence.GenerationType.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TicketBooking_details")
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false)
    private String customerName;
    @Column(nullable = false)
    private LocalDate bookingDate;
    @Column(nullable = false)
    private String sitNumber;
    @Column(nullable = false)
    private Integer cost;
    @Column(nullable = false)
    private String paymentStatus;
    @Column(nullable = false)
    private String paymentMode;

}
