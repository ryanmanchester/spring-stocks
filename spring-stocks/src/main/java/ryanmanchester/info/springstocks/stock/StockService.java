package ryanmanchester.info.springstocks.stock;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StockService {
	@Value("${alphavantage.api.key}")
	private String alphaVantageApiKey;
	@Value("${alphavantage.base.url}")
	private String alphaVantageBaseUrl;
	
	private final RestTemplate restTemplate;
	
	public StockService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	public Stock stockData(String symbol) {
		String url = alphaVantageBaseUrl + "?function=GLOBAL_QUOTE&symbol="+symbol+"&apikey="+alphaVantageApiKey;
		try {
			Stock stock = restTemplate.getForObject(url, Stock.class);
			if(stock != null) {
				return stock;
			}
		} catch(Exception e) {
			e.getMessage();
			
		}
		return null;
	}

}
