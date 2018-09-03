import model.Storage;
import threads.ThreadReader;
import threads.ThreadWriter;


public class Main {
    public static void main(String[] args) {

        Storage storage = new Storage();
        ThreadReader threadReader = new ThreadReader(storage);
        ThreadWriter threadWriter = new ThreadWriter(storage, threadReader);

        threadWriter.start();
        threadReader.start();
    }
}
