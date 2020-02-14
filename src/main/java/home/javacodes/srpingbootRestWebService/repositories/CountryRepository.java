package home.javacodes.srpingbootRestWebService.repositories;

import org.springframework.data.repository.CrudRepository;

import home.javacodes.srpingbootRestWebService.models.Country;

public interface CountryRepository extends CrudRepository<Country, String> {

}
