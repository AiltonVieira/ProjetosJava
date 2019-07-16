
package newpackagebr.com.bg.sistembghibernate.dominio;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@SuppressWarnings("serial")
@MappedSuperclass
public class DominioBase implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    
    public Long getId() {
        return id;
    }
}
