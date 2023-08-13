import java.util.ArrayList;

public interface StudentService {
    Student getById(ArrayList<Student> students, int studentId);
    Student getByName(ArrayList<Student> students, String studentName);
    void getAllStudents(ArrayList<Student> students);
    ArrayList<Student> getAllStudentBoys(ArrayList<Student> students);
    ArrayList<Student> getAllStudentGirls(ArrayList<Student> students);
    ArrayList<Student> getAllOfflineStudents(ArrayList<Student> students);
    ArrayList<Student> getAllOnlineStudents(ArrayList<Student> students);
    double getAverageAge(ArrayList<Student> students);

    // Тут ты можешь добавить свои методы, например вывести количество Онлайн и
    // Оффлайн студентов

}
