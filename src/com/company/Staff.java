package com.company;

import java.util.Scanner;

public class Staff {
    private int id;
    private String name;
    private  String position;

    Scanner sc = new Scanner(System.in);
    public Staff() {
    }

    public Staff(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public void createStaff(){
        System.out.println("Enter employee id - ");
        id = sc.nextInt();
        System.out.println("Enter employee name - ");
        name = sc.next();
        System.out.println("Enter employee position - ");
        position = sc.next();
    }
    public static Staff[] createStaffArray (int n){
        Staff[] arrStaff = new Staff[n];
        for (int i = 0; i<arrStaff.length; i++){
            arrStaff[i] = new Staff();
            arrStaff[i].createStaff();
        }
        return arrStaff;
    }

    public void showInfo(){
        System.out.print("ID - " + id + "\n"
                + "Name - " + name + "\n"
                + "Position is - " + position);
    }

    public static void showArrayStaff(Staff [] arr){
        for (int i = 0 ; i< arr.length; i++){
            arr[i].showInfo();
        }
    }
    public static void actions(Dogs[] arr, int n, Staff [] arr2, Aviary[] arr3){
        switch (n){
            case 1:{
                for (int i = 0; i<arr.length; i++){
                    if (arr[i].isHungry()){
                        if (arr[i].getAge()<=1) {
                            arr[i].setHungry(false);
                            System.out.println("Dog with id - " + arr[i].getId() + " fed according to the diet for puppies");
                        }
                        if (arr[i].getAge()>1 && arr[i].getAge()<8){
                            arr[i].setHungry(false);
                            System.out.println("Dog with id - " + arr[i].getId() + " fed according to the diet for adult dogs");
                        }
                        if (arr[i].getAge()>8){
                            arr[i].setHungry(false);
                            System.out.println("Dog with id - " + arr[i].getId() + " fed according to the diet for older dogs");
                        }
                    }
                }
            }break;
            case 2:{
                for (int i = 0; i<arr.length; i++){
                    if(arr[i].getAge()<=1 && arr[i].isTrained() == false){
                        TrainingGround.training(arr[i]);
                    }
                }
            }break;
            case 3:{
                for (int i = 0; i<arr.length; i++){
                    if(arr[i].isSick() == true){
                        arr[i].setSick(false);
                        System.out.println("Dog with id" + arr[i].getId()+" "+ arr[i].getName()+ " was cured");
                    }
                }
            }break;
            case 4:{
                for (int i = 0; i<arr.length; i++){
                    if(arr[i].isSick() == false && arr[i].getAge()<8){
                        System.out.println("Dog with id " + arr[i].getId() + " ready to work");
                    }
                }
            }break;
            case 5:{
                for (int i =0; i<arr2.length; i++){
                    if(arr2[i].position.equals("cleaner")) {
                        for (int j= 0; j< arr3.length; j++){
                            if (arr3[j].isClean() == false){
                                System.out.println("Worker id - " + arr2[i].getId() + " cleaned the aviary " + arr3[j].getId());
                                arr3[j].setClean(true);
                            }
                        }

                    }
                }

            }break;
            default:{
                System.out.println("Enter the correct number ");
            }

        }

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
