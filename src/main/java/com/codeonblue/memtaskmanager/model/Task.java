package com.codeonblue.memtaskmanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Task {
    private Long id;
    private String title;
    private String description;
    private String status;
}
