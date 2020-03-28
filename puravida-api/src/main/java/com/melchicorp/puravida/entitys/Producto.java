package com.melchicorp.puravida.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="autos")
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
