import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Myclass myclass=new Myclass("Kanykei","Askarbekova",19,
                new String[]{"English,Soft skiil,Practice,Technical"},"Manty");
        Myclass myclass1=new Myclass("Eliza","Ashyrbaeva",18,
                new String[]{"\"English,Soft skiil,Practice,Technical"},"Plov");


        System.out.println(myclass.getName()+"\n"+myclass.getSurname()+"\n"+myclass.getAge()+"\n"
                + Arrays.toString(myclass.getLessons()) +"\n"+myclass.getFood());
        System.out.println(myclass1.getName()+"\n"+myclass1.getSurname()+"\n"+myclass1.getAge()+"\n"
                + Arrays.toString(myclass1.getLessons()) +"\n"+myclass1.getFood());

    }
}
