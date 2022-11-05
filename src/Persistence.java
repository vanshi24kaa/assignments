abstract class Persistence {
    abstract void persist();
}
class Filepersistence extends Persistence {
    void persist()
    {
        System.out.println("data is stored in files");
    }
}
class DatabasePersistence extends Persistence{
    void persist()
    {
        System.out.println("Data is stored in databaase");
    }
}
class Data{
    public static void main(String[] args)
    {
        Filepersistence f=new Filepersistence();
        DatabasePersistence d=new DatabasePersistence();
        f.persist();
        d.persist();
    }
}
