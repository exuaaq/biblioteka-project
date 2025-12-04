create database biblioteka


/////////////////////////////////////////////////////////////////////////

create table biblioteka(
    id_biblioteka int(30) not null,
    naziv varchar(30),
    adresa varchar(30),
    telefon varchar(30),
    PRIMARY KEY (id_biblioteka)
       );


create table kartica(
    id_kartica int(30) not null,
    ime varchar(30),
    prezime varchar(30),
    adresa varchar(30),
    datumd varchar(30),
    datumv varchar(30),
    naziv varchar(30),
    pisac varchar(30),
    id_biblioteka int(30) not null,
    PRIMARY KEY (id_kartica),
    FOREIGN KEY (id_biblioteka) REFERENCES biblioteka(id_biblioteka)
    
    
    );



SELECT b.naziv, b.adresa, b.telefon, k.id_kartica, k.ime,k.prezime, k.adresa, k.datumd, k.datumv, k.naziv, k.pisac
FROM `biblioteka`.`id_biblioteka` b INNER JOIN kartica k ON  b.id_biblioteka=k.id_biblioteka


UPDATE biblioteka
SET b.naziv = 'Hadzim', b.adresa='Buzim', b.telefon='303030', k.id_kartica='1', k.ime='Hamid',k.prezime='Kdsfdsc', k.adresa='Visoko', k.datumd='24/7/2003', k.datumv='22/11/2022', k.naziv='Bruh', k.pisac='Eldar Alic' 
FROM biblioteka b
INNER JOIN kartica k 
       ON b.id_biblioteka=k.id_biblioteka
WHERE b.id_biblioteka = '1' AND k.id_biblioteka='1'; 


UPDATE biblioteka
SET naziv = 'Hadzim', adresa='Buzim', telefon='303030'
WHERE id_biblioteka = 1 


UPDATE kartica
SET id_kartica='1', ime='Hamid',prezime='Khgfhhgfc', adresa='Visoko', datumd='24/7/2003', datumv='22/11/2022', naziv='Bruh', pisac='Eldar Alic' 
WHERE id_biblioteka = 1 



INSERT INTO biblioteka(id_biblioteka, Naziv, Adresa, Telefon) VALUES (3,'GDMK','Titina','3242341'); INSERT INTO kartica(id_kartica, Ime, Prezime, Adresa, datumd, datumv, Naziv, Pisac, id_biblioteka) VALUES (1,'Himzo','Djerozovic','Piskavica','24/2/2222','24.7.2003','Bruh','Eldar Alic',1)



