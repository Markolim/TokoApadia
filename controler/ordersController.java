package com.example.ppw.controller;

//add some necessary lib
import com.example.ppw.model.orders;
import com.example.ppw.repository.ordersRepo;
import com.example.ppw.repository.testNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


import java.util.Scanner;
class ReverseNumberWhile
{
   public static void main(String args[])
   {
      int num=0;
      int reversenum =0;
      System.out.println("Input your number and press enter: ");
      
      //This statement will capture the user input
      Scanner in = new Scanner(System.in);
      
      //Captured input would be stored in number num
      num = in.nextInt();
      
      //While Loop: Logic to find out the reverse number
      while( num != 0 )
      {
          reversenum = reversenum * 10;
          reversenum = reversenum + num%10;
          num = num/10;
      }
      //will printout reverse number
      System.out.println("Reverse of input number is: "+reversenum);
   }
}

import java.util.Scanner;
//Untuk menghitung 
public class switchcase4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //inisiasi variabel
        int harga, jumlah, total = 0;
        int potongan1, potongan2, potongan3;
        //menghitung harga barang
        System.out.print ("Masukkan Harga Barang : Rp ");
        harga = input.nextInt();
        System.out.print ("Jumlah Barang : ");
        jumlah = input.nextInt();
        total = harga*jumlah;
        System.out.println("Total Bayar : Rp "+ total);
        

        //code revisi
        potongan1 = (total -((total*5)/100));
        potongan2 = (total - ((total*10)/100));
        potongan3 = (total - ((total*15)/100));
        //condition
        if(total >= 200000){
        System.out.println("Total Bayar (Diskon 15%) : Rp "+ potongan3);
        }else if(total >= 100000 ){
        System.out.println("Total Bayar (Diskon 10%) : Rp "+ potongan2);
        }else if(total >= 50000){
        System.out.println("Total Bayar (Diskon 5%) : Rp "+ potongan1);
        }
        if (jumlah >= 50 && total >= 200000) {
        System.out.println("Total Bayar (Diskon 5%) : Rp " +(potongan3-((potongan3*5)/100)));
        }else if (jumlah >= 50 && total >= 100000) {
        System.out.println("Total Bayar : Rp "+ (potongan2-((potongan2*5)/100)));
        }else if (jumlah >= 50 && total >= 50000){
        System.out.println("Total Bayar (Diskon 5%) : Rp "+ (potongan1-((potongan1*5)/100)));
        }else if (jumlah >= 50){
        System.out.println("Total Bayar (Diskon 5%) : Rp "+ (total-((total*5)/100)));}
//tambahan terbaru
    }
}
