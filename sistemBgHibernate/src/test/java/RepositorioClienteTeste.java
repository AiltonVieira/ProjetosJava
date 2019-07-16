
import java.util.List;
import newpackagebr.com.bg.sistembghibernate.dominio.Cliente;
import newpackagebr.com.bg.sistembghibernate.repositorios.RepositorioCliente;
import org.junit.Test;


public class RepositorioClienteTeste {
    @Test
    public void  salvar(){
        Cliente cliente = new Cliente();
        cliente.setNome("Ailton Silva");
        cliente.setCpf("123456789");
        cliente.setRg("09876543210");
        cliente.setTelefone("11954292017");
        cliente.setEmail("ailton@");
        
        RepositorioCliente repositorioCliente = new RepositorioCliente();
        repositorioCliente.salvar(cliente);
    }

    @Test
    public void listar(){
        RepositorioCliente repositorioCliente = new RepositorioCliente();
        List<Cliente> resultado = repositorioCliente.listar();
        
        for (Cliente cliente : resultado){
            System.out.println("Codigo: " + cliente.getId() + "- Nome: " + cliente.getNome() + "- Cpf: " + cliente.getCpf()
                               + "RG: " + cliente.getRg() + " Telefone: " + cliente.getTelefone() + " E-mail: " + cliente.getEmail());
        }
    }
       
    @Test
    public void buscar() {
        Long codigo = 1L;
        Cliente cliente = new RepositorioCliente().buscar(codigo);
        if (cliente == null) {
            System.out.println("Registro não encontrado: ");
            
        }else {
            System.out.println("Registro encontrado: ");
            System.out.println(cliente.toString());
            
        }
    }    
        
     @Test
     public void excluir() {
        Long codigo = 4L;
        RepositorioCliente repositorioCliente = new RepositorioCliente();
        Cliente cliente = new RepositorioCliente().buscar(codigo);
            
         if (cliente == null) {
             System.out.println("Registro não encontrado: ");

         }else {
            System.out.println("Registro removido com sucesso!!!");
            System.out.println(cliente.toString());
            }
        }
        @Test
        public void alterar() {
            Long codigo = 1L;
            RepositorioCliente repositorioCliente = new RepositorioCliente();
            Cliente cliente = new RepositorioCliente().buscar(codigo);
            
            if (cliente == null) {
                System.out.println("Registro não encontrado: ");
                
            }else {
                System.out.println("Registro Alterado com sucesso!!! :");
                System.out.println(cliente.toString());
                editar(cliente);
                repositorioCliente.editar(cliente);
                 
        
             }

        }
        
        @Test
        private void editar(Cliente cliente) {
            cliente.setNome("Ailton 1 Silva");
            cliente.setNome("aSilva");
            cliente.setEmail("silvavieira@");
            cliente.setCpf("1234567");
            System.out.println(cliente.toString());
        }    
 
    
    
}

    
    

