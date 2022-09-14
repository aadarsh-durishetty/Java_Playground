package workout;

class hostel{
    String block;
    int bed;
    int room;
    public void set1(String block1, int bed1, int room1){
        block = block1;
        bed = bed1;
        room = room1;
    }
    public void get1(){
        System.out.println("Block: "+block);
        System.out.println("Bed: "+bed);
        System.out.println("Room: "+room);
    }
}
class mess{
    String messtype;
    int fee;
    public void set2(String messtype1, int fee1){
        messtype = messtype1;
        fee = fee1;
    }
    public void get2(){
        System.out.println("Mess type: "+messtype);
        System.out.println("Fee: "+fee);
    }
}
class faculty{
    String course;
    String slot;
    public void set3(String course1, String slot1){
        course = course1;
        slot = slot1;
    }
    public void get3(){
        System.out.println("Course: "+course);
        System.out.println("Slot: "+slot);
    }
}
class academic{
    String admin_yr;
    String present_yr;
    double credit;
    double cgpa;
    public void set4(String admin_yr1, String present_yr1, double credit1, double cgpa1){
        admin_yr = admin_yr1;
        present_yr = present_yr1;
        credit = credit1;
        cgpa = cgpa1;
    }
    public void get4(){
        System.out.println("Admin year: "+admin_yr);
        System.out.println("Present year: "+present_yr);
        System.out.println("Credits registered: "+credit);
        System.out.println("CGPA: "+cgpa);
    }
}
class student{
    String name;
    String regno;
    String major;
    public void set5(String name1, String regno1, String major1){
        name = name1;
        regno = regno1;
        major = major1;
    }
    public void get5(){
        System.out.println("Name: "+name);
        System.out.println("Reg no: "+regno);
        System.out.println("Major: "+major);
    }
}
public class vit_classes {
    public static void main(String[] args) {
        student s = new student();
        academic a = new academic();
        faculty f = new faculty();
        hostel h = new hostel();
        mess m = new mess();
        s.set5("Aadarsh","21BCE3815","CSE");
        a.set4("2021","Sophomore",19.5,9.28);
        f.set3("DSA","B2");
        h.set1("L",2,527);
        m.set2("Non-veg",60000);
        System.out.println("------ DETAILS OF VIT STUDENT ------");
        s.get5();a.get4();f.get3();h.get1();m.get2();
    }
}
