package org.example;

public class UIWidget {
    private boolean isEnabled = true;

    public UIWidget(boolean isEnabled){
        this.isEnabled = isEnabled;
        System.out.println("UIWidget létrehozva");

    }

    public void enable(){
        this.isEnabled = true;
    }

    public void disable(){
        this.isEnabled = false;
    }

    public boolean isEnabled(){
        return this.isEnabled;
    }
}
