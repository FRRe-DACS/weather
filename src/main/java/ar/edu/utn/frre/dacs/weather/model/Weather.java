package ar.edu.utn.frre.dacs.weather.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;

import lombok.Data;

@Entity
@Table(name = "weather")
@Data
public class Weather {

	@Id
	@Column(name = "id")
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	@CreatedDate
	private Date createdAt;
	
	@Column
	private String city;

	@Column
	@Enumerated(EnumType.STRING)
	private Forecast forecast;
}