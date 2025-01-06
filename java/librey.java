interface Liboperation
{
    void issuebook();
    void returnbook();
}
class Student implements Liboperation
{
    public void issuebook()
    {
        System.out.println("ncert");
    }
    public void returnbook()
    {
        System.out.println("ncert");
    }
}
class Teacher implements Liboperation
{
    public void issuebook()
    {
        System.out.println("schand");
    }
    public void returnbook()
    {
        System.out.println("schand");
    }
}
class Demo
{
    public static void main(String[] args) {
        Student s=new Student();
        s.issuebook();
        s.returnbook();
        Teacher t=new Teacher();
        t.issuebook();
        t.returnbook();
    }
}