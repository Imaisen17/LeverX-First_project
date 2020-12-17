package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cont;
        Dogs[] arrdogs = Dogs.createDogsArray(2);
        Dogs.showArrayDogs(arrdogs);
        Staff[] staff = Staff.createStaffArray(2);
        Aviary[] aviary = Aviary.createAviaryArray(2);
        do {
            System.out.println("What actions should the staff take?" + "\n" +
                    "1 - Feeding" + "\n"
                    + "2 - Training" + "\n"
                    + "3 - Therapy" + "\n"
                    + "4 - Searching for dogs ready to go to work"+ "\n"
                    + "5 - Сleaning the aviary");
            Staff.actions(arrdogs, sc.nextInt(), staff, aviary);
            System.out.println("Do you want to continue?");
            cont = sc.next();
        } while (cont.equals("yes"));
    }
}
