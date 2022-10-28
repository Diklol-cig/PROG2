package org.example;

public class Main {
    public static void main(String[] args) {

        //UIWidget widget = new UIWidget(true);

        //System.out.println(widget.isEnabled());

        //widget.disable();

        //System.out.println(widget.isEnabled());
        //System.out.println("---");

        //TextBox tb1 = new TextBox(); //Automatikusan csak a parameter nelkuli konstruktort tudja meghivni a szuloosztalyban

        //System.out.println(tb1.isEnabled());

        //tb1.disable();

        //System.out.println(tb1.isEnabled());

        //tb1.setText("Hello");

        //System.out.println(tb1.getText());

        //tb1.clear();

        //System.out.println(tb1.getText() + "-ennyi");

        //obj.equals 2 obj tartalma szerinti osszehasonlitas

        //obj.hashcode veszi az obj memoriacimet es a hashelt memoriacimet adja vissza

        //obj.wait nem fogunk ra kiterni xd + notify + notifyAll

        //TextBox tb2 = tb1;

        //System.out.println(tb1.equals(tb2));

        //TextBox box1 = new TextBox();

        //TextBox box2 = new TextBox();

        //System.out.println(box1.equals(box2));  //Azert false mert memoriacim szerint hasonlit ossze

        //Minden rendszerben igaz az, hogy mindenutt ahol egy szuperosztaly peldanya szerepelt, szerepelhet egy alosztaly peldanya is, de fordítva nem!!!!!

        UIWidget widget = new UIWidget(true);

        TextBox box = new TextBox();
        show(widget); //ClassCastException hiba
        box.setText("Anyad");
        show(box);
    }

    //Egy gyermekosztaly objektuma mindig castolhato a szuloosztaly tipusara -> Outcasting
    //Viszont a szulosztaly egy peldanya nem alakithato at a gyermekosztaly egy típusára (Kivéve 1 eset: )
    //A downcasting csak akkor mukodik amikor A -> B (Outcast) utana B->A(Downcast)
    public static void show(UIWidget widget){
        //DownCastolás
        if (widget instanceof TextBox){
            TextBox box = (TextBox)widget;
            box.setText("Na");
        }
        System.out.println(widget);
    }
}