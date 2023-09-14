import java.util.Scanner;

public class InputInf {
    public static String[] InputInfo(){
    Scanner in = new Scanner(System.in);
    while(true){
        System.out.println("Введите данные через пробел в формате: Фамилия Имя Отчество датарождения(dd-MM-yyyy) номертелефона пол: ");
        String a = in.nextLine();
        String[] per = a.split(" ");
        if(per.length == 6){
            return per;
        } else if (per.length > 6) {
            System.out.println("There is too much data entered");
        }
        else{
            System.out.println("The data entered is too small");
        }
    }
}
}