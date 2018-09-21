/*
Navicat MySQL Data Transfer

Source Server         : rm-uf6vl7168doce1268do.mysql.rds.aliyuncs.com
Source Server Version : 50718
Source Host           : rm-uf6vl7168doce1268do.mysql.rds.aliyuncs.com:3306
Source Database       : nterp

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-09-21 21:47:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mianliaoruku
-- ----------------------------
DROP TABLE IF EXISTS `mianliaoruku`;
CREATE TABLE `mianliaoruku` (
  `uuid` int(11) NOT NULL AUTO_INCREMENT,
  `rukudanhao` int(11) DEFAULT NULL,
  `shouhuocangku` varchar(255) DEFAULT NULL,
  `rukufangshi` varchar(255) DEFAULT NULL,
  `rikushijian` date DEFAULT NULL,
  `beizhu` varchar(255) DEFAULT NULL,
  `opration` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mianliaoruku
-- ----------------------------
INSERT INTO `mianliaoruku` VALUES ('1', '1', '1', '1', '2018-06-10', '1', '1');
