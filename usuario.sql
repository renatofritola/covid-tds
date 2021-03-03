
CREATE SEQUENCE public.usuario_id_seq;

CREATE TABLE public.usuario (
                id INTEGER NOT NULL DEFAULT nextval('public.usuario_id_seq'),
                nome VARCHAR NOT NULL,
                senha VARCHAR NOT NULL,
                perfil VARCHAR NOT NULL,
                CONSTRAINT usuario_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.usuario_id_seq OWNED BY public.usuario.id;