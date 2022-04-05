package com.artemvasin.spring;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setPet(Pet pet) {    // сетер нужен для внедрения через сетер, для конструтора не нужен
        this.pet = pet;
    }

    //    public Person(Pet pet) {     это если внедряем через конструктор
//        this.pet = pet;
//    }
    public Person() {
    }

    public void callYourPet() {
        System.out.println("privet my Pet");
        pet.say();
    }
}
