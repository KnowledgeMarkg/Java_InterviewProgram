package com.Supai.assesment;

public class InterviewQuestions {

    public static void main(String[] args) {
        int result = execute();
        System.out.println("Result: " + result);
    }

    private static int execute() {
        try {
            System.out.println("Try");
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("Catch");
            return 1;
        } finally {
            System.out.println("Finally");
        }
    }
}

