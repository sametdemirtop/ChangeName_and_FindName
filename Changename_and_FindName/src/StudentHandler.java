import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentHandler {
    private ArrayList<Student> students;
    private Scanner scanner;

    public StudentHandler() {
        super();
        this.students = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void initialize() throws FileNotFoundException {
        File file1 = new File("C:\\Users\\Adem\\Desktop\\files\\customer.txt");

        scanner = new Scanner(file1);
        Scanner rf = scanner;
        rf.useDelimiter(",");

        UndergradStudent st1 = new UndergradStudent("Ahmet", "Prof. Altan Caliskan", "Undergrad", 50);
        UndergradStudent st2 = new UndergradStudent("Ali", "Prof. Altan Caliskan", "Undergrad", 40);

        GraduateStudent st3 = new GraduateStudent("Ayse", "Prof. Altan Caliskan", "Graduate",
                "Machine Learning in Audiogram Analsis");
        GraduateStudent st4 = new GraduateStudent("Mehmet", "Prof. Altan Caliskan", "Graduate",
                "Tympanometry Analysis using Image Processing");

        this.students.add(st1);
        this.students.add(st2);
        this.students.add(st3);
        this.students.add(st4);

        while (rf.hasNextLine()) {
            System.out.println(rf.next());
        }
    }

    public void searchByName(String name) {
        boolean searched = false;

        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).getName().equals(name)) {
                System.out.println(this.students.get(i).toString());
                searched = true;
            }
        }

        if (searched == false) {
            System.out.println("There is no student as like this name");
        }
    }

    public void modifyName(String oldName, String newName) {
        boolean searched = false;
        int index = 0;

        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).getName().equals(oldName)) {
                searched = true;
                index = i;
            }
        }

        if (searched) {
            this.students.get(index).setName(newName);
        }
    }

    public void saveData() throws IOException {
        File f = new File("C:\\Users\\Adem\\Desktop\\files\\customer.txt");

        FileWriter fw = new FileWriter(f);

        for (int i = 0; i < this.students.size(); i++) {
            fw.write(this.students.get(i).toString());
            fw.write("\n");
        }

        fw.flush();
        fw.close();
    }
}