package ru.netology.javacore;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Todos {
    String type;
    String task;

    List<String> todos = new ArrayList<>();

    public Todos(){}
    public Todos (String type, String task){
        this.type = type;
        this.task = task;
    }
    String getType(){
        return type;
    }
    String getTask(){
        return task;
    }

    public void addTask(String task) {
        todos.add(task);
    }

    public void removeTask(String task) {
        todos.remove(task);
    }

    public String getAllTasks() {
        StringBuilder result = new StringBuilder();
        todos.stream()
                .sorted()
                .forEach(todos -> result.append(todos).append(" "));
        return result.toString();
    }

//    public boolean isEmpty(){
//        return todos.isEmpty();
//    }
}
