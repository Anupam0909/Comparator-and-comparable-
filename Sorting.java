package sorting;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


class student implements Comparable<student>{
         String name;
         int id;
         int age;
         String code;


         public student(String name, int id, int age, String code) {
             this.name = name;
             this.id = id;
             this.age = age;
             this.code = code;
         }

         public String toString() {
             return " id " + id + " Name " + name + " AGE " + age + " Code " + code;
         }

         @Override
//        public int compareTo(student o2) {
//             return this.name.compareTo(o2.name);
//        }
//         public int compareTo(student o2) {
//             return this.id-o2.id;
//         }
//public int compareTo(student o2){
//             return this.code.compareTo(o2.code);
//         }
//         public int compareTo(student o2){
//             return o2.id-this.id;
//         }
         public int compareTo(student o2) {
             if (this.age != o2.age) {
                 return this.age-o2.age;
             }
             else {
                 return this.name.compareTo(o2.name);
             }
         }

}

         public class Sorting {

    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        //student student1 = new student()
       student st1 = new student("rohan" ,001 , 12,"dd001");
        list.add(st1);
        list.add( new student("ram" ,002 , 13,"ab001"));
        list.add( new student("Anupam" ,003 , 14,"aa001"));
        list.add( new student("aryan" ,000 , 14,"ad001"));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
