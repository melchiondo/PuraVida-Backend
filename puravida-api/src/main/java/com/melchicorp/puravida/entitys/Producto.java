package com.melchicorp.puravida.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="categoria")
	private String categoria;
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="colores")
	private String colores;
	
	@Column(name="talles")
	private String talles;
	
	@Column(name="descCorta")
	private String descCorta;
	
	@Column(name="descLarga")
	private String descLarga;
	
	@Column(name="imgPortada")
	private String imgPortada;
	
	@Column(name="imgLista")
	private String imgLista;
	
	@Column(name="temporada")
	private String temporada;
	
	@Column(name="marca")
	private String marca;
	
	@Column(name="precio")
	private String precio;
	
	@Column(name="moneda")
	private String moneda;
	
	@Column(name="descuento")
	private String descuento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColores() {
		return colores;
	}

	public void setColores(String colores) {
		this.colores = colores;
	}

	public String getTalles() {
		return talles;
	}

	public void setTalles(String talles) {
		this.talles = talles;
	}

	public String getDescCorta() {
		return descCorta;
	}

	public void setDescCorta(String descCorta) {
		this.descCorta = descCorta;
	}

	public String getDescLarga() {
		return descLarga;
	}

	public void setDescLarga(String descLarga) {
		this.descLarga = descLarga;
	}

	public String getImgPortada() {
		return imgPortada;
	}

	public void setImgPortada(String imgPortada) {
		this.imgPortada = imgPortada;
	}

	public String getImgLista() {
		return imgLista;
	}

	public void setImgLista(String imgLista) {
		this.imgLista = imgLista;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getDescuento() {
		return descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

//	--> EJEMPLO:
//    id: "1",
//    nombre: "Bikini Punta Cana",
//    categoria: "Bikinis",
//    tipo: "Bikini 2 piezas",
//    colores: ["Fucsia","Amarillo","Negro","Celeste","Rojo","Rosa bebé"],
//    talles: ["1","2","3","4"],
//    descCorta: "Conjunto 2 volados al hombro con culotless",
//    descLarga: "Conjunto 2 volados al hombro con culotless",
//    imgPortada: "assets/img/productos/Malla1.jpeg",
//    imgLista: ["assets/img/productos/f1.jpeg","assets/img/productos/f2.jpeg"],
//    temporada: "Temporada 2020",
//    marca: "Pura Vida",
//    precio: "700.00",
//    moneda: "peso",
//    descuento: "20",

}
