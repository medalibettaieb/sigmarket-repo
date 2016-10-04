package training.oneToManyBi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: F
 *
 */
@Entity

public class F implements Serializable {

	   
	@Id
	private int idF;
	
	@ManyToOne
	private E e;
	private static final long serialVersionUID = 1L;

	public F() {
		super();
	}   
	public int getIdF() {
		return this.idF;
	}

	public void setIdF(int idF) {
		this.idF = idF;
	}
	public E getE() {
		return e;
	}
	public void setE(E e) {
		this.e = e;
	}
   
}
