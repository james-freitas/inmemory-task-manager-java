package com.codeonblue.memtaskmanager.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class Task {
    private Long id;
    private String title;
    private String description;
    private String status;
}
