package com.demo;

import com.demo.model.BeeCostProduct;
import com.demo.model.BeeCostResponse;
import com.demo.model.Product;
import com.demo.service.TestService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Function;

@SpringBootApplication
@EnableCaching
public class SpringBootWithKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithKafkaApplication.class, args);
	}

	@Bean
	RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	CommandLineRunner commandLineRunner(TestService testService) {
		return args -> {
			testService.save();
			testService.query();
//			BeeCostResponse response = restTemplate.getForObject("https://dev.muadee.vn/product/recent", BeeCostResponse.class);
//			Map<String, List<BeeCostProduct>> data = response.getData();
//			List<BeeCostProduct> products = data.get("products");
//			products.forEach(product -> {
//				String detailUrl = String.format("https://dev.muadee.vn/product/detail?product_base_id=%s&type=new", product.getProduct_base_id());
//				String historyPriceUrl = String.format("https://dev.muadee.vn/product/history_price?product_base_id=%s&price_current=%f", product.getProduct_base_id(), product.getPrice());
//
//				Map<String, Object> detailResponse = restTemplate.getForObject(detailUrl, Map.class);;
//				Map<String, Object> detailData = (Map<String, Object>) detailResponse.get("data");
//				Map<String, Object> productBase = (Map<String, Object>) detailData.get("product_base");
//
//				Map<String, Object> historyPriceResponse = restTemplate.getForObject(historyPriceUrl, Map.class);;
//				Map<String, Object> historyPriceData = (Map<String, Object>) historyPriceResponse.get("data");
//				Map<String, Object> historyPrice = (Map<String, Object>) historyPriceData.get("product_history_data");
//
//				Product p = new Product();
//				if (historyPrice != null) {
//					Map<String, Object> itemHistory = (Map<String, Object>) historyPrice.get("item_history");
//					List<Double> prices = (List<Double>) itemHistory.get("price");
//					Double minPrice = prices.stream().mapToDouble(v -> v).min().orElseThrow(NoSuchElementException::new);
//					p.setLowestPrice(minPrice);
//				}
//
//				p.setName(p.getName());
//				p.setDescription((String) productBase.get("description"));
//				p.setShopeeShopID((String) productBase.get("shop_id_platform"));
//				p.setShopeeID((String) productBase.get("shop_base_id"));
//				p.setCurrentPrice(product.getPrice());
//				System.out.println(p);
//			});
		};
	}
}
