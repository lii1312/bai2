package bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fulll name: ");
        String name = sc.nextLine();
        System.out.println("Year Of Old: ");
        int yearOfOld = sc.nextInt();
        System.out.println("Year of birth: ");
        int yearOfBirth = sc.nextInt();
        sc.nextLine();
        System.out.println("Sex: ");
        String sex = sc.nextLine();
        System.out.println("Gpa: ");
        float gpa = sc.nextFloat();
        sc.nextLine();
        System.out.println("HomeTown");
        String hometown = sc.nextLine();
        System.out.println(name+ "-"+yearOfOld+ "-"+yearOfBirth+ "-"+sex+ "-"+gpa+ "-"+hometown);
    }
    
}
