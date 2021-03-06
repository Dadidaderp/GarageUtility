PGDMP         %                u           GarageUtility    9.6.1    9.6.0 4    ~	           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            	           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            �	           1262    16384    GarageUtility    DATABASE     m   CREATE DATABASE "GarageUtility" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'C' LC_CTYPE = 'C';
    DROP DATABASE "GarageUtility";
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            �	           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12655    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false            �	           0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            �            1259    16387    client    TABLE     �   CREATE TABLE client (
    id integer NOT NULL,
    nom text NOT NULL,
    prenom text NOT NULL,
    adresse text NOT NULL,
    telephone text NOT NULL,
    mail text NOT NULL,
    nbvisite integer
);
    DROP TABLE public.client;
       public         postgres    true    3            �	           0    0    COLUMN client.nom    COMMENT     2   COMMENT ON COLUMN client.nom IS 'Nom du client.';
            public       postgres    false    186            �	           0    0    COLUMN client.prenom    COMMENT     9   COMMENT ON COLUMN client.prenom IS 'prénom du client.';
            public       postgres    false    186            �	           0    0    COLUMN client.adresse    COMMENT     :   COMMENT ON COLUMN client.adresse IS 'Adresse du client.';
            public       postgres    false    186            �	           0    0    COLUMN client.telephone    COMMENT     @   COMMENT ON COLUMN client.telephone IS 'Téléphone du client.';
            public       postgres    false    186            �	           0    0    COLUMN client.mail    COMMENT     4   COMMENT ON COLUMN client.mail IS 'Mail du client.';
            public       postgres    false    186            �            1259    16385    Client_ID_seq    SEQUENCE     q   CREATE SEQUENCE "Client_ID_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public."Client_ID_seq";
       public       postgres    false    186    3            �	           0    0    Client_ID_seq    SEQUENCE OWNED BY     3   ALTER SEQUENCE "Client_ID_seq" OWNED BY client.id;
            public       postgres    false    185            �            1259    16396    piece    TABLE     n   CREATE TABLE piece (
    "ID" integer NOT NULL,
    denomination text NOT NULL,
    datepose date NOT NULL
);
    DROP TABLE public.piece;
       public         postgres    true    3            �	           0    0    COLUMN piece.denomination    COMMENT     G   COMMENT ON COLUMN piece.denomination IS 'Dénomination de la pièce.';
            public       postgres    false    187            �	           0    0    COLUMN piece.datepose    COMMENT     E   COMMENT ON COLUMN piece.datepose IS 'Date de la pose de la pièce.';
            public       postgres    false    187            �            1259    16403    Piece_ID_seq    SEQUENCE     p   CREATE SEQUENCE "Piece_ID_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public."Piece_ID_seq";
       public       postgres    false    187    3            �	           0    0    Piece_ID_seq    SEQUENCE OWNED BY     3   ALTER SEQUENCE "Piece_ID_seq" OWNED BY piece."ID";
            public       postgres    false    188            �            1259    16416    vehicule    TABLE     �   CREATE TABLE vehicule (
    "ID" integer NOT NULL,
    immatriculation text NOT NULL,
    marque text NOT NULL,
    modele text NOT NULL,
    idclient integer
);
    DROP TABLE public.vehicule;
       public         postgres    true    3            �	           0    0    COLUMN vehicule.immatriculation    COMMENT     O   COMMENT ON COLUMN vehicule.immatriculation IS 'Immatriculation du véhicule.';
            public       postgres    false    190            �	           0    0    COLUMN vehicule.marque    COMMENT     =   COMMENT ON COLUMN vehicule.marque IS 'Marque du véhicule.';
            public       postgres    false    190            �	           0    0    COLUMN vehicule.modele    COMMENT     K   COMMENT ON COLUMN vehicule.modele IS 'Modèle de la marque du véhicule.';
            public       postgres    false    190            �	           0    0    COLUMN vehicule.idclient    COMMENT     E   COMMENT ON COLUMN vehicule.idclient IS 'id du client propriétaire';
            public       postgres    false    190            �            1259    16414    Voiture_ID_seq    SEQUENCE     r   CREATE SEQUENCE "Voiture_ID_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public."Voiture_ID_seq";
       public       postgres    false    3    190            �	           0    0    Voiture_ID_seq    SEQUENCE OWNED BY     8   ALTER SEQUENCE "Voiture_ID_seq" OWNED BY vehicule."ID";
            public       postgres    false    189            �            1259    16674 
   reparation    TABLE     a   CREATE TABLE reparation (
    id integer NOT NULL,
    fk_vehicule text,
    fk_piece integer
);
    DROP TABLE public.reparation;
       public         postgres    false    3            �	           0    0    TABLE reparation    COMMENT     9   COMMENT ON TABLE reparation IS 'table des réparations';
            public       postgres    false    191            �	           0    0    COLUMN reparation.id    COMMENT     ;   COMMENT ON COLUMN reparation.id IS 'id de la réparation';
            public       postgres    false    191            �	           0    0    COLUMN reparation.fk_vehicule    COMMENT     L   COMMENT ON COLUMN reparation.fk_vehicule IS 'immatriculation du véhicule';
            public       postgres    false    191            �           2604    16390 	   client id    DEFAULT     Z   ALTER TABLE ONLY client ALTER COLUMN id SET DEFAULT nextval('"Client_ID_seq"'::regclass);
 8   ALTER TABLE public.client ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    185    186    186            �           2604    16405    piece ID    DEFAULT     Z   ALTER TABLE ONLY piece ALTER COLUMN "ID" SET DEFAULT nextval('"Piece_ID_seq"'::regclass);
 9   ALTER TABLE public.piece ALTER COLUMN "ID" DROP DEFAULT;
       public       postgres    false    188    187            �           2604    16419    vehicule ID    DEFAULT     _   ALTER TABLE ONLY vehicule ALTER COLUMN "ID" SET DEFAULT nextval('"Voiture_ID_seq"'::regclass);
 <   ALTER TABLE public.vehicule ALTER COLUMN "ID" DROP DEFAULT;
       public       postgres    false    190    189    190            �	           0    0    Client_ID_seq    SEQUENCE SET     8   SELECT pg_catalog.setval('"Client_ID_seq"', 145, true);
            public       postgres    false    185            �	           0    0    Piece_ID_seq    SEQUENCE SET     5   SELECT pg_catalog.setval('"Piece_ID_seq"', 4, true);
            public       postgres    false    188            �	           0    0    Voiture_ID_seq    SEQUENCE SET     8   SELECT pg_catalog.setval('"Voiture_ID_seq"', 11, true);
            public       postgres    false    189            v	          0    16387    client 
   TABLE DATA               N   COPY client (id, nom, prenom, adresse, telephone, mail, nbvisite) FROM stdin;
    public       postgres    false    186   �0       w	          0    16396    piece 
   TABLE DATA               6   COPY piece ("ID", denomination, datepose) FROM stdin;
    public       postgres    false    187   %1       {	          0    16674 
   reparation 
   TABLE DATA               8   COPY reparation (id, fk_vehicule, fk_piece) FROM stdin;
    public       postgres    false    191   �1       z	          0    16416    vehicule 
   TABLE DATA               L   COPY vehicule ("ID", immatriculation, marque, modele, idclient) FROM stdin;
    public       postgres    false    190   �1       �           2606    16392    client Client_pkey 
   CONSTRAINT     K   ALTER TABLE ONLY client
    ADD CONSTRAINT "Client_pkey" PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.client DROP CONSTRAINT "Client_pkey";
       public         postgres    false    186    186            �           2606    16410    piece Piece_pkey 
   CONSTRAINT     K   ALTER TABLE ONLY piece
    ADD CONSTRAINT "Piece_pkey" PRIMARY KEY ("ID");
 <   ALTER TABLE ONLY public.piece DROP CONSTRAINT "Piece_pkey";
       public         postgres    false    187    187            �           2606    16683    vehicule immatriculation 
   CONSTRAINT     \   ALTER TABLE ONLY vehicule
    ADD CONSTRAINT immatriculation PRIMARY KEY (immatriculation);
 B   ALTER TABLE ONLY public.vehicule DROP CONSTRAINT immatriculation;
       public         postgres    false    190    190            �           2606    16681    reparation reparation_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY reparation
    ADD CONSTRAINT reparation_pkey PRIMARY KEY (id);
 D   ALTER TABLE ONLY public.reparation DROP CONSTRAINT reparation_pkey;
       public         postgres    false    191    191            �           1259    16485    fki_client_idclient    INDEX     E   CREATE INDEX fki_client_idclient ON vehicule USING btree (idclient);
 '   DROP INDEX public.fki_client_idclient;
       public         postgres    false    190            �           1259    16695 	   fki_piece    INDEX     =   CREATE INDEX fki_piece ON reparation USING btree (fk_piece);
    DROP INDEX public.fki_piece;
       public         postgres    false    191            �           1259    16689    fki_vehicule    INDEX     C   CREATE INDEX fki_vehicule ON reparation USING btree (fk_vehicule);
     DROP INDEX public.fki_vehicule;
       public         postgres    false    191            �           2606    16480    vehicule fk_client_idclient    FK CONSTRAINT     n   ALTER TABLE ONLY vehicule
    ADD CONSTRAINT fk_client_idclient FOREIGN KEY (idclient) REFERENCES client(id);
 E   ALTER TABLE ONLY public.vehicule DROP CONSTRAINT fk_client_idclient;
       public       postgres    false    190    186    2291            �	           0    0 )   CONSTRAINT fk_client_idclient ON vehicule    COMMENT     m   COMMENT ON CONSTRAINT fk_client_idclient ON vehicule IS 'liens entre idclient du véhicule et id du client';
            public       postgres    false    2301            �           2606    16690    reparation fk_piece    FK CONSTRAINT     g   ALTER TABLE ONLY reparation
    ADD CONSTRAINT fk_piece FOREIGN KEY (fk_piece) REFERENCES piece("ID");
 =   ALTER TABLE ONLY public.reparation DROP CONSTRAINT fk_piece;
       public       postgres    false    191    2293    187            �           2606    16684    reparation fk_vehicule    FK CONSTRAINT     {   ALTER TABLE ONLY reparation
    ADD CONSTRAINT fk_vehicule FOREIGN KEY (fk_vehicule) REFERENCES vehicule(immatriculation);
 @   ALTER TABLE ONLY public.reparation DROP CONSTRAINT fk_vehicule;
       public       postgres    false    190    2296    191            v	   j   x�3��I,�J�t�I,MI�4R�ILNUp�/*(Vp+J�KV����L-�403426153��L���iuH�M���K����㲀�畘��G�yY`�H�������� ��2�      w	   M   x�3�t�L��I�4204�50�56�2�)-J�Grsd���AŌtM�L ʜ�s�R��SK�@��PCb���� C�      {	      x������ � �      z	   �   x�-��n�0D���*NlC��)T��J��"qI�rq@J0�~}���ݷ晸d�������vh�߲�K�R�z;-2��u�M������9X4T�vo0��0MH��HHZ�Po>pS���-ˊ^_л�s����r_�$��W���YU��I5S^>�G�5͔�ﱮs#l8�������;�1�S��*�9.?ē@�E8�݀9�?0��emD�     