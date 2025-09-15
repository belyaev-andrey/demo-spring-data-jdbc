ALTER TABLE hobby
    ADD client INTEGER;

ALTER TABLE hobby
    ALTER COLUMN client SET NOT NULL;

ALTER TABLE hobby
    ADD CONSTRAINT fk_hobby_on_client FOREIGN KEY (client) REFERENCES client (id) ON DELETE CASCADE;