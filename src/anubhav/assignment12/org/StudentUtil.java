package anubhav.assignment12.org;

import java.util.ArrayList;
import java.util.List;

public class StudentUtil {
    static List<Student> studentsList;
    public static List<Student> createStudents()
    {
        studentsList=new ArrayList<>();
        studentsList.add(new Student(111, "Jiya Brein", 17, false, "Computer Science", 2018, 70.8));
        studentsList.add(new Student(122, "Paul Niksui", 18, true, "Mechanical", 2016, 50.2));
        studentsList.add(new Student(133, "Martin Theron", 17, true, "Electronic", 2017, 90.3));
        studentsList.add(new Student(144, "Murali Gowda", 18, true, "Electrical", 2018, 80));
        studentsList.add(new Student(155, "Nima Roy", 19, false, "Textile", 2016, 70));
        studentsList.add(new Student(166, "Iqbal Hussain", 18, true, "Security", 2016, 70));
        studentsList.add(new Student(177, "Manu Sharma", 16, true, "Chemical", 2018, 70));
        studentsList.add(new Student(188, "Wang Liu", 20, true, "Computer Science", 2015, 80));
        studentsList.add(new Student(199, "Amelia Zoe", 18, false, "Computer Science", 2016, 85));
        studentsList.add(new Student(200, "Jaden Dough", 18, true, "Security", 2015, 82));
        studentsList.add(new Student(211, "Jasna Kaur", 20, false, "Electronic", 2019, 83));
        studentsList.add(new Student(222, "Nitin Joshi", 19, true, "Textile", 2016, 60.4));
        studentsList.add(new Student(233, "Jyothi Reddy", 16, false, "Computer Science", 2015, 45.6));
        studentsList.add(new Student(244, "Nicolus Den", 16, true, "Electronic", 2017, 95.8));
        studentsList.add(new Student(255, "Ali Baig", 17, true, "Electronic", 2018, 88.4));
        studentsList.add(new Student(266, "Sanvi Pandey", 17, false, "Electric", 2019, 72.4));
        studentsList.add(new Student(277, "Anuj Chettiar", 18, true, "Computer Science", 2017, 57.5));
        return studentsList;
    }
}

