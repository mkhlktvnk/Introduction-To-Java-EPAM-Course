package com.company;

public class MenuPrinter {
    private final String[] menuOptions;

    public MenuPrinter(String... menuOptions) {
        this.menuOptions = menuOptions.clone();
    }

    public void print() {
        for (String option : menuOptions) {
            System.out.println(option);
        }
    }
}
