package ru.netology.javacore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodosTests {

    @Test                            // проверяем добавление задачи
    public void testAddTask() {
        //arrange
        String task = "test";
        Todos todos = new Todos();
        String expected = "test ";
        //act
        todos.addTask(task);
        String result = todos.getAllTasks();
        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test                                 //проверяем вывод в лексикографическом порядке
    public void testOutput() {
        //arrange
        String task1 = "c";
        String task2 = "b";
        String task3 = "a";
        Todos todos = new Todos();
        String expected = "a b c ";
        //act
        todos.addTask(task1);
        todos.addTask(task2);
        todos.addTask(task3);
        String result = todos.getAllTasks();
        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test                              // проверяем удаление задачи
    public void removeTaskTest() {
        //arrange
        String task1 = "c";
        String task2 = "b";
        String task3 = "a";
        Todos todos = new Todos();
        todos.addTask(task1);
        todos.addTask(task2);
        todos.addTask(task3);
        String expected = "a c ";
        //act
        todos.removeTask(task2);
        String result = todos.getAllTasks();
        //assert
        Assertions.assertEquals(expected, result);
    }
}
