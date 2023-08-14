public class Produto {

    // atributos / variaveis de instancia
    int codigo;
    String nome;
    double preco;

    // metodo pra impressao dos dados 

    public void imprimir() {
        System.out.println(codigo);
        System.out.println(nome);
        System.out.println(preco);
    }

    public static void main(String[] args) {
        Produto p = new Produto();
        
        System.out.println(p);
        p.codigo = 12;
        p.nome = "SUCO";
        p.preco = 12.99;

        System.out.println(p.codigo);

        System.out.println(p.nome);
        
        System.out.println(p.preco);

        p.imprimir();
    }

}
