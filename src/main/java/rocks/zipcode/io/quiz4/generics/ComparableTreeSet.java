package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class    ComparableTreeSet<_ extends Comparable> extends TreeSet<_> implements Comparable<ComparableTreeSet<_>>{
   private TreeSet<_> i;



    public ComparableTreeSet(_... arr) {
        for(_ el: arr)
        {
            add(el);
        }
    }



    public ComparableTreeSet() {
        this.i= new TreeSet<_>();
        ;
    }

    public int compareTo(ComparableTreeSet<_> o) {

        Iterator<_> other =o.iterator();

        for(_ cur :this){
            _ otherObject = other.next();

            if(cur.compareTo(otherObject)!=0){
                return cur.compareTo(otherObject);
            }
        }

        return 0;
    }

//    @Override
//    public int compareTo(_ o) {
//
//        return toString().compareTo(o.toString());
//    }
}
