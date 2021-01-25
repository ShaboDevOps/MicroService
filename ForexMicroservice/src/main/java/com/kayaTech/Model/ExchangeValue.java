package com.kayaTech.Model;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	
	@Id
	private Long id;
	@Column(name = "currency_FROM")
	private String from;
	@Column(name = "currency_TO")
	private String to;
	@Column(name = "conversionMaltiple")
	private BigDecimal conversionMaltiple;
	private int port;
	
	
	public ExchangeValue() {
		//super();
	}

	public ExchangeValue(Long id, String from, String to,BigDecimal conversionMaltiple,int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.port = port;
		this.conversionMaltiple = conversionMaltiple;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public BigDecimal getConversionMaltiple() {
		return conversionMaltiple;
	}

	public void setConversionMaltiple(BigDecimal conversionMaltiple) {
		this.conversionMaltiple = conversionMaltiple;
	}
	
	
	

}
