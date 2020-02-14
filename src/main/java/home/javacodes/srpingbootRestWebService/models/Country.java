package home.javacodes.srpingbootRestWebService.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String Code;
	
	private String Name;
	private String Continent;
	private String Region;
	private float SurfaceArea;
	
	@Column(name = "IndepYear", unique = true, nullable = true)
	private Integer IndepYear;
	
	private int Population;
	
	@Column(name = "LifeExpectancy", unique = true, nullable = true)
	private Float LifeExpectancy;
	private float GNP;
	
	@Column(name = "GNPOld", unique = true, nullable = true)
	private Float GNPOld;
	private String localName;
	private String GovernmentForm;
	private String HeadOfState;
	
	@Column(name = "Capital", unique = true, nullable = true)
	private Integer Capital;
	
	private String Code2;
	
	public Country() {
	}

	public Country(String code, String name, String continent, String region, float surfaceArea, Integer indepYear,
			int population, Float lifeExpectancy, float gNP, Float gNPOld, String localName, String governmentForm,
			String headOfState, int capital, String code2) {
		Code = code;
		Name = name;
		Continent = continent;
		Region = region;
		SurfaceArea = surfaceArea;
		IndepYear = indepYear;
		Population = population;
		LifeExpectancy = lifeExpectancy;
		GNP = gNP;
		GNPOld = gNPOld;
		this.localName = localName;
		GovernmentForm = governmentForm;
		HeadOfState = headOfState;
		Capital = capital;
		Code2 = code2;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getContinent() {
		return Continent;
	}

	public void setContinent(String continent) {
		Continent = continent;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public float getSurfaceArea() {
		return SurfaceArea;
	}

	public void setSurfaceArea(float surfaceArea) {
		SurfaceArea = surfaceArea;
	}

	public Integer getIndepYear() {
		return IndepYear;
	}

	public void setIndepYear(Integer indepYear) {
		IndepYear = indepYear;
	}

	public int getPopulation() {
		return Population;
	}

	public void setPopulation(int population) {
		Population = population;
	}

	public Float getLifeExpectancy() {
		return LifeExpectancy;
	}

	public void setLifeExpectancy(Float lifeExpectancy) {
		LifeExpectancy = lifeExpectancy;
	}

	public float getGNP() {
		return GNP;
	}

	public void setGNP(float gNP) {
		GNP = gNP;
	}

	public Float getGNPOld() {
		return GNPOld;
	}

	public void setGNPOld(Float gNPOld) {
		GNPOld = gNPOld;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getGovernmentForm() {
		return GovernmentForm;
	}

	public void setGovernmentForm(String governmentForm) {
		GovernmentForm = governmentForm;
	}

	public String getHeadOfState() {
		return HeadOfState;
	}

	public void setHeadOfState(String headOfState) {
		HeadOfState = headOfState;
	}

	public Integer getCapital() {
		return Capital;
	}

	public void setCapital(Integer capital) {
		Capital = capital;
	}

	public String getCode2() {
		return Code2;
	}

	public void setCode2(String code2) {
		Code2 = code2;
	}
	
	
	
}
