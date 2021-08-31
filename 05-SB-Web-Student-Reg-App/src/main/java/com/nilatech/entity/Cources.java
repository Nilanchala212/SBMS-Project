package com.nilatech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COURCES")
public class Cources {
	@Id
	@Column(name = "COURCES_ID")
	private Integer courcesId;
	@Column(name = "COURCES_NAME")
	private String courcesName;
	public Integer getCourcesId() {
		return courcesId;
	}
	public void setCourcesId(Integer courcesId) {
		this.courcesId = courcesId;
	}
	public String getCourcesName() {
		return courcesName;
	}
	public void setCourcesName(String courcesName) {
		this.courcesName = courcesName;
	}
	@Override
	public String toString() {
		return "Cources [courcesId=" + courcesId + ", courcesName=" + courcesName + "]";
	}

}
