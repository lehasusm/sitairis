public abstract class Student implements Educated, Object {
    protected String Surname=null;
    protected String Name=null;
    protected String Gender=null;
    protected  int Age=0;
    String Faculty;
    String Specialization;

    public Student(String surname, String name, String gender, int age, String faculty, String specialization) {
        Surname = surname;
        Name = name;
        Gender = gender;
        Age = age;
        this.Faculty = faculty;
        this.Specialization = specialization;
    }

    public String GetSurname() {
        return Surname;
    }
    public String GetName() {
        return Name;
    }
    public String GetGender() {return Gender;}
    public int GetAge() {return Age;}
    public String getFaculty() {return Faculty;}
    public String getSpecialization() {return Specialization;}


}
