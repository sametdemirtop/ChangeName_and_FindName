public interface StudentParser {
    abstract Student parse(String student);
}

class UndergradParser implements StudentParser {

    @Override
    public Student parse(String student) {
        return null;
    }
}

class GradParser implements StudentParser {

    @Override
    public Student parse(String student) {
        return null;
    }

}
