
public class Course {
    int id;
    String name;
    int price;
    int duration;
    Student[] students;
    Teacher[] teachers;
    String phoneNumberDelete = " ДЕНЬ ОПЛАТЫ: ";
    String phoneNumber;

    public void teacherCount(int count) {
        teachers = new Teacher[count];
    }
    public void studentCount(int count) {
        students = new Student[count];
    }

    public boolean addStudents(Student student) {

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return true;
            }
        }
        return false;
    }

    public void removerStudent(String phoneNumber) {

        for (int i = 0; i < students.length; i++) {
            if (students[i].phone != null && students[i].phone.equalsIgnoreCase(phoneNumber)) {
                students[i] = null;
                 break;
            }
        }
    }

    public boolean addTeachers(Teacher teacher) {

        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                teachers[i] = teacher;
                return true;
            }
        }
        return false;
    }
}

