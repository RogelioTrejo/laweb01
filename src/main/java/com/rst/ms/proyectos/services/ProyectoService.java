package com.rst.ms.proyectos.services;

import java.util.List;

import com.rst.ms.proyectos.domain.ProyectoInvestigacion;



public interface ProyectoService {
List <ProyectoInvestigacion> listarTodos();
	
	ProyectoInvestigacion buscarPorId(Long id);
	ProyectoInvestigacion grabar(ProyectoInvestigacion proyecto);
	ProyectoInvestigacion actualizar(ProyectoInvestigacion proyecto, Long id);
	void eliminar(Long id);
	

}
