package com.company;

import java.util.Scanner;

public class Aviary {
    Scanner sc = new Scanner(System.in);

    private int id;
    private boolean isClean;

    public Aviary(int id, boolean isClean) {
        this.id = id;
        this.isClean = isClean;
    }

    public Aviary() {
    }
    public void createAviary() {
        System.out.println("Enter id aviary");
        id = sc.nextInt();
        System.out.println("Is the aviary clean?");
        if (sc.next().equals("yes")) {
            isClean = true;
        } else {
            isClean = false;
        }
    }
    public static Aviary[] createAviaryArray (int n){
        Aviary[] arrAviary = new Aviary[n];
        for (int i = 0; i<arrAviary.length; i++){
            arrAviary[i] = new Aviary();
            arrAviary[i].createAviary();
        }
        return arrAviary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }
}
