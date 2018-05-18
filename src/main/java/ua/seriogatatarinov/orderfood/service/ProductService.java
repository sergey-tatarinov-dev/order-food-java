package ua.seriogatatarinov.orderfood.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import ua.seriogatatarinov.orderfood.model.Product;

import java.util.List;

@Service("productService")
public interface ProductService {
	@Cacheable("products")
	public List<Product> getAll();
}
