DROP TABLE PRODUCT;
DROP TABLE CATEGORY;

CREATE TABLE category(
  id_category INT PRIMARY KEY AUTO_INCREMENT,
  title VARCHAR(15) NOT NULL
);

CREATE TABLE product(
  id_product INT PRIMARY KEY AUTO_INCREMENT,
  title VARCHAR(30) null,
  description varchar(50) null,
  weight INT,
  id_category INT REFERENCES category(id_category),
  price INT
);

INSERT INTO category VALUES (DEFAULT, 'PIZZA');
INSERT INTO category VALUES (DEFAULT, 'SUSHI');

INSERT INTO product VALUES (DEFAULT, 'Гавайская', 'Лучшая пицца с ананасами', 440, 1, 200);
INSERT INTO product VALUES (DEFAULT, 'Фирменная', 'Рыготная пицца с оливками', 440, 1, 150);
INSERT INTO product VALUES (DEFAULT, 'Ветчина', 'Самая бомжовая пицца', 440, 1, 75);
INSERT INTO product VALUES (DEFAULT, 'Салями ', 'С салями и солёными огурцами', 440, 1, 150);
INSERT INTO product VALUES (DEFAULT, 'Говядина', 'Лучшая говядина на райчике', 440, 1, 175);
INSERT INTO product VALUES (DEFAULT, 'Фитнес', 'Для баб без мазика', 440, 1, 100);
