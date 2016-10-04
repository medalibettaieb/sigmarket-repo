package training.oneToManyBi;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: E
 *
 */
@Entity

public class E implements Serializable {

	@Id
	private int idE;

	@OneToMany(mappedBy="e")
	private List<F> fs;
	private static final long serialVersionUID = 1L;

	public E() {
		super();
	}

	public int getIdE() {
		return this.idE;
	}

	public void setIdE(int idE) {
		this.idE = idE;
	}

	public List<F> getFs() {
		return fs;
	}

	public void setFs(List<F> fs) {
		this.fs = fs;
	}

}
