package home.javacodes.srpingbootRestWebService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import home.javacodes.srpingbootRestWebService.models.Country;
import home.javacodes.srpingbootRestWebService.repositories.CountryRepository;

@RestController
public class RESTController {
	@Autowired
	private CountryRepository countryRepository;
	
	@GetMapping(path="/country_api")
	public @ResponseBody Iterable<Country> getAllWorld(){
		
		//this returns a JSON 
		return countryRepository.findAll();
	}
}
