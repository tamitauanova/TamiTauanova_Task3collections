package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListClass {

//    Создаем список в котором добавляем элементы поочередно в начало и конец списка,
//    после чего вычитываем данный список наоборот (по элементу с конца и начала)
   public static void listTask() {
      LinkedList<String> list = new LinkedList<>();
       for (int i = 0; i < 5; i++) {
           if (i % 2 == 0) {
               list.add(String.valueOf((int) (Math.random() * 100)));
           } else {
               list.addFirst(String.valueOf((int) (Math.random() * 100)));
           }
       }
       System.out.println(list);
       for (int i = 0; i < 5; i++) {
           if (i % 2 == 0) {
               System.out.println(list.pollLast());
           } else {
               System.out.println(list.pollFirst());
           }
       }
       System.out.println(list);
   }
//    Создаем игру “Дженга”. Рандомно достаем из середины (не первый и не последний элемент)
//    их коллекции и кладем в конец.
    public static void jengaList() {
       Random random = new Random();
       LinkedList<Integer> blocks = new LinkedList<>();
       int index = random.nextInt();
       for (int i = 0; i < 10; i++) {
           blocks.add(i);
       }
       Collections.shuffle(blocks);
       System.out.println(blocks);

       for (int i = 0; i < 11; i++) {
           int index1 = random.nextInt(blocks.size()-1);
           if (index1 != 0) {
               int number = blocks.get(index1);
               System.out.println(number);
               blocks.remove(index1);
               blocks.addLast(number);
               System.out.println(blocks);
           }
       }
   }
    }

