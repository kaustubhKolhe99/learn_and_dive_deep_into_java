import java.nio.file.*;

public class WatchServiceAPI {
    public static void main(String[] args) throws  Exception {
        try(WatchService watchService = FileSystems.getDefault().newWatchService()){
            Path dir = Paths.get("src/copied_files");
            dir.register(watchService , StandardWatchEventKinds.ENTRY_DELETE,
                    StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_MODIFY);
            WatchKey watchKey = watchService.take(); //take method stats the watch
            do {
                for (WatchEvent<?> event : watchKey.pollEvents() ){
                    System.out.println("kind:" + event.kind());
                    System.out.println("context:" + event.context());
                    System.out.println("count:" + event.count());
                }
            }while (watchKey.reset());
        }
    }
}
