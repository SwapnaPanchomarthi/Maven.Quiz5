package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    private Student student;
    private List<Student> studentList;
    private Map<Student, Double> map;

    public ZipCodeWilmington()
    {
        this.studentList= new ArrayList<Student>();
        this.map=new TreeMap<>();

    }
    public ZipCodeWilmington(Student student){
        this.student=student;
        this.studentList= new ArrayList<Student>();
    }
    public void enroll(Student student) {
        studentList.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return studentList.contains(student);
    }

    public void lecture(double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours/studentList.size();

    }

    public Map<Student, Double> getStudyMap() {

        return (Map<Student, Double>) map.entrySet();
    }
}
