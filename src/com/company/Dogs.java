package com.company;

import java.util.Scanner;

public class Dogs {
    private int id;
    private String name;
    private int age;
    private boolean isTrained;
    private boolean isHungry;
    private boolean isSick;


    public Dogs(int id, String name, int age, boolean isTrained, boolean isHungry, boolean isSick) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isTrained = isTrained;
        this.isHungry = isHungry;
        this.isSick = isSick;
    }

    public Dogs() {
    }

       public static Dogs[] createDogsArray (int n){
            Dogs[] arrdogs = new Dogs[n];
            for (int i = 0; i<arrdogs.length; i++){
                arrdogs[i] = new Dogs();
                arrdogs[i].createDog();
            }
            return arrdogs;
        }
    public void createDog(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dog id ");
        id = sc.nextInt();
        System.out.println("Enter the dog name ");
        name = sc.next();
        System.out.println("Enter the dog age ");
        age = sc.nextInt();
        System.out.println("Is the dog trained? ");
        if (sc.next().equals("yes")){
            isTrained = true;
        }else isTrained = false;
        System.out.println("Is the dog hungry?");
        if (sc.next().equals("yes")){
            isHungry = true;
        }else isHungry = false;
        System.out.println("Is the dog sick?");
        if (sc.next().equals("yes")){
            isSick = true;
        }else isSick = false;
    }
    public void showInfo(){
        System.out.println("ID - " + id + "\n"
                          + "Name - " + name + "\n"
                          +  "Age - " + age + "\n"
                          + "Trained -" + isTrained +"\n"
                          + "Hungry - " + isHungry +"\n"
                          + "Is it sick - " + isSick);
    }
    public static void showArrayDogs(Dogs [] arr){
        for (int i = 0 ; i< arr.length; i++){
            arr[i].showInfo();
        }
    }
    public void bark(){
        System.out.println("Gav - gav :))");
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public boolean isSick() {
        return isSick;
    }

    public void setSick(boolean sick) {
        isSick = sick;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
