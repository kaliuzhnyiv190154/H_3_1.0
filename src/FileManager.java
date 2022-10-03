import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileManager {
    private File file;

    public FileManager(File file) {
        this.file = file;
    }

    public void readFile() {
        try (Stream<String> stream = Files.lines(Paths.get(file.getPath()))) {

            stream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
