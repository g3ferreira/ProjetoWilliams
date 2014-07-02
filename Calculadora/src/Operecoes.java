import javax.swing.JOptionPane;


public class Operecoes {
	
	
	public void resultadoSoma(OperacaodeSoma soma,int numero1, int numero2){
		
		int result = soma.somaNumeros(numero1, numero2);
		JOptionPane.showMessageDialog(null, "Resultado da Soma e:aa  "+result);
		
		

	}
		
	public void subtraiResultado(OperacaodeSoma soma,int numero1, int numero2){
		
		int result = soma.subtraiNumeros(numero1, numero2);
		JOptionPane.showMessageDialog(null, "Resultado da Subtracao :aa  "+result);
		
		

	}
	
		

}
