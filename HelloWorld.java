package com.goldspacebear.learnjava;

public class HelloWorld {
    public static void main(String [] args) {
        int lives = 3;
        boolean isGameOver = (lives < 1);
        System.out.println(isGameOver);
        if (isGameOver){
            System.out.println("Game Over!");
        }
        else
            System.out.println("You're still alive!");
    }
}
