import java.util.ArrayList;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    /**
     * Жогоруда жазылган статичный полялар биз консолго чыгарып жаткан кодубузга
     * цвет кошуп берет, астыдагы кодту коментарийден чыгарып иштетип кор
     * Ps: бул цветтер жон гана сиздерге кызык болуусу учун эле корсотулду тапшырмага тиешеси жок,
     * бирок ушул цветтерди колдонуп консолго чыгарсанар болот
     */
    public static void main(String[] args) {


//        System.out.println(ANSI_BLUE+"Кандайсын Студент 🙂"+ANSI_RESET);
//        System.out.println(ANSI_PURPLE+"Сен бул жердеги задачаны чыгара аласын мен ишенем 😎"+ANSI_RESET);
//        System.out.println(ANSI_CYAN+"Good luck! 💪");
//        System.out.println("Have a nice weekend 😀"+ANSI_RESET);

        Student student = new Student(2, "Bek", "Sharapov", 24, Gender.MALE, StudyFormat.OFLINE);
        Student student1 = new Student(1, "Nurjigit", "Umarov", 22, Gender.MALE, StudyFormat.OFLINE);
        Student student4 = new Student(5,"Aizirek","Toktosunova",19,Gender.FEMALE,StudyFormat.OFLINE);
        Student student2 = new Student(3, "Ruslan", "Taipolotov", 27, Gender.MALE, StudyFormat.OFLINE);
        Student student3 = new Student(4, "Bekbolsun", "Dos", 25, Gender.MALE, StudyFormat.ONLINE);
        Student student5 = new Student(6,"Adina","Duishobaeva",20,Gender.FEMALE,StudyFormat.ONLINE);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        StudentServiceImpl studentService = new StudentServiceImpl();
        System.out.println(studentService.getAverageAge(students));


    }
}