import java.util.Locale;

/**
 * Бул классты толуктоо керек коментарийде болгон поляларды чыгарып,
 * жетишпей жаткан enum'дарды тузуу керек.
 * Дагы эмнелер жетишпей жатат бул жерде, а может геттер сеттер методтор, а дагы ?
 */
public class Student {
    private int id;
    private String name;
    private String surname;
    private int age;
    private Gender gender;

    private StudyFormat studyFormat;

    public Student() {
    }

    public Student(int id, String name, String surname, int age, Gender gender, StudyFormat studyFormat) {
        this.id = id;
        if (name.length() <= 2) try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("\u001B[31m" + "The name must be larger than 3 characters!");
        }
        else {
            this.name = name;
        }
        if (surname.length() <= 2) try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("\u001B[31m" + "The surname must be larger than 3 characters!");
        }
        this.surname = surname;
        if (age < 0 || age > 120) try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("\u001B[31m" + "You entered the wrong age");
        }
        else {
            this.age = age;
        }
        this.gender = gender;
        this.studyFormat = studyFormat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 2) try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("\u001B[31m" + "The name must be larger than 3 characters!");
        }
        else {
            this.name = name;
        }

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.length() <= 2) try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("\u001B[31m" + "The surname must be larger than 3 characters!");
        }
        else {
            this.surname = surname;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("\u001B[31m" + "You entered the wrong age");
        }
        else {
            this.age = age;
        }

    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public StudyFormat getStudyFormat() {
        return studyFormat;
    }

    public void setStudyFormat(StudyFormat studyFormat) {
        this.studyFormat = studyFormat;
    }

    @Override
    public String toString() {
        return "\u001B[47m"+"Student:"+"\u001B[0m" +"\u001B[31m"+
                "   | ID: |"+"\u001B[0m" +id +"\u001B[31m"+
                "| name: |"+"\u001B[0m" + name +"\u001B[31m"+
                "| surname: |"+"\u001B[0m" + surname +"\u001B[31m"+
                "| age: |"+"\u001B[0m" + age +"\u001B[31m"+
                "| gender: |" +"\u001B[0m"+ gender +"\u001B[31m"+
                "| studyFormat: |"+"\u001B[0m" + studyFormat+"\u001B[0m"+"\n" +
                "          |=================================================================================================\n"+"\u001B[0m";
    }
}
