package pkg10.bolum;

public class Course {
    private String courseName;
    private String[] students = new String[10];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents++] = student;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        int index = -1;
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                index = i;
                break;
            }
        }

        if (index >= 0) {
            for (int i = index; i < numberOfStudents - 1; i++) {
                students[i] = students[i + 1];
            }
            students[numberOfStudents - 1] = null;
            numberOfStudents--;
        }
    }

    public void clear() {
        students = new String[10];
        numberOfStudents = 0;
    }

    
    public static void main(String[] args) {
        Course course = new Course("Veri Yapilari");
        course.addStudent("Ahmet Yilmaz");
        course.addStudent("Ayse Demir");
        course.addStudent("Mehmet Kaya");

        System.out.println("Ders Adi: " + course.getCourseName());
        System.out.println("Ogrenci Sayisi: " + course.getNumberOfStudents());
        
        course.dropStudent("Ayse Demir");
        System.out.println("Ayse silindi. Yeni ogrenci sayisi: " + course.getNumberOfStudents());
    }
}