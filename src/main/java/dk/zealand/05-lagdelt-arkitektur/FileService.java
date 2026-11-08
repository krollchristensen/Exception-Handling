import java.io.IOException;

public class FileService {
    private final FileRepository repository;

    public FileService(FileRepository repository) {
        this.repository = repository;
    }

    public String getFileContent(String filename) throws IOException {
        return repository.readFile(filename);
    }
}
