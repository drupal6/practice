/*
Navicat MySQL Data Transfer

Source Server         : 101sdfasdfasdfasdf
Source Server Version : 50173
Source Host           : 192.168.2.101:3306
Source Database       : db_praxis

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2018-12-13 16:38:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_answer
-- ----------------------------
DROP TABLE IF EXISTS `t_answer`;
CREATE TABLE `t_answer` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `topic_id` bigint(20) unsigned DEFAULT NULL COMMENT '题目编号',
  `an_seq` tinyint(4) unsigned DEFAULT NULL COMMENT '答案顺序',
  `an_type` tinyint(4) unsigned DEFAULT NULL COMMENT '答案类型',
  `an_id` bigint(20) unsigned DEFAULT NULL COMMENT '答案编号',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_answer
-- ----------------------------

-- ----------------------------
-- Table structure for t_book
-- ----------------------------
DROP TABLE IF EXISTS `t_book`;
CREATE TABLE `t_book` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '课本编号',
  `name` varchar(50) DEFAULT NULL COMMENT '课本名称',
  `auth_id` int(11) unsigned DEFAULT NULL COMMENT '作者编号',
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `type_id` int(11) unsigned DEFAULT NULL COMMENT '类型编号',
  `grade_id` int(11) unsigned DEFAULT NULL COMMENT '年级编号',
  `states` tinyint(4) unsigned DEFAULT NULL COMMENT '状态 0编辑 1半公开 2公开',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_book
-- ----------------------------

-- ----------------------------
-- Table structure for t_examination
-- ----------------------------
DROP TABLE IF EXISTS `t_examination`;
CREATE TABLE `t_examination` (
  `id` int(11) unsigned NOT NULL COMMENT '试卷编号',
  `name` varchar(255) DEFAULT NULL,
  `desc` varchar(255) DEFAULT NULL COMMENT '描述',
  `type_id` int(11) unsigned DEFAULT NULL COMMENT '类型编号',
  `grade_id` int(11) unsigned DEFAULT NULL COMMENT '年级编号',
  `book_id` int(11) unsigned DEFAULT NULL COMMENT '课本编号',
  `score` int(11) unsigned DEFAULT NULL COMMENT '分数',
  `auth_id` int(11) unsigned DEFAULT NULL COMMENT '作者编号',
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `states` tinyint(4) unsigned DEFAULT NULL COMMENT '状态 0编辑 1半公开 2公开',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_examination
-- ----------------------------

-- ----------------------------
-- Table structure for t_grade
-- ----------------------------
DROP TABLE IF EXISTS `t_grade`;
CREATE TABLE `t_grade` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(30) DEFAULT NULL COMMENT '年级',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_grade
-- ----------------------------

-- ----------------------------
-- Table structure for t_question
-- ----------------------------
DROP TABLE IF EXISTS `t_question`;
CREATE TABLE `t_question` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `topic_id` bigint(20) unsigned DEFAULT NULL COMMENT '题目编号',
  `q_seq` tinyint(4) unsigned DEFAULT NULL COMMENT '描述顺序',
  `q_type` tinyint(4) unsigned DEFAULT NULL COMMENT '描述类型',
  `q_id` bigint(20) unsigned DEFAULT NULL COMMENT '描述编号',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_question
-- ----------------------------

-- ----------------------------
-- Table structure for t_question_audio
-- ----------------------------
DROP TABLE IF EXISTS `t_question_audio`;
CREATE TABLE `t_question_audio` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `source` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_question_audio
-- ----------------------------

-- ----------------------------
-- Table structure for t_question_canvas
-- ----------------------------
DROP TABLE IF EXISTS `t_question_canvas`;
CREATE TABLE `t_question_canvas` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `source` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_question_canvas
-- ----------------------------

-- ----------------------------
-- Table structure for t_question_pic
-- ----------------------------
DROP TABLE IF EXISTS `t_question_pic`;
CREATE TABLE `t_question_pic` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `source` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_question_pic
-- ----------------------------

-- ----------------------------
-- Table structure for t_question_text
-- ----------------------------
DROP TABLE IF EXISTS `t_question_text`;
CREATE TABLE `t_question_text` (
  `id` bigint(20) unsigned NOT NULL,
  `text` text COMMENT '描述文字',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_question_text
-- ----------------------------

-- ----------------------------
-- Table structure for t_question_video
-- ----------------------------
DROP TABLE IF EXISTS `t_question_video`;
CREATE TABLE `t_question_video` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `source` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_question_video
-- ----------------------------

-- ----------------------------
-- Table structure for t_test
-- ----------------------------
DROP TABLE IF EXISTS `t_test`;
CREATE TABLE `t_test` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `sss` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_test
-- ----------------------------
INSERT INTO `t_test` VALUES ('1', 'asdfasdf');
INSERT INTO `t_test` VALUES ('2', 'test123');
INSERT INTO `t_test` VALUES ('3', 'test123');
INSERT INTO `t_test` VALUES ('4', 'test123');

-- ----------------------------
-- Table structure for t_topic
-- ----------------------------
DROP TABLE IF EXISTS `t_topic`;
CREATE TABLE `t_topic` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `seq` tinyint(4) unsigned DEFAULT NULL COMMENT '题号',
  `type` tinyint(4) unsigned DEFAULT NULL COMMENT '类型',
  `score` tinyint(4) unsigned DEFAULT NULL COMMENT '分数',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_topic
-- ----------------------------

-- ----------------------------
-- Table structure for t_type
-- ----------------------------
DROP TABLE IF EXISTS `t_type`;
CREATE TABLE `t_type` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '类型编号',
  `name` varchar(30) DEFAULT NULL COMMENT '类型名称',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_type
-- ----------------------------
