package com.example.casemd6backend.model.question;


import lombok.Data;

import javax.persistence.*;

@Entity(name = "options")
@Data
public class Option
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String status;
}
