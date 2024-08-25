package bai2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
        Boolean check1 = sc.hasNextInt();// kiem tra du lieu vao co phai so nguyen khong
        Boolean check2 = sc.hasNextDouble();// kiem tra du lieu vao co phai so thuc khong
        System.out.println("co token khong: "+check1);
        System.out.println("co token khong: "+check2);
    }
}
