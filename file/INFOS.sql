/*
Navicat MySQL Data Transfer

Source Server         : rm-uf6vl7168doce1268do.mysql.rds.aliyuncs.com
Source Server Version : 50718
Source Host           : rm-uf6vl7168doce1268do.mysql.rds.aliyuncs.com:3306
Source Database       : nterp

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-09-21 21:47:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for infos
-- ----------------------------
DROP TABLE IF EXISTS `infos`;
CREATE TABLE `infos` (
  `totalsizeleft` int(11) DEFAULT '0',
  `totalsizemodify` int(11) DEFAULT '0',
  `totalsizenumber` int(11) DEFAULT '0',
  `xxxlsizeleft` int(11) DEFAULT '0',
  `xxxlsizemodify` int(11) DEFAULT '0',
  `xxxlsizenumber` int(11) DEFAULT '0',
  `xxlsizeleft` int(11) DEFAULT '0',
  `xxlsizemodify` int(11) DEFAULT '0',
  `xxlsizenumber` int(11) DEFAULT '0',
  `xlsizeleft` int(11) DEFAULT '0',
  `xlsizemodify` int(11) DEFAULT '0',
  `xlsizenumber` int(11) DEFAULT '0',
  `lsizeleft` int(11) DEFAULT '0',
  `lsizemodify` int(11) DEFAULT '0',
  `lsizenumber` int(11) DEFAULT '0',
  `msizeleft` int(11) DEFAULT '0',
  `msizemodify` int(11) DEFAULT '0',
  `msizenumber` int(11) DEFAULT '0',
  `ssizeleft` int(11) DEFAULT '0',
  `ssizemodify` int(11) DEFAULT '0',
  `ssizenumber` int(11) DEFAULT '0',
  `orderdate` date DEFAULT NULL,
  `stylename` varchar(255) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `styleid` varchar(255) DEFAULT NULL,
  `color` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of infos
-- ----------------------------
INSERT INTO `infos` VALUES ('1', '1', '1', '1', '1', '1', '1', '0', '0', '0', '1', '0', '1', '0', '1', '1', '1', '1', '1', '1', '1', '2018-09-21', '1', '1', '1', '1');
