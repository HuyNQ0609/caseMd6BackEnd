package com.example.casemd6backend.model.question;

import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.List;

@Data
public class SearchQuestion {
    String name;
    String category;
    String questionType;
    String level;
}
