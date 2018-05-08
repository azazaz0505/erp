/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50559
Source Host           : localhost:3306
Source Database       : nterp

Target Server Type    : MYSQL
Target Server Version : 50559
File Encoding         : 65001

Date: 2018-05-07 16:32:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `loginaccount` varchar(30) NOT NULL,
  `loginpasswd` varchar(255) DEFAULT NULL,
  `id` int(11) unsigned zerofill NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
