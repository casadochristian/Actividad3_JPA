package entidad.coche;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
	@Table(name = "direcciones")
	public class Direccion {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String tipoVia;
		private String nombreVia;
		
		@OneToOne
		@JoinColumn(name = "fk_id_empresa", referencedColumnName = "id")
		private Empresa empresa;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTipoVia() {
			return tipoVia;
		}

		public void setTipoVia(String tipoVia) {
			this.tipoVia = tipoVia;
		}

		public String getNombreVia() {
			return nombreVia;
		}

		public void setNombreVia(String nombreVia) {
			this.nombreVia = nombreVia;
		}

		public Empresa getEmpresa() {
			return empresa;
		}

		public void setEmpresa(Empresa empresa) {
			this.empresa = empresa;
		}
		
		
	}



