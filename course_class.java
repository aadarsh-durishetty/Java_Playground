package workout;
//import java.util.*;
public class course_class {
    public static void main(String[] args) {
        class course {
            String name;
            int id;
            String type;
            String school;

            public void set(String name1, int id1, String type1, String school1) {
                name = name1;
                id = id1;
                type = type1;
                school = school1;
            }

            public void get() {
                System.out.println("Name: " + name + " - ID: " + id + " - Type: " + type + " - School: " + school);
            }

            public void search() {
                if (school == "scope")
                    System.out.println("Student from scope school");
                else
                    System.out.println("Student not from scope school");

            }
        }

        course c1 = new course();
        course c2 = new course();
        c1.set("aadarsh", 3815, "theory", "scope");
        c2.set("vishal", 3678, "lab", "site");
        c1.get();
        c1.search();
        c2.get();
        c2.search();

    }
}