/*
Navicat MySQL Data Transfer

Source Server         : 101sdfasdfasdfasdf
Source Server Version : 50173
Source Host           : 192.168.2.101:3306
Source Database       : db_practice

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2018-12-21 15:23:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_answer_resource
-- ----------------------------
DROP TABLE IF EXISTS `t_answer_resource`;
CREATE TABLE `t_answer_resource` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '答案文本编号',
  `seq` tinyint(4) unsigned DEFAULT NULL COMMENT '顺序',
  `topic_id` bigint(20) unsigned DEFAULT NULL COMMENT '题目编号',
  `resource_type` int(11) unsigned DEFAULT NULL COMMENT '答案类型',
  `resource` text COMMENT '答案文本描述',
  `score` int(11) unsigned DEFAULT NULL COMMENT '分数',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_answer_resource
-- ----------------------------

-- ----------------------------
-- Table structure for t_answer_resource_type
-- ----------------------------
DROP TABLE IF EXISTS `t_answer_resource_type`;
CREATE TABLE `t_answer_resource_type` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '答案类型编号',
  `name` varchar(30) DEFAULT NULL COMMENT '答案类型名称',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='答案类型表';

-- ----------------------------
-- Records of t_answer_resource_type
-- ----------------------------
INSERT INTO `t_answer_resource_type` VALUES ('1', '选择题');
INSERT INTO `t_answer_resource_type` VALUES ('2', '填空题');
INSERT INTO `t_answer_resource_type` VALUES ('3', '选择填空题');
INSERT INTO `t_answer_resource_type` VALUES ('4', '简答题');
INSERT INTO `t_answer_resource_type` VALUES ('5', '连线题');

-- ----------------------------
-- Table structure for t_answer_selection_optional
-- ----------------------------
DROP TABLE IF EXISTS `t_answer_selection_optional`;
CREATE TABLE `t_answer_selection_optional` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '选项编号',
  `seq` tinyint(4) unsigned DEFAULT NULL COMMENT '顺序',
  `answer_text_id` bigint(20) unsigned DEFAULT NULL COMMENT '答案描述编号',
  `resource_type` tinyint(4) unsigned DEFAULT NULL COMMENT '选项类型',
  `resource` text COMMENT '选项资源',
  `is_answer` tinyint(4) unsigned DEFAULT NULL COMMENT '是否是答案',
  `score` int(11) DEFAULT NULL COMMENT '分数',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_answer_selection_optional
-- ----------------------------

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
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='年级分类表';

-- ----------------------------
-- Records of t_grade_type
-- ----------------------------
INSERT INTO `t_grade_type` VALUES ('1', '幼儿园');
INSERT INTO `t_grade_type` VALUES ('2', '一年级');

-- ----------------------------
-- Table structure for t_language_type
-- ----------------------------
DROP TABLE IF EXISTS `t_language_type`;
CREATE TABLE `t_language_type` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '语言类型编号',
  `name` varchar(50) DEFAULT NULL COMMENT '语言分类名称',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='语言分类表';

-- ----------------------------
-- Records of t_language_type
-- ----------------------------
INSERT INTO `t_language_type` VALUES ('1', '中文');

-- ----------------------------
-- Table structure for t_question_resource
-- ----------------------------
DROP TABLE IF EXISTS `t_question_resource`;
CREATE TABLE `t_question_resource` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '问题资源编号',
  `seq` tinyint(4) unsigned DEFAULT NULL COMMENT '顺序',
  `topic_id` bigint(20) unsigned DEFAULT NULL COMMENT '题目编号',
  `resource_type` int(11) unsigned DEFAULT NULL COMMENT '问题类型',
  `resource` text COMMENT '资源内容',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='问题资源表';

-- ----------------------------
-- Records of t_question_resource
-- ----------------------------

-- ----------------------------
-- Table structure for t_question_resource_type
-- ----------------------------
DROP TABLE IF EXISTS `t_question_resource_type`;
CREATE TABLE `t_question_resource_type` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '问题描述类型编号',
  `name` varchar(30) DEFAULT NULL COMMENT '问题描述类型名称',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='问题描述类型表';

-- ----------------------------
-- Records of t_question_resource_type
-- ----------------------------
INSERT INTO `t_question_resource_type` VALUES ('1', '文本');
INSERT INTO `t_question_resource_type` VALUES ('2', '图片');
INSERT INTO `t_question_resource_type` VALUES ('3', '音频');
INSERT INTO `t_question_resource_type` VALUES ('4', '视频');
INSERT INTO `t_question_resource_type` VALUES ('5', '画布');

-- ----------------------------
-- Table structure for t_subject_type
-- ----------------------------
DROP TABLE IF EXISTS `t_subject_type`;
CREATE TABLE `t_subject_type` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '学科分类编号',
  `name` varchar(50) DEFAULT NULL COMMENT '学科分类名称',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='学科分类表';

-- ----------------------------
-- Records of t_subject_type
-- ----------------------------
INSERT INTO `t_subject_type` VALUES ('1', '英语');
INSERT INTO `t_subject_type` VALUES ('2', '数学');
INSERT INTO `t_subject_type` VALUES ('3', '语文');
