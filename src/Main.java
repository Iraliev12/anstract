import java.util.Random;
import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        Farm farm = new Horse("janyjer",5,3,6,"murat",
                112,12,"black","male","as");
        Farm farm1 = new Horse("janyjer",5,3,6,"murat",
                112,12,"black","male","as");

        System.out.println("address:"+farm.getAddress());
        System.out.println("cows:"+farm.getCows());
        System.out.println("horse:"+farm.getHorses());
        System.out.println("sheep:"+farm.getSheep());
        System.out.println("OName:"+farm.getOwnerName());
        System.out.println("------------");
       System.out.println("address:"+farm1.getAddress());
        System.out.println("cows:"+farm1.getCows());
        System.out.println("horse:"+farm1.getHorses());
        System.out.println("sheep:"+farm1.getSheep());
        System.out.println("owner name:"+farm1.getOwnerName());

              {

        }

       }

        }








