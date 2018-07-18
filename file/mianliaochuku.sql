/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50559
Source Host           : localhost:3306
Source Database       : nterp

Target Server Type    : MYSQL
Target Server Version : 50559
File Encoding         : 65001

Date: 2018-06-25 10:30:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mianliaochuku
-- ----------------------------
DROP TABLE IF EXISTS `mianliaochuku`;
CREATE TABLE `mianliaochuku` (
  `uuid` int(11) NOT NULL AUTO_INCREMENT,
  `chukudanhao` int(11) DEFAULT NULL,
  `chuhuocangku` varchar(255) DEFAULT NULL,
  `chukufangshi` varchar(255) DEFAULT NULL,
  `chukushijian` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `beizhu` varchar(255) DEFAULT NULL,
  `opration` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mianliaochuku
-- ----------------------------
INSERT INTO `mianliaochuku` VALUES ('1', '1', '1', '1', '2018-06-10 10:28:46', '1', '1');
