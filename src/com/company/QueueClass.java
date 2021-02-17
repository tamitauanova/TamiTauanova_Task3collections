package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class QueueClass {

//    Создаем очередь к врачу. Работаем в цикле, добавляем и удаляем элементы коллекции.
//        Первый пришел - первый вышел, однако каждый 3й раз в кабинет заходит (печатается на экран и удаляется)
//        тот кто пришел последний.
    public void hospitalPatients() {
        LinkedList<Integer> patients = new LinkedList<Integer>();
        patients.add(1);
        patients.add(2);
        patients.add(3);
        patients.add(4);
        patients.add(5);
        int counter = 1;
        while (patients.size() > 1) {
            if (counter % 3 == 0) {
                System.out.println(patients.pollFirst());
            }
            System.out.println(patients.pollLast());
            counter++;
            patients.add((int) (Math.random()*100));
            System.out.println(patients);
        }
    }

//    Создаем гонку на выбывание. Создаем коллекцию, заполняем элементами. Рандомно сортируем.
//    Последний элемент печатаем и удаляем. Так до тех пор пока в коллекции на останется 1 элемент.
    public static void queueTask() {
        LinkedList<Integer> gonka = new LinkedList<>();
        gonka.add(1);
        gonka.add(2);
        gonka.add(3);
        gonka.add(4);
        gonka.add(5);
        Collections.shuffle(gonka);
        System.out.println(gonka);

        while (gonka.size() > 1) {
            System.out.println("Last element is " + gonka.getLast());
            System.out.println(gonka);
            gonka.pollLast();
        }
        System.out.println(gonka);
        }
    }

