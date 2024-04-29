package practiceNew;

public class Singleton {

    private static Singleton singleton ;


    private Singleton(){

    }

    public static Singleton getInstance(){

        if(singleton==null){

            return  singleton= new Singleton();
        }else {


            return singleton;
        }


    }

    public static void main(String[] args) {


        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());


    }









}
