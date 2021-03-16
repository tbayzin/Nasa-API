package com.repository;

import com.dto.Planet;
import org.springframework.data.repository.CrudRepository;

public interface PlanetRepository extends CrudRepository <Planet, Long> {

}
