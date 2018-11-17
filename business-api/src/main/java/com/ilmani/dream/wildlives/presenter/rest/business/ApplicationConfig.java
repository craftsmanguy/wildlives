package com.ilmani.dream.wildlives.presenter.rest.business;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.ilmani.dream.wildlives.presenter.rest.business.advert.v1.AdvertBusinessResource;
import com.ilmani.dream.wildlives.presenter.rest.business.advert.v1.FormatBusinessResource;
import com.ilmani.dream.wildlives.presenter.rest.business.pet.v1.PetBusinessResource;
import com.ilmani.dream.wildlives.presenter.rest.business.pet.v1.RaceBusinessResource;
import com.ilmani.dream.wildlives.presenter.rest.business.security.v1.AuthenticationRequestUserFilter;
import com.ilmani.dream.wildlives.presenter.rest.business.security.v1.AuthenticationUserService;
import com.ilmani.dream.wildlives.presenter.rest.business.user.v1.UserBusinessResource;


@ApplicationPath("/")
public class ApplicationConfig  extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<>();
		
		resources.add(ExceptionHandler.class);

		resources.add(AuthenticationRequestUserFilter.class);
		resources.add(AuthenticationUserService.class);
		resources.add(AdvertBusinessResource.class);
		resources.add(FormatBusinessResource.class);
		
		resources.add(RaceBusinessResource.class);
		resources.add(PetBusinessResource.class);
		
		resources.add(UserBusinessResource.class);

		return resources;
	}

	@Override
	public Set<Object> getSingletons() {
		Set<Object> singletons = new HashSet<>();
		return singletons;
	}

}
