/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50559
Source Host           : localhost:3306
Source Database       : nterp

Target Server Type    : MYSQL
Target Server Version : 50559
File Encoding         : 65001

Date: 2018-06-25 10:30:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for kuweiguanli
-- ----------------------------
DROP TABLE IF EXISTS `kuweiguanli`;
CREATE TABLE `kuweiguanli` (
  `uuid` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `capacity` varchar(255) DEFAULT NULL,
  `operation` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of kuweiguanli
-- ----------------------------
INSERT INTO `kuweiguanli` VALUES ('1', '1', '1', null, '1', '1');
