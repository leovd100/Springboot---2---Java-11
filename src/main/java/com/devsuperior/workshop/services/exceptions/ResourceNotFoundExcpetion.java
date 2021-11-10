package com.devsuperior.workshop.services.exceptions;

public class ResourceNotFoundExcpetion extends RuntimeException{

	
	private static final long serialVersionUID = 1L;

	
	public ResourceNotFoundExcpetion(Object id) {
		super("Resource not found. Id " + id);
	}
}
