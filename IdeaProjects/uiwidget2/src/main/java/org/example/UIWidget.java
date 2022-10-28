package org.example;

public abstract class UIWidget {
    private boolean isEnabled = true;

    public UIWidget(boolean isEnabled){
        this.isEnabled = isEnabled;
        //System.out.println("UIWidget létrehozva");

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

    //Azert lett letrehozva, hogy majd aki megorokli az felulirja
    public abstract void render();
    //Ha egy osztalyon belul van egy absztrakt metodus akkor maganak az osztalynak is absztraktnak kell lennie
    //Absztrakt metodus csak absztrakt osztalyban szerepelhet
    //Közös kód biztosítása a alosztályai számára
}