import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Janela {
    Lista lista;

    public Janela() {
        lista = new Lista();
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
        String corTriagem = ""; // Inicializa com um valor padrão vazio
    
        numCartao = parseInt(showInputDialog("NumCartao:"));
        nome = showInputDialog("Nome: ");
        
        do {
            try {
                corTriagem = showInputDialog("Cor (verde ou amarelo): ");
                
                if (!corTriagem.equalsIgnoreCase("verde") && !corTriagem.equalsIgnoreCase("amarelo")) {
                    showMessageDialog(null, "Somente as cores 'verde' e 'amarelo' são aceitas. Tente novamente.");
                }
            } catch (Exception e) {
                showMessageDialog(null, "Cor de triagem inválida. Digite 'verde' ou 'amarelo'.");
                continue; // Continua pedindo a cor de triagem até que seja válida
            }
        } while (!corTriagem.equalsIgnoreCase("verde") && !corTriagem.equalsIgnoreCase("amarelo"));
    
        lista.inserir(new Paciente(nome, corTriagem, numCartao));
    }
    
    

    private String pesquisa() {
        int numCartao = parseInt(showInputDialog("NumCartao:"));
    
        No resultado = lista.pesquisaCerta(numCartao);
    
        if (resultado != null) {
            Paciente pacienteEncontrado = resultado.paciente;
            return pacienteEncontrado.toString();
        } else {
            return "Paciente não encontrado xD";
        }
    }
    
    
    
    
}
