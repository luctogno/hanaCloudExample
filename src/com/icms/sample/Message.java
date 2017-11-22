package com.icms.sample;

import java.util.Date;

/**
 * Class holding information on a person.
 */
public class Message {

	public static final String MESSAGE_TYPE = "b1b42152f7d1481b5363";
	
	private String device;
	private Date sysTimestamp;
	private Date timestamp;
	private double temperature;

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public Date getSysTimestamp() {
		return sysTimestamp;
	}

	public void setSysTimestamp(Date sysTimestamp) {
		this.sysTimestamp = sysTimestamp;
	}

}
