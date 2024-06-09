package ru.netology.services;

public class VacationCalculator {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // остаток накоплений
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3; // траты на отдых
            } else {
                money = money + income - expenses; // работаем и тратим на обязательные расходы
            }
        }
        return count;
    }
}
