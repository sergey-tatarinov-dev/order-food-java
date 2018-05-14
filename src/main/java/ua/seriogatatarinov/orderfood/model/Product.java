package ua.seriogatatarinov.orderfood.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import ua.seriogatatarinov.orderfood.util.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends BaseEntity {

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

	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_category", referencedColumnName = "id_category")
	private Category category;

	@Basic
	@Column(name = "image_binary", nullable = false)
	private String imageBinaryString;

	@Type(type = "jsonb")
	@Column(columnDefinition = "jsonb")
	private List<Portion> portions = new ArrayList<>();

}