package rocks.zipcode.io.quiz4.generics;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {



    public SortedGroup(){
        super();
    }
    @Override
    public void insert(Object value) {
        try {
            super.insert(value);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bound occured");
        }
    }

    @Override
    public void delete(Object value) {
        try {
            super.delete(value);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bound occured");
        }
    }


    public Integer indexOf(_ value) {

        return (Integer) super.fetch((int)value);
    }
}
