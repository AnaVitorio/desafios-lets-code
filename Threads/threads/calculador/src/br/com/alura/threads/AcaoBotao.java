
package br.com.alura.threads;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;

import br.com.alura.TarefaMultiplicacao;

public class AcaoBotao implements ActionListener {

	private JTextField primeiro;
	private JTextField segundo;
	private JLabel resultado;

	public AcaoBotao(JTextField primeiro, JTextField segundo, JLabel resultado) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		//Essa classe precisa implementar a interface Runnable para que possamos passalá
		//como parâmetro na Thread
		TarefaMultiplicacao tarefa = new TarefaMultiplicacao(primeiro, segundo, resultado)
		//Criando uma Thread
		//Precisamos passar algo que será executado um Runnable
		Thread threadCalculo = new Thread(tarefa);
		//Agora é preciso indicar para a maquina virtual iniciar a thread
		threadCalculo.start();
		
		
	}

}