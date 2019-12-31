/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50558
Source Host           : localhost:3306
Source Database       : shiro_db

Target Server Type    : MYSQL
Target Server Version : 50558
File Encoding         : 65001

Date: 2018-11-29 18:03:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for pe_permission
-- ----------------------------
DROP TABLE IF EXISTS `pe_permission`;
CREATE TABLE `pe_permission` (
  `id` varchar(40) NOT NULL COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '权限名称',
  `code` varchar(20) DEFAULT NULL,
  `description` text COMMENT '权限描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of pe_permission
-- ----------------------------
INSERT INTO `pe_permission` VALUES ('1', '添加用户', 'user-add', null);
INSERT INTO `pe_permission` VALUES ('2', '查询用户', 'user-find', null);
INSERT INTO `pe_permission` VALUES ('3', '更新用户', 'user-update', null);
INSERT INTO `pe_permission` VALUES ('4', '删除用户', 'user-delete', null);

-- ----------------------------
-- Table structure for pe_role
-- ----------------------------
DROP TABLE IF EXISTS `pe_role`;
CREATE TABLE `pe_role` (
  `id` varchar(40) NOT NULL COMMENT '主键ID',
  `name` varchar(40) DEFAULT NULL COMMENT '权限名称',
  `description` varchar(255) DEFAULT NULL COMMENT '说明',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_k3beff7qglfn58qsf2yvbg41i` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of pe_role
-- ----------------------------
INSERT INTO `pe_role` VALUES ('1', '系统管理员', '系统日常维护');
INSERT INTO `pe_role` VALUES ('2', '普通员工', '普通操作权限');

-- ----------------------------
-- Table structure for pe_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `pe_role_permission`;
CREATE TABLE `pe_role_permission` (
  `role_id` varchar(40) NOT NULL COMMENT '角色ID',
  `permission_id` varchar(40) NOT NULL COMMENT '权限ID',
  PRIMARY KEY (`role_id`,`permission_id`),
  KEY `FK74qx7rkbtq2wqms78gljv87a0` (`permission_id`),
  KEY `FKee9dk0vg99shvsytflym6egxd` (`role_id`),
  CONSTRAINT `fk-p-rid` FOREIGN KEY (`role_id`) REFERENCES `pe_role` (`id`),
  CONSTRAINT `fk-pid` FOREIGN KEY (`permission_id`) REFERENCES `pe_permission` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of pe_role_permission
-- ----------------------------
INSERT INTO `pe_role_permission` VALUES ('1', '1');
INSERT INTO `pe_role_permission` VALUES ('1', '2');
INSERT INTO `pe_role_permission` VALUES ('2', '2');
INSERT INTO `pe_role_permission` VALUES ('1', '3');
INSERT INTO `pe_role_permission` VALUES ('1', '4');

-- ----------------------------
-- Table structure for pe_user
-- ----------------------------
DROP TABLE IF EXISTS `pe_user`;
CREATE TABLE `pe_user` (
  `id` varchar(40) NOT NULL COMMENT 'ID',
  `username` varchar(255) NOT NULL COMMENT '用户名称',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of pe_user
-- ----------------------------
INSERT INTO `pe_user` VALUES ('1', 'zhangsan', '123456');
INSERT INTO `pe_user` VALUES ('2', 'lisi', '123456');
INSERT INTO `pe_user` VALUES ('3', 'wangwu', '123456');

-- ----------------------------
-- Table structure for pe_user_role
-- ----------------------------
DROP TABLE IF EXISTS `pe_user_role`;
CREATE TABLE `pe_user_role` (
  `role_id` varchar(40) NOT NULL COMMENT '角色ID',
  `user_id` varchar(40) NOT NULL COMMENT '权限ID',
  KEY `FK74qx7rkbtq2wqms78gljv87a1` (`role_id`),
  KEY `FKee9dk0vg99shvsytflym6egx1` (`user_id`),
  CONSTRAINT `fk-rid` FOREIGN KEY (`role_id`) REFERENCES `pe_role` (`id`),
  CONSTRAINT `fk-uid` FOREIGN KEY (`user_id`) REFERENCES `pe_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of pe_user_role
-- ----------------------------
INSERT INTO `pe_user_role` VALUES ('1', '1');
