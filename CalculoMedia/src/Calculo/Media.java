package Calculo;

import javax.swing.JOptionPane;

public class Media {
	
	/*Main é um metodo auto executavel em Java*/
	public static void main (String [] args) {
		
		String nota1 = JOptionPane.showInputDialog("Informe a nota 1 ");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2 ");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3 ");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4 ");
		
		double dnota1 = Double.parseDouble(nota1);
		double dnota2 = Double.parseDouble(nota2);
		double dnota3 = Double.parseDouble(nota3);
		double dnota4 = Double.parseDouble(nota4);
		
		double media = (dnota1 + dnota2 + dnota3 + dnota4) / 4;
		
		/*Média para aprovação é 70*/
		
		if (media >= 50) {
			
			if (media >=70) {
				JOptionPane.showMessageDialog(null, "Aluno está aprovado por média : " + media);
			}else {
				JOptionPane.showMessageDialog(null, "Aluno em recuperação com média : " + media);
			}
		    }else {
				JOptionPane.showMessageDialog(null, "Aluno está reprovado com média : " + media);
			}
		}
		
		/*JOptionPane.showMessageDialog(null, "A media é: " + media);*/
	}

