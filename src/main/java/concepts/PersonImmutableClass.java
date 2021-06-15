package concepts;

import java.util.HashMap;
import java.util.Map;

public class PersonImmutableClass {

    private String name;
    private Map<String,Long> contactList;

    public PersonImmutableClass(String name, Map<String, Long> contactList) {

        this.name = name;

        Map<String,Long> tempMap = new HashMap<>();


        for (Map.Entry<String, Long> entry : contactList.entrySet()) {
                tempMap.put(entry.getKey(),entry.getValue());
        }


        this.contactList = contactList;
        this.contactList = tempMap;
    }

    public PersonImmutableClass() {
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
