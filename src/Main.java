import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Teacher teacher = new Teacher("Bakdoolot Baike", "996555457854");
        Teacher teacher1 = new Teacher("Dolon Baike", "996555457854");

        Course easyIt = new Course();
        easyIt.name = "easyIt";
        System.out.println(" КУРСЫ ИЗИ АЙТИ");

        easyIt.teacherCount(2);
        boolean s1 = easyIt.addTeachers(teacher);
        boolean s2 = easyIt.addTeachers(teacher1);
        System.out.println(s1 + " " + s2);

        for (Teacher s : easyIt.teachers) {
            if (s != null) {
                System.out.println(s.name + " " + s.phone + "  -----БЫЛИ ДОБАВЛЕНЫ УЧИТЕЛЯ ДЖАВА");
            }
        }
        Student student = new Student("Alina", "9965554444");
        Student student1 = new Student("Ajara", "99655322222");
        easyIt.studentCount(2);
        boolean g1 = easyIt.addStudents(student);
        boolean g2 = easyIt.addStudents(student1);
        System.out.println(g1 + " " + g2 + ".  ----Алина и Ажара передумали ходить");

        for (Student h : easyIt.students) {
            if (h != null) {
                System.out.println(h.name + " " + h.phone);
            }
        }

        Student[] students = new Student[7];
        students[0] = new Student("Aibek", "996555444444");
        students[1] = new Student("Alice", "996555333333");
        students[2] = new Student("Aijan", "996555222222");
        students[3] = new Student("Talgat", "996555777777");
        students[4] = new Student("Aliya", "996555888888");
        students[5] = new Student("Bermet", "996555111111");
        students[6] = new Student("Aidana", "996555121212");

        Course newStudents = new Course();
        newStudents.name = "newStudents";
        System.out.println(" ВСЕ СТУДЕНТЫ КОТОРЫЕ ПОСЕЩАЮТ КУРСЫ, БУДУТ ПОКАЗАНЫ НИЖЕ");

        System.out.println(students[0].name + " " + students[0].phone + " " + students[1].name + " " + students[1].phone + " " + students[2].name + " " + students[2].phone);
        System.out.print(students[3].name + " " + students[3].phone + " " + students[4].name + " " + students[4].phone + " ");
        System.out.println(students[5].name + " " + students[5].phone + " " + students[6].name + " " + students[6].phone);


        newStudents.studentCount(7);
        newStudents.addStudents(students[0]);
        newStudents.addStudents(students[1]);
        newStudents.addStudents(students[2]);
        newStudents.addStudents(students[3]);
        newStudents.addStudents(students[4]);
        newStudents.addStudents(students[5]);
        newStudents.addStudents(students[6]);

//        students[5] = null;
//        students[6] = null;
        if (newStudents.students.length > 0) {
            System.out.print(" УДАЛИТЬ ОДНОГО СТУДЕНТА ПО НОМЕРУ ТЕЛЕФОНА, КОТОРЫЙ НЕ ОПЛАТИЛ ЗА МЕСЯЦ : ");
            String phoneNumber = scan.nextLine();
            newStudents.removerStudent(phoneNumber);
            System.out.println(newStudents.phoneNumberDelete  + " БЫЛ УДАЛЕН ПЕРВЫЙ СТУДЕНТ ");

            }
        if(newStudents.students.length > 1) {
            System.out.print(" УДАЛИТЬ ВТОРОГО СТУДЕНТА ПО НОМЕРУ ТЕЛЕФОНА, КОТОРЫЙ НЕ ОПЛАТИЛ ЗА МЕСЯЦ : ");
            String phoneNumber = scan.nextLine();
            newStudents.removerStudent(phoneNumber);
            System.out.println(newStudents.phoneNumberDelete + " БЫЛ УДАЛЕН ВТОРОЙ СТУДЕНТ ");
        }

            for (Student d : newStudents.students) {
                if (d != null) {
                    System.out.println(d.name + " " + d.phone);
                }
            }

            System.out.println("  ОСТАЛОСЬ ПЯТЬ СТУДЕНТОВ, КОТОРЫЕ УСПЕШНО ОПЛАТИЛИ ЗА УЧЕБУ");
        }
    }

