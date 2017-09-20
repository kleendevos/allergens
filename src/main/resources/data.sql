
insert into categorie (id, categorie) values (1000, 'fruit, groenten en noten');
insert into categorie (id, categorie) values (1001, 'dranken');
insert into categorie (id, categorie) values (1002, 'zuivel');
insert into categorie (id, categorie) values (1003, 'vlees, vis en vleesvervangers');
insert into categorie (id, categorie) values (1004, 'brood en graanproducten');
insert into categorie (id, categorie) values (1005, 'deegwaren en rijst');
insert into categorie (id, categorie) values (1006, 'vetten en oliën');
insert into categorie (id, categorie) values (1007, 'snacks');
insert into categorie (id, categorie) values (1008, 'soepen en bouillons');
insert into categorie (id, categorie) values (1009, 'kruiden');
insert into categorie (id, categorie) values (1010, 'meel, bloem en bindmiddelen');

insert into allergens (id, name) values (1000, "Glutenvrij");
insert into allergens (id, name) values (1001, "Lactosevrij");
insert into allergens (id, name) values (1002, "Veganistisch");
insert into allergens (id, name) values (1003, "Vegatarisch");


insert into product (id, ean_number, brand, name, categorie_id) values (1000,'8722700250494','Becel','smeerboter Boter',1006);
insert into product (id, ean_number, brand, name, categorie_id) values (2000,'8712100714962','Knorr','groentebouillon',1008);
insert into product (id, ean_number, brand, name, categorie_id) values (3000,'8076809029278','Barilla','spaghetti',1005);
insert into product (id, ean_number, brand, name, categorie_id) values (4000,'5410063023888','Cereal','boerenbrood bruin',1004);
insert into product (id, ean_number, brand, name, categorie_id) values (5000,'8710908900785','Knorr','thaise groene curry',1009);
insert into product (id, ean_number, brand, name, categorie_id) values (6000,'8722700250494','Becel','vloeibare boter bakken en braden',1006);
insert into product (id, ean_number, brand, name, categorie_id) values (7000,'5412158005915','Biofood','pijnboompitten',1000);
insert into product (id, ean_number, brand, name, categorie_id) values (8000,'5412158004123','Biofood','quinoa',1005);
insert into product (id, ean_number, brand, name, categorie_id) values (9000,'7622210995025','Cote dor','chocolade - melk met gekarameliseerde amandelen',1007);
insert into product (id, ean_number, brand, name, categorie_id) values (9500,'23011731','Quorn','Vleesvervanger - italiaanse Blokjes', 1003);

insert into product_allergens (product_id, allergens_id) values (1000,1000);






