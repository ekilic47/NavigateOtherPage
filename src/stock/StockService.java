package stock;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

@ManagedBean(name = "b2")
@RequestScoped
public class StockService {
	private List<SelectItem> symbols;

	public StockService() {
		symbols = new ArrayList<SelectItem>();
		symbols.add(new SelectItem("MSFT"));
		symbols.add(new SelectItem("IBM"));
		symbols.add(new SelectItem("RHAT"));
	}

	public List<SelectItem> getSymbols() {
		return symbols;
	}

	public int getStockValue(QuoteRequest r) {
		return Math.abs((r.getSym() + r.getQuoteDate().toString()).hashCode());
	}
}