package org.example;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    //Override eseten fv szignatura nem valtoztathato

    /*/
    @Override  //Ha az equalset overrideoljuk akkor a hashcode-ot is overrideolni kell
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof  Point)){
            return false;
        }
        else {
            Point other = (Point)obj; //DownCastolás
            return this.x == other.x && this.y == other.y;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x,this.y);
    }
*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    //Szabalyok amiket edemes betartani
    //-Vagy mindket metodust(equals, hashCode) vagy egyiket sem
    //-Két obj osszehasonlitasakor a legtobb esetben a ket objektumot az erteke alapjan akarom osszehasonlitani,
    //ehhez szukseg van az equals metodus felulirasara, ezeket siman le lehet generalni
    //
    //Ha a ket obj azonos az equals alapjanm, akkor a hashkódjuk is egyezzen meg

    //Polimorfizmus
    //TextBox -> UiWidget


    @Override
    public String toString(){
        //Point(x: 2,y: 5)
        return String.format("Point(x: %d, y: %d)", this.x, this.y);
    }
}
