package newpackagebr.com.bg.sistemabghibernate.controladores;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;


public class ControladorTela {
    private String mensagem;
    private JFrame telaPrincipal;
    private JDesktopPane desktop;
    private AcessoRapido acessoRapido;
    private TelaCadastroCliente telaCadastroCliente;
    
    
    //Construtor
    
        public ControladorTela(JFrame telaPrincipal, JDesktopPane desktop){
            this.telaPrincipal = telaPrincipal;
            this.desktop = desktop;
        }
    
    
}
