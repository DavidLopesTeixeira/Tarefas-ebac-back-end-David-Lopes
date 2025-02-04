/**
 *
 */
package main.java.br.com.david.dao.jpa;

import main.java.br.com.david.dao.generic.jpa.IGenericJapDAO;
import main.java.br.com.david.david.jpa.Persistente;

/**
 * @author David
 *
 */
public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
