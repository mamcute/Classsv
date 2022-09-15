package lab7;
import java.util.*;
import java.util.ArrayList;
public class lab7_27211137987 {
    static class person {
        String name;
        String phoneNumber;
        String address;
        String email;
        person(){
            this.name="";
            this.phoneNumber="";
            this.address="";
            this.email="";
        }
        person(String name, String phoneNumber, String address, String email){
            this.name=name;
            this.phoneNumber=phoneNumber;
            this.address=address;
            this.email=email;
        }
        public String toString() {
            return "\t"+name+"\t"+phoneNumber+"\t"+address+"\t"+email;
        }
        void input() {
            Scanner kp= new Scanner(System.in);
            System.out.println("name:");
            name=kp.nextLine();
            System.out.println("phone number:");
            phoneNumber=kp.nextLine();
            System.out.println("address:");
            address=kp.nextLine();
            System.out.println("email:");
            email=kp.nextLine();
        }
        void output() {
            System.out.print(name+"\t"+phoneNumber+"\t"+address+"\t"+email);
        }
    }
    static class student extends person{
        private String status;
        student(){
        }
        student(String name, String phoneNumber, String address, String email, String status){
            super(name,phoneNumber,address,email);
            this.status=status;
        }
        public String toString() {
            return "\t"+status;
        }
        void input1() {
            int year;
            Scanner ks= new Scanner(System.in);
            super.input();
            System.out.println("year:");
            year=ks.nextInt();
            switch( year){
            case 1:
                status="freshman";
                break;
            case 2:
                status="sophomore";
                break;
            case 3:
                status="junior";
                break;
            case 4:
                status="senior";
                break;    
            }
            
        }
        void ouput1() {
            super.output();
            System.out.print("\t"+status);
        }
    }
    static class employee extends person{
        String office;
        int salary;
        String date;
        
        employee(){
            
        }
        employee(String name, String phoneNumber, String address, String email, String office, int salary,String date){
            super(name,phoneNumber,address,email);
            this.office=office;
            this.salary=salary;
            this.date=date;
            
        }
        public String toString() {
            return "\t"+office+"\t"+salary+"\t"+date;
        }
        void input2() {
            Scanner ke= new Scanner(System.in);
            super.input();
            System.out.println("office:");
            office=ke.nextLine();
            System.out.println("salary:");
            salary=ke.nextInt();
            System.out.println("date:");
            date=ke.nextLine();
    }
        void output2() {
            System.out.print("\t"+office+"\t"+salary+"\t"+date);
        }
        static class faculty extends employee{
            private int hour,rank;
            faculty(){
                
            }
            faculty(String name, String phoneNumber, String address, String email,String office, int salary,String date,int hour, int rank){
                super(name,phoneNumber,address,email,office,salary,date);
                this.hour=hour;
                this.rank=rank;
            }
            public String toString() {
                return "\t"+hour+"\t"+rank;
            }
            void input21(){
                Scanner kf= new Scanner(System.in);
                super.input2();
                System.out.println("hour:");
                hour=kf.nextInt();
                System.out.println("rank:");
                rank=kf.nextInt();
                
            }
            void output21() {
                System.out.print("\t"+hour+"\t"+rank);
            }
        }
        static class staff extends employee{
            private String title;
            staff(){
                
            }
            staff(String name, String phoneNumber, String address, String email,String office, int salary,String date,String title){
                super(name,phoneNumber,address,email,office,salary,date);
                this.title=title;
            }
            public String toString() {
                return "\t"+title;
            }
            void input22(){
                Scanner ke= new Scanner(System.in);
                super.input2();
                System.out.println("title:");
                title=ke.nextLine();
                
            }
            void output22() {
                System.out.print("\t"+title);
            }
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        student st= new student();
        employee em= new employee();
        ArrayList<person> L= new ArrayList<person>();
        Scanner kn= new Scanner(System.in);
        String s;
        String s1="s";
        String s2="e";
        System.out.println("nhap n:");
        int n=kn.nextInt();
        for(int i=0;i<n;i++) {
            person e= new person();
            System.out.print("Student or employee(s/e)? ");
            s=kn.nextLine();
            if(s.equals(s1)) {
            	
            }
            
        }

    }

}
