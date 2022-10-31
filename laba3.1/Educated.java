public class Educated {
    String surname;
    String name;
    String gender;
    int age;
    public Educated(String surname, String name, String gender, int age) {
        this.surname=surname;
        this.name=name;
        this.gender=gender;
        this.age=age;
    }
    public Educated(String surname, String name) {
        this.surname=surname;
        this.name=name;
    }

    public Educated() {
        surname="Sinitskaya";
        name="ksenia";
        gender="w";
        age=19;
    }
    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    public void educationalInstitution(){
        System.out.println("The educational process is underway");
    }
}
