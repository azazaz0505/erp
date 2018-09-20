/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50559
Source Host           : localhost:3306
Source Database       : nterp

Target Server Type    : MYSQL
Target Server Version : 50559
File Encoding         : 65001

Date: 2018-09-20 10:11:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for chucuohuizong
-- ----------------------------
DROP TABLE IF EXISTS `chucuohuizong`;
CREATE TABLE `chucuohuizong` (
  `uuid` int(11) NOT NULL AUTO_INCREMENT,
  `orderdate` datetime DEFAULT NULL,
  `styleid` varchar(255) DEFAULT NULL,
  `stylename` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `number` int(11) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chucuohuizong
-- ----------------------------
