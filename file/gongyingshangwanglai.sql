/*
Navicat MySQL Data Transfer

Source Server         : rm-uf6vl7168doce1268do.mysql.rds.aliyuncs.com
Source Server Version : 50718
Source Host           : rm-uf6vl7168doce1268do.mysql.rds.aliyuncs.com:3306
Source Database       : nterp

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-09-21 21:46:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for gongyingshangwanglai
-- ----------------------------
DROP TABLE IF EXISTS `gongyingshangwanglai`;
CREATE TABLE `gongyingshangwanglai` (
  `uuid` int(11) NOT NULL AUTO_INCREMENT,
  `gongyingshangmingcheng` varchar(255) DEFAULT NULL,
  `gongyingshanbianma` varchar(255) DEFAULT NULL,
  `hetongzongjine` double DEFAULT NULL,
  `yikaipiaojine` double DEFAULT NULL,
  `weikaipiaojine` double DEFAULT NULL,
  `yufukuan` double DEFAULT NULL,
  `yifukuanjine` double DEFAULT NULL,
  `rukuzongjine` double DEFAULT NULL,
  `fukuan` varchar(255) DEFAULT NULL,
  `baobiao` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gongyingshangwanglai
-- ----------------------------
INSERT INTO `gongyingshangwanglai` VALUES ('1', '1', '1', '1', '1', '1', '1', '1', null, null, null);
