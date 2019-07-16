
package newpackagebr.com.bg.sistembghibernate.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Cliente extends DominioBase {
    
    @Column (length = 50, nullable = false)
    private String nome;
    @Column (length = 11, nullable = false)
    private String cpf;
    @Column (length = 14, nullable = false)
    private String rg;
    @Column (length = 14, nullable = false)
    private String telefone;
    @Column (length = 50, nullable = false)
    private String email;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = this.nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String nome) {
        this.cpf = this.cpf;
    }
    
    public String getRg() {
        return rg;
    }
    
    public void setRg(String nome) {
        this.rg = this.rg;
    }    
        
        public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String nome) {
        this.telefone = this.telefone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String nome) {
        this.email = this.email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", telefone=" + telefone + ", email=" + email + '}';
    }
    
   
    
}
