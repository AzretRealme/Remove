public class Course {
    int id;
    String name;
    int price;
    int duration;
    Student[] students;
    Teacher[] teachers;
    int manyStudents;

    public void TeacherCount(int count) {
        teachers = new Teacher[count];
    }
    public void StudentCount(int count) {
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
    public int removerStudent(String phoneNumber) {
        for (int i = 0; i < manyStudents; i++) {
            if (students[i].phone.equals(phoneNumber)) {
                students[i] = null;
                manyStudents--;
            }
        }
        return manyStudents;
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
