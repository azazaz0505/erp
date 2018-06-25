/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50559
Source Host           : localhost:3306
Source Database       : nterp

Target Server Type    : MYSQL
Target Server Version : 50559
File Encoding         : 65001

Date: 2018-06-25 10:30:35
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
  `rikushijian` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `beizhu` varchar(255) DEFAULT NULL,
  `opration` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mianliaoruku
-- ----------------------------
INSERT INTO `mianliaoruku` VALUES ('1', '1', '1', '1', '2018-06-10 10:29:04', '1', '1');
