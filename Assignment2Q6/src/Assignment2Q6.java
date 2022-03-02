abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
		System.out.println("File Persistence");
		return null;
    	
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
    	System.out.println("Data persistence");
		return null;
    	
    }
}

public class Assignment2Q6 {
    public static void main(String[] args) {
    	FilePersistence obje = new FilePersistence();
    	obje.persist();
    	DatabasePersistence obje1 = new DatabasePersistence();
    	obje1.persist();
    }
}