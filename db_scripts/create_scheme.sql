DROP TABLE IF EXISTS customer, menu, news, news_image;

CREATE TABLE menu
(
  id bigint NOT NULL,
  link character varying(255),
  label character varying(255),
  CONSTRAINT menu_pkey PRIMARY KEY (id )
);

CREATE TABLE news
(
  id bigint NOT NULL,
  body text,
  title character varying(255),
  CONSTRAINT news_pkey PRIMARY KEY (id )
);