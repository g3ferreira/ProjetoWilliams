import javax.swing.JOptionPane;


public class TesteCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operecoes op = new Operecoes();
		OperacaodeSoma soma = new OperacaodeSoma();
		
		try{
			String numero1 = JOptionPane.showInputDialog("Informe o primeiro numero:");
			int n1 = Integer.parseInt(numero1);
			String numero2 = JOptionPane.showInputDialog("Informe o primeiro numero:");
			int n2 = Integer.parseInt(numero2);
			op.resultadoSoma(soma, n1, n2);
		
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Informe o numero do tipo inteiro ");
		}
	
	}

}
