/*
Navicat MySQL Data Transfer

Source Server         : cht
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : train

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-06-01 23:14:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `station`
-- ----------------------------
DROP TABLE IF EXISTS `station`;
CREATE TABLE `station` (
  `stationId` int(11) NOT NULL AUTO_INCREMENT,
  `trainNum` varchar(20) NOT NULL,
  `station` varchar(20) NOT NULL,
  `outTime` varchar(5) NOT NULL,
  `dayTime` int(11) NOT NULL,
  `sitePrice` double NOT NULL,
  PRIMARY KEY (`stationId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of station
-- ----------------------------
INSERT INTO `station` VALUES ('1', 'k339', '北京', '12:37', '1', '0');
INSERT INTO `station` VALUES ('2', 'k339', '秦皇岛', '17:06', '1', '44');
INSERT INTO `station` VALUES ('3', 'k339', '沈阳', '22:30', '1', '99');
INSERT INTO `station` VALUES ('4', 'k339', '哈尔滨', '04:37', '2', '154');
INSERT INTO `station` VALUES ('5', 't109', '北京', '20:14', '1', '0');
INSERT INTO `station` VALUES ('6', 't109', '无锡', '08:19', '2', '165');
INSERT INTO `station` VALUES ('7', 't109', '上海', '09:14', '2', '179');
