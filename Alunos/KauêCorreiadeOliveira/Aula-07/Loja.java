import java.util.ArrayList;

public class Loja {
    public String nomeFantasia;
    public String razaoSocial;
    public String cnpj;
    public Endereco endereco;
    public ArrayList<Vendedor> vendedores;
    public ArrayList<Cliente> clientes;

    public Loja(String nomeFantasia, String razaoSocial, String cnpj, Endereco endereco) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.vendedores = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
    



   

    public void adicionaVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public void adicionaCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void contarClientes() {
        System.out.println("Quantidade de clientes: " + clientes.size());
    }

    public void contarVendedores() {
        System.out.println("Quantidade de vendedores: " + vendedores.size());
    }

    public void apresentarse() {
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        endereco.apresentarLogradouro();
    }
}
