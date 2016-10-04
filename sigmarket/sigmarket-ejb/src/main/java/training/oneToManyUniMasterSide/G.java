package training.oneToManyUniMasterSide;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: G
 *
 */
@Entity

public class G implements Serializable {

	   
	@Id
	private int idG;
	
	@ManyToOne
	private H h;
	private static final long serialVersionUID = 1L;

	public G() {
		super();
	}   
	public int getIdG() {
		return this.idG;
	}

	public void setIdG(int idG) {
		this.idG = idG;
	}
	public H getH() {
		return h;
	}
	public void setH(H h) {
		this.h = h;
	}
   
}
