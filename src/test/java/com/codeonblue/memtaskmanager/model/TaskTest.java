package com.codeonblue.memtaskmanager.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TaskTest {

    @Test
    void testTaskConstructorAndGetters() {
        // Arrange
        Long id = 1L;
        String title = "Complete project";
        String description = "Finish the project by the end of the week";
        String status = "In Progress";

        // Act
        Task task = new Task(id, title, description, status);

        // Assert
        assertThat(task.getId()).isEqualTo(id);
        assertThat(task.getTitle()).isEqualTo(title);
        assertThat(task.getDescription()).isEqualTo(description);
        assertThat(task.getStatus()).isEqualTo(status);
    }

    @Test
    void testTaskSetters() {
        // Arrange
        Task task = new Task();
        Long id = 2L;
        String title = "Review code";
        String description = "Review the pull request for the new feature";
        String status = "Pending";

        // Act
        task.setId(id);
        task.setTitle(title);
        task.setDescription(description);
        task.setStatus(status);

        // Assert
        assertThat(task.getId()).isEqualTo(id);
        assertThat(task.getTitle()).isEqualTo(title);
        assertThat(task.getDescription()).isEqualTo(description);
        assertThat(task.getStatus()).isEqualTo(status);
    }

    @Test
    void testTaskEqualsAndHashCode() {
        // Arrange
        Task task1 = new Task(1L, "Task 1", "Description 1", "Done");
        Task task2 = new Task(1L, "Task 1", "Description 1", "Done");

        // Act & Assert
        assertThat(task1).isEqualTo(task2);
        assertThat(task1.hashCode()).isEqualTo(task2.hashCode());
    }

    @Test
    void testTaskToString() {
        // Arrange
        Task task = new Task(1L, "Task 1", "Description 1", "Done");

        // Act
        String taskString = task.toString();

        // Assert
        assertThat(taskString).contains("id=1", "title=Task 1", "description=Description 1", "status=Done");
    }
}