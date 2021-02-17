package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        QueueClass emptyQueue = new QueueClass();
        emptyQueue.hospitalPatients();

        QueueClass.queueTask();

        ListClass.listTask();

        ListClass.jengaList();

        int numberOfCards = 10;
        Set<CreditCard> creditCards = new HashSet<>();
        for (int i = 0; i < numberOfCards; i++) {
            creditCards.add(new CreditCard(new Random().nextLong()));
        }
            System.out.println(creditCards.toString());

        MapClass mapClass = new MapClass();
        mapClass.register("5", "tami");
        mapClass.register("6", "tom");
        mapClass.register("7", "jim");
        System.out.println(mapClass.users);
        mapClass.deleteUser("6");
        System.out.println(mapClass.users);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter username: ");
        String userNameValue = scanner.next();
        System.out.println(userNameValue);
        }
    }




