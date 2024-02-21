package ryanmanchester.info.springstocks.stock;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StockService {
	@Value("${alphavantage.api.key}")
	private String alphaVantageApiKey;
	
	@Value("${alphavantage.base.url}")
	private String alphaVantageBaseUrl;
	
	private final RestTemplate restTemplate;
	
	public StockService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	
	public Stock getStockData(String symbol) {
		String url = alphaVantageBaseUrl + "?function=GLOBAL_QUOTES$symbol="+symbol+"&apikey=" +alphaVantageApiKey;
		try {
			Stock stockData = restTemplate.getForObject(url, Stock.class);
			return stockData;
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}
