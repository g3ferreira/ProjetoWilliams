
public class OperacaodeSoma {

	private int numero1;
	private int numero2;
	
	public OperacaodeSoma(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public OperacaodeSoma() {
		
	}
	
	public int somaNumeros(int numero1, int numero2){
		
		this.numero1=numero1;
		this.numero2=numero2;
		
		int result = (numero1 + numero2);
		
		return result;
	}
	

	public int subtraiNumeros(int numero1, int numero2){
		
		this.numero1=numero1;
		this.numero2=numero2;
		
		int result = (numero1 - numero2);
		
		return result;
	}
	
}
