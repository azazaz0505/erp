/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50559
Source Host           : localhost:3306
Source Database       : nterp

Target Server Type    : MYSQL
Target Server Version : 50559
File Encoding         : 65001

Date: 2018-05-08 14:41:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for infos
-- ----------------------------
DROP TABLE IF EXISTS `infos`;
CREATE TABLE `infos` (
  `total-sizeleft` int(11) DEFAULT '0',
  `total-sizemodify` int(11) DEFAULT '0',
  `total-sizenumber` int(11) DEFAULT '0',
  `xxxl-sizeleft` int(11) DEFAULT '0',
  `xxxl-sizemodify` int(11) DEFAULT '0',
  `xxxl-sizenumber` int(11) DEFAULT '0',
  `xxl-sizeleft` int(11) DEFAULT '0',
  `xxl-sizemodify` int(11) DEFAULT '0',
  `xxl-sizenumber` int(11) DEFAULT '0',
  `xl-sizeleft` int(11) DEFAULT '0',
  `xl-sizemodify` int(11) DEFAULT '0',
  `xl-sizenumber` int(11) DEFAULT '0',
  `l-sizeleft` int(11) DEFAULT '0',
  `l-sizemodify` int(11) DEFAULT '0',
  `l-sizenumber` int(11) DEFAULT '0',
  `m-sizeleft` int(11) DEFAULT '0',
  `m-sizemodify` int(11) DEFAULT '0',
  `m-sizenumber` int(11) DEFAULT '0',
  `s-sizeleft` int(11) DEFAULT '0',
  `s-sizemodify` int(11) DEFAULT '0',
  `s-sizenumber` int(11) DEFAULT '0',
  `orderdate` date DEFAULT NULL,
  `stylename` varchar(255) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `styleid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
