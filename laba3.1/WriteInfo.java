import java.util.Scanner;
public class WriteInfo 
{        public static void main(String[] args) {
          Schoolboy schoolboy=new Schoolboy("Sinitskaya", "Ksenia","woman", 17, 11,"V");
          Student student=new Student("Sinitskaya", "Ksenia", "woman", 19, "UEF", "programmer-logistician", 073601);
          Postgraduate postgraduate=new Postgraduate("Mordas", "Nadia", "woman", 19,"Warehouse accounting for production","Krupskaya");
            System.out.println("Schoolboy - Surname:" + schoolboy.getSurname() + ", Name:" + schoolboy.getName() + " Gender:" + schoolboy.getGender() +
                    ", Age:" + schoolboy.getAge() + ", Class number:" + schoolboy.getClassNumber() + " Class letter:" + schoolboy.getClassLetter() );
            System.out.println("Student - Surname:" + student.getSurname() + ", Name:" + student.getName() + " Gender:" + student.getGender() +
                    ", Age:" + student.getAge() + ", Faculty:" + student.getFaculty() + ", Specialization:" + student.getSpecialization() + ", Group number:" + student.getGroupNumber() );
            System.out.println("Postgraduate - Surname:" + postgraduate.getSurname() + ", Name:" + postgraduate.getName() + " Gender:" + postgraduate.getGender() +
                    ", Age:" + postgraduate.getAge() + ", Scientific Work:" + postgraduate.getScientificWork() + " Scientific Supervisor:" + postgraduate.getScientificSupervisor() );
        }
}
