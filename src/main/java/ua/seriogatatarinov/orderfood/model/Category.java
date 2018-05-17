package ua.seriogatatarinov.orderfood.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_category", nullable = false, precision = 0)
	private Long id;

	@Basic
	@Column(name = "title", length = 30, nullable = false)
	private String title;
}
