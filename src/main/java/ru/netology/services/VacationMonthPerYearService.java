package ru.netology.services;

public class VacationMonthPerYearService {
    public int calculate(int income, int expenses, int threshold) {
        int counter = 0; // счётчик отпускных месяцов
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем отдыхать
                money = (money - expenses) / 3;
                counter++; // увеличиваем счётчик отпускных месяцов
            } else {
                money = (money + income) - expenses;
            }
        }
        return counter;
    }
}
