/*
Navicat MySQL Data Transfer

Source Server         : rm-uf6vl7168doce1268do.mysql.rds.aliyuncs.com
Source Server Version : 50718
Source Host           : rm-uf6vl7168doce1268do.mysql.rds.aliyuncs.com:3306
Source Database       : nterp

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-09-21 21:47:45
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
  `zhejiunianxian` date DEFAULT NULL,
  `yuanzhi` varchar(255) DEFAULT NULL,
  `jingcanzhi` varchar(255) DEFAULT NULL,
  `operation` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of zichanguanli
-- ----------------------------
INSERT INTO `zichanguanli` VALUES ('1', '1', '2', '1', '2018-06-10', '1', '1', '1');
