package in.podtest;

public class Teacher {
    String teacherName;
    String subject;

    Teacher(String teacherName,String subject)
    {
        this.teacherName = teacherName;
        this.subject = subject;
    }

    public void getTeacherInfo()
    {
        System.out.println("Teacher Name is: "+teacherName+" and Subject is: "+subject);
    }
}
