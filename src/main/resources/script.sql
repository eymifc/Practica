-- 21 JULIO 2024 CREACION DE TABLAS

-- Table: public.docente

-- DROP TABLE IF EXISTS public.docente;

CREATE TABLE IF NOT EXISTS public.docente
(
    id integer NOT NULL DEFAULT nextval('docente_id_seq'::regclass),
    aula character varying(255) COLLATE pg_catalog."default",
    estado integer,
    grupo integer,
    nombre character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT docente_pkey PRIMARY KEY (id)
    )

-- Table: public.materias

-- DROP TABLE IF EXISTS public.materias;

CREATE TABLE IF NOT EXISTS public.materias
(
    id integer NOT NULL DEFAULT nextval('materias_id_seq'::regclass),
    estado integer,
    nombre character varying(255) COLLATE pg_catalog."default",
    sigla character varying(255) COLLATE pg_catalog."default",
    docente_id integer,
    CONSTRAINT materias_pkey PRIMARY KEY (id),
    CONSTRAINT fkk8xkm3f4idliujsx9kchv3p6m FOREIGN KEY (docente_id)
    REFERENCES public.docente (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    )
-- Table: public.personal

-- DROP TABLE IF EXISTS public.personal;

CREATE TABLE IF NOT EXISTS public.personal
(
    codper integer NOT NULL DEFAULT nextval('personal_codper_seq'::regclass),
    am character varying(255) COLLATE pg_catalog."default",
    ap character varying(255) COLLATE pg_catalog."default",
    estado integer,
    nombre character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT personal_pkey PRIMARY KEY (codper)
    )
