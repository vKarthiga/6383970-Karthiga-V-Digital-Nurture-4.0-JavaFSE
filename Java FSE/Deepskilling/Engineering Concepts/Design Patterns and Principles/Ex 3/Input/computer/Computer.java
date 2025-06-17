package com.builder.computer;

public class Computer {
    // Required parameters
    private final String CPU;
    private final String RAM;

    // Optional parameters
    private final int storage;
    private final boolean hasGraphicsCard;
    private final boolean hasBluetooth;

    // Private constructor: use builder to create object
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasBluetooth = builder.hasBluetooth;
    }

    // Static nested Builder class
    public static class Builder {
        // Required parameters
        private final String CPU;
        private final String RAM;

        // Optional parameters with defaults
        private int storage = 0;
        private boolean hasGraphicsCard = false;
        private boolean hasBluetooth = false;

        // Constructor for required parameters
        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        // Setter methods for optional parameters
        public Builder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder graphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Builder bluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        // Build method
        public Computer build() {
            return new Computer(this);
        }
    }

    // Method to display configuration
    public void showConfig() {
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Graphics Card: " + (hasGraphicsCard ? "Yes" : "No"));
        System.out.println("Bluetooth: " + (hasBluetooth ? "Yes" : "No"));
    }
}
