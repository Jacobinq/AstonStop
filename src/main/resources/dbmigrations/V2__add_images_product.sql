ALTER TABLE products ADD COLUMN image VARCHAR(255) NOT NULL DEFAULT '';

UPDATE products SET IMAGE = ''