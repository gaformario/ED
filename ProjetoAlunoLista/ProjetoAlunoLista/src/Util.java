import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Util {

    private Lista<Aluno> lista = new Lista<>();

    public void menu() {
        String msg = "1.Cadastrar\n2. Remover\n3. Imprimir\n4. Finalizar\n";
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
                            showMessageDialog(null, lista.imprimir());
                            break;
                        case 2:
                            remover();
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
        int ra;
        String nome;

        ra = parseInt(showInputDialog("RA:"));
        nome = showInputDialog("Nome: ");

        lista.inserirInicio(new Aluno(ra, nome));
    }

    private void remover() {
        
        int ra = parseInt(showInputDialog("RA:"));
        Aluno aluno = new Aluno(ra);

        lista.remover(aluno);

    }
}
