package rough;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created by sewadeus on 11/09/2015.
 */
public class Collections_API {

    public static void main(String[] args){
        ArrayList list = new ArrayList<String>();
                list.add("hotelurl");
                list.add("Pagetab");
                list.add("Tabstring");
        System.out.println(list.get(1));
        System.out.println(list.size());

        for (int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

/***************************************HashTable*********************************************************************/
        Hashtable table = new Hashtable();
        table.put("Hotelurl", "www.mrandmrssmith.com");
        table.put("pagetab", "Overview");
        table.put("TabString","The only place to find luxury");

        System.out.println(table.get("Hotelurl"));

    }


}
