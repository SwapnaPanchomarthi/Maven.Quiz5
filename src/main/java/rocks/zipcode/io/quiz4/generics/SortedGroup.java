package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T> extends Group<T> {

    private TreeSet<T> treeSet;

    public SortedGroup(){

       this.treeSet=new TreeSet<>();
    }


    @Override
    public void insert(Object value) {

        treeSet.add((T) value);
    }

    @Override
    public void delete(Object value) {

        treeSet.remove(value);
    }


    public Integer indexOf(T value) {

        //
        // return (Integer) super.fetch((int)value);
        return treeSet.headSet(value).size();
    }
}
