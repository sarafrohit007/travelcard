package com.example.TravelCard.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "email_domain", catalog = "paymentdb", uniqueConstraints = @UniqueConstraint(columnNames = "domain"))
public class EmailDomain implements Serializable {

	private Integer id;
	private String domain;
	private boolean blocked;
	private String pattern;
	
	public EmailDomain() {
    }

    public EmailDomain(String domain, boolean blocked) {
        this.domain = domain;
        this.blocked = blocked;
        this.pattern = null;
    }
    
    public EmailDomain(String domain, boolean blocked, String pattern) {
        this.domain = domain;
        this.blocked = blocked;
        this.pattern = pattern;
    }

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "domain", unique = true, nullable = false)
	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Column(name = "blocked", unique = true, nullable = false)
	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	@Column(name = "pattern")
	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	@Override
	public String toString() {
		return "EmailDomain [id=" + id + ", domain=" + domain + ", blocked=" + blocked + ", pattern=" + pattern + "]";
	}

}
