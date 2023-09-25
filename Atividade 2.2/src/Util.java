import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Util {
    ListaJanela lista;

    public Util() {
        lista = new ListaJanela();
    }

    public void menu() {
        String msg = "1.Cadastrar\n2. Pesquisar\n3. Imprimir\n4. Finalizar\n";
        int opcao = 0;

        do {
            try {
                opcao = parseInt(showInputDialog(msg));
                if (opcao < 1 || opcao > 4) {
                    showMessageDialog(null, "Opção inválida");
                    
                }else {
                    switch(opcao) {
                        case 1:
                            cadastrar();
                            break;
                        case 3:
                            showMessageDialog(null, lista.imprimirJanela());
                            break;
                        case 2:
                            showMessageDialog(null,pesquisa());
                            break;
                    }
                }
            }
            catch(NumberFormatException e) {
                showMessageDialog(null, "Você deve digitar um número!");
            }
                
        } while(opcao != 4);

    }

    private void cadastrar() {
        int numCartao;
        String nome;
        String corTriagem = ""; 
    
        numCartao = parseInt(showInputDialog("NumCartao:"));
        nome = showInputDialog("Nome: ");
        
        do {
            try {
                corTriagem = showInputDialog("Cor (V ou A): ");
                
                if (!corTriagem.equalsIgnoreCase("V") && !corTriagem.equalsIgnoreCase("A")) {
                    showMessageDialog(null, "Somente as cores 'verde(V)' e 'amarelo(A)' são aceitas. Tente novamente.");
                }
            } catch (Exception e) {
                showMessageDialog(null, "Cor de triagem inválida. Digite 'verde(V)' ou 'amarelo(A)'.");
                continue; // Continua pedindo a cor até ser válida
            }
        } while (!corTriagem.equalsIgnoreCase("V") && !corTriagem.equalsIgnoreCase("A"));
    
        lista.inserirPaciente(new Paciente(nome, corTriagem, numCartao));
    }
    
    

    private String pesquisa() {
        int numCartao = parseInt(showInputDialog("NumCartao:"));
    
        No resultado = lista.pesquisar(numCartao);
    
        if (resultado != null) {
            Paciente pacienteEncontrado = resultado.paciente;
            return pacienteEncontrado.toString();
        } else {
            return "Paciente não encontrado xD";
        }
    }
    
}
