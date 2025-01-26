public class CallingConstructor {
     String name;
     String  age;
     String grade;
     String course;

    public CallingConstructor()
    {
        System.out.println("Details of the student");
    }
    public CallingConstructor(String name)
    {
        this();
        this.name = name;
        System.out.println("NAME:" + name);
    }
    public CallingConstructor(String name , String age)
    {
        this(name);
        this.name = name ;
        this.age = age;
        System.out.println("AGE:" + age);
    }
    public CallingConstructor(String name , String age , String grade)
    {
        this(name,age);
        this.name = name ;
        this.age = age;
        this.grade = grade;
        System.out.println("GRADE:" + grade);
    }
    public CallingConstructor(String name , String age , String grade , String course)
    {
        this(name,age,grade);
        this.name = name ;
        this.age = age;
        this.grade = grade;
        this.course = course;
        System.out.println("Course:" + course);
    }
}
