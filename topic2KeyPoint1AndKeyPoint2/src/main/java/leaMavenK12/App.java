package leaMavenK12;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner =new  Scanner(System.in);
        System.out.println("Please type your name and then press \"Enter\"");
        String name =scanner.nextLine();
        System.out.println("Hello "+name+"!");
        scanner.close();
    }	
}
