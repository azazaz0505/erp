/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50559
Source Host           : localhost:3306
Source Database       : nterp

Target Server Type    : MYSQL
Target Server Version : 50559
File Encoding         : 65001

Date: 2018-05-08 14:41:01
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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
