package ryanmanchester.info.springstocks.stock;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Stock {
	
	@JsonProperty("01. symbol")
	private String symbol;
	@JsonProperty("05. price")
	private String price;
	
	public Stock(String symbol, String price) {
		this.symbol = symbol;
		this.price = price;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getPrice() {
		return price;
	}
	
	

}
