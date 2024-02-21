package ryanmanchester.info.springstocks.stock;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonProperty;

@Service
public class StockService {
	@JsonProperty("01. symbol")
	private String alphaVantageApiKey;
	@JsonProperty("05. price")
	private String alphaVantageBaseUrl;
	
	private final RestTemplate restTemplate;
	
	public StockService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

}
