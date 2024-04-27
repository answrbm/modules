import org.apache.commons.codec.binary.Base64;

import java.util.Arrays;

public class Controller {
    public static void main(String[] args) {
//        MyEntity myEntity = new MyEntity(1,"Entity");
//        DBSetting dbSetting = new DBSetting("postgres","1");
//        DB db = new DB(myEntity,dbSetting);
//        MyService myService = new MyService(db);
//
//        myService.saveMyEntity(myEntity);
//        System.out.println(myService.getMyEntity());
//        myEntity.setName("Updated entity");
//        myService.saveMyEntity(myEntity);
//        System.out.println(myService.getMyEntity());

        Base64 base64 = new org.apache.commons.codec.binary.Base64();
        String obj = new String(base64.decode("SmF2YSBpcyBhIG11bHRpLXBsYXRmb3JtLCBvYmplY3Qtb3JpZW50ZWQsIGFuZCBuZXR3b3JrLWNlbnRyaWMgbGFuZ3VhZ2UgdGhhdCBjYW4gYmUgdXNlZCBhcyBhIHBsYXRmb3JtIGluIGl0c2VsZi4="));
        System.out.println(obj);
    }
}
