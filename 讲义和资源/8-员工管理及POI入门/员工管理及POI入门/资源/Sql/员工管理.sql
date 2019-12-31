
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for em_archive
-- ----------------------------
DROP TABLE IF EXISTS `em_archive`;
CREATE TABLE `em_archive` (
  `id` varchar(40) NOT NULL COMMENT 'ID',
  `op_user` varchar(255) NOT NULL COMMENT '操作用户',
  `month` varchar(255) NOT NULL COMMENT '月份',
  `company_id` varchar(255) NOT NULL COMMENT '企业ID',
  `totals` int(8) NOT NULL DEFAULT '0' COMMENT '总人数',
  `payrolls` int(8) NOT NULL DEFAULT '0' COMMENT '在职人数',
  `departures` int(8) NOT NULL DEFAULT '0' COMMENT '离职人数',
  `data` longtext COMMENT '数据',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of em_archive
-- ----------------------------

-- ----------------------------
-- Table structure for em_positive
-- ----------------------------
DROP TABLE IF EXISTS `em_positive`;
CREATE TABLE `em_positive` (
  `user_id` varchar(40) NOT NULL COMMENT '员工ID',
  `date_of_correction` datetime DEFAULT NULL COMMENT '转正日期',
  `correction_evaluation` text COMMENT '转正评价',
  `enclosure` text COMMENT '附件',
  `estatus` int(2) NOT NULL COMMENT '单据状态 1是未执行，2是已执行',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of em_positive
-- ----------------------------
INSERT INTO `em_positive` VALUES ('1063705989926227968', '2018-12-23 08:00:00', '111', null, '1', '2018-12-15 21:45:10');

-- ----------------------------
-- Table structure for em_resignation
-- ----------------------------
DROP TABLE IF EXISTS `em_resignation`;
CREATE TABLE `em_resignation` (
  `user_id` varchar(40) NOT NULL COMMENT '用户ID',
  `resignation_time` varchar(255) NOT NULL,
  `type_of_turnover` varchar(255) DEFAULT NULL COMMENT '离职类型',
  `reasons_for_leaving` varchar(255) DEFAULT NULL COMMENT '申请离职原因',
  `compensation` varchar(255) DEFAULT NULL COMMENT '补偿金',
  `notifications` varchar(255) DEFAULT NULL COMMENT '代通知金',
  `social_security_reduction_month` varchar(255) DEFAULT NULL COMMENT '社保减员月',
  `provident_fund_reduction_month` varchar(255) DEFAULT NULL COMMENT '公积金减员月',
  `picture` varchar(255) DEFAULT NULL COMMENT '图片',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of em_resignation
-- ----------------------------
INSERT INTO `em_resignation` VALUES ('1063705989926227968', '2018-02-05', '主动离职', null, '100', '100', '离职日本月', '离职日次月', null, '2018-12-16 20:49:26');

-- ----------------------------
-- Table structure for em_transferposition
-- ----------------------------
DROP TABLE IF EXISTS `em_transferposition`;
CREATE TABLE `em_transferposition` (
  `user_id` varchar(40) NOT NULL COMMENT '用户ID',
  `post` varchar(255) DEFAULT NULL COMMENT '岗位',
  `rank` varchar(255) DEFAULT NULL COMMENT '职级',
  `reporting_object` varchar(255) DEFAULT NULL COMMENT '汇报对象',
  `hrbp` varchar(255) DEFAULT NULL COMMENT 'HRBP',
  `adjustment_time` datetime NOT NULL COMMENT '调岗时间',
  `cause_of_adjusting_post` text COMMENT '调岗原因',
  `enclosure` text COMMENT '附件 [1,2,3]',
  `form_of_management` varchar(255) DEFAULT NULL COMMENT '管理形式',
  `working_city` varchar(255) DEFAULT NULL COMMENT '工作城市',
  `taxable_city` varchar(255) DEFAULT NULL COMMENT '纳税城市',
  `current_contract_start_time` varchar(255) DEFAULT NULL COMMENT '现合同开始时间',
  `closing_time_of_current_contract` varchar(255) DEFAULT NULL COMMENT '现合同结束时间',
  `working_place` varchar(255) DEFAULT NULL COMMENT '工作地点',
  `initial_contract_start_time` varchar(255) DEFAULT NULL COMMENT '首次合同开始时间',
  `first_contract_termination_time` varchar(255) DEFAULT NULL COMMENT '首次合同结束时间',
  `contract_period` varchar(255) DEFAULT NULL COMMENT '合同期限',
  `renewal_number` int(8) DEFAULT NULL COMMENT '续签次数',
  `recommender_business_people` varchar(255) DEFAULT NULL COMMENT '推荐企业人',
  `estatus` int(2) NOT NULL COMMENT '单据状态 1是未执行，2是已执行',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of em_transferposition
-- ----------------------------
INSERT INTO `em_transferposition` VALUES ('1063705989926227968', '', '', '', '', '2018-12-03 08:00:00', 'aaaaa', '', '', '', '', '2018-12-03', '2018-12-04', '', '', '', '12月', '1', '', '1', '2018-12-15 22:01:08');

-- ----------------------------
-- Table structure for em_user_company_jobs
-- ----------------------------
DROP TABLE IF EXISTS `em_user_company_jobs`;
CREATE TABLE `em_user_company_jobs` (
  `user_id` varchar(40) NOT NULL COMMENT '员工ID',
  `company_id` varchar(255) DEFAULT NULL COMMENT '企业ID',
  `post` varchar(255) DEFAULT NULL COMMENT '岗位',
  `work_mailbox` varchar(255) DEFAULT NULL COMMENT '工作邮箱',
  `rank` varchar(255) DEFAULT NULL COMMENT '职级',
  `correction_evaluation` text COMMENT '转正评价',
  `report_id` varchar(255) DEFAULT NULL COMMENT '汇报对象',
  `report_name` varchar(255) DEFAULT NULL,
  `state_of_correction` varchar(255) DEFAULT NULL COMMENT '转正状态',
  `hrbp` varchar(255) DEFAULT NULL COMMENT 'hrbp',
  `working_time_for_the_first_time` varchar(255) DEFAULT NULL COMMENT '首次参加工作时间',
  `adjustment_agedays` int(8) DEFAULT NULL COMMENT '调整司龄天',
  `adjustment_of_length_of_service` int(8) DEFAULT NULL COMMENT '调整工龄天',
  `working_city` varchar(255) DEFAULT NULL COMMENT '工作城市',
  `taxable_city` varchar(255) DEFAULT NULL COMMENT '纳税城市',
  `current_contract_start_time` varchar(255) DEFAULT NULL COMMENT '现合同开始时间',
  `closing_time_of_current_contract` varchar(255) DEFAULT NULL COMMENT '现合同结束时间',
  `initial_contract_start_time` varchar(255) DEFAULT NULL COMMENT '首次合同开始时间',
  `first_contract_termination_time` varchar(255) DEFAULT NULL COMMENT '首次合同结束时间',
  `contract_period` varchar(255) DEFAULT NULL COMMENT '合同期限',
  `contract_documents` varchar(255) DEFAULT NULL COMMENT '合同文件',
  `renewal_number` int(8) DEFAULT NULL COMMENT '续签次数',
  `other_recruitment_channels` varchar(255) DEFAULT NULL COMMENT '其他招聘渠道',
  `recruitment_channels` varchar(255) DEFAULT NULL COMMENT '招聘渠道',
  `social_recruitment` varchar(255) DEFAULT NULL COMMENT '社招校招',
  `recommender_business_people` varchar(255) DEFAULT NULL COMMENT '推荐企业人',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of em_user_company_jobs
-- ----------------------------
INSERT INTO `em_user_company_jobs` VALUES ('1063705989926227968', '1', '文员', null, null, null, null, null, null, '1066370498633486336', null, '1', null, null, null, '2018-12-25', '2018-12-21', '2018-12-03', '2018-12-04', '6月', null, '1', '拉勾网', '猎头', '社招', '百度');

-- ----------------------------
-- Table structure for em_user_company_personal
-- ----------------------------
DROP TABLE IF EXISTS `em_user_company_personal`;
CREATE TABLE `em_user_company_personal` (
  `user_id` varchar(40) NOT NULL COMMENT '用户ID',
  `username` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `time_of_entry` varchar(255) DEFAULT NULL,
  `department_name` varchar(255) DEFAULT NULL,
  `company_id` varchar(255) NOT NULL COMMENT '公司ID',
  `sex` varchar(255) DEFAULT NULL COMMENT '性别',
  `date_of_birth` varchar(255) DEFAULT NULL COMMENT '出生日期',
  `the_highest_degree_of_education` varchar(255) DEFAULT NULL COMMENT '最高学历',
  `national_area` varchar(255) DEFAULT NULL COMMENT '国家地区',
  `passport_no` varchar(255) DEFAULT NULL COMMENT '护照号',
  `id_number` varchar(255) DEFAULT NULL COMMENT '身份证号',
  `id_card_photo_positive` varchar(255) DEFAULT NULL COMMENT '身份证照片-正面',
  `id_card_photo_back` varchar(255) DEFAULT NULL COMMENT '身份证照片-背面',
  `native_place` varchar(255) DEFAULT NULL COMMENT '籍贯',
  `nation` varchar(255) DEFAULT NULL COMMENT '民族',
  `english_name` varchar(255) DEFAULT NULL COMMENT '英文名',
  `marital_status` varchar(255) DEFAULT NULL COMMENT '婚姻状况',
  `staff_photo` varchar(255) DEFAULT NULL COMMENT '员工照片',
  `birthday` varchar(255) DEFAULT NULL COMMENT '生日',
  `zodiac` varchar(255) DEFAULT NULL COMMENT '属相',
  `age` varchar(255) DEFAULT NULL COMMENT '年龄',
  `constellation` varchar(255) DEFAULT NULL COMMENT '星座',
  `blood_type` varchar(255) DEFAULT NULL COMMENT '血型',
  `domicile` varchar(255) DEFAULT NULL COMMENT '户籍所在地',
  `political_outlook` varchar(255) DEFAULT NULL COMMENT '政治面貌',
  `time_to_join_the_party` varchar(255) DEFAULT NULL COMMENT '入党时间',
  `archiving_organization` varchar(255) DEFAULT NULL COMMENT '存档机构',
  `state_of_children` varchar(255) DEFAULT NULL COMMENT '子女状态',
  `do_children_have_commercial_insurance` varchar(255) DEFAULT NULL COMMENT '子女有无商业保险',
  `is_there_any_violation_of_law_or_discipline` varchar(255) DEFAULT NULL COMMENT '有无违法违纪行为',
  `are_there_any_major_medical_histories` varchar(255) DEFAULT NULL COMMENT '有无重大病史',
  `qq` varchar(255) DEFAULT NULL COMMENT 'QQ',
  `wechat` varchar(255) DEFAULT NULL COMMENT '微信',
  `residence_card_city` varchar(255) DEFAULT NULL COMMENT '居住证城市',
  `date_of_residence_permit` varchar(255) DEFAULT NULL COMMENT '居住证办理日期',
  `residence_permit_deadline` varchar(255) DEFAULT NULL COMMENT '居住证截止日期',
  `place_of_residence` varchar(255) DEFAULT NULL COMMENT '现居住地',
  `postal_address` varchar(255) DEFAULT NULL COMMENT '通讯地址',
  `contact_the_mobile_phone` varchar(255) DEFAULT NULL,
  `personal_mailbox` varchar(255) DEFAULT NULL,
  `emergency_contact` varchar(255) DEFAULT NULL COMMENT '紧急联系人',
  `emergency_contact_number` varchar(255) DEFAULT NULL COMMENT '紧急联系电话',
  `social_security_computer_number` varchar(255) DEFAULT NULL COMMENT '社保电脑号',
  `provident_fund_account` varchar(255) DEFAULT NULL COMMENT '公积金账号',
  `bank_card_number` varchar(255) DEFAULT NULL COMMENT '银行卡号',
  `opening_bank` varchar(255) DEFAULT NULL COMMENT '开户行',
  `educational_type` varchar(255) DEFAULT NULL COMMENT '学历类型',
  `graduate_school` varchar(255) DEFAULT NULL COMMENT '毕业学校',
  `enrolment_time` varchar(255) DEFAULT NULL COMMENT '入学时间',
  `graduation_time` varchar(255) DEFAULT NULL COMMENT '毕业时间',
  `major` varchar(255) DEFAULT NULL COMMENT '专业',
  `graduation_certificate` varchar(255) DEFAULT NULL COMMENT '毕业证书',
  `certificate_of_academic_degree` varchar(255) DEFAULT NULL COMMENT '学位证书',
  `home_company` varchar(255) DEFAULT NULL COMMENT '上家公司',
  `title` varchar(255) DEFAULT NULL COMMENT '职称',
  `resume` varchar(255) DEFAULT NULL COMMENT '简历',
  `is_there_any_competition_restriction` varchar(255) DEFAULT NULL COMMENT '有无竞业限制',
  `proof_of_departure_of_former_company` varchar(255) DEFAULT NULL COMMENT '前公司离职证明',
  `remarks` text COMMENT '备注',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of em_user_company_personal
-- ----------------------------
INSERT INTO `em_user_company_personal` VALUES ('1', 'test1', '13000000001', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('101', 'test101', '13000000101', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('102', 'test102', '13000000102', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('103', 'test103', '13000000103', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('104', 'test104', '13000000104', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('105', 'test105', '13000000105', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('106', 'test106', '13000000106', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('1063705989926227955', 'a02', '13400000002', '2018-02-03', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('1063705989926227961', 'a02', '13400000002', '2018-02-03', '开发部', '1', '', '', '初中', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `em_user_company_personal` VALUES ('107', 'test107', '13000000107', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('1074238801402007552', 'a02', '13400000002', '2018-02-01', '开发部', '1', null, null, '初中', '中国大陆', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `em_user_company_personal` VALUES ('1074238801402007555', 'a02', '13400000002', '2018-02-01', '开发部', '1', '', '', '初中', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `em_user_company_personal` VALUES ('108', 'test108', '13000000108', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('109', 'test109', '13000000109', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('11', 'test11', '13000000011', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('110', 'test110', '13000000110', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('12', 'test12', '13000000012', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('13', 'test13', '13000000013', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('14', 'test14', '13000000014', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('15', 'test15', '13000000015', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('16', 'test16', '13000000016', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('17', 'test17', '13000000017', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('18', 'test18', '13000000018', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('19', 'test19', '13000000019', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('2', 'test2', '13000000002', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('20', 'test20', '13000000020', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('21', 'test21', '13000000021', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('22', 'test22', '13000000022', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('23', 'test23', '13000000023', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('24', 'test24', '13000000024', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('25', 'test25', '13000000025', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('26', 'test26', '13000000026', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('27', 'test27', '13000000027', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('28', 'test28', '13000000028', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('29', 'test29', '13000000029', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('3', 'test3', '13000000003', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('30', 'test30', '13000000030', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('31', 'test31', '13000000031', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('32', 'test32', '13000000032', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('33', 'test33', '13000000033', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('34', 'test34', '13000000034', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('35', 'test35', '13000000035', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('36', 'test36', '13000000036', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('37', 'test37', '13000000037', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('38', 'test38', '13000000038', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('39', 'test39', '13000000039', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('4', 'test4', '13000000004', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('40', 'test40', '13000000040', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('41', 'test41', '13000000041', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('42', 'test42', '13000000042', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('43', 'test43', '13000000043', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('44', 'test44', '13000000044', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('45', 'test45', '13000000045', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('46', 'test46', '13000000046', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('47', 'test47', '13000000047', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('48', 'test48', '13000000048', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('49', 'test49', '13000000049', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('5', 'test5', '13000000005', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('50', 'test50', '13000000050', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('51', 'test51', '13000000051', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('52', 'test52', '13000000052', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('53', 'test53', '13000000053', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('54', 'test54', '13000000054', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('55', 'test55', '13000000055', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('56', 'test56', '13000000056', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('57', 'test57', '13000000057', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('58', 'test58', '13000000058', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('59', 'test59', '13000000059', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('6', 'test6', '13000000006', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('60', 'test60', '13000000060', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('61', 'test61', '13000000061', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('62', 'test62', '13000000062', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('63', 'test63', '13000000063', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('64', 'test64', '13000000064', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('65', 'test65', '13000000065', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('66', 'test66', '13000000066', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('67', 'test67', '13000000067', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('68', 'test68', '13000000068', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('69', 'test69', '13000000069', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('70', 'test70', '13000000070', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('71', 'test71', '13000000071', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('72', 'test72', '13000000072', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('73', 'test73', '13000000073', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('74', 'test74', '13000000074', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('75', 'test75', '13000000075', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('76', 'test76', '13000000076', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('77', 'test77', '13000000077', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('78', 'test78', '13000000078', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('79', 'test79', '13000000079', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('80', 'test80', '13000000080', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('84', 'test84', '13000000084', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('85', 'test85', '13000000085', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('86', 'test86', '13000000086', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('87', 'test87', '13000000087', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('88', 'test88', '13000000088', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('89', 'test89', '13000000089', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('90', 'test90', '13000000090', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('91', 'test91', '13000000091', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('92', 'test92', '13000000092', '2018-03-01', '开发部', '1', '', '', '初中', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `em_user_company_personal` VALUES ('93', 'test93', '13000000093', '2018-03-01', '开发部', '1', '', '', '初中', '中国大陆', '1234', '1234', '', '', '1234', '1234', '', '未婚', '', '', '牛', '', '', '', '', '', '', '', '', '', '无', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '统招', '', '', '', '', '', '', '', '', '', '', '', '');
