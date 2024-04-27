public class MyService {

    private DB db;

    public MyService(DB db) {
        this.db = db;
    }

    public MyEntity getMyEntity() {
        return db.getMyEntity();
    }

    public void saveMyEntity(MyEntity myEntity) {
        db.setMyEntity(myEntity);
    }

    public void deleteMyEntity() {
        db.setMyEntity(null);
    }
}
