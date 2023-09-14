import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        ArrayList<String> list = new ArrayList<>();
        String nameFile = null;
        HashMap<String, String> info = person.parseInfo();

        nameFile = info.get("lastname") + ".txt";
        for (String i: info.values()) {
            list.add(i);
        }
        System.out.println(info);
        CreateFile.createFiles(nameFile,list);
    }
}