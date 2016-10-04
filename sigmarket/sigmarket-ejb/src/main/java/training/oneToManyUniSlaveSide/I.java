package training.oneToManyUniSlaveSide;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: I
 *
 */
@Entity

public class I implements Serializable {

	@Id
	private int idI;

	@OneToMany
	private List<J> js;
	private static final long serialVersionUID = 1L;

	public I() {
		super();
	}

	public int getIdI() {
		return this.idI;
	}

	public void setIdI(int idI) {
		this.idI = idI;
	}

	public List<J> getJs() {
		return js;
	}

	public void setJs(List<J> js) {
		this.js = js;
	}

}
