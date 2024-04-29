//UsoReturn

public class UsoReturn{
	public static void main(String[] args) {
		Comparador sujeto1 = new Comparador(12,'@');
		Comparador sujeto2 = new Comparador(12,'@');
		Comparador sujeto3 = new Comparador(52,'f');

		System.out.println("¿Sujeto1 es igual a sujeto2?\n--->"+sujeto1.equal(sujeto2));
	}
	
}

class Comparador{
	int a;
	char b;
	public Comparador(int a, char b){
		this.a = a;
		this.b = b;
	}

	public boolean equal(Comparador obj){
		return (obj.a==a || obj.b==b);
	}
}