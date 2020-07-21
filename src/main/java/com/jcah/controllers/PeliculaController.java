package com.jcah.controllers;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jcah.entities.Pelicula;

@Controller
public class PeliculaController {

	@GetMapping("/")
	public String mostrarPrincipal(Model model) {

		List<Pelicula> peliculas = getLista();
		model.addAttribute("hola","Hola desde Thymeleaf");
		model.addAttribute("peliculas", peliculas);

		return "index";

	}
	
	
	
	private List<Pelicula> getLista(){
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		List<Pelicula> lista = null;
		
		try {
			lista  = new LinkedList<>();
			
			Pelicula pelicula1 = new Pelicula();
			pelicula1.setTitulo("Power Rangers");
			pelicula1.setDuracion(180);
			pelicula1.setClasificacion("B");
			pelicula1.setGenero("Aventura");
			pelicula1.setFechaEstreno(sdf.parse("02-05-2017"));
			
			Pelicula pelicula2 = new Pelicula();
			pelicula2.setTitulo("La bella y la Bestia");
			pelicula2.setDuracion(120);
			pelicula2.setClasificacion("A");
			pelicula2.setGenero("Drama");
			pelicula2.setFechaEstreno(sdf.parse("02-05-2019"));
			
			Pelicula pelicula3 = new Pelicula();
			pelicula3.setTitulo("Contratiempo");
			pelicula3.setDuracion(130);
			pelicula3.setClasificacion("B");
			pelicula3.setGenero("Terror");
			pelicula3.setFechaEstreno(sdf.parse("12-06-2016"));
			
			
			lista.add(pelicula1);
			lista.add(pelicula2);
			lista.add(pelicula3);
			
	 
			
			return lista;
			
			
		} catch (Exception e) {

			System.out.println("Error" + e.getMessage());
			return null;
				}
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
