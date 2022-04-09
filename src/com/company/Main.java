package com.company;

public class Main {

    public static void main(String[] args) {
	Days days = Days.MONDAY;

    switch (days){

        case MONDAY -> System.out.println("Дүйшөнбу күнү JAVA сабагы болот,жаңы тема өтүлөт. ");
        case TUESDAY -> System.out.println("Шейшемби күнү бизде SoftSkills өтөт.");
        case WEDNESDAY -> System.out.println(" Шаршемби - JAVA жаңы тема өтөбүз.");
        case THURSDAY -> System.out.println("Бейшемби - практика.");
        case FRIDAY -> System.out.println("Жума күнү - бышыктоо,өтүлгөн эки жаңы теманы кайталоо.");
        case SATURDAY -> System.out.println("Ишенби - эс алуу.");
        case SUNDAY-> System.out.println("Ишенби Англис тили");


    }
    }
}
