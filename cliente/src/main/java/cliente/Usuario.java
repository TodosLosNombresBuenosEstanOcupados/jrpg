package cliente;

import java.io.Serializable;

public class Usuario implements Serializable{

	private static final long serialVersionUID = 6943439087501030283L;
	private String nombre_usuario;
	private String password_usuario;
	private int opcion;
	private int idPj;
	private String accion;
	
	public Usuario(String nombre_usuario, String password_usuario, int idPj) {
		this.nombre_usuario = nombre_usuario;
		this.password_usuario = password_usuario;
		this.opcion=-1;
		this.idPj=idPj;
	}

	public Usuario() {

	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getPassword_usuario() {
		return password_usuario;
	}

	public void setPassword_usuario(String password_usuario) {
		this.password_usuario = password_usuario;
	}

	public int getIdPj() {
		return idPj;
	}

	public void setIdPj(int idPj) {
		this.idPj = idPj;
	}

	
	public int getOpcion() {
		return opcion;
	}

	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}	
}

