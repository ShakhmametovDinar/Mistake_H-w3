import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Person {
    public static HashMap<String, String> parseInfo() {
        HashMap<String, String> infList = new HashMap<>();
        InputInf inputInf = new InputInf();
        String[] info = inputInf.InputInfo();
        ArrayList<String> name = new ArrayList<>();

        for (String i: info) {
            if (i.matches("..-..-....")) {
                try {
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    LocalDate date = LocalDate.parse(i, dtf);
                } catch (DateTimeException e) {
                    throw new DateTimeException("Неверный формат даты!");
                }
                infList.put("date", i);
            } else if (i.matches("[0-9]+")) {
                infList.put("num", i);
            } else if (i.length() == 1) {
                if (i.equals("f") || i.equals("m")) {
                    infList.put("gender", i);
                } else {
                    try {
                        throw new GenException();
                    } catch (GenException e) {
                        e.genderException(i);
                    }
                }
            } else{
                name.add(i);

            }

        }
        Set<String> set = new HashSet<>(name);
        name.clear();
        name.addAll(set);
        if(name.size() == 3){
            infList.put("firstname",name.get(2));
            infList.put("lastname",name.get(1));
            infList.put("patronymic", name.get(0));
        }
        else{
            throw new RuntimeException("Not enough data!");
        }
        return infList;
    }
}