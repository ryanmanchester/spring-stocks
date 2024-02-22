package ryanmanchester.info.springstocks.stock;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@JsonRootName("Global Quote")
public class Stock {
	@Id
	@JsonProperty("01. symbol")
	private String symbol;
	
	@JsonProperty("02. open")
	private String open;
	
	@JsonProperty("03. high")
	private String high;
	
	@JsonProperty("04. low")
	private String low;
	
	@JsonProperty("05. price")
	private String price;
	
	@JsonProperty("06. volume")
	private String volume;
	
	@JsonProperty("07. latest trading day")
	private String latesTradingDay;
	
	@JsonProperty("08. previous close")
	private String previousClose;
	
	@JsonProperty("09. change")
	private String change;
	
	@JsonProperty("10. change percent")
	private String changePercent;
	
	public Stock() {
		
	}
	
	@JsonCreator
	public Stock(String symbol, String open, String high, String low, String price, String volume, String latestTradingDay,
			String previousClose, String change, String changePercent) {
		super();
		this.symbol = symbol;
		this.open = open;
		this.high = high;
		this.low = low;
		this.price = price;
		this.volume = volume;
		this.latesTradingDay = latestTradingDay;
		this.previousClose = previousClose;
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



	public String getLatesTradingDay() {
		return latesTradingDay;
	}



	public String getPreviousClose() {
		return previousClose;
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
				+ ", volume=" + volume + ", latesTradingDay=" + latesTradingDay + ", previousClose=" + previousClose
				+ ", change=" + change + ", changePercent=" + changePercent + "]";
	}





	
	
	
}
