package com.company;

public class CreditCard {

//Создаем список кредитных карточек банка, список должен иметь только уникальные значения.
// Для карточки можно создать соответствующую сущность или же использовать просто 12ти символьный любой набор чисел.

    private long number;

    public CreditCard(long number) {
        this.number = number;
    }
    public long getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number=" + number +
                '}';
    }
}
