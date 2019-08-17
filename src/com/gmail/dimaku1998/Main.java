/*2) Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда
начинается с единицы. На одном этаже 4 квартиры. Напишите программу
которая получит номер квартиры с клавиатуры, и выведет на экран на
каком этаже, какого подъезда расположенна эта квартира. Если такой
квартиры нет в этом доме то нужно сообщить об этом пользователю. */
package com.gmail.dimaku1998;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number room = ");
        int room = sc .nextInt();
        if(room > 0 && room < 145){
            System.out.println("Porch = " + (((room - 1)/36) +1) );
            System.out.println("Floor  = " + ((((room-1) % 36) / 4)+1));
        }else
            System.out.println(" Room not found");
    }
}
