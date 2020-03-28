package com.melchicorp.puravida.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.melchicorp.puravida.entitys.Producto;

public interface ProductosDAO extends JpaRepository<Producto, Long>{
	
}
