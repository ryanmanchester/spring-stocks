package ryanmanchester.info.springstocks.stock;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
	
	private final StockService stockService;
	
	public StockController(StockService stockService) {
		this.stockService = stockService;
	}
	
	@GetMapping("/stocks")
	public String getStockData() {
		return stockService.getStockData();
	}
	
	@GetMapping("/demo-stock")
	public Stock getDemoStock() {
		return stockService.mapApiToStock();
	}
}
