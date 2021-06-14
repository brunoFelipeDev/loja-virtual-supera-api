CREATE TABLE product (
	id bigint NOT NULL,
	name character varying(256) NOT NULL,
	price numeric(11,2),
	score bigint,
	image character varying(256),
	CONSTRAINT product_pkey PRIMARY KEY (id)
);