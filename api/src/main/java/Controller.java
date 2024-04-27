public class Controller {
    public static void main(String[] args) {
        MyEntity myEntity = new MyEntity(1,"Entity");
        DBSetting dbSetting = new DBSetting("postgres","1");
        DB db = new DB(myEntity,dbSetting);
        MyService myService = new MyService(db);

        myService.saveMyEntity(myEntity);
        System.out.println(myService.getMyEntity());
        myEntity.setName("Updated entity");
        myService.saveMyEntity(myEntity);
        System.out.println(myService.getMyEntity());
    }
}
