  import java.util.Scanner;
//Declaraçao de atributos
public class Contatos {
  private String nome;
  private String endereco;
  private String cidade;
  private String telefone;

  //(Construtor) Valor Inicial de cada atributo ("String"),("double") ou ("int") (0)
    public Contatos() {
        this("","","","");
    }
    
 //Construtor Alt+Insert -> Construtor -> Selecionar todos -> Gerar
    public Contatos(String nome, String endereco, String cidade, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.telefone = telefone;
    }
    
    //Encapsulamento Alt+Insert -> Gett Setter -> Selecionar Todos -> Gerar
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    //Metodos
    public void cadastrarDados(){
        Scanner ent = new Scanner (System.in);
        System.out.println("Digite Nome:");
        setNome(ent.next());
        System.out.println("Digite Endereco:");
        setEndereco (ent.next());
        System.out.println("Digite Cidade:");
        setCidade (ent.next());
        System.out.println("Digite Telefone:");
        setTelefone (ent.next());
    }
    
    public void MostarDados(){
    System.out.println("\nNome:" +this.getNome() +"\nEndereco:"+ this.getEndereco()+"\nCidade:" + this.getCidade()+ "\nTelefone:" +this.getTelefone());
    }
  
  
}
