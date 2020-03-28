package com.melchicorp.puravida.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.melchicorp.puravida.entitys.Auto;

public interface AutosDAO extends JpaRepository<Auto, String>{
	
}
