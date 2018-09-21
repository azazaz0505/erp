/*
Navicat MySQL Data Transfer

Source Server         : rm-uf6vl7168doce1268do.mysql.rds.aliyuncs.com
Source Server Version : 50718
Source Host           : rm-uf6vl7168doce1268do.mysql.rds.aliyuncs.com:3306
Source Database       : nterp

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-09-21 21:47:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `loginaccount` varchar(30) NOT NULL,
  `loginpasswd` varchar(255) DEFAULT NULL,
  `login_uuid` varchar(125) DEFAULT NULL,
  PRIMARY KEY (`loginaccount`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login` VALUES ('admin', 'WVdSdGFXND0=', '111');
INSERT INTO `login` VALUES ('guest', 'WjNWbGMzUT0=', null);
INSERT INTO `login` VALUES ('test', 'ZEdWemRBPT0=', null);
