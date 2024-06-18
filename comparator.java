package sorting; 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    int id ;
    int age ;

    public Student(String name, int id ,int age ) {

        this.name = name;
        this.id = id;
        this.age = age ;

    }
    public String toString (){
        return "id "+id + " NAME "+ name +" Age "+age ;
    }




}
public class comparator {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Rohan", 10 , 12 ));
        list.add(new Student("Anupam", 1,13));
        list.add(new Student("Shyam", 12,12 ));
        list.add(new Student("Bro", 9,11));

        Comparator<Student> idCompare = new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student  o2) {
                return o1.id-o2.id;
            }
        };

        Comparator<Student> nameCompare = new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student  o2) {
                return o1.name.compareTo(o2.name);
            }
        };
        Comparator<Student> ageCompare = new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student  o2) {
                if(o1.age!= o2.age)return o1.age-o2.age;
                else{
                    return o1.name.compareTo(o2.name);
                }
            }
        };
        System.out.println(list);
        Collections.sort(list,ageCompare);
        System.out.println(list);

    }
}
