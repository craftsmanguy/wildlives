package com.ilmani.dream.wildlives.presenter.rest.business.pet.v1.resources;

import java.io.Serializable;

public class PetResource implements Serializable {

	private static final long serialVersionUID = 2811739234678308526L;

	private String id;

	private String name;

	private String description;

	private boolean isLof;

	private String gender;

	private Integer birth;

	private RaceResource breed;

	public PetResource() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isLof() {
		return isLof;
	}

	public void setLof(boolean isLof) {
		this.isLof = isLof;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getBirth() {
		return birth;
	}

	public void setBirth(Integer birth) {
		this.birth = birth;
	}

	public RaceResource getBreed() {
		return breed;
	}

	public void setBreed(RaceResource breed) {
		this.breed = breed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birth == null) ? 0 : birth.hashCode());
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (isLof ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof PetResource)) {
			return false;
		}
		PetResource other = (PetResource) obj;
		if (birth == null) {
			if (other.birth != null) {
				return false;
			}
		} else if (!birth.equals(other.birth)) {
			return false;
		}
		if (breed == null) {
			if (other.breed != null) {
				return false;
			}
		} else if (!breed.equals(other.breed)) {
			return false;
		}
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (gender == null) {
			if (other.gender != null) {
				return false;
			}
		} else if (!gender.equals(other.gender)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (isLof != other.isLof) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

}
