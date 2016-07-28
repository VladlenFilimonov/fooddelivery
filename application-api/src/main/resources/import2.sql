-- MySQL dump 10.13  Distrib 5.7.12, for Linux (x86_64)
--
-- Host: localhost    Database: testDB
-- ------------------------------------------------------
-- Server version	5.7.12-0ubuntu1.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Logo.png','Pizza'),(2,'Logo2.png','Sushi'),(3,'Logo3.png','BBQ'),(4,'Logo4.png','Kebab and Burger'),(5,'Logo5.png','WOK'),(6,'Logo6.png','Pasta'),(7,'Logo7.png','Snacks'),(8,'Logo8.png','Soup'),(9,'Logo9.png','Salad'),(10,'Logo10.png','Main Courses'),(11,'Logo11.png','Desserts');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `category_restaurants`
--

LOCK TABLES `category_restaurants` WRITE;
/*!40000 ALTER TABLE `category_restaurants` DISABLE KEYS */;
INSERT INTO `category_restaurants` VALUES (1,1),(1,2),(9,2),(11,2),(1,3),(2,3),(1,4),(7,4),(8,4),(9,4),(10,4),(11,4),(1,5),(2,5),(5,5),(6,5),(7,5),(8,5),(9,5),(10,5),(11,5),(1,6),(6,6),(7,6),(8,6),(9,6),(10,6),(11,6),(1,7),(1,8),(6,8),(7,8),(8,8),(9,8),(10,8),(11,8),(1,9),(2,9),(4,9),(6,9),(7,9),(8,9),(9,9),(10,9),(11,9),(1,10),(1,11),(1,12),(2,13),(2,14),(2,15),(5,15),(8,15),(9,15),(10,15),(11,15),(2,16),(2,17),(7,17),(8,17),(9,17),(10,17),(11,17),(1,18),(2,18),(1,19),(2,19),(5,19),(7,19),(8,19),(9,19),(10,19),(11,19),(2,20),(2,21),(5,21),(7,21),(8,21),(9,21),(10,21),(11,21),(2,22),(2,23),(8,23),(2,24),(2,25),(11,25),(3,26),(8,26),(9,26),(10,26),(11,26),(7,27),(8,27),(9,27),(10,27),(11,27),(3,28),(7,28),(8,28),(9,28),(10,28),(11,28),(3,29),(7,29),(8,29),(9,29),(10,29),(11,29),(7,30),(8,30),(9,30),(10,30),(11,30),(3,31),(7,31),(8,31),(9,31),(10,31),(11,31),(4,32),(7,32);
/*!40000 ALTER TABLE `category_restaurants` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
INSERT INTO `comment` VALUES (1,'¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw\0\0à\n;(%÷x','¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw\0\0à\n;(%÷x','Horoso',1,1),(2,'¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw\0\0à\n;(%\"9Àx','¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw\0\0à\n;(%\"9Àx','Ploho',2,2);
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `contact_info`
--

LOCK TABLES `contact_info` WRITE;
/*!40000 ALTER TABLE `contact_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `contact_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `delivery`
--

LOCK TABLES `delivery` WRITE;
/*!40000 ALTER TABLE `delivery` DISABLE KEYS */;
INSERT INTO `delivery` VALUES (1,'\0',10.00,'22333839','¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw;;;Éÿx','¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpwÿx'),(2,'\0',15.00,'80005858','¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw;;;Éÿx','¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpwÿx'),(3,'\0',15.00,'80003141',NULL,NULL),(4,'\0',20.00,'80007788',NULL,NULL),(5,'\0',22.00,'8833',NULL,NULL),(6,'\0',20.00,'67221177',NULL,NULL),(7,'\0',10.00,'80002202',NULL,NULL),(8,'\0',15.00,'1822',NULL,NULL),(9,'\0',20.00,'67220220',NULL,NULL),(10,'\0',10.00,'25522225',NULL,NULL),(11,'\0',13.00,'20003737',NULL,NULL),(12,'\0',15.00,'20006666',NULL,NULL),(13,'\0',10.00,'25397358',NULL,NULL),(14,'\0',19.99,'25314924',NULL,NULL),(15,'\0',15.00,'20405060',NULL,NULL),(16,'\0',15.00,'20545000',NULL,NULL),(17,'\0',22.00,'67225225',NULL,NULL),(18,'\0',20.00,'27444477',NULL,NULL),(19,'\0',20.00,'67007874',NULL,NULL),(20,'\0',20.00,'28343454',NULL,NULL),(21,'\0',30.00,'66777888',NULL,NULL),(22,'\0',15.00,'29535335',NULL,NULL),(23,'\0',15.00,'20803333',NULL,NULL),(24,'\0',25.00,'29616161',NULL,NULL),(25,'\0',15.00,'25600000',NULL,NULL),(26,'\0',25.00,'27077751',NULL,NULL),(27,'\0',30.00,'80005436',NULL,NULL),(28,'\0',0.00,'26737389',NULL,NULL),(29,'\0',0.00,'67292270',NULL,NULL),(30,'\0',0.00,'66103334',NULL,NULL),(31,'\0',45.00,'20003204',NULL,NULL),(32,'\0',10.00,'20233330',NULL,NULL);
/*!40000 ALTER TABLE `delivery` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `rating`
--

LOCK TABLES `rating` WRITE;
/*!40000 ALTER TABLE `rating` DISABLE KEYS */;
INSERT INTO `rating` VALUES (1,'¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw\0\0à\n;(4Îx','¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw\0\0à\n;(4Îx',10,1,1),(2,'¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw\0\0à\n;(4Îx','¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw\0\0à\n;(4Îx',6,1,1),(3,'¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw\0\0à\n;(4Îx','¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw\0\0à\n;(4Îx',8,2,2),(4,'¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw\0\0à\n;(4Îx','¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw\0\0à\n;(4Îx',2,2,2);
/*!40000 ALTER TABLE `rating` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `restaurant`
--

LOCK TABLES `restaurant` WRITE;
/*!40000 ALTER TABLE `restaurant` DISABLE KEYS */;
INSERT INTO `restaurant` VALUES (1,'','¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw\0\0à\n;\'5áò\0x','¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw\0\0à\n;\'71\0x','Pizza_Fly_logo.png','Pizza Fly','ACTIVE',1),(2,'','¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw\0\0à\n;\'7}îÀx','¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw\0\0à\n;(µqÀx','LuLu_Pica_logo.png','LuLu Pica','ACTIVE',2),(3,'',NULL,NULL,'Domino_Club_logo.png','Domino Club','ACTIVE',3),(4,'',NULL,NULL,'CanCan_Pica_logo.png','CanCan Pica','ACTIVE',4),(5,'',NULL,NULL,'Vairak_Saules_logo.png','Vairak Saules','ACTIVE',5),(6,'',NULL,NULL,'IL_Patio_logo.png','IL Patio','ACTIVE',6),(7,'',NULL,NULL,'Express_Pizza_logo.png','Express Pizza','ACTIVE',7),(8,'',NULL,NULL,'Cili_Pica_logo.png','Cili Pica','ACTIVE',8),(9,'\0',NULL,NULL,'Tokyo_City_logo.png','Tokyo City','ACTIVE',9),(10,'\0',NULL,NULL,'Picu_Darbnica_logo.png','Picu Darbnica','ACTIVE',10),(11,'\0',NULL,NULL,'Makss_un_Morics_logo.png','Makss un Morics','ACTIVE',11),(12,'\0',NULL,NULL,'Extra_Pizza_logo.png','Extra Pizza','ACTIVE',12),(13,'\0',NULL,NULL,'Samurai_Sushi_logo.png','Samurai Sushi','ACTIVE',13),(14,'\0',NULL,NULL,'Sushikomplekti.lv_logo.png','Sushikomplekti.lv','ACTIVE',14),(15,'',NULL,NULL,'Bento_Sushi_logo.png','Bento Sushi','ACTIVE',15),(16,'\0',NULL,NULL,'Sushi_Express_logo.png','Sushi Express','ACTIVE',16),(17,'',NULL,NULL,'Gan_Bei_logo.png','Gan Bei','ACTIVE',17),(18,'\0',NULL,NULL,'City_Food_logo.png','City Food','ACTIVE',18),(19,'',NULL,NULL,'Kabuki_Express_logo.png','Kabuki Express','ACTIVE',19),(20,'\0',NULL,NULL,'Sushi_home_logo.png','Sushi home','ACTIVE',20),(21,'\0',NULL,NULL,'Yakuza_logo.png','Yakuza','ACTIVE',21),(22,'\0',NULL,NULL,'Sushi_Max_logo.png','Sushi Max','ACTIVE',22),(23,'\0',NULL,NULL,'Sushi_Mania_logo.png','Sushi Mania','ACTIVE',23),(24,'\0',NULL,NULL,'Mikado_Sushi_logo.png','Mikado Sushi','ACTIVE',24),(25,'\0',NULL,NULL,'Sushi_Service_logo.png','Sushi Service','ACTIVE',25),(26,'\0',NULL,NULL,'Vans_logo.png','Vans','ACTIVE',26),(27,'',NULL,NULL,'LIDO_logo.png','LIDO','ACTIVE',27),(28,'\0',NULL,NULL,'Zalais_Darzs_logo.png','Zalais Darzs','ACTIVE',28),(29,'\0',NULL,NULL,'Uzbekistana_logo.png','Uzbekistana','ACTIVE',29),(30,'\0',NULL,NULL,'Uzbegims_logo.png','Uzbegims','ACTIVE',30),(31,'\0',NULL,NULL,'Erebuni_logo.png','Erebuni','ACTIVE',31),(32,'\0',NULL,NULL,'BEFRITES_logo.png','BEFRITES','ACTIVE',32);
/*!40000 ALTER TABLE `restaurant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `restaurant_urls`
--

LOCK TABLES `restaurant_urls` WRITE;
/*!40000 ALTER TABLE `restaurant_urls` DISABLE KEYS */;
INSERT INTO `restaurant_urls` VALUES (1,'http://pizzafly.lv/picas',1),(2,'https://www.lulu.lv/picas',1),(2,'https://www.lulu.lv/salati-un-merces',9),(2,'https://www.lulu.lv/saldie',11),(3,'http://www.dominoclub.lv/lv/produkcija/pica_2842_cm/1/9/',1),(3,'http://www.dominoclub.lv/lv/produkcija/susi/1/3/',2),(4,'http://www.cancan.lv/picas-visi',1),(4,'http://www.cancan.lv/salatiuzkodas',7),(4,'http://www.cancan.lv/zupas',8),(4,'http://www.cancan.lv/salatiuzkodas',9),(4,'http://www.cancan.lv/visi',10),(4,'http://www.cancan.lv/dzerienideserti',11),(5,'http://www.vairaksaules.lv/lv/edienkarte/pica',1),(5,'http://www.vairaksaules.lv/lv/edienkarte/susi',2),(5,'http://www.vairaksaules.lv/lv/edienkarte/wok-edieni',5),(5,'http://www.vairaksaules.lv/lv/edienkarte/pasta-un-ravioli',6),(5,'http://www.vairaksaules.lv/lv/edienkarte/uzkodas',7),(5,'http://www.vairaksaules.lv/lv/edienkarte/zupas',8),(5,'http://www.vairaksaules.lv/lv/edienkarte/salati',9),(5,'http://www.vairaksaules.lv/en/menu/meat-dishes',10),(5,'http://www.vairaksaules.lv/en/menu/desserts',11),(6,'http://www.patio.lv/menu/pizza',1),(6,'http://www.patio.lv/menu/pasta',6),(6,'http://www.patio.lv/menu/snacks',7),(6,'http://www.patio.lv/menu/soups',8),(6,'http://www.patio.lv/menu/salads',9),(6,'http://www.patio.lv/menu/hot-dishes',10),(6,'http://www.patio.lv/menu/desserts',11),(7,'http://www.expresspizza.lv/imgs/logo.png',1),(8,'http://www.cili.lv/wp-content/uploads/2015/09/menju-06.2016.pdf',1),(8,'http://www.cili.lv/wp-content/uploads/2015/09/menju-06.2016.pdf',6),(8,'http://www.cili.lv/wp-content/uploads/2015/09/menju-06.2016.pdf',7),(8,'http://www.cili.lv/wp-content/uploads/2015/09/menju-06.2016.pdf',8),(8,'http://www.cili.lv/wp-content/uploads/2015/09/menju-06.2016.pdf',9),(8,'http://www.cili.lv/wp-content/uploads/2015/09/menju-06.2016.pdf',10),(8,'http://www.cili.lv/wp-content/uploads/2015/09/menju-06.2016.pdf',11),(9,'http://www.tokyocity.lv/spisok-product/Pitctca.html',1),(9,'http://www.tokyocity.lv/spisok-product/sushi.html',2),(9,'http://www.tokyocity.lv/spisok-product/Street_Food.html',4),(9,'http://www.tokyocity.lv/spisok-product/Pasta.html',6),(9,'http://www.tokyocity.lv/spisok-product/Goryachie-zakuski1.html',7),(9,'http://www.tokyocity.lv/spisok-product/-supy-.html',8),(9,'http://www.tokyocity.lv/spisok-product/salaty.html',9),(9,'http://www.tokyocity.lv/spisok-product/Goryachie-blyuda1.html',10),(9,'http://www.tokyocity.lv/spisok-product/deserty.html',11),(10,'http://www.picudarbnica.lv/riga-ilguciems/picas/',1),(11,'http://www.makssunmorics.lv',1),(12,'http://www.extrapizza.lv/lv/picos',1),(13,'http://samuraisushi.lv/lv/sushi-rolli/',2),(14,'http://www.sushikomplekti.lv',2),(15,'http://bentosushi.lv/lv/maki--8gab',2),(15,'http://bentosushi.lv/lv/wok-edieni',5),(15,'http://bentosushi.lv/lv/zupas',8),(15,'http://bentosushi.lv/lv/salati',9),(15,'http://bentosushi.lv/lv/karstie-edieni',10),(15,'http://bentosushi.lv/lv/deserti',11),(16,'http://www.sushiexpress.lv/lv/sushi-maki.html',2),(17,'http://lage.lv/ganbei/lv/sushi/',2),(17,'http://lage.lv/ganbei/lv/salad_appetizers/',7),(17,'http://lage.lv/ganbei/lv/soups/',8),(17,'http://lage.lv/ganbei/lv/salad_appetizers/',9),(17,'http://lage.lv/ganbei/lv/short_order/',10),(17,'http://lage.lv/ganbei/lv/desserts/',11),(18,'http://www.cityfood.lv/lv/picas/',1),(18,'http://www.cityfood.lv/lv/sushi_maki/',2),(19,'http://www.sushi.lv/lv/katalogs/picas-12:00-21:00-pardaugava',1),(19,'http://www.sushi.lv/lv/katalogs/sushi',2),(19,'http://www.sushi.lv/lv/katalogs/wok',5),(19,'http://www.sushi.lv/lv/katalogs/uzkodas',7),(19,'http://www.sushi.lv/lv/katalogs/zupas',8),(19,'http://www.sushi.lv/lv/katalogs/salati',9),(19,'http://www.sushi.lv/lv/katalogs/pamatedieni',10),(19,'http://www.sushi.lv/lv/katalogs/deserti',11),(20,'http://www.sushihome.lv/ru/category/view/maki',2),(21,'http://www.yakuza.lv/lv/catalog//susi',2),(21,'http://www.yakuza.lv/lv/catalog//voks',5),(21,'http://www.yakuza.lv/lv/catalog//salati-un-uzkodas',7),(21,'http://www.yakuza.lv/lv/catalog//zupas',8),(21,'http://www.yakuza.lv/lv/catalog//salati-un-uzkodas',9),(21,'http://www.yakuza.lv/lv/catalog//pamatedieni',10),(21,'http://www.yakuza.lv/lv/catalog//deserti',11),(22,'http://www.yakuza.lv/lv/catalog//deserti',2),(23,'http://sushimania.lv/lv/sushi-rolls',2),(23,'http://sushimania.lv/lv/zupas',8),(24,'http://www.mikadosushi.lv/lv/pasuti_online_-_sushi_gunkni_uramaki_sashimi_maki_nigiri_hosomaki/akcijas_un_jaunumi_-_sushi_gunkni_uramaki_sashimi_maki_nigiri_hosomaki/',2),(25,'http://sushiservice.lv/lv/',2),(25,'http://sushiservice.lv/lv/t/desserts/',11),(26,'http://www.van.lv/ru/menu/saslik',3),(26,'http://www.van.lv/ru/menu/soups',8),(26,'http://www.van.lv/ru/menu/salats',9),(26,'http://www.van.lv/ru/menu/second-dishes',10),(26,'http://www.van.lv/ru/menu/deserts',11),(27,'https://www.lidopiegade.lv/lido/pamatedieni/piedevas/',7),(27,'https://www.lidopiegade.lv/lido/zupas/',8),(27,'https://www.lidopiegade.lv/lido/salati/',9),(27,'https://www.lidopiegade.lv/lido/pamatedieni/galas-edieni/',10),(27,'https://www.lidopiegade.lv/lido/konditorejas-izstradajumi/',11),(28,'http://www.zalais-darzs.lv/',3),(28,'http://www.zalais-darzs.lv/',7),(28,'http://www.zalais-darzs.lv/',8),(28,'http://www.zalais-darzs.lv/',9),(28,'http://www.zalais-darzs.lv/',10),(28,'http://www.zalais-darzs.lv/',11),(29,'http://www.uzbekistana.lv/media/uploads/dish_typ_files/Sasliki_Uzbekistan_Bruninieku_2015.pdf',3),(29,'http://www.uzbekistana.lv/media/uploads/dish_typ_files/Aukstas_uzkodas_Uzbekistan_Bruninieku_2015.pdf',7),(29,'http://www.uzbekistana.lv/media/uploads/dish_typ_files/Zupas_Uzbekistan_Bruninieku_2015.pdf',8),(29,'http://www.uzbekistana.lv/media/uploads/dish_typ_files/Salads_Uzbekistan_Bruninieku_2015.pdf',9),(29,'http://www.uzbekistana.lv/media/uploads/dish_typ_files/Karstie_edieni_Uzbekistan_Bruninieku_2015.pdf',10),(29,'http://www.uzbekistana.lv/media/uploads/dish_typ_files/Desertes_Uzbekistan_Bruninieku_2015.pdf',11),(30,'http://www.uzbegims.lv/menu.pdf',7),(30,'http://www.uzbegims.lv/menu.pdf',8),(30,'http://www.uzbegims.lv/menu.pdf',9),(30,'http://www.uzbegims.lv/menu.pdf',10),(30,'http://www.uzbegims.lv/menu.pdf',11),(31,'http://www.erebuni.lv/ru/bluda-na-grile.html',3),(31,'http://www.erebuni.lv/ru/auksts-uzkodas.html',7),(31,'http://www.erebuni.lv/ru/supi.html',8),(31,'http://www.erebuni.lv/ru/salti.html',9),(31,'http://www.erebuni.lv/ru/vtorije-bluda.html',10),(31,'http://www.erebuni.lv/ru/deserti.html',11),(32,'http://www.kebabupiegade.lv/?page_id=14',4),(32,'http://www.kebabupiegade.lv/?page_id=12',7);
/*!40000 ALTER TABLE `restaurant_urls` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('User',1,'¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw\0\0à\n;(Æx','¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw\0\0à\n;(ÕÚÀx','vladlenfilimonov@gmail.com','Vladlens','Filimonovs','AnonymousX','1234',NULL),('User',2,'¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw\0\0à\n;(ÕÚÀx','¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw\0\0à\n;(ÕÚÀx','email','Dmitrijs','Jakovlevs','login','1234',NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` VALUES (1,'ADMIN'),(2,'MANAGER'),(3,'USER');
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user_roles`
--

LOCK TABLES `user_roles` WRITE;
/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;
INSERT INTO `user_roles` VALUES (1,1),(2,1),(1,2),(2,3);
/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `work_day`
--

LOCK TABLES `work_day` WRITE;
/*!40000 ALTER TABLE `work_day` DISABLE KEYS */;
INSERT INTO `work_day` VALUES (1,'¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw;;;Éÿx','MONDAY','¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpwÿx',1),(2,'¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw;;;Éÿx','TUESDAY','¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpwÿx',1),(3,'¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw;;;Éÿx','WEDNESDAY','¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpwÿx',2),(4,'¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpw;;;Éÿx','THURSDAY','¬í\0sr\0\rjava.time.Ser]º\"H²\0\0xpwÿx',2),(5,'?','FRIDAY','?',1),(6,'?','FRIDAY','?',2),(7,'?','FRIDAY','?',3),(8,'?','FRIDAY','?',4),(9,'?','FRIDAY','?',5),(10,'?','FRIDAY','?',6),(11,'?','FRIDAY','?',7),(12,'?','FRIDAY','?',8),(13,'?','FRIDAY','?',9),(14,'?','FRIDAY','?',10),(15,'?','FRIDAY','?',11),(16,'?','FRIDAY','?',12),(17,'?','FRIDAY','?',14),(18,'?','FRIDAY','?',15),(19,'?','FRIDAY','?',16),(20,'?','FRIDAY','?',17),(21,'?','FRIDAY','?',18),(22,'?','FRIDAY','?',19),(23,'?','FRIDAY','?',20),(24,'?','FRIDAY','?',21),(25,'?','FRIDAY','?',22),(26,'?','FRIDAY','?',23),(27,'?','FRIDAY','?',24),(28,'?','FRIDAY','?',25),(29,'?','FRIDAY','?',26),(30,'?','FRIDAY','?',27),(31,'?','FRIDAY','?',28),(32,'?','FRIDAY','?',29),(33,'?','FRIDAY','?',30),(34,'?','FRIDAY','?',31),(35,'?','FRIDAY','?',32),(36,'?','SATURDAY','?',1),(37,'?','SUNDAY','?',1);
/*!40000 ALTER TABLE `work_day` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-07-28 16:43:44
