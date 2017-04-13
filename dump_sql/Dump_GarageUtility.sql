-- Database: "GarageUtility"
-- DROP DATABASE "GarageUtility";

CREATE DATABASE "GarageUtility"
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'C'
       LC_CTYPE = 'C'
       CONNECTION LIMIT = -1;

       -- Table: public.piece
       -- DROP TABLE public.piece;
       CREATE TABLE public.piece
       (
         "ID" integer NOT NULL DEFAULT nextval('"Piece_ID_seq"'::regclass),
         denomination text NOT NULL, -- Dénomination de la pièce.
         datepose date NOT NULL, -- Date de la pose de la pièce.
         CONSTRAINT "Piece_pkey" PRIMARY KEY ("ID")
       )
       WITH (
         OIDS=TRUE
       );
       ALTER TABLE public.piece
         OWNER TO postgres;
       COMMENT ON COLUMN public.piece.denomination IS 'Dénomination de la pièce.';
       COMMENT ON COLUMN public.piece.datepose IS 'Date de la pose de la pièce.';

       -- Table: public.vehicule
       -- DROP TABLE public.vehicule;
       CREATE TABLE public.vehicule
       (
         "ID" integer NOT NULL DEFAULT nextval('"Voiture_ID_seq"'::regclass),
         immatriculation text NOT NULL, -- Immatriculation du véhicule.
         marque text NOT NULL, -- Marque du véhicule.
         modele text NOT NULL, -- Modèle de la marque du véhicule.
         CONSTRAINT "Voiture_pkey" PRIMARY KEY ("ID")
       )
       WITH (
         OIDS=TRUE
       );
       ALTER TABLE public.vehicule
         OWNER TO postgres;
       COMMENT ON COLUMN public.vehicule.immatriculation IS 'Immatriculation du véhicule.';
       COMMENT ON COLUMN public.vehicule.marque IS 'Marque du véhicule.';
       COMMENT ON COLUMN public.vehicule.modele IS 'Modèle de la marque du véhicule.';

       -- Table: public.client
       -- DROP TABLE public.client;
       CREATE TABLE public.client
       (
         id integer NOT NULL DEFAULT nextval('"Client_ID_seq"'::regclass),
         nom text NOT NULL, -- Nom du client.
         prenom text NOT NULL, -- prénom du client.
         adresse text NOT NULL, -- Adresse du client.
         telephone text NOT NULL, -- Téléphone du client.
         mail text NOT NULL, -- Mail du client.
         CONSTRAINT "Client_pkey" PRIMARY KEY (id)
       )
       WITH (
         OIDS=TRUE
       );
       ALTER TABLE public.client
         OWNER TO postgres;
       COMMENT ON COLUMN public.client.nom IS 'Nom du client.';
       COMMENT ON COLUMN public.client.prenom IS 'prénom du client.';
       COMMENT ON COLUMN public.client.adresse IS 'Adresse du client.';
       COMMENT ON COLUMN public.client.telephone IS 'Téléphone du client.';
       COMMENT ON COLUMN public.client.mail IS 'Mail du client.';

       -- Table: public.reparation
       -- DROP TABLE public.reparation;
       CREATE TABLE public.reparation
       (
         id integer NOT NULL DEFAULT nextval('"Reparation_ID_seq"'::regclass),
         datereparation date NOT NULL, 
         fk_vehicule integer NOT NULL REFERENCES vehicule, --clé étrangère vers le véhicule.
         fk_piece integer NOT NULL REFERENCES piece, -- clé étrangère vers la pièce.
         CONSTRAINT "Reparation_pkey" PRIMARY KEY (id)
       )
       WITH (
         OIDS=TRUE
       );
