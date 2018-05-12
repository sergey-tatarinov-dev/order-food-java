package ua.seriogatatarinov.orderfood.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_product", nullable = false, precision = 0)
	private Long id;

	@Basic
	@Column(name = "title", length = 30, nullable = false)
	private String title;

	@Basic
	@Column(name = "description", length = 50, nullable = true)
	private String description;

	@Basic
	@Column(name = "weight", precision = 0, nullable = true)
	private int weight;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_category", referencedColumnName = "id_category")
	private Category category;

	@Basic
	@Column(name = "price", precision = 0)
	private int price;

}