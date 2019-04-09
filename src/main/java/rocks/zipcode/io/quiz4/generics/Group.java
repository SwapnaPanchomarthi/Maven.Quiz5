package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements Iterable, GroupInterface {
    private List<_> group;

    public Group() {
       this.group=new ArrayList<>();

    }

    public Integer count() {
        return group.size();
    }

    @Override
    public Boolean has(Object valueToInsert) {
         return group.contains(valueToInsert);
    }

//    public void insert(_ value) {
//        try {
//            group.add(value);
//        }catch (StackOverflowError error){
//            System.out.println("java.lang.StackOverflowError");
//        }
//    }

//    public Boolean has(_ value) {
//        return group.contains(value);
//    }

    public _ fetch(int indexOfValue) {
        return group.get(indexOfValue);
    }

    @Override
    public void insert(Object string) {
        try {
            group.add((_) string);
        }catch (StackOverflowError error){
            System.out.println("java.lang.StackOverflowError");
        }
    }

    @Override
    public void delete(Object valueToInsert) {

    group.remove(valueToInsert);
    }
//
//    public void delete(_ value) {
//        group.remove(value);
//    }

    public void clear() {
        group.clear();
    }

    public Iterator<_> iterator() {

         return group.iterator();
    }

    @Override
    public String toString() {
        return String.valueOf(group);
    }
}
