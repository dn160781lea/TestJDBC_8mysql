package lea.mySqlAdress;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Created by john on 30.01.17.
 */
public class MainMySqlAddress {
    public static void main(String[] args) {
        GenericXmlApplicationContext gec = new GenericXmlApplicationContext();
        gec.load("classpath:mysqlAdress-sp/setting.xml");
        gec.refresh();

        Home home = gec.getBean("homeDao", Home.class);
        List<Contact> list = home.findAll();
        for (Contact c: list) {
            System.out.println(c.toString()   );
        }

    }
}
