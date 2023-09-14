public class GenException extends Exception{
    public void genderException(String s){
        System.out.println("Incorrect format of the person's gender");
        System.out.printf("Your option: %s", s);
    }
}
