package ryanmanchester.info.springstocks.stock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.annotation.Cacheable;
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
	
	private final StockRepository stockRepository;
	
	public StockService(RestTemplateBuilder restTemplateBuilder, StockRepository stockRepository) {
		this.restTemplate = restTemplateBuilder.build();
		this.stockRepository = stockRepository;
	}
	
	public String getStockData() {
		//String url =alphaVantageBaseUrl + "?function=GLOBAL_QUOTE&symbol=IBM&apikey=" + alphaVantageApiKey;
		
		 return restTemplate.getForObject(url, String.class);
		
		
	}
	
	
	public Stock fetchAndSaveDemoStock() {
		Stock stock = restTemplate.getForObject(url, Stock.class);
		return stockRepository.save(stock);
		
	}
	
	public List<Stock> findAllStocks() {
		return stockRepository.findAll();
	}
}
	
	

	

