package rocks.zipcode.io.quiz4.generics;

import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class    ComparableTreeSet<_> implements Comparable<_>{
   private TreeSet<_> i;

    public _ getPrice() {
        return price;
    }

    public void setPrice(_ price) {
        this.price = price;
    }

    private _ price;

    @Override
    public String toString() {
        return  i +
                ", price=" + price +
                '}';
    }

    public ComparableTreeSet(_... arr) {
    }


    public ComparableTreeSet() {
        this.i= new TreeSet<_>();
        this.price=null;
    }

    public int compareTo(ComparableTreeSet<_> o) {

        for (int j=0;j<i.size();j++) {


        }
        return Integer.valueOf(null);
    }

    @Override
    public int compareTo(_ o) {

        return 0;
    }
}
