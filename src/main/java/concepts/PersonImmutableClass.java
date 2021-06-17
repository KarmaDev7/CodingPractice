package concepts;

import java.util.HashMap;
import java.util.Map;

public class PersonImmutableClass {

    private final String name;
    private final Map<String,Long> contactList;

    public PersonImmutableClass(String name, Map<String, Long> contactList) {



        Map<String,Long> tempMap = new HashMap<>();


        for (Map.Entry<String, Long> entry : contactList.entrySet()) {
                tempMap.put(entry.getKey(),entry.getValue());
        }


        this.contactList = tempMap;
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public Map<String, Long> getContactList() {
        Map<String,Long> tempMap = new HashMap<>();

        for (Map.Entry<String, Long> entry : contactList.entrySet()) {

            tempMap.put(entry.getKey(), entry.getValue());

        }
          return tempMap;
    }


    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("sumit");

        HashMap<String, Long> contactList = new HashMap<>();
        contactList.put("Sumit", 7894561230L);



        PersonImmutableClass  person = new PersonImmutableClass(str.toString(), contactList);
    }


}
