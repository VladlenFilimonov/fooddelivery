-- MySQL dump 10.13  Distrib 5.7.12, for Linux (x86_64)
--
-- Host: localhost    Database: testDB
-- ------------------------------------------------------
-- Server version	5.7.12-0ubuntu1.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT = @@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS = @@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION = @@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE = @@TIME_ZONE */;
/*!40103 SET TIME_ZONE = '+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS = @@UNIQUE_CHECKS, UNIQUE_CHECKS = 0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS = @@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS = 0 */;
/*!40101 SET @OLD_SQL_MODE = @@SQL_MODE, SQL_MODE = 'NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES = @@SQL_NOTES, SQL_NOTES = 0 */;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `id`   BIGINT(20) NOT NULL AUTO_INCREMENT,
  `logo` TINYBLOB,
  `name` VARCHAR(255)        DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 4
  DEFAULT CHARSET = latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category`
  DISABLE KEYS */;
INSERT INTO `category` VALUES (1, NULL, 'Pizza'), (2, NULL, 'BBQ'), (3, NULL, 'Soup');
/*!40000 ALTER TABLE `category`
  ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category_restaurants`
--

DROP TABLE IF EXISTS `category_restaurants`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category_restaurants` (
  `categories_id`  BIGINT(20) NOT NULL,
  `restaurants_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`categories_id`, `restaurants_id`),
  KEY `FK_tfqy7gbjn938hif9hym3tlvpu` (`restaurants_id`),
  CONSTRAINT `FK_mcytrvu1jyqwg1a2esy4wuglx` FOREIGN KEY (`categories_id`) REFERENCES `category` (`id`),
  CONSTRAINT `FK_tfqy7gbjn938hif9hym3tlvpu` FOREIGN KEY (`restaurants_id`) REFERENCES `restaurant` (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category_restaurants`
--

LOCK TABLES `category_restaurants` WRITE;
/*!40000 ALTER TABLE `category_restaurants`
  DISABLE KEYS */;
INSERT INTO `category_restaurants` VALUES (1, 1), (2, 1), (2, 2), (3, 2);
/*!40000 ALTER TABLE `category_restaurants`
  ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comment` (
  `id`            BIGINT(20) NOT NULL AUTO_INCREMENT,
  `created_at`    TINYBLOB,
  `updated_at`    TINYBLOB,
  `content`       VARCHAR(255)        DEFAULT NULL,
  `restaurant_id` BIGINT(20)          DEFAULT NULL,
  `user_id`       BIGINT(20)          DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_c95ltcns00wbnxw8nuu97cjx0` (`restaurant_id`),
  KEY `FK_mxoojfj9tmy8088avf57mpm02` (`user_id`),
  CONSTRAINT `FK_c95ltcns00wbnxw8nuu97cjx0` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`id`),
  CONSTRAINT `FK_mxoojfj9tmy8088avf57mpm02` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment`
  DISABLE KEYS */;
INSERT INTO `comment` VALUES (1, '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à\n )NW@x',
                              '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à\n )NW@x', 'Horoso', 1, 1),
  (2, '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à\n )NW@x',
   '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à\n )NW@x', 'Ploho', 2, 2);
/*!40000 ALTER TABLE `comment`
  ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contact_info`
--

DROP TABLE IF EXISTS `contact_info`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contact_info` (
  `id`         BIGINT(20) NOT NULL AUTO_INCREMENT,
  `phone`      VARCHAR(255)        DEFAULT NULL,
  `url`        VARCHAR(255)        DEFAULT NULL,
  `manager_id` BIGINT(20)          DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_rdc2mdktnxbqptacbyvi35y9i` (`manager_id`),
  CONSTRAINT `FK_rdc2mdktnxbqptacbyvi35y9i` FOREIGN KEY (`manager_id`) REFERENCES `user` (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact_info`
--

LOCK TABLES `contact_info` WRITE;
/*!40000 ALTER TABLE `contact_info`
  DISABLE KEYS */;
/*!40000 ALTER TABLE `contact_info`
  ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `delivery`
--

DROP TABLE IF EXISTS `delivery`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `delivery` (
  `id`                  BIGINT(20) NOT NULL AUTO_INCREMENT,
  `free_by_client_card` BIT(1)              DEFAULT NULL,
  `free_from`           DECIMAL(19, 2)      DEFAULT NULL,
  `phone`               VARCHAR(255)        DEFAULT NULL,
  `time_max`            TINYBLOB,
  `time_min`            TINYBLOB,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delivery`
--

LOCK TABLES `delivery` WRITE;
/*!40000 ALTER TABLE `delivery`
  DISABLE KEYS */;
INSERT INTO `delivery` VALUES (1, '', 25.00, '27744332', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw;;;š\Éÿx',
                               '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpwÿx'),
  (2, '', 25.00, '27744332', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw;;;š\Éÿx',
   '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpwÿx');
/*!40000 ALTER TABLE `delivery`
  ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rating`
--

DROP TABLE IF EXISTS `rating`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rating` (
  `id`            BIGINT(20) NOT NULL AUTO_INCREMENT,
  `created_at`    TINYBLOB,
  `updated_at`    TINYBLOB,
  `value`         INT(11)             DEFAULT NULL,
  `restaurant_id` BIGINT(20)          DEFAULT NULL,
  `user_id`       BIGINT(20)          DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_sbvlvv0ympesrbp00kuianmk9` (`restaurant_id`),
  KEY `FK_8dfu35xwik8uwlrdloci4ok2i` (`user_id`),
  CONSTRAINT `FK_8dfu35xwik8uwlrdloci4ok2i` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `FK_sbvlvv0ympesrbp00kuianmk9` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 5
  DEFAULT CHARSET = latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rating`
--

LOCK TABLES `rating` WRITE;
/*!40000 ALTER TABLE `rating`
  DISABLE KEYS */;
INSERT INTO `rating` VALUES (1, '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à\n \"í¦€x',
                             '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à\n \"í¦€x', 10, 1, 1),
  (2, '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à\n \"í¦€x',
   '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à\n \"í¦€x', 6, 1, 1),
  (3, '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à\n \"í¦€x',
   '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à\n \"í¦€x', 8, 2, 2),
  (4, '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à\n \"í¦€x',
   '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à\n \"í¦€x', 2, 2, 2);
/*!40000 ALTER TABLE `rating`
  ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `restaurant`
--

DROP TABLE IF EXISTS `restaurant`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `restaurant` (
  `id`          BIGINT(20) NOT NULL AUTO_INCREMENT,
  `accept_card` BIT(1)              DEFAULT NULL,
  `created_at`  TINYBLOB,
  `updated_at`  TINYBLOB,
  `logo`        TINYBLOB,
  `name`        VARCHAR(255)        DEFAULT NULL,
  `status`      VARCHAR(255)        DEFAULT NULL,
  `delivery_id` BIGINT(20)          DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_fl2ljeqcfp7muwn9jxciut9ax` (`delivery_id`),
  CONSTRAINT `FK_fl2ljeqcfp7muwn9jxciut9ax` FOREIGN KEY (`delivery_id`) REFERENCES `delivery` (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `restaurant`
--

LOCK TABLES `restaurant` WRITE;
/*!40000 ALTER TABLE `restaurant`
  DISABLE KEYS */;
INSERT INTO `restaurant` VALUES (1, '', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à\n %dÀx',
                                 '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à\n €ò@x', NULL, 'Lido',
                                 'ACTIVE', 1),
  (2, '', '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à\n q°\0x',
   '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à\n ­Àx', NULL, 'StakeHouse', 'ACTIVE', 2);
/*!40000 ALTER TABLE `restaurant`
  ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `restaurant_urls`
--

DROP TABLE IF EXISTS `restaurant_urls`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `restaurant_urls` (
  `restaurant_id` BIGINT(20) NOT NULL,
  `urls`          VARCHAR(255) DEFAULT NULL,
  `urls_key`      BIGINT(20) NOT NULL,
  PRIMARY KEY (`restaurant_id`, `urls_key`),
  KEY `FK_cjt17kyn2h4ta7nvxsomgu8kk` (`urls_key`),
  CONSTRAINT `FK_cjt17kyn2h4ta7nvxsomgu8kk` FOREIGN KEY (`urls_key`) REFERENCES `category` (`id`),
  CONSTRAINT `FK_f30vcvit0as7t108ul1yg0cdd` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `restaurant_urls`
--

LOCK TABLES `restaurant_urls` WRITE;
/*!40000 ALTER TABLE `restaurant_urls`
  DISABLE KEYS */;
INSERT INTO `restaurant_urls`
VALUES (1, 'http://lidoPizza.lv', 1), (1, 'http://lidoBBQ.lv', 2), (2, 'http://StakeHouse/BBQ.lv', 2),
  (2, 'http://SteakHouse/Soup', 3);
/*!40000 ALTER TABLE `restaurant_urls`
  ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `dtype`      VARCHAR(31) NOT NULL,
  `id`         BIGINT(20)  NOT NULL AUTO_INCREMENT,
  `created_at` TINYBLOB,
  `updated_at` TINYBLOB,
  `email`      VARCHAR(255)         DEFAULT NULL,
  `first_name` VARCHAR(255)         DEFAULT NULL,
  `last_name`  VARCHAR(255)         DEFAULT NULL,
  `login`      VARCHAR(255)         DEFAULT NULL,
  `password`   VARCHAR(255)         DEFAULT NULL,
  `phone`      VARCHAR(255)         DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user`
  DISABLE KEYS */;
INSERT INTO `user` VALUES ('User', 1, '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à\n !p.@x',
                           '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à\n !p.@x',
                           'vladlenfilimonov@gmail.com', 'Vladlens', 'Filimonovs', 'AnonymousX', '1234', NULL),
  ('User', 2, '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à\n !p€x',
   '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw\0\0\à\n !p€x', 'email', 'Dmitrijs', 'Jakovlevs', 'login', '1234',
   NULL);
/*!40000 ALTER TABLE `user`
  ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_role` (
  `id`   BIGINT(20) NOT NULL AUTO_INCREMENT,
  `role` VARCHAR(255)        DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 4
  DEFAULT CHARSET = latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role`
  DISABLE KEYS */;
INSERT INTO `user_role` VALUES (1, 'ADMIN'), (2, 'MANAGER'), (3, 'USER');
/*!40000 ALTER TABLE `user_role`
  ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_roles`
--

DROP TABLE IF EXISTS `user_roles`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_roles` (
  `user_id`  BIGINT(20) NOT NULL,
  `roles_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`user_id`, `roles_id`),
  KEY `FK_amwlmdeik2qdnksxgd566knop` (`roles_id`),
  CONSTRAINT `FK_amwlmdeik2qdnksxgd566knop` FOREIGN KEY (`roles_id`) REFERENCES `user_role` (`id`),
  CONSTRAINT `FK_g1uebn6mqk9qiaw45vnacmyo2` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_roles`
--

LOCK TABLES `user_roles` WRITE;
/*!40000 ALTER TABLE `user_roles`
  DISABLE KEYS */;
INSERT INTO `user_roles` VALUES (1, 1), (2, 1), (1, 2), (2, 3);
/*!40000 ALTER TABLE `user_roles`
  ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_day`
--

DROP TABLE IF EXISTS `work_day`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_day` (
  `id`            BIGINT(20) NOT NULL AUTO_INCREMENT,
  `close_at`      TINYBLOB,
  `day`           VARCHAR(255)        DEFAULT NULL,
  `open_at`       TINYBLOB,
  `restaurant_id` BIGINT(20)          DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_hlw7duckmmd2cs716ijfgepj9` (`restaurant_id`),
  CONSTRAINT `FK_hlw7duckmmd2cs716ijfgepj9` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 5
  DEFAULT CHARSET = latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_day`
--

LOCK TABLES `work_day` WRITE;
/*!40000 ALTER TABLE `work_day`
  DISABLE KEYS */;
INSERT INTO `work_day` VALUES (1, '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw;;;š\Éÿx', 'SATURDAY',
                               '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpwÿx', 1),
  (2, '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw;;;š\Éÿx', 'SUNDAY',
   '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpwÿx', 1),
  (3, '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw;;;š\Éÿx', 'THURSDAY',
   '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpwÿx', 2),
  (4, '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpw;;;š\Éÿx', 'SUNDAY',
   '¬\í\0sr\0\rjava.time.Ser•]„º\"H²\0\0xpwÿx', 2);
/*!40000 ALTER TABLE `work_day`
  ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE = @OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE = @OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS = @OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT = @OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS = @OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION = @OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES = @OLD_SQL_NOTES */;

-- Dump completed on 2016-07-27 10:35:36
