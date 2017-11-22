package com.icms.sample;

import java.util.Date;

/**
 * Class holding information on a person.
 */
public class Message {
    private Date system_timestamp;
    private Date TIMESTAMP;
    private double Ciaone;
	public double getCiaone() {
		return Ciaone;
	}
	public void setCiaone(double ciaone) {
		Ciaone = ciaone;
	}
	public Date getTIMESTAMP() {
		return TIMESTAMP;
	}
	public void setTIMESTAMP(Date tIMESTAMP) {
		TIMESTAMP = tIMESTAMP;
	}
	public Date getSystem_timestamp() {
		return system_timestamp;
	}
	public void setSystem_timestamp(Date system_timestamp) {
		this.system_timestamp = system_timestamp;
	}

}
