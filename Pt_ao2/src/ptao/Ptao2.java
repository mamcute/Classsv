package ptao;
import java.util.*;



class Ql extends Nv{
	private String chucvu;
	private int phucap;
	Ql(){
		
	}
	public Ql(String chucvu, int phucap) {
		super();
		this.chucvu = chucvu;
		this.phucap = phucap;
	}
	public String toString() {
		return "\t"+chucvu+"\t"+phucap;
	}
	void intput() {
		super.input();
		Scanner kb= new Scanner(System.in);
		System.out.print("chuc vu:");
		chucvu=kb.nextLine();
		System.out.print("phu cap:");
		phucap=kb.nextInt();
		setSalary(getSalary()+phucap);
	}
	void output() {
		super.output();
		System.out.print("\t"+chucvu+"\t"+phucap);
	}
}
public class Ptao2 {
	

	public static void main(String[] args) {
		
		ArrayList<Nv> l= new ArrayList<>();
		Scanner kn=new Scanner(System.in);
		System.out.print("nhap n:");
		int n=kn.nextInt();
		
		for(int i=0;i<n;i++) {
			
			int s;
			System.out.print("Nv or Ql(1/0):");
			s=kn.nextInt();
			if(s==1) {
				Nv a= new Nv();
				a.input();
				l.add(a);
			}else {
				Ql b= new Ql();
				b.intput();
				l.add(b);
			}
		}
//		for(Nv b:l) {
//			b.output();
//			System.out.println();
//		}
//		for(int i=0;i<l.size();i++ ) {
//    		for(int j=0;j<l.size();j++) {
//    			if(l.get(i).getName().compareTo(l.get(j).getName())>0) {
//    				Nv tam= new Nv();
//    				tam=l.get(i);
//    				l.set(i, l.get(j));
//    				l.set(j, tam);
//    				
//    			}
//    		}
//    	}
//		System.out.println("Sort name");
//		for(Nv b:l) {
//			b.output();
//			System.out.println();
//		}
//		for(int i=0;i<l.size();i++ ) {
//    		for(int j=0;j<l.size();j++) {
//    			if(l.get(i).getSalary()<l.get(j).getSalary()) {
//    				Nv tam= new Nv();
//    				tam=l.get(i);
//    				l.set(i, l.get(j));
//    				l.set(j, tam);
//    				
//    			}
//    		}
//    	}
//		System.out.println("Sort salary");
//		for(Nv b:l) {
//			b.output();
//			System.out.println();
//		}
		System.out.println("Manager");
		for(int i=0;i<l.size();i++) {
			if(l.get(i) instanceof Ql==true) {
				l.get(i).output();
				System.out.println();
			}
		}

	}

}
