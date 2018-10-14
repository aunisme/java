import java.io.*;
class circle
{
static final double pi= 3.14;
double radius=10;
String warna = "biru";
//metode untuk menghitung luas lingkaran
double hitungLuas()
{
return pi * radius * radius;
}

public static void main (String[]args) 
{
circle lingk = new circle();
System.out.println ("luas Lingkaran="+ lingk.hitungLuas());
System.out.println ("warna Lingkaran="+ lingk.warna);
}
}