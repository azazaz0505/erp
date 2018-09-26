/*
Navicat MySQL Data Transfer

Source Server         : rm-uf6vl7168doce1268do.mysql.rds.aliyuncs.com
Source Server Version : 50718
Source Host           : rm-uf6vl7168doce1268do.mysql.rds.aliyuncs.com:3306
Source Database       : nterp

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-09-21 21:46:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for chucuohuizong
-- ----------------------------
DROP TABLE IF EXISTS `chucuohuizong`;
CREATE TABLE `chucuohuizong` (
  `uuid` int(11) NOT NULL AUTO_INCREMENT,
  `orderdate` date DEFAULT NULL,
  `styleid` varchar(255) DEFAULT NULL,
  `stylename` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `number` int(11) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chucuohuizong
-- ----------------------------
INSERT INTO `chucuohuizong` VALUES ('1', '2018-09-21', '1', '1', '1', '00000000001');
