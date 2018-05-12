package ua.seriogatatarinov.orderfood.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.seriogatatarinov.orderfood.repository.ProductRepository;
import ua.seriogatatarinov.orderfood.model.Product;
import ua.seriogatatarinov.orderfood.service.ProductService;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	@Transactional
	public List<Product> getAll() {
		return productRepository.findAll();
	}

}
