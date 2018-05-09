package ua.seriogatatarinov.orderfood.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	private int id;

	private String title;

	private String description;

	private int weight;

	private Category category;

	private int price;

}