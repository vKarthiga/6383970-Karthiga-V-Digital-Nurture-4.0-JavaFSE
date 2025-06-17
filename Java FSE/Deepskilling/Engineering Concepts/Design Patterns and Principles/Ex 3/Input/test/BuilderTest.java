package com.builder.test;

import com.builder.computer.Computer;

public class BuilderTest {
    public static void main(String[] args) {

        // Create a basic computer
        Computer basicComputer = new Computer.Builder("Intel i3", "8GB")
                .storage(256)
                .build();

        System.out.println("Basic Computer:");
        basicComputer.showConfig();

        System.out.println();

        // Create a gaming computer
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .storage(1024)
                .graphicsCard(true)
                .bluetooth(true)
                .build();

        System.out.println("Gaming Computer:");
        gamingComputer.showConfig();
    }
}
