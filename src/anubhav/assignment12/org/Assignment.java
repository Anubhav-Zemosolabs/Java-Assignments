package anubhav.assignment12.org;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Assignment {
    List<Student> studentList=StudentUtil.createStudents();
    private void departmentNames()
    {
        System.out.println("Question 1");
        studentList.stream()
                .map(Student::getDepartment)
                .distinct()
                .forEach(System.out::println);
        System.out.println();
    }
    private void studentNamesEnrolledAfter()
    {
        System.out.println("Question 2");
        studentList.stream()
                .filter(t->t.yearOfEnrollment>2018)
                .map(Student::getName)
                .forEach(System.out::println);
        System.out.println();
    }
    private void detailsOfMaleStudentInDepartment(){
        System.out.println("Question 3");
        studentList.stream()
                .filter(Student::getMale)
                .filter(t->t.getDepartment().equals("Computer Science"))
                .forEach(System.out::println);
        System.out.println();
    }
    private void noOfStudents(){
        System.out.println("Question 4");
        long noOfMale=studentList.stream()
                .filter(Student::getMale)
                .count();
        long noOfFeMale=studentList.stream()
                .filter(t->t.getMale()==false)
                .count();
        System.out.println("No of Male Students " + noOfMale);
        System.out.println("No of FeMale Students " + noOfFeMale);
        System.out.println();
    }
    private void averageAge(){
        System.out.println("Question 5");
        Map<Boolean, Double> studentStream=studentList.stream()
                .collect(Collectors.groupingBy(Student::getMale,Collectors.averagingInt(Student::getAge)));
        System.out.println("Female Age average "+ studentStream.get(false));
        System.out.println("Male Age average "+ studentStream.get(true));
        System.out.println();
    }
    private void highestPercentage(){
        System.out.println("Question 6");
        Optional<Student> highestPerformance=studentList.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Student::getPerformanceTillDate)));
        System.out.println(highestPerformance);
        System.out.println();
    }
    private void noOfStudentInEachDepartment(){
        System.out.println("Question 7");
        Map<String, Long> noOfStudent=studentList.stream().collect(Collectors.groupingBy(Student::getDepartment,Collectors.counting()));
        System.out.println(noOfStudent);
        System.out.println();
    }
    private void averagePercentageInEachDepartment()
    {
        System.out.println("Question 8");
        Map<String, Double> averagePercentage=studentList.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.averagingDouble(Student::getPerformanceTillDate)));
        System.out.println(averagePercentage);
        System.out.println();
    }
    private void youngestStudent(){
        System.out.println("Question 9");
        System.out.println(studentList.stream()
                .filter(t->t.getDepartment().equals("Electronic"))
                .collect(Collectors.minBy(Comparator.comparingInt(Student::getAge))));
        System.out.println();
    }
    private void noOfStudentsInComputerSc(){
        System.out.println("Question 10");
        Map<Boolean, Long> noOfStudent=studentList
                .stream()
                .filter(t->t.getDepartment().equals("Computer Science"))
                .collect(Collectors.groupingBy(Student::getMale,Collectors.counting()));
        System.out.println("No Of Male Student "+noOfStudent.get(true));
        System.out.println("No Of Female Student "+noOfStudent.get(false));
        System.out.println();
    }

    public static void main(String[] args) {
        new Assignment().departmentNames(); //Question 1
        new Assignment().studentNamesEnrolledAfter(); //Question 2
        new Assignment().detailsOfMaleStudentInDepartment(); //Question 3
        new Assignment().noOfStudents(); //Question 4
        new Assignment().averageAge(); //Question 5
        new Assignment().highestPercentage(); //Question 6
        new Assignment().noOfStudentInEachDepartment(); //Question 7
        new Assignment().averagePercentageInEachDepartment(); //Question 8
        new Assignment().youngestStudent(); //Question 9
        new Assignment().noOfStudentsInComputerSc(); //Question 10
    }
}
