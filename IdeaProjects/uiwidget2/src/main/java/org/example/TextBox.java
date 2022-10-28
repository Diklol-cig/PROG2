package org.example;

public class TextBox extends UIWidget{
    private String text = "";

    public TextBox(){
        super(true);
        //A szuloosztaly konstrukorat explicit modon meg kell hivni itt ha van parametere

        //System.out.println("TextBox letrehozva");
    }
    //Mi kell nekunk
    //setText
    //getText
    //clear

    public String getText(){
        return this.text;
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        this.text = "";
    }

    @Override
    public String toString(){
        return this.text.toString();
    }

    @Override
    public void render() {
        System.out.println("Render Textbox");
    }
}