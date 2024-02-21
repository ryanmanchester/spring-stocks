package ryanmanchester.info.springstocks.stock;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StockService {
	@Value("${alphavantage.api.key}")
	private String alphaVantageApiKey;
	
	@Value("${alphavantage.base.url}")
	private String alphaVantageBaseUrl;
	
	private final RestTemplate restTemplate;
	private final String url =  "https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol=IBM&apikey=demo";
	
	public StockService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	
	public String getStockData() {
		//String url =alphaVantageBaseUrl + "?function=GLOBAL_QUOTE&symbol=IBM&apikey=" + alphaVantageApiKey;
		
		 return restTemplate.getForObject(url, String.class);
		
		
	}
	
	public Stock mapApiToStock() {
		return restTemplate.getForObject(url, Stock.class);
	}

}
