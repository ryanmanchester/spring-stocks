package ryanmanchester.info.springstocks.stock;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StockService {
	
	private String alphaVantageApiKey;
	
	private String alphaVantageBaseUrl;
	
	private final RestTemplate restTemplate;
	
	public StockService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

}
