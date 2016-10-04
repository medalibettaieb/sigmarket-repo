package training.oneToManyUniMasterSide;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: H
 *
 */
@Entity

public class H implements Serializable {

	   
	@Id
	private int idH;
	private static final long serialVersionUID = 1L;

	public H() {
		super();
	}   
	public int getIdH() {
		return this.idH;
	}

	public void setIdH(int idH) {
		this.idH = idH;
	}
   
}
