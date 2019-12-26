/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50723
Source Host           : 192.168.0.6:3306
Source Database       : fire

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2019-12-26 10:59:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_org
-- ----------------------------
DROP TABLE IF EXISTS `sys_org`;
CREATE TABLE `sys_org` (
  `org_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '区域自增ID',
  `code` varchar(10) DEFAULT NULL COMMENT '省市区编号',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `pid` bigint(20) DEFAULT NULL COMMENT '父节点',
  `level` int(20) DEFAULT NULL COMMENT '层级',
  `pids` varchar(200) DEFAULT NULL COMMENT '所有父节点',
  `adress` varchar(200) DEFAULT NULL COMMENT '地址',
  `remark` varchar(200) DEFAULT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`org_id`),
  UNIQUE KEY `idx_name` (`name`) USING BTREE COMMENT '机构名称唯一索引'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='机构表';

-- ----------------------------
-- Records of sys_org
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role_org
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_org`;
CREATE TABLE `sys_role_org` (
  `role_org_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色机构关联ID',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  `org_id` bigint(20) DEFAULT NULL COMMENT '机构ID',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`role_org_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色机构关联表';

-- ----------------------------
-- Records of sys_role_org
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户自增ID',
  `account` varchar(50) NOT NULL COMMENT '账号(不能重复)',
  `salt` varchar(50) NOT NULL COMMENT '用户密码秘钥',
  `password` varchar(50) NOT NULL COMMENT '密码',
  `name` varchar(50) NOT NULL COMMENT '名字',
  `sex` smallint(2) DEFAULT '1' COMMENT '性别 1男 0女',
  `phone` varchar(50) DEFAULT NULL COMMENT '手机号',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `idx_account` (`account`) USING BTREE COMMENT '用户账户唯一索引'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `user_role_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户关系角色表主键',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户Id',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色id',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`user_role_id`),
  UNIQUE KEY `idx_userId_role_id` (`user_id`,`role_id`) USING BTREE COMMENT '用户不能有相同角色'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色关联表';

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
