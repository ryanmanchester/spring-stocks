package ryanmanchester.info.springstocks.stock;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Stock {
	private String symbol;
	private String open;
	private String high;
	private String low;
	private String price;
	private String volume;
	private String latest;
	private String previous;
	private String change;
	private String changePercent;
	
	

	public Stock(String symbol, String open, String high, String low, String price, String volume, String latest,
			String previous, String change, String changePercent) {
		super();
		this.symbol = symbol;
		this.open = open;
		this.high = high;
		this.low = low;
		this.price = price;
		this.volume = volume;
		this.latest = latest;
		this.previous = previous;
		this.change = change;
		this.changePercent = changePercent;
	}



	public String getSymbol() {
		return symbol;
	}



	public String getOpen() {
		return open;
	}



	public String getHigh() {
		return high;
	}



	public String getLow() {
		return low;
	}



	public String getPrice() {
		return price;
	}



	public String getVolume() {
		return volume;
	}



	public String getLatest() {
		return latest;
	}



	public String getPrevious() {
		return previous;
	}



	public String getChange() {
		return change;
	}



	public String getChangePercent() {
		return changePercent;
	}



	@Override
	public String toString() {
		return "Stock [symbol=" + symbol + ", open=" + open + ", high=" + high + ", low=" + low + ", price=" + price
				+ ", volume=" + volume + ", latest=" + latest + ", previous=" + previous + ", change=" + change
				+ ", changePercent=" + changePercent + "]";
	}


	
	
	
}
