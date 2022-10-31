import java.lang.reflect.Type;
public  class Schoolboy implements Object, Educated
{
    protected String Surname=null;
    protected String Name=null;
    protected String Gender=null;
    protected  int Age=0;
    int classNumber;
    String classLetter;

    public Schoolboy( int classNumber, String classLetter) {
        this.classNumber = classNumber;
        this.classLetter = classLetter;
    }

    public Schoolboy(String sinitskaya, String ksenia, String woman, int i, int i1, String v) {
    }

    public int getClassNumber() {
        return classNumber;
    }
    public String getClassLetter() {
        return classLetter;
    }
    public String GetSurname() {
        return Surname;
    }
    public String GetName() {
        return Name;
    }
    public String GetGender() {return Gender;}

    @Override
    public int GetAge() {
        return 0;
    }

    public int getAge() {return Age;}

    @Override
    public void educationalInstitution() {
        System.out.println("Study at school");
    }

    @Override
    public void printInfo() {
        System.out.println("Class: " + classNumber + " <<" +classLetter+ ">>");
    }


}
