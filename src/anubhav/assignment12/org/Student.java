package anubhav.assignment12.org;

public class Student {
    int id;
    String name;
    int age;
    Boolean isMale;
    String department;
    int yearOfEnrollment;
    double performanceTillDate;

    public Student(int id, String name, int age, Boolean isMale, String department, int yearOfEnrollment, double performanceTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.department = department;
        this.yearOfEnrollment = yearOfEnrollment;
        this.performanceTillDate = performanceTillDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getMale() {
        return isMale;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public void setYearOfEnrollment(int yearOfEnrollment) {
        this.yearOfEnrollment = yearOfEnrollment;
    }

    public double getPerformanceTillDate() {
        return performanceTillDate;
    }

    public void setPerformanceTillDate(double performanceTillDate) {
        this.performanceTillDate = performanceTillDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                ", department='" + department + '\'' +
                ", yearOfEnrollment=" + yearOfEnrollment +
                ", performanceTillDate=" + performanceTillDate +
                '}';
    }
}