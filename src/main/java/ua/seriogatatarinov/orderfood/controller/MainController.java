package ua.seriogatatarinov.orderfood.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ua.seriogatatarinov.orderfood.model.Category;
import ua.seriogatatarinov.orderfood.model.Product;

@RestController
public class MainController {

	static Product[] products;

	static {
		products = new Product[]{
				new Product(1, "Гавайская", "Лучшая пицца с ананасами", 440, Category.PIZZA, 200),
				new Product(2, "Фирменная", "Рыготная пицца с оливками", 440, Category.PIZZA, 150),
				new Product(3, "Ветчина", "Самая бомжовая пицца", 440, Category.PIZZA, 75),
				new Product(4, "Салями", "С салями и солёными огурцами", 440, Category.PIZZA, 150),
				new Product(5, "Говядина", "Лучшая говядина на райчике", 440, Category.PIZZA, 175),
				new Product(5, "Фитнес", "Для баб без мазика", 440, Category.PIZZA, 100)
		};

	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public Product[] method() {
		return products;
	}
}
