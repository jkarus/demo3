package com.example.demo.model;

public class ProcessResult {
    private int postValue;
    private int randomData;
    private int total;
    private String taskResult;

    public ProcessResult(int postValue, int randomData, int total, String taskResult) {
        this.postValue = postValue;
        this.randomData = randomData;
        this.total = total;
        this.taskResult = taskResult;
    }

    // Getters и Setters
    public int getPostValue() {
        return postValue;
    }

    public int getRandomData() {
        return randomData;
    }

    public int getTotal() {
        return total;
    }

    public String getTaskResult() {
        return taskResult;
    }
}
