public class Student {
    private String name;
    private String advisor;
    private String type;

    public Student() {
        super();
    }

    public Student(String name, String advisor, String type) {
        super();
        this.name = name;
        this.advisor = advisor;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String result = "";

        result += "Name: " + this.name + "\n";
        result += "Advisor: " + this.advisor + "\n";
        result += "Type: " + this.type + "\n";
        return result;
    }

}

class GraduateStudent extends Student {
    private String thesisTopic;

    public GraduateStudent() {
        super();
    }

    public GraduateStudent(String name, String advisor, String type, String thesisTopic) {
        super(name, advisor, type);
        this.thesisTopic = thesisTopic;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }
}

class UndergradStudent extends Student {
    private int numberOfHours;

    public UndergradStudent() {
        super();
    }

    public UndergradStudent(String name, String advisor, String type, int numberOfHours) {
        super(name, advisor, type);
        this.numberOfHours = numberOfHours;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }
}
