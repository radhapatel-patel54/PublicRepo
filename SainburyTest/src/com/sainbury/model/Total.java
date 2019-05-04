package  com.sainbury.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Total {
	
	private double gross;
	private double vat;
	
	
	public Total() {
		super();
	}
	public Total(double gross, double vat) {
		super();
		this.gross = gross;
		this.vat = vat;
	}
	public double getGross() {
		return gross;
	}
	public void setGross(double gross) {
		this.gross = gross;
	}
	public double getVat() {
		return vat;
	}
	public void setVat(double vat) {
		this.vat = vat;
	}
	
	

}
