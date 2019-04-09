package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup <T> implements Iterable<T> {

    private List<T> list;
    public SimpleStringGroup() {

        list=new ArrayList<T>();
    }

    public Integer count() {

        return list.size();
    }

    public void insert(T string) {


    list.add(string);
    }

    public Boolean has(String string) {
        return list.contains(string);
    }

    public String fetch(int indexOfValue) {
        return (String) list.get(indexOfValue);
    }

    public void delete(String string) {
        list.remove(string);
    }

    public void clear() {
        list.clear();
    }


    @Override
    public Iterator<T> iterator() {

         return list.iterator();
    }
}
