CREATE TABLE tb_usuario
(
    id bigint NOT NULL,
    birthday timestamp(6) without time zone NOT NULL,
    created_at timestamp(6) without time zone NOT NULL,
    email character varying(50) NOT NULL,
    first_name character varying(200) NOT NULL,
    last_login timestamp(6) without time zone,
    last_name character varying(200) NOT NULL,
    login character varying(50) NOT NULL,
    password character varying(255) NOT NULL,
    phone character varying(12) NOT NULL,
    role smallint NOT NULL,
    CONSTRAINT tb_usuario_pkey PRIMARY KEY (id),
    CONSTRAINT uk_login UNIQUE (login),
    CONSTRAINT email UNIQUE (email),
    CONSTRAINT tb_usuario_role_check CHECK (role >= 0 AND role <= 1)
);

CREATE SEQUENCE tb_usuario_id_seq;

INSERT INTO public.tb_usuario(
	id, birthday, created_at, email, first_name, last_login, last_name, login, password, phone, role)
	VALUES (nextval('tb_usuario_id_seq'), '1990-05-01 00:00:00', '1990-05-01 00:00:00', '', '', '1990-05-01 00:00:00', '', '', '', '', 0);
