
public class Quadruple<A,B,C,D> {
	
	A alfa;
	B beta;
	C gamma;
	D delta;
	
	private Quadruple(A a, B b, C c, D d){
		this.alfa=a;
		this.beta=b;
		this.gamma=c;
		this.delta=d;
		
	}
	void showQuadruple() {
		System.out.println("Alfa:"+alfa);
		System.out.println("Beta:"+beta);
		System.out.println("Gamma:"+gamma);
		System.out.println("Delta:"+delta);
	}
	
	public static void main(String[] args) {
		
		String a[]= {"Kuba", "Daniel"};
		String b= "Rodziknak PL ! ";
		Integer c=1; 
		Number d=4.1;
		
		Quadruple cont=new Quadruple(a,b,c,d);
		cont.showQuadruple();
	}

}
