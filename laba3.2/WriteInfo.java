import java.util.Scanner;
public class WriteInfo 
{        public static void main(String[] args) {
          Schoolboy schoolboy=new Schoolboy("Sinitskaya", "Ksenia","woman", 17, 11,"V");
          Student student=new Student("Sinitskaya", "Ksenia", "woman", 19, "UEF", "programmer-logistician", 073601);
          Postgraduate postgraduate=new Postgraduate("Mordas", "Nadia", "woman", 19,"Warehouse accounting for production","Krupskaya");
            System.out.println("Schoolboy - Surname:" + schoolboy.GetSurname() + ", Name:" + schoolboy.GetName() + " Gender:" + schoolboy.GetGender() +
                    ", Age:" + schoolboy.getAge() + ", Class number:" + schoolboy.getClassNumber() + " Class letter:" + schoolboy.getClassLetter() );
            System.out.println("Student - Surname:" + student.GetSurname() + ", Name:" + student.GetName() + " Gender:" + student.GetGender() +
                    ", Age:" + student.GetAge() + ", Faculty:" + student.getFaculty() + ", Specialization:" + student.getSpecialization() + ", Group number:" + student.GetGroupNumber() );
            System.out.println("Postgraduate - Surname:" + postgraduate.GetSurname() + ", Name:" + postgraduate.GetName() + " Gender:" + postgraduate.GetGender() +
                    ", Age:" + postgraduate.GetAge() + ", Scientific Work:" + postgraduate.getScientificWork() + " Scientific Supervisor:" + postgraduate.getScientificSupervisor() );
        }
}
