package org.example;

import javax.swing.plaf.metal.MetalBorders;

public class Main {
    public static void main(String[] args) {
        UIWidget[] widgets = {new TextBox(), new RadioButton()};

        for(UIWidget widget: widgets){
            System.out.println(widget.getClass());
            widget.render();
        }
    }


    //Encapsulation(Egysegbe zaras) Amikor az adatokat(mezoket, valtozokat stb) és az ezeken muveleteket vegzo metodusokat egyutt kezeljuk
    //Polimorfizmus-- Mindig a felulirt metodusok ..

    //Absztrakt osztalyok, metodusok
    //Ez az oszaly nem peldanyosithato viszont kiterjesztheto


    //Ha egy oszaly kiterjeszti azt az osztalyt aminek van absztrakt metodusa, akkor az alosztalynak implementalnia kell majd ezt a metodust
}