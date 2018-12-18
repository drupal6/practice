/*
Navicat MySQL Data Transfer

Source Server         : 101sdfasdfasdfasdf
Source Server Version : 50173
Source Host           : 192.168.2.101:3306
Source Database       : db_practice

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2018-12-18 17:43:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_exrcises
-- ----------------------------
DROP TABLE IF EXISTS `t_exrcises`;
CREATE TABLE `t_exrcises` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '练习题编号',
  `name` varchar(255) DEFAULT NULL COMMENT '练习题名称',
  `desc` varchar(255) DEFAULT NULL COMMENT '练习题描述',
  `language_id` int(11) unsigned DEFAULT NULL COMMENT '语言分类id',
  `subject_id` int(11) unsigned DEFAULT NULL COMMENT '学科分类id',
  `grade_id` int(11) unsigned DEFAULT NULL COMMENT '年级分类id',
  `auth_id` bigint(20) unsigned DEFAULT NULL COMMENT '作者id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `states` tinyint(4) unsigned DEFAULT NULL COMMENT '状态  -1删除 0没有过审  1公开  ',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='练习题表';

-- ----------------------------
-- Records of t_exrcises
-- ----------------------------

-- ----------------------------
-- Table structure for t_exrcises_topic
-- ----------------------------
DROP TABLE IF EXISTS `t_exrcises_topic`;
CREATE TABLE `t_exrcises_topic` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '练习题题目编号',
  `type` int(11) unsigned DEFAULT NULL COMMENT '题目类型',
  `seq` int(11) unsigned DEFAULT NULL COMMENT '顺序编号',
  `score` int(11) unsigned DEFAULT NULL COMMENT '分数',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='练习题题目表';

-- ----------------------------
-- Records of t_exrcises_topic
-- ----------------------------

-- ----------------------------
-- Table structure for t_grade_type
-- ----------------------------
DROP TABLE IF EXISTS `t_grade_type`;
CREATE TABLE `t_grade_type` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '年级分类',
  `name` varchar(50) DEFAULT NULL COMMENT '年级分类名称',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='年级分类表';

-- ----------------------------
-- Records of t_grade_type
-- ----------------------------

-- ----------------------------
-- Table structure for t_language_type
-- ----------------------------
DROP TABLE IF EXISTS `t_language_type`;
CREATE TABLE `t_language_type` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '语言类型编号',
  `name` varchar(50) DEFAULT NULL COMMENT '语言分类名称',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='语言分类表';

-- ----------------------------
-- Records of t_language_type
-- ----------------------------

-- ----------------------------
-- Table structure for t_question_type
-- ----------------------------
DROP TABLE IF EXISTS `t_question_type`;
CREATE TABLE `t_question_type` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '题目类型',
  `name` varchar(50) DEFAULT NULL COMMENT '题目类型名称',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='题目类型表';

-- ----------------------------
-- Records of t_question_type
-- ----------------------------

-- ----------------------------
-- Table structure for t_subject_type
-- ----------------------------
DROP TABLE IF EXISTS `t_subject_type`;
CREATE TABLE `t_subject_type` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '学科分类编号',
  `name` varchar(50) DEFAULT NULL COMMENT '学科分类名称',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='学科分类表';

-- ----------------------------
-- Records of t_subject_type
-- ----------------------------
