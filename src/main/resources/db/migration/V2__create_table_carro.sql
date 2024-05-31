CREATE TABLE tb_carro (
    id BIGINT NOT NULL,
    color VARCHAR(50) NOT NULL,
    license_plate VARCHAR(8) NOT NULL,
    model VARCHAR(50) NOT NULL,
    car_year INT NOT NULL,
    id_usuario BIGINT NOT NULL,
    CONSTRAINT tb_carro_pkey PRIMARY KEY (id),
    CONSTRAINT uk_license_plate UNIQUE (license_plate),
    CONSTRAINT fk_id_usuario FOREIGN KEY (id_usuario)
        REFERENCES public.tb_usuario (id)
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

CREATE SEQUENCE tb_carro_id_seq;
