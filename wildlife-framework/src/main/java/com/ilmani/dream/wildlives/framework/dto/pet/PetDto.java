package com.ilmani.dream.wildlives.framework.dto.pet;

import java.io.Serializable;

public class PetDto implements Serializable{

	private static final long serialVersionUID = 2811739234678308526L;

	private String functionalIdentifier;

	private String name;

	private String description;

	private boolean isLof;

	private String gender;

	private Integer birth;

	private RaceDto race;

	public PetDto() {
		super();
	}

	public PetDto(String functionalIdentifier, String name, String description, boolean isLof,
			String gender, Integer birth, RaceDto race) {
		super();
		this.functionalIdentifier = functionalIdentifier;
		this.name = name;
		this.description = description;
		this.isLof = isLof;
		this.gender = gender;
		this.birth = birth;
		this.race = race;
	}

	public String getFunctionalIdentifier() {
		return functionalIdentifier;
	}

	public void setFunctionalIdentifier(String functionalIdentifier) {
		this.functionalIdentifier = functionalIdentifier;
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

	public RaceDto getRace() {
		return race;
	}

	public void setRace(RaceDto race) {
		this.race = race;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birth == null) ? 0 : birth.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((functionalIdentifier == null) ? 0 : functionalIdentifier.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + (isLof ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((race == null) ? 0 : race.hashCode());
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
		if (!(obj instanceof PetDto)) {
			return false;
		}
		PetDto other = (PetDto) obj;
		if (birth == null) {
			if (other.birth != null) {
				return false;
			}
		} else if (!birth.equals(other.birth)) {
			return false;
		}
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (functionalIdentifier == null) {
			if (other.functionalIdentifier != null) {
				return false;
			}
		} else if (!functionalIdentifier.equals(other.functionalIdentifier)) {
			return false;
		}
		if (gender == null) {
			if (other.gender != null) {
				return false;
			}
		} else if (!gender.equals(other.gender)) {
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
		if (race == null) {
			if (other.race != null) {
				return false;
			}
		} else if (!race.equals(other.race)) {
			return false;
		}
		return true;
	}

	
}
