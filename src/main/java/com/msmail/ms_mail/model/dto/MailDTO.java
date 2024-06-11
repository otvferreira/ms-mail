package com.msmail.ms_mail.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

@Data
@Getter
@Setter
public class MailDTO{

    @NotBlank
    private String sender;

    @NotBlank
    private String recipient;

    private String carbonCopy;

    private String blindCarbonCopy;

    @NotBlank
    private String subject;

    private String body;

}
