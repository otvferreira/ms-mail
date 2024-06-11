package com.msmail.ms_mail.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.NotBlank;

import java.time.OffsetDateTime;

@Entity
@Table(name = "mail")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mail {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @NotBlank
    private String sender;

    @NotBlank
    private String recipient;

    private String carbonCopy;

    private String blindCarbonCopy;

    @NotBlank
    private String subject;

    private String body;

    @CreationTimestamp
    @Column(nullable = false, columnDefinition = "datetime")
    private OffsetDateTime dateTime;

}
