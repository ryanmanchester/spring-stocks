package ryanmanchester.info.springstocks.stock;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
	
	private final StockService stockService;
	
	
	public StockController(StockService stockService, StockRepository stockRepository) {
		this.stockService = stockService;
		
	}
	
	@GetMapping("/stocks")
	public String getStockData() {
		return stockService.getStockData();
	}
	
	@GetMapping("/add-stock")
	public Stock addDemoStock() {
		return stockService.fetchAndSaveDemoStock();
	}
	
	@GetMapping("/my-stocks")
	public List<Stock> showAllStocks() {
		return stockService.findAllStocks();
	}
	
	@GetMapping("/my-stocks/{symbol}")
	public Stock showStockSymbol(@PathVariable String symbol) {
		return stockService.displayStockSymbol(symbol);
	}
	
	
}
