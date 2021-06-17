import java.io.IOException;

public class Main {
        public static void main(String[] args) throws IOException {
                StudentHandler stHandler = new StudentHandler();

                stHandler.initialize();

                stHandler.searchByName("Ahmet");
                stHandler.searchByName("Samet");

                stHandler.modifyName("Ayse", "Canan");
                stHandler.saveData();

        }
}
