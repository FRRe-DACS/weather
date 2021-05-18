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

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;

import ar.edu.utn.frre.dacs.weather.model.Weather;
import ar.edu.utn.frre.dacs.weather.repository.WeatherRepository;

/**
 * 
 * 
 * @author Dr. Jorge Villaverde
 * @version 1.0
 */
//@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@AutoConfigureMockMvc
public class WeatherControllerTests {

	   @Autowired
	    private MockMvc mockMvc;

	    @Autowired
	    private WeatherRepository weatherRepository;

	    @BeforeEach
	    public void setup() {
	        weatherRepository.deleteAll();
	    }

	    @Test
	    public void shouldCreateRecord() throws Exception {
//	        Weather weather = new Weather(new Date(), "Nashville", "Tennessee", 36.1189f, -86.6892f, 37.3);
//	        ObjectMapper objectMapper = new ObjectMapper();
//	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//	        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
//	        weather.setDateRecorded(simpleDateFormat.parse("1985-01-01"));
//
//	        String requestJson = objectMapper.writeValueAsString(weather);
//	        MockHttpServletResponse response = mockMvc.perform(post("/weather")
//	                .contentType("application/json")
//	                .content(requestJson))
//	                .andDo(print())
//	                .andExpect(jsonPath("$.*", hasSize(7)))
//	                .andExpect(jsonPath("$.id", greaterThan(0)))
//	                .andExpect(jsonPath("$.city").value(weather.getCity()))
//	                .andExpect(jsonPath("$.state").value(weather.getState()))
//	                .andExpect(jsonPath("$.lat").value(weather.getLat()))
//	                .andExpect(jsonPath("$.lon").value(weather.getLon()))
//	                .andExpect(jsonPath("$.temperature").value(weather.getTemperature()))
//	                .andExpect(status().isCreated()).andReturn().getResponse();
//
//	        Integer id = JsonPath.parse(response.getContentAsString()).read("$.id");
//	        assertEquals(true, weatherRepository.findById(id).isPresent());

	    }

	    @Test
	    public void shouldGetAll() throws Exception {
//	        Weather weather = new Weather(new Date(), "Nashville", "Tennessee", 36.1189f, -86.6892f, 37.3);
//	        ObjectMapper objectMapper = new ObjectMapper();
//	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//	        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
//	        weather.setDateRecorded(simpleDateFormat.parse("1985-01-01"));
//
//	        String requestJson = objectMapper.writeValueAsString(weather);
//	        MockHttpServletResponse response = mockMvc.perform(post("/weather")
//	                .contentType("application/json")
//	                .content(requestJson))
//	                .andDo(print())
//	                .andExpect(status().isCreated()).andReturn().getResponse();
//	        Integer firstId = JsonPath.parse(response.getContentAsString()).read("$.id");
//
//	        response = mockMvc.perform(post("/weather")
//	                .contentType("application/json")
//	                .content(requestJson))
//	                .andDo(print())
//	                .andExpect(status().isCreated()).andReturn().getResponse();
//	        Integer secondId = JsonPath.parse(response.getContentAsString()).read("$.id");
//
//
//	        mockMvc.perform(get("/weather")
//	                .contentType("application/json"))
//	                .andDo(print())
//	                .andExpect(jsonPath("$").isArray())
//	                .andExpect(jsonPath("$", hasSize(2)))
//	                .andExpect(jsonPath("$[0].id").value(firstId))
//	                .andExpect(jsonPath("$[1].id").value(secondId))
//	                .andExpect(status().isOk());
	    }

	    @Test
	    public void shouldGetById() throws Exception {
//	        Weather weather = new Weather(new Date(), "Nashville", "Tennessee", 36.1189f, -86.6892f, 37.3);
//	        ObjectMapper objectMapper = new ObjectMapper();
//	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//	        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
//	        weather.setDateRecorded(simpleDateFormat.parse("1985-01-01"));
//
//	        String requestJson = objectMapper.writeValueAsString(weather);
//	        MockHttpServletResponse response = mockMvc.perform(post("/weather")
//	                .contentType("application/json")
//	                .content(requestJson))
//	                .andDo(print())
//	                .andExpect(status().isCreated()).andReturn().getResponse();
//	        Integer id = JsonPath.parse(response.getContentAsString()).read("$.id");
//
//	        mockMvc.perform(get("/weather/" + id))
//	                .andDo(print())
//	                .andExpect(jsonPath("$.*", hasSize(7)))
//	                .andExpect(jsonPath("$.id").value(id))
//	                .andExpect(jsonPath("$.city").value(weather.getCity()))
//	                .andExpect(jsonPath("$.state").value(weather.getState()))
//	                .andExpect(jsonPath("$.lat").value(weather.getLat()))
//	                .andExpect(jsonPath("$.lon").value(weather.getLon()))
//	                .andExpect(jsonPath("$.temperature").value(weather.getTemperature()))
//	                .andExpect(status().isOk());
//
//	        mockMvc.perform(get("/weather/" + Integer.MAX_VALUE))
//	                .andDo(print())
//	                .andExpect(status().isNotFound());
	    }

	    @Test
	    public void shouldDeleteById() throws Exception {
//	        Weather weather = new Weather(new Date(), "Nashville", "Tennessee", 36.1189f, -86.6892f, 37.3);
//	        ObjectMapper objectMapper = new ObjectMapper();
//	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//	        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
//	        weather.setDateRecorded(simpleDateFormat.parse("1985-01-01"));
//
//	        String requestJson = objectMapper.writeValueAsString(weather);
//	        MockHttpServletResponse response = mockMvc.perform(post("/weather")
//	                .contentType("application/json")
//	                .content(requestJson))
//	                .andDo(print())
//	                .andExpect(status().isCreated()).andReturn().getResponse();
//	        Integer id = JsonPath.parse(response.getContentAsString()).read("$.id");
//
//	        mockMvc.perform(delete("/weather/" + id))
//	                .andDo(print())
//	                .andExpect(status().isNoContent());
//	        assertEquals(false, weatherRepository.findById(id).isPresent());
//
//	        mockMvc.perform(delete("/weather" + Integer.MAX_VALUE))
//	                .andDo(print())
//	                .andExpect(status().isNotFound());
	    }
}
