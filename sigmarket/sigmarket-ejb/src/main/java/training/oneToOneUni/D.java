package training.oneToOneUni;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: D
 *
 */
@Entity

public class D implements Serializable {

	   
	@Id
	private int idD;
	private static final long serialVersionUID = 1L;

	public D() {
		super();
	}   
	public int getIdD() {
		return this.idD;
	}

	public void setIdD(int idD) {
		this.idD = idD;
	}
   
}
