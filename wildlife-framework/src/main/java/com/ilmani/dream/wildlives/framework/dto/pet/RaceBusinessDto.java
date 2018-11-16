package com.ilmani.dream.wildlives.framework.dto.pet;

import java.io.Serializable;

public class RaceBusinessDto extends AbstractRaceDto implements Serializable{

	private static final long serialVersionUID = -2024163533028655253L;

	protected String scientistName;

	protected String specie;

	protected String clan;

	public RaceBusinessDto() {

	}
	
	public RaceBusinessDto(String code) {
		this.code = code;
	}

	public RaceBusinessDto(String name, String specie, String clan) {
		this.name = name;
		this.specie = specie;
		this.clan = clan;
	}

	public RaceBusinessDto(String name, String scientistName, String code, String specie, String clan) {
		this.name = name;
		this.scientistName = scientistName;
		this.code = code;
		this.specie = specie;
		this.clan = clan;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScientistName() {
		return scientistName;
	}

	public void setScientistName(String scientistName) {
		this.scientistName = scientistName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public String getClan() {
		return clan;
	}

	public void setClan(String clan) {
		this.clan = clan;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clan == null) ? 0 : clan.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((scientistName == null) ? 0 : scientistName.hashCode());
		result = prime * result + ((specie == null) ? 0 : specie.hashCode());
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
		if (!(obj instanceof RaceBusinessDto)) {
			return false;
		}
		RaceBusinessDto other = (RaceBusinessDto) obj;
		if (clan == null) {
			if (other.clan != null) {
				return false;
			}
		} else if (!clan.equals(other.clan)) {
			return false;
		}
		if (code == null) {
			if (other.code != null) {
				return false;
			}
		} else if (!code.equals(other.code)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (scientistName == null) {
			if (other.scientistName != null) {
				return false;
			}
		} else if (!scientistName.equals(other.scientistName)) {
			return false;
		}
		if (specie == null) {
			if (other.specie != null) {
				return false;
			}
		} else if (!specie.equals(other.specie)) {
			return false;
		}
		return true;
	}

}
