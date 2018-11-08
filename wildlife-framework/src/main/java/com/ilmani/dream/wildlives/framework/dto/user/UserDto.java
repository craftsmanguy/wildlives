package com.ilmani.dream.wildlives.framework.dto.user;

import java.util.ArrayList;
import java.util.List;

import com.ilmani.dream.wildlives.framework.dto.advert.AbstractAdvertDto;
import com.ilmani.dream.wildlives.framework.dto.pet.AbstractPetDto;

public class UserDto extends AbstractUserDto {

	private static final long serialVersionUID = -8951795870529852049L;

	private List<AbstractPetDto> pets = new ArrayList<AbstractPetDto>();

	private List<AbstractAdvertDto> adverts = new ArrayList<AbstractAdvertDto>();

	public UserDto() {
		super();
	}

	public UserDto(String pseudonym, String email, String country, String postalCode, String city) {
		super();
		this.pseudonym = pseudonym;
		this.email = email;
		this.country = country;
		this.postalCode = postalCode;
		this.city = city;
	}

	public List<AbstractPetDto> getPets() {
		return pets;
	}

	public void setPets(List<AbstractPetDto> petsDto) {
		this.pets = petsDto;
	}

	public List<AbstractAdvertDto> getAdverts() {
		return adverts;
	}

	public void setAdverts(List<AbstractAdvertDto> adverts) {
		this.adverts = adverts;
	}

}
