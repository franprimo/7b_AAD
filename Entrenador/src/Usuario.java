
public class Usuario {
	
	private int id = 0;
	private String nombre = null;
	private int total = 0;
	private int objetivo = 0;
	private DatosKM datosKm = new DatosKM();
	
	public DatosKM getDatosKm() {
		return datosKm;
	}

	public void setDatosKm(DatosKM datosKm) {
		this.datosKm = datosKm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(int objetivo) {
		this.objetivo = objetivo;
	}

	public Usuario(){
		
	}

}
