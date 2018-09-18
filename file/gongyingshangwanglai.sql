/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50559
Source Host           : localhost:3306
Source Database       : nterp

Target Server Type    : MYSQL
Target Server Version : 50559
File Encoding         : 65001

Date: 2018-06-25 10:30:10
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



---修改表
CREATE TABLE `gongyingshangwanglai` (
  `uuid` int(11) NOT NULL AUTO_INCREMENT,
  `fukuanleixing` varchar(20) DEFAULT NULL,
  `gongyingshangmingcheng` varchar(255) DEFAULT NULL,
  `shiyou` varchar(255) DEFAULT NULL,
  `zhifufangshi` varchar(255) DEFAULT NULL,
  `fapiaoxinxi` varchar(255) DEFAULT NULL,
  `fapiaoshuilv` varchar(255) DEFAULT NULL,
  `hetongzongjine` double DEFAULT NULL,
  `yifukuanjine` double DEFAULT NULL,
  `fukuanriqi` timestamp NULL DEFAULT NULL,
  `rukuzongjine` double DEFAULT NULL,
  `zhuangtai` varchar(255) DEFAULT NULL,
  `shenqingriqi` timestamp NULL DEFAULT NULL,
  `bumen` varchar(255) DEFAULT NULL,
  `jingbanren` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;