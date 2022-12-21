package com.sbi.soma.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@Entity
@Table(name="specialization")
public class Specialization {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="specCode")
	private String specCode;
	
	@Column(name="sepcName")
	private String specName;
	
	@Column(name="sepcNote")
	private String specNote;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSpecCode() {
		return specCode;
	}

	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

	public String getSpecName() {
		return specName;
	}

	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public String getSpecNote() {
		return specNote;
	}

	public void setSpecNote(String specNote) {
		this.specNote = specNote;
	}
	
	
}
