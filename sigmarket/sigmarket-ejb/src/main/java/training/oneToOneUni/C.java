package training.oneToOneUni;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: C
 *
 */
@Entity

public class C implements Serializable {

	   
	@Id
	private int idC;
	
	@OneToOne
	private D d; 
	private static final long serialVersionUID = 1L;

	public C() {
		super();
	}   
	public int getIdC() {
		return this.idC;
	}

	public void setIdC(int idC) {
		this.idC = idC;
	}
	public D getD() {
		return d;
	}
	public void setD(D d) {
		this.d = d;
	}
   
}
