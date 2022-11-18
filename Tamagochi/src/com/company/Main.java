package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    static int hunger = ThreadLocalRandom.current().nextInt(0, 84);
    static int happiness = ThreadLocalRandom.current().nextInt(0, 84);
    static int sleepiness = ThreadLocalRandom.current().nextInt(0, 84);
    static int fullness = ThreadLocalRandom.current().nextInt(0, 84);

    public static void showStats() {


        System.out.println("Your Tamagochi's hunger is " + hunger);
        System.out.println("Your Tamagochi's happiness is " + happiness);
        System.out.println("Your Tamagochi's sleepiness is " + sleepiness);
        System.out.println("Your Tamagochi's fullness is " + fullness);

    }

    public static void feedTamagochi() {
        if (hunger - 15 < 0) {
            System.out.println("Your Tamagochi's hunger is fine. Choose something else!");
            hunger = 0;
            chooseAction();
        } else {
            hunger -= 15;
            fullness += 15;
        }
    }

    public static void playWith() {
        if (happiness + 15 > 100) {
            System.out.println("Your Tamagochi's happiness is fine. Choose something else!");
            happiness = 100;
            chooseAction();
        } else {
            happiness += 15;
            sleepiness += 15;
        }
    }

    public static void sleepTama() {
        if (sleepiness - 15 < 0) {
            System.out.println("Not sleepy!");
            sleepiness = 0;
        } else {
            sleepiness -= 15;
        }
    }

    public static void poopTama() {
        if (fullness - 15 < 0) {
            System.out.println("Does not need to poop!");
            fullness = 0;
        } else {
            fullness -= 15;
        }

    }

    public static void overtimeTama() {
        sleepiness += 15;
        hunger += 15;
        happiness -= 15;

    }

    public static void chooseAction() {
        System.out.println("Choose Tamagochi Action!");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.next();
        switch (action) {
            case "feed":
                feedTamagochi();
                showStats();
                chooseAction();
            case "play":
                playWith();
                showStats();
                chooseAction();
            case "sleep":
                sleepTama();
                showStats();
                chooseAction();
            case "poop":
                poopTama();
                showStats();
                chooseAction();
            case "overtime":
                overtimeTama();
                showStats();
                chooseAction();
            case "quit":
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("Invalid command action");
                chooseAction();
        }
    }


    public static void main(String[] args) {

        System.out.println("Welcome to Tamagochi! Currently, your Tamagochi has the following stats:");
        showStats();
        chooseAction();


    }


}
