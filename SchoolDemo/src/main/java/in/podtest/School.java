package in.podtest;

public class School {

    public static void main(String[] args)
    {
        Teacher t1 = new Teacher("Dhoni","Maths");
        Teacher t2 = new Teacher("Sachin","Physics");

        Student s1 = new Student("Rohit","45",new int[]{264,209,219},t1);
        Student s2 = new Student("Virat","18",new int[]{183,152,105},t2);
        Student s3 = new Student("Bumrah","25",new int[]{0,1,2},t2);
        Student s4 = new Student("Pandya","52",new int[]{45,18,128},t1);

        t1.getTeacherInfo();
        t2.getTeacherInfo();

        s1.getStudentInfo();
        s2.getStudentInfo();
        s3.getStudentInfo();
        s4.getStudentInfo();



    }
}
