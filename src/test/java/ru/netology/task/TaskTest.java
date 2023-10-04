package ru.netology.task;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class TaskTest {
    @Test
    public void test1() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        SimpleTask task = new SimpleTask(5, "Позвонить родителям");
        boolean actual = task.matches("Позвонить");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        SimpleTask task = new SimpleTask(5, "Позвонить родителям");
        boolean expected = false;
        boolean actual = task.matches("Написать");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean expected = true;
        boolean actual = epic.matches("Молоко");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean expected = false;
        boolean actual = epic.matches("Пироги");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test5() {


        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean expected = true;
        boolean actual = meeting.matches("Выкатка 3й версии приложения");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean expected = true;
        boolean actual = meeting.matches("Приложение НетоБанка");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean expected = false;
        boolean actual = meeting.matches("Закатка");
        Assertions.assertEquals(expected, actual);
    }

}


