import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Teacher teacher = new Teacher("Bakdoolot Baike", "996555457854");
        Teacher teacher1 = new Teacher("Dolon Baike", "996555457854");

        Course EasyIt = new Course();
        EasyIt.name = "easyIt";
        System.out.println("EasyIt Course Java");

        EasyIt.TeacherCount(2);
        boolean s1 = EasyIt.addTeachers(teacher);
        boolean s2 = EasyIt.addTeachers(teacher1);
        System.out.println(s1 + " " + s2);

        for (Teacher s : EasyIt.teachers) {
            if (s != null) {
                System.out.println(s.name + " " + s.phone);
            }
        }

        Student[] students = new Student[7];
        students[0] = new Student("Aibek", "996555444444 ");
        students[1] = new Student("Alice", "996555333333");
        students[2] = new Student("Aijan", "996555222222");
        students[3] = new Student("Talgat", " 996555777777");
        students[4] = new Student("Aliya", " 996555888888");
        students[5] = new Student("Bermet", " 996555111111");
        students[6] = new Student("Aidana", " 996555121212");

        Course NewStudents = new Course();
        NewStudents.name = "NewStudents";
        System.out.println("NewStudents");

        System.out.println(students[0].name + " " + students[0].phone + " " + students[1].name + " " + students[1].phone + " " + students[2].name + " " + students[2].phone);
        System.out.print(students[3].name + " " + students[3].phone + " " + students[4].name + " " + students[4].phone);
        System.out.println(students[5].name + " " + students[5].phone + " " + students[6].name + " " + students[6].phone);


        NewStudents.StudentCount(5);
        NewStudents.addStudents(students[0]);
        NewStudents.addStudents(students[1]);
        NewStudents.addStudents(students[2]);
        NewStudents.addStudents(students[3]);
        NewStudents.addStudents(students[4]);
        students[5] = null;
        students[6] = null;

        while(NewStudents.students.length > 0){
            System.out.print(" Enter students phone number to remove: ");

            String phoneNumber = scan.nextLine();
            NewStudents.removerStudent(phoneNumber);

            System.out.println(NewStudents.manyStudents + "students left");
            break;
        }

        System.out.println(students[5] + " Aibek left " + students[6] + " Alice left");

        for (Student d : NewStudents.students) {
            if (d != null) {
                System.out.println(d.name + " " + d.phone);
            }
        }

        System.out.println("End");
    }
}
