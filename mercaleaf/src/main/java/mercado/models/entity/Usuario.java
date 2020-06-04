package mercado.models.entity;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "usuarios")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_usuario")
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUsuario;
	private String nombre;
	private String apellido;
	private String email;

	@Column(name = "fecha_nacimiento")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;

	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_rol", referencedColumnName = "id_rol")
//	@JsonManagedReference
//	@JsonIgnore
	private Rol rol;

	private String direccion;

	@OneToMany(mappedBy = "usuario")
	@JsonIgnore
	private List<PedidoUsuario> pedidoUsuario;

	private String nombreUsuario;

	private String password;

	private String foto;

	// FOTO
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
//	@JsonBackReference
	@JsonIgnore
	private List<ImageModel> fotos;

	public Usuario() {
		pedidoUsuario = new ArrayList<PedidoUsuario>();
	}

	public Usuario(String nombre, String apellido, String email) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	@PrePersist
	public void prePersist() {
		createAt = new Date();
		
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<PedidoUsuario> getPedidoUsuario() {
		return pedidoUsuario;
	}

	public void setPedidoUsuario(List<PedidoUsuario> pedidoUsuario) {
		this.pedidoUsuario = pedidoUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", fechaNacimiento=" + fechaNacimiento + ", createAt=" + createAt + ", rol=" + rol + ", direccion="
				+ direccion + ", pedidoUsuario=" + pedidoUsuario + ", nombreUsuario=" + nombreUsuario + ", password="
				+ password + ", foto=" + foto + "]";
	}

	// GET SET FOTO
	public List<ImageModel> getFotos() {
		return fotos;
	}

	public void setFotos(List<ImageModel> fotos) {
		this.fotos = fotos;
	}

}
