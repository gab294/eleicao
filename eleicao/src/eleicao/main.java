package eleicao;
import javax.swing.JOptionPane;
public class main {
public static void main(String[] args) {
String inputCandidatos = JOptionPane.showInputDialog("Informe a quantidade de candidatos:");
int numeroCandidatos = Integer.parseInt(inputCandidatos);
String[] candidatos = new String[numeroCandidatos];
int[] votos = new int[numeroCandidatos];

		for (int i = 0; i < numeroCandidatos; i++) {
		    candidatos[i] = JOptionPane.showInputDialog("Nome do Candidato:");
		}
		String inputEleitores = JOptionPane.showInputDialog("Informe a quantidade de eleitores:");
		int numeroEleitores = Integer.parseInt(inputEleitores);

		String menu = "";
		for (int i = 0; i < numeroCandidatos; i++) {
		    menu += (i + 1) + " - " + candidatos[i] + "\n";
		}
		for (int i = 1; i <= numeroEleitores; i++) {
		    String inputVoto = JOptionPane.showInputDialog("ELEITOR " + i + ", ESCOLHA SEU CANDIDATO:\n\n" + menu);
		    int voto = Integer.parseInt(inputVoto);

		    votos[voto - 1]++;
		}
		String resultado = " RESULTADO DA ELEIÇÃO \n\n";
		int maiorVotos = 0;
		String vencedor = "";

		for (int i = 0; i < numeroCandidatos; i++) {
		    resultado += candidatos[i] + ": " + votos[i] + " voto(s)\n";

		    if (votos[i] > maiorVotos) {
		        maiorVotos = votos[i];
		        vencedor = candidatos[i];
		    }
		}
		resultado += "\nVENCEU A ELEIÇÃO: " + vencedor + " com " + maiorVotos + " voto(s)!";
		JOptionPane.showMessageDialog(null, resultado);
	
	}

}