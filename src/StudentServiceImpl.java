import java.util.ArrayList;

/**
 *   Достор бул жердеги методторду атын айтып жаткандай реализация кылуу керек
 *   Мисалы  ArrayList<Student> getAllOfflineStudents(ArrayList<Student> students);
 *   Бул жерде Баардык Оффлайн окууган студенттерди чыгаруу керек(enum) полясы аркылуу салыштырабыз
 *
 */

// Бул жерге StudentService тин методторун алып келуу керек бирок кантип 🤔?
public class StudentServiceImpl implements StudentService {


    @Override
    public Student getById(ArrayList<Student> students, int studentId) {
        for (Student student : students) {
            if (student.getId()==studentId){
                return student;
            }
        }
      return null;
    }

    @Override
    public Student getByName(ArrayList<Student> students, String studentName) {
        for (Student student : students) {
            if (student.getName().equals(studentName)){
                return student;
            }
        }
        return null;
    }

    @Override
    public void getAllStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public ArrayList<Student> getAllStudentBoys(ArrayList<Student> students) {
        ArrayList<Student>studentBoys = new ArrayList<>();
        for (Student student : students) {
            if (student.getGender()==Gender.MALE){
                studentBoys.add(student);
            }

        }
        return studentBoys;
    }

    @Override
    public ArrayList<Student> getAllStudentGirls(ArrayList<Student> students) {
        ArrayList<Student>studentGirls = new ArrayList<>();
        for (Student student : students) {
            if (student.getGender()==Gender.FEMALE){
                studentGirls.add(student);
            }
        }
        return studentGirls;
    }

    @Override
    public ArrayList<Student> getAllOfflineStudents(ArrayList<Student> students) {
        ArrayList<Student>offlineStudents=new ArrayList<>();
        for (Student student : students) {
            if (student.getStudyFormat()==StudyFormat.OFLINE){
                offlineStudents.add(student);
            }
        }
        return offlineStudents;
    }

    @Override
    public ArrayList<Student> getAllOnlineStudents(ArrayList<Student> students) {
        ArrayList<Student>onlineStudents=new ArrayList<>();
        for (Student student : students) {
            if (student.getStudyFormat()==StudyFormat.ONLINE){
                onlineStudents.add(student);
            }
        }
        return onlineStudents;
    }

    @Override
    public double getAverageAge(ArrayList<Student> students) {
        double sum =0;
        for (Student student : students) {
            sum +=student.getAge();
        }
        return sum /students.size();
    }
}
