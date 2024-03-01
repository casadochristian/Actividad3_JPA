package entidad.coche;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "coches")
public class Coche {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String marca;
	private double modelo;
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="coche_usu",
	   joinColumns= { @JoinColumn(name="fk_id_coche", referencedColumnName="id") },
	   inverseJoinColumns= { @JoinColumn(name="fk_id_empleado", referencedColumnName="id")})
	private List<Empleado> listaEmpleados;
	
	@ManyToOne
	@JoinColumn(name="fk_id_empresa", referencedColumnName="id")
	private Empresa empresa;	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return marca;
	}

	public void setNombre(String nombre) {
		this.marca = nombre;
	}

	public double getNota() {
		return modelo;
	}

	public void setNota(double nota) {
		this.modelo = nota;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaUsuarios(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	
	
}
