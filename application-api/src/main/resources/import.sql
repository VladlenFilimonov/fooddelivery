LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1, 'pizza.jpg', 'Pizza'), (2, 'sushi.jpg', 'Sushi'), (3, 'bbq.jpg', 'BBQ'),
  (4, 'kebab.jpg', 'Kebab and Burger'), (5, 'wok.jpg', 'WOK'), (6, 'pasta.jpg', 'Pasta'), (7, 'snacks.jpg', 'Snacks'),
  (8, 'soup.jpg', 'Soup'), (9, 'salad.jpg', 'Salad'), (10, 'courses.jpg', 'Main Courses'),
  (11, 'desserts.jpg', 'Desserts');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

LOCK TABLES `delivery` WRITE;
/*!40000 ALTER TABLE `delivery` DISABLE KEYS */;
INSERT INTO `delivery` VALUES (3,'',15.00,'80003141',NULL,NULL),(4,'\0',20.00,'80007788',NULL,NULL),(5,'',22.00,'8833',NULL,NULL),(6,'',20.00,'67221177',NULL,NULL),(7,'',10.00,'80002202',NULL,NULL),(8,'\0',15.00,'1822',NULL,NULL),(9,'\0',20.00,'67220220',NULL,NULL),(10,'',10.00,'25522225',NULL,NULL),(11,'',13.00,'20003737',NULL,NULL),(12,'',15.00,'20006666',NULL,NULL),(13,'',10.00,'25397358',NULL,NULL),(14,'',19.99,'25314924',NULL,NULL),(15,'',15.00,'20405060',NULL,NULL),(16,'\0',15.00,'20545000',NULL,NULL),(17,'\0',22.00,'67225225',NULL,NULL),(18,'\0',20.00,'27444477',NULL,NULL),(19,'\0',20.00,'67007874',NULL,NULL),(20,'\0',20.00,'28343454',NULL,NULL),(21,'\0',30.00,'66777888',NULL,NULL),(22,'\0',15.00,'29535335',NULL,NULL),(23,'',15.00,'20803333',NULL,NULL),(24,'',25.00,'29616161',NULL,NULL),(25,'',15.00,'25600000',NULL,NULL),(26,'',25.00,'27077751',NULL,NULL),(27,'',30.00,'80005436',NULL,NULL),(28,'\0',0.00,'26737389',NULL,NULL),(29,'\0',0.00,'67292270',NULL,NULL),(30,'',0.00,'66103334',NULL,NULL),(31,'\0',45.00,'20003204',NULL,NULL),(32,'',10.00,'20233330',NULL,NULL);
/*!40000 ALTER TABLE `delivery` ENABLE KEYS */;
UNLOCK TABLES;

LOCK TABLES `restaurant` WRITE;
/*!40000 ALTER TABLE `restaurant` DISABLE KEYS */;
INSERT INTO `restaurant` VALUES (3, '', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"q×€x',
                                 '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"q×€x', 'logo.png',
                                 'Domino Club', 'ACTIVE', 3),
  (4, '', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"Ü§@x', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"Ü§@x', 'logo.png', 'CanCan Pica', 'ACTIVE', 4),
  (5, '', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"Ü§@x', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"Ü§@x', 'logo.png', 'Vairak Saules', 'ACTIVE', 5),
  (6, '', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"Ü§@x', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"Ü§@x', 'logo.png', 'IL Patio', 'ACTIVE', 6),
  (7, '', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"\ë\é€x', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"\ë\é€x', 'logo.png', 'Express Pizza', 'ACTIVE', 7),
  (8, '', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"\ë\é€x', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"\ë\é€x', 'logo.png', 'Cili Pica', 'ACTIVE', 8),
  (9, '\0', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"\ë\é€x', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"\ë\é€x', 'logo.png', 'Tokyo City', 'ACTIVE', 9),
  (10, '\0', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"\ë\é€x', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"\ë\é€x', 'logo.png', 'Picu Darbnica', 'ACTIVE', 10),
  (11, '\0', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"\nn\0x', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"\nn\0x', 'logo.png', 'Makss un Morics', 'ACTIVE', 11),
  (12, '\0', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"°@x', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"°@x', 'logo.png', 'Extra Pizza', 'ACTIVE', 12),
  (13, '\0', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"(ò€x', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"(ò€x', 'logo.png', 'Samurai Sushi', 'ACTIVE', 13),
  (14, '\0', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"84Àx', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"84Àx', 'logo.png', 'Sushikomplekti.lv', 'ACTIVE', 14),
  (15, '', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"84Àx', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"84Àx', 'logo.png', 'Bento Sushi', 'ACTIVE', 15),
  (16, '\0', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"84Àx', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"84Àx', 'logo.png', 'Sushi Express', 'ACTIVE', 16),
  (17, '', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"84Àx', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"84Àx', 'logo.png', 'Gan Bei', 'ACTIVE', 17),
  (18, '\0', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"Gw\0x', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"Gw\0x', 'logo.png', 'City Food', 'ACTIVE', 18),
  (19, '', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"„€\0x', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"„€\0x', 'logo.png', 'Kabuki Express', 'ACTIVE', 19),
  (20, '\0', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"„€\0x', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"„€\0x', 'logo.png', 'Sushi home', 'ACTIVE', 20),
  (21, '\0', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"“\Â@x', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"“\Â@x', 'logo.png', 'Yakuza', 'ACTIVE', 21),
  (22, '\0', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"“\Â@x', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"“\Â@x', 'logo.png', 'Sushi Max', 'ACTIVE', 22),
  (23, '\0', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"“\Â@x', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"“\Â@x', 'logo.png', 'Sushi Mania', 'ACTIVE', 23),
  (24, '\0', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"“\Â@x',
   '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"“\Â@x', 'logo.png', 'Mikado Sushi', 'ACTIVE', 24),
  (25, '\0', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"£€x',
   '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"£€x', 'logo.png', 'Sushi Service', 'ACTIVE', 25),
  (26, '\0', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"£€x',
   '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"£€x', 'logo.png', 'Vans', 'ACTIVE', 26),
  (27, '', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"£€x',
   '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"£€x', 'logo.png', 'LIDO', 'ACTIVE', 27),
  (28, '\0', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"£€x',
   '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"£€x', 'logo.png', 'Zalais Darzs', 'ACTIVE', 28),
  (29, '\0', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"²FÀx',
   '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"²FÀx', 'logo.png', 'Uzbekistana', 'ACTIVE', 29),
  (30, '\0', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"²FÀx',
   '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"²FÀx', 'logo.png', 'Uzbegims', 'ACTIVE', 30),
  (31, '\0', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"²FÀx',
   '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"²FÀx', 'logo.png', 'Erebuni', 'ACTIVE', 31),
  (32, '\0', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"²FÀx',
   '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à+\"²FÀx', 'logo.png', 'BEFRITES', 'ACTIVE', 32);
/*!40000 ALTER TABLE `restaurant` ENABLE KEYS */;
UNLOCK TABLES;

LOCK TABLES `category_restaurants` WRITE;
/*!40000 ALTER TABLE `category_restaurants` DISABLE KEYS */;
INSERT INTO `category_restaurants` VALUES (1,3),(2,3),(1,4),(7,4),(8,4),(9,4),(10,4),(11,4),(1,5),(2,5),(5,5),(6,5),(7,5),(8,5),(9,5),(10,5),(11,5),(1,6),(6,6),(7,6),(8,6),(9,6),(10,6),(11,6),(1,7),(1,8),(6,8),(7,8),(8,8),(9,8),(10,8),(11,8),(1,9),(2,9),(4,9),(6,9),(7,9),(8,9),(9,9),(10,9),(11,9),(1,10),(1,11),(1,12),(2,13),(2,14),(2,15),(5,15),(8,15),(9,15),(10,15),(11,15),(2,16),(2,17),(7,17),(8,17),(9,17),(10,17),(11,17),(1,18),(2,18),(1,19),(2,19),(5,19),(7,19),(8,19),(9,19),(10,19),(11,19),(2,20),(2,21),(5,21),(7,21),(8,21),(9,21),(10,21),(11,21),(2,22),(2,23),(8,23),(2,24),(2,25),(11,25),(3,26),(8,26),(9,26),(10,26),(11,26),(7,27),(8,27),(9,27),(10,27),(11,27),(3,28),(7,28),(8,28),(9,28),(10,28),(11,28),(3,29),(7,29),(8,29),(9,29),(10,29),(11,29),(7,30),(8,30),(9,30),(10,30),(11,30),(3,31),(7,31),(8,31),(9,31),(10,31),(11,31),(4,32),(7,32);
/*!40000 ALTER TABLE `category_restaurants` ENABLE KEYS */;
UNLOCK TABLES;

LOCK TABLES `restaurant_urls` WRITE;
/*!40000 ALTER TABLE `restaurant_urls` DISABLE KEYS */;
INSERT INTO `restaurant_urls` VALUES (3,'http://www.dominoclub.lv/lv/produkcija/pica_2842_cm/1/9/',1),(3,'http://www.dominoclub.lv/lv/produkcija/susi/1/3/',2),(4,'http://www.cancan.lv/picas-visi',1),(4,'http://www.cancan.lv/salatiuzkodas',7),(4,'http://www.cancan.lv/zupas',8),(4,'http://www.cancan.lv/salatiuzkodas',9),(4,'http://www.cancan.lv/visi',10),(4,'http://www.cancan.lv/dzerienideserti',11),(5,'http://www.vairaksaules.lv/lv/edienkarte/pica',1),(5,'http://www.vairaksaules.lv/lv/edienkarte/susi',2),(5,'http://www.vairaksaules.lv/lv/edienkarte/wok-edieni',5),(5,'http://www.vairaksaules.lv/lv/edienkarte/pasta-un-ravioli',6),(5,'http://www.vairaksaules.lv/lv/edienkarte/uzkodas',7),(5,'http://www.vairaksaules.lv/lv/edienkarte/zupas',8),(5,'http://www.vairaksaules.lv/lv/edienkarte/salati',9),(5,'http://www.vairaksaules.lv/en/menu/meat-dishes',10),(5,'http://www.vairaksaules.lv/en/menu/desserts',11),(6,'http://www.patio.lv/menu/pizza',1),(6,'http://www.patio.lv/menu/pasta',6),(6,'http://www.patio.lv/menu/snacks',7),(6,'http://www.patio.lv/menu/soups',8),(6,'http://www.patio.lv/menu/salads',9),(6,'http://www.patio.lv/menu/hot-dishes',10),(6,'http://www.patio.lv/menu/desserts',11),(7,'http://www.expresspizza.lv/imgs/logo.png',1),(8,'http://www.cili.lv/wp-content/uploads/2015/09/menju-06.2016.pdf',1),(8,'http://www.cili.lv/wp-content/uploads/2015/09/menju-06.2016.pdf',6),(8,'http://www.cili.lv/wp-content/uploads/2015/09/menju-06.2016.pdf',7),(8,'http://www.cili.lv/wp-content/uploads/2015/09/menju-06.2016.pdf',8),(8,'http://www.cili.lv/wp-content/uploads/2015/09/menju-06.2016.pdf',9),(8,'http://www.cili.lv/wp-content/uploads/2015/09/menju-06.2016.pdf',10),(8,'http://www.cili.lv/wp-content/uploads/2015/09/menju-06.2016.pdf',11),(9,'http://www.tokyocity.lv/spisok-product/Pitctca.html',1),(9,'http://www.tokyocity.lv/spisok-product/sushi.html',2),(9,'http://www.tokyocity.lv/spisok-product/Street_Food.html',4),(9,'http://www.tokyocity.lv/spisok-product/Pasta.html',6),(9,'http://www.tokyocity.lv/spisok-product/Goryachie-zakuski1.html',7),(9,'http://www.tokyocity.lv/spisok-product/-supy-.html',8),(9,'http://www.tokyocity.lv/spisok-product/salaty.html',9),(9,'http://www.tokyocity.lv/spisok-product/Goryachie-blyuda1.html',10),(9,'http://www.tokyocity.lv/spisok-product/deserty.html',11),(10,'http://www.picudarbnica.lv/riga-ilguciems/picas/',1),(11,'http://www.makssunmorics.lv',1),(12,'http://www.extrapizza.lv/lv/picos',1),(13,'http://samuraisushi.lv/lv/sushi-rolli/',2),(14,'http://www.sushikomplekti.lv',2),(15,'http://bentosushi.lv/lv/maki--8gab',2),(15,'http://bentosushi.lv/lv/wok-edieni',5),(15,'http://bentosushi.lv/lv/zupas',8),(15,'http://bentosushi.lv/lv/salati',9),(15,'http://bentosushi.lv/lv/karstie-edieni',10),(15,'http://bentosushi.lv/lv/deserti',11),(16,'http://www.sushiexpress.lv/lv/sushi-maki.html',2),(17,'http://lage.lv/ganbei/lv/sushi/',2),(17,'http://lage.lv/ganbei/lv/salad_appetizers/',7),(17,'http://lage.lv/ganbei/lv/soups/',8),(17,'http://lage.lv/ganbei/lv/salad_appetizers/',9),(17,'http://lage.lv/ganbei/lv/short_order/',10),(17,'http://lage.lv/ganbei/lv/desserts/',11),(18,'http://www.cityfood.lv/lv/picas/',1),(18,'http://www.cityfood.lv/lv/sushi_maki/',2),(19,'http://www.sushi.lv/lv/katalogs/picas-12:00-21:00-pardaugava',1),(19,'http://www.sushi.lv/lv/katalogs/sushi',2),(19,'http://www.sushi.lv/lv/katalogs/wok',5),(19,'http://www.sushi.lv/lv/katalogs/uzkodas',7),(19,'http://www.sushi.lv/lv/katalogs/zupas',8),(19,'http://www.sushi.lv/lv/katalogs/salati',9),(19,'http://www.sushi.lv/lv/katalogs/pamatedieni',10),(19,'http://www.sushi.lv/lv/katalogs/deserti',11),(20,'http://www.sushihome.lv/ru/category/view/maki',2),(21,'http://www.yakuza.lv/lv/catalog//susi',2),(21,'http://www.yakuza.lv/lv/catalog//voks',5),(21,'http://www.yakuza.lv/lv/catalog//salati-un-uzkodas',7),(21,'http://www.yakuza.lv/lv/catalog//zupas',8),(21,'http://www.yakuza.lv/lv/catalog//salati-un-uzkodas',9),(21,'http://www.yakuza.lv/lv/catalog//pamatedieni',10),(21,'http://www.yakuza.lv/lv/catalog//deserti',11),(22,'http://www.yakuza.lv/lv/catalog//deserti',2),(23,'http://sushimania.lv/lv/sushi-rolls',2),(23,'http://sushimania.lv/lv/zupas',8),(24,'http://www.mikadosushi.lv/lv/pasuti_online_-_sushi_gunkni_uramaki_sashimi_maki_nigiri_hosomaki/akcijas_un_jaunumi_-_sushi_gunkni_uramaki_sashimi_maki_nigiri_hosomaki/',2),(25,'http://sushiservice.lv/lv/',2),(25,'http://sushiservice.lv/lv/t/desserts/',11),(26,'http://www.van.lv/ru/menu/saslik',3),(26,'http://www.van.lv/ru/menu/soups',8),(26,'http://www.van.lv/ru/menu/salats',9),(26,'http://www.van.lv/ru/menu/second-dishes',10),(26,'http://www.van.lv/ru/menu/deserts',11),(27,'https://www.lidopiegade.lv/lido/pamatedieni/piedevas/',7),(27,'https://www.lidopiegade.lv/lido/zupas/',8),(27,'https://www.lidopiegade.lv/lido/salati/',9),(27,'https://www.lidopiegade.lv/lido/pamatedieni/galas-edieni/',10),(27,'https://www.lidopiegade.lv/lido/konditorejas-izstradajumi/',11),(28,'http://www.zalais-darzs.lv/',3),(28,'http://www.zalais-darzs.lv/',7),(28,'http://www.zalais-darzs.lv/',8),(28,'http://www.zalais-darzs.lv/',9),(28,'http://www.zalais-darzs.lv/',10),(28,'http://www.zalais-darzs.lv/',11),(29,'http://www.uzbekistana.lv/media/uploads/dish_typ_files/Sasliki_Uzbekistan_Bruninieku_2015.pdf',3),(29,'http://www.uzbekistana.lv/media/uploads/dish_typ_files/Aukstas_uzkodas_Uzbekistan_Bruninieku_2015.pdf',7),(29,'http://www.uzbekistana.lv/media/uploads/dish_typ_files/Zupas_Uzbekistan_Bruninieku_2015.pdf',8),(29,'http://www.uzbekistana.lv/media/uploads/dish_typ_files/Salads_Uzbekistan_Bruninieku_2015.pdf',9),(29,'http://www.uzbekistana.lv/media/uploads/dish_typ_files/Karstie_edieni_Uzbekistan_Bruninieku_2015.pdf',10),(29,'http://www.uzbekistana.lv/media/uploads/dish_typ_files/Desertes_Uzbekistan_Bruninieku_2015.pdf',11),(30,'http://www.uzbegims.lv/menu.pdf',7),(30,'http://www.uzbegims.lv/menu.pdf',8),(30,'http://www.uzbegims.lv/menu.pdf',9),(30,'http://www.uzbegims.lv/menu.pdf',10),(30,'http://www.uzbegims.lv/menu.pdf',11),(31,'http://www.erebuni.lv/ru/bluda-na-grile.html',3),(31,'http://www.erebuni.lv/ru/auksts-uzkodas.html',7),(31,'http://www.erebuni.lv/ru/supi.html',8),(31,'http://www.erebuni.lv/ru/salti.html',9),(31,'http://www.erebuni.lv/ru/vtorije-bluda.html',10),(31,'http://www.erebuni.lv/ru/deserti.html',11),(32,'http://www.kebabupiegade.lv/?page_id=14',4),(32,'http://www.kebabupiegade.lv/?page_id=12',7);
/*!40000 ALTER TABLE `restaurant_urls` ENABLE KEYS */;
UNLOCK TABLES;

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('User',1,NULL,NULL,'vladlenfilimonov@gmail.com','Vladlens','Filimonovs','AnonymousX','1234',NULL),('User',2,NULL,NULL,'email','Dmitrijs','Jakovlevs','login','1234',NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` VALUES (1,'ADMIN'),(2,'MANAGER'),(3,'USER');
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;

LOCK TABLES `user_roles` WRITE;
/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;
INSERT INTO `user_roles` VALUES (1,1),(2,1),(1,2),(2,3);
/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;
UNLOCK TABLES;

