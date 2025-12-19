package com.cloning;

//Marker interface
public class Verma implements Cloneable {

 int sid;
 String sname;
 String scity;

 public Verma(int sid, String sname, String scity) {
     this.sid = sid;
     this.sname = sname;
     this.scity = scity;
 }

 void show() {
     System.out.println("------- Student Details -------");
     System.out.println("sid   : " + sid);
     System.out.println("sname : " + sname);
     System.out.println("scity : " + scity);
 }
 public static void main(String[] args) throws CloneNotSupportedException {
     Verma s1 = new Verma (101, "Rohit", "Ratangarh");
     Verma clone = (Verma) s1.clone();
     clone.show();
     s1.show();
     System.out.println(s1.equals(clone));
 }
}
