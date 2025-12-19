package com.cloning;
class Student {
    int sid;
    String sname;
    String scity;
    // Instance Block → Object Creation
    {
        System.out.println("Instance Block of Student Class");
    }
    public Student(int sid, String sname, String scity) {
        this.sid = sid;
        this.sname = sname;
        this.scity = scity;
    }
    void show() {
        System.out.println("--------- Student Details -------------");
        System.out.println("sid  : " + sid);
        System.out.println("sname: " + sname);
        System.out.println("scity: " + scity);
    }
}
public class Rahul {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rahul", "Bikaner");
        Student copy = new Student(101, "Rahul", "Bikaner");
        // We are creating the clone or copy of the s1
        Student clone = new Student(s1.sid, s1.sname, s1.scity);
        System.out.println("s1.hashCode(): " + s1.hashCode());
        System.out.println("clone.hashCode(): " + clone.hashCode());
        System.out.println(s1.equals(clone));
        s1.show();
        clone.show();
    }
}
