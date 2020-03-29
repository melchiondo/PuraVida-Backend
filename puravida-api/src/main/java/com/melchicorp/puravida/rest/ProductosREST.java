package com.melchicorp.puravida.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.melchicorp.puravida.dao.ProductosDAO;
import com.melchicorp.puravida.entitys.Producto;

@RestController
@RequestMapping("productos")
public class ProductosREST {

	@Autowired
	private ProductosDAO productosDAO;

	//////////////////////////////////////////////////////////////////
	// UpdateProducto - modificación de producto --> PUT /productos //
	//////////////////////////////////////////////////////////////////
	@PutMapping
	public ResponseEntity<Producto> updateProducto(@RequestBody Producto producto) {
		Optional<Producto> optionalProducto = productosDAO.findById(producto.getId());
		if (optionalProducto.isPresent()) {
			Producto updateProducto = optionalProducto.get();
			updateProducto.setCategoria(producto.getCategoria());
			updateProducto.setColores(producto.getColores());
			updateProducto.setDescCorta(producto.getDescCorta());
			updateProducto.setDescLarga(producto.getDescLarga());
			updateProducto.setDescuento(producto.getDescuento());
			updateProducto.setImgLista(producto.getImgLista());
			updateProducto.setImgPortada(producto.getImgPortada());
			updateProducto.setMarca(producto.getMarca());
			updateProducto.setMoneda(producto.getMoneda());
			updateProducto.setNombre(producto.getNombre());
			updateProducto.setPrecio(producto.getPrecio());
			updateProducto.setTalles(producto.getTalles());
			updateProducto.setTemporada(producto.getTemporada());
			updateProducto.setTipo(producto.getTipo());
			productosDAO.save(updateProducto);
			return ResponseEntity.ok(updateProducto);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	//////////////////////////////////////////////////////////////////
	// deleteProducto - Baja de producto --> DELETE /productos/{id} //
	//////////////////////////////////////////////////////////////////
	@DeleteMapping(value = "{id}")
	public ResponseEntity<Void> deleteProducto(@PathVariable("id") Long id) {
		Optional<Producto> optionalproducto = productosDAO.findById(id);
		if (optionalproducto.isPresent()) {
			productosDAO.deleteById(id);
			return ResponseEntity.ok(null);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	/////////////////////////////////////////////////////////////////
	// createProducto - Alta de nuevo producto --> POST /productos //
	/////////////////////////////////////////////////////////////////
	@PostMapping
	public ResponseEntity<Producto> createProducto(@RequestBody Producto producto) {
		Producto newProducto = productosDAO.save(producto);
		return ResponseEntity.ok(newProducto);
	}

	////////////////////////////////////////////////////////////////////////
	// getProductoById - Responde producto por id --> GET /productos/{id} //
	////////////////////////////////////////////////////////////////////////
	@RequestMapping(value = "{id}")
	public ResponseEntity<Producto> getProductoById(@PathVariable("id") Long id) {
		Optional<Producto> optionalproducto = productosDAO.findById(id);
		if (optionalproducto.isPresent()) {
			return ResponseEntity.ok(optionalproducto.get());
		} else {
			return ResponseEntity.noContent().build();
		}
	}

	///////////////////////////////////////////////////////////////////
	// getProducto - Responde todos los productos --> GET /productos //
	///////////////////////////////////////////////////////////////////
	@GetMapping
	public ResponseEntity<List<Producto>> getProducto() {
		List<Producto> productos = productosDAO.findAll();
		return ResponseEntity.ok(productos);
	}

//	@GetMapping
//	public String Hello() {
//		return "API Productos de Pura Vida!";
//	}

}
