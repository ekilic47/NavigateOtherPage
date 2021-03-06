package stock;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "b1")

@RequestScoped
public class QuoteRequest {
	private Date quoteDate = new Date();
	private String sym = "MSFT";

	public QuoteRequest() {
		System.out.println("Creating b1");
	}

	public String getSym() {
		System.ouat.println("getting sym");
		return sym;
	}

	public void setSym(String sym) {
		System.out.println("setting sym to: " + sym);
		this.sym = sym;
	}

	public Date getQuoteDate() {
		return quoteDate;
	}

	public void setQuoteDate(Date quoteDate) {
		this.quoteDate = quoteDate;
	}

	public int getStockValue() {
		return Math.abs((sym + quoteDate.toString()).hashCode());
	}
}