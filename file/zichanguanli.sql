/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50559
Source Host           : localhost:3306
Source Database       : nterp

Target Server Type    : MYSQL
Target Server Version : 50559
File Encoding         : 65001

Date: 2018-06-25 10:30:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for zichanguanli
-- ----------------------------
DROP TABLE IF EXISTS `zichanguanli`;
CREATE TABLE `zichanguanli` (
  `uuid` int(11) NOT NULL AUTO_INCREMENT,
  `gudingzichanbiana` varchar(255) DEFAULT NULL,
  `gudingzichanmingcheng` varchar(255) DEFAULT NULL,
  `gudingzichanleixing` varchar(255) DEFAULT NULL,
  `zhejiunianxian` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `yuanzhi` varchar(255) DEFAULT NULL,
  `jingcanzhi` varchar(255) DEFAULT NULL,
  `operation` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of zichanguanli
-- ----------------------------
INSERT INTO `zichanguanli` VALUES ('1', '1', '1', '1', '2018-06-10 10:29:23', '1', '1', '1');
