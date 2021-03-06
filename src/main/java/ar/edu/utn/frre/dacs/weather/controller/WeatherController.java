/*
 * Copyright (C) 2015-2019 UTN-FRRe
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ar.edu.utn.frre.dacs.weather.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.utn.frre.dacs.weather.model.Weather;
import ar.edu.utn.frre.dacs.weather.repository.WeatherRepository;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * 
 * @author Dr. Jorge Villaverde
 * @version 1.0
 */
@RestController
@RequestMapping("weather")
public class WeatherController {

	@Autowired
	@Getter
	@Setter
	private WeatherRepository repository;
	
	@GetMapping("")
	public ResponseEntity<List<Weather>> getWeathers() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Weather> getWeather(@PathVariable Long id) {
		Optional<Weather> found = repository.findById(id);
		if (!found.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(found.get());
	}
	
	@PostMapping("")
	public ResponseEntity<Weather> createWeather(@RequestBody Weather request) {
		Weather created = repository.save(request);
		return ResponseEntity.ok(created);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Weather> deleteWeather(@PathVariable Long id) {
		Optional<Weather> found = repository.findById(id);
		if (!found.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Weather toDelete = found.get();
		repository.delete(toDelete);
		return ResponseEntity.ok(toDelete);
	}

}
