package com.rst.ms.proyectos.services;

import java.util.List;

import com.rst.ms.proyectos.domain.Investigador;
import com.rst.ms.proyectos.exception.EntityNotFoundException;
import com.rst.ms.proyectos.exception.IllegalOperationException;

public interface InvestigadorService {
	List <Investigador> listarTodos();
	
	Investigador buscarPorId(Long id);
	Investigador grabar(Investigador investigador)throws IllegalOperationException;
	Investigador actualizar(Investigador investigador, Long id) throws EntityNotFoundException, IllegalOperationException;
	void eliminar(Long id)throws EntityNotFoundException, IllegalOperationException;
	
	Investigador findByDni (String dni);
	Investigador findByEmail (String email);
}
