package bai15_student;
//Viết một class Student với các thuộc tính sau:
//Mã số sinh viên (studentId) kiểu int.
//Họ và tên (name) kiểu String.
//Điểm trung bình (averageScore) kiểu double.
//Viết các phương thức getter và setter cho các thuộc tính của class Student.

public class Student {
    private int studentId;
    private String name;
    private double averageScore;

    public Student(int studentId, String name, double averageScore) {
        this.studentId = studentId;
        this.name = name;
        this.averageScore = averageScore;
    }

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAverageScore() {
        return averageScore;
    }
    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
