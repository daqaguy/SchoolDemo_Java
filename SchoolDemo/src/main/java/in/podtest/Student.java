package in.podtest;

public class Student {

    String name;
    String rollNo;
    int[] marks;
    Teacher classTeacher;

    Student(String name,String rollNo,int[] marks,Teacher classTeacher)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.classTeacher = classTeacher;
    }

    public void getStudentInfo()
    {
        System.out.println("Student Name is: "+name+" Roll No is: "+rollNo);
        System.out.println("Total Marks are: "+getTotalMarks()+" Class Teacher name is: "+classTeacher.teacherName);
    }

    public int getTotalMarks()
    {
        int totalMarks = 0;
        for (int i: marks)
        {
            totalMarks = totalMarks +i;
        }
        return totalMarks;
    }

}
