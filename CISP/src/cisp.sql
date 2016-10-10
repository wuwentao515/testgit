/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : copycisp

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2016-09-26 17:36:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `blacklist`
-- ----------------------------
DROP TABLE IF EXISTS `blacklist`;
CREATE TABLE `blacklist` (
  `sinoId` varchar(50) NOT NULL COMMENT '逾期管理表',
  `overdue_start_time` datetime DEFAULT NULL COMMENT '逾期开始日',
  `reason` varchar(50) DEFAULT NULL COMMENT '逾期原因',
  `public_time` timestamp NULL DEFAULT NULL COMMENT '报送/公开时间',
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `cardid` varchar(20) DEFAULT NULL COMMENT '身份证号',
  `phone` varchar(20) DEFAULT NULL COMMENT '电话',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `live_address` varchar(20) DEFAULT NULL COMMENT '居住地址',
  `overdue_money` decimal(10,2) DEFAULT NULL COMMENT '逾期金额',
  `loan_location` varchar(12) DEFAULT NULL COMMENT '贷款地点',
  `loan_type` varchar(10) DEFAULT NULL COMMENT '借款类型',
  `loan_start_time` datetime DEFAULT NULL COMMENT '借款开始日',
  `loan_guarantee` varchar(10) DEFAULT NULL COMMENT '担保方式',
  `overdue_duration` varchar(10) DEFAULT NULL COMMENT '逾期时长',
  `overdue_status` varchar(10) DEFAULT NULL COMMENT '逾期状态',
  `user_account` varchar(45) DEFAULT NULL COMMENT '用户帐号',
  `personal_address` varchar(10) DEFAULT NULL COMMENT '户籍地址',
  `overdue_times` char(2) DEFAULT NULL,
  PRIMARY KEY (`sinoId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blacklist
-- ----------------------------

-- ----------------------------
-- Table structure for `contract_accept_detail`
-- ----------------------------
DROP TABLE IF EXISTS `contract_accept_detail`;
CREATE TABLE `contract_accept_detail` (
  `sinoid` varchar(50) NOT NULL COMMENT '本系统唯一标识',
  `contract_id` varchar(50) DEFAULT NULL COMMENT '合同编号',
  `contract_sum` decimal(10,2) DEFAULT NULL COMMENT '合同金额',
  `start_time` datetime DEFAULT NULL COMMENT '合同开始时间',
  `stop_time` datetime DEFAULT NULL COMMENT '合同结束时间',
  `contract_type` char(2) DEFAULT NULL COMMENT '贷款类型（是字典）',
  `guara_type` char(2) DEFAULT NULL COMMENT '贷款形式（是字典）',
  `pay_period` char(2) DEFAULT NULL COMMENT '贷款期数',
  `pay_location` varchar(50) DEFAULT NULL COMMENT '贷款地点（是字典）',
  `contract_status` char(2) DEFAULT NULL COMMENT '债权状态（是字典）',
  `settle_time` datetime DEFAULT NULL COMMENT '结清日期',
  `sinotime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '操作时间',
  PRIMARY KEY (`sinoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='合同同意详情表';

-- ----------------------------
-- Records of contract_accept_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `contract_delay_history`
-- ----------------------------
DROP TABLE IF EXISTS `contract_delay_history`;
CREATE TABLE `contract_delay_history` (
  `sinoid` varchar(50) NOT NULL COMMENT '本系统唯一标识',
  `sn` char(2) NOT NULL DEFAULT '' COMMENT '延迟次数',
  `sinotime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '操作时间',
  PRIMARY KEY (`sinoid`,`sn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of contract_delay_history
-- ----------------------------

-- ----------------------------
-- Table structure for `dissent_detail`
-- ----------------------------
DROP TABLE IF EXISTS `dissent_detail`;
CREATE TABLE `dissent_detail` (
  `dissent_id` varchar(50) NOT NULL DEFAULT '' COMMENT '申诉编号',
  `cardid` varchar(20) DEFAULT NULL COMMENT '申诉人身份证号',
  `appeal_time` datetime DEFAULT NULL COMMENT '申诉时间',
  `appeal_detail` varchar(200) DEFAULT NULL COMMENT '申诉内容',
  `status` char(2) DEFAULT NULL COMMENT '处置状态',
  PRIMARY KEY (`dissent_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dissent_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `extend_time`
-- ----------------------------
DROP TABLE IF EXISTS `extend_time`;
CREATE TABLE `extend_time` (
  `sinoid` varchar(50) NOT NULL COMMENT '本系统唯一标识',
  `extend_limit_time` datetime DEFAULT NULL COMMENT '展期到期时间',
  `whole_not_paid` decimal(10,2) DEFAULT NULL COMMENT '未偿金额',
  `sinotime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`sinoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of extend_time
-- ----------------------------

-- ----------------------------
-- Table structure for `id_mapper`
-- ----------------------------
DROP TABLE IF EXISTS `id_mapper`;
CREATE TABLE `id_mapper` (
  `sinoid` varchar(50) NOT NULL COMMENT '本系统唯一标识',
  `user_account` varchar(45) DEFAULT NULL COMMENT '用户账号',
  `instiid` varchar(50) NOT NULL COMMENT '申请编号（机构中业务的唯一标识）',
  `contract_id` varchar(50) DEFAULT NULL COMMENT '合同编号',
  `insti_code` varchar(10) DEFAULT NULL COMMENT '机构编号',
  `data_from` char(2) DEFAULT NULL COMMENT '数据来源（是字典）',
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `cardid` varchar(30) DEFAULT NULL COMMENT '身份证号',
  `cr_status` varchar(2) DEFAULT NULL COMMENT '债权流转过程状态（是字典）',
  `sinotime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`sinoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of id_mapper
-- ----------------------------

-- ----------------------------
-- Table structure for `insti_detail`
-- ----------------------------
DROP TABLE IF EXISTS `insti_detail`;
CREATE TABLE `insti_detail` (
  `insti_code` int(10) NOT NULL COMMENT '机构代码',
  `insti_type` int(2) DEFAULT NULL COMMENT '会员类型（数据字典）',
  `insti_name` varchar(50) DEFAULT NULL COMMENT '机构全称',
  `insti_shortname` varchar(50) DEFAULT NULL COMMENT '机构简称',
  `corporation_name` varchar(30) DEFAULT NULL COMMENT '公司名称',
  `social_credit_code` varchar(30) DEFAULT NULL COMMENT '社会信用代码',
  `credit_person` varchar(30) DEFAULT NULL COMMENT '信用人',
  `general_manager` varchar(30) DEFAULT NULL COMMENT '普通管理员',
  `registered_address` varchar(50) DEFAULT NULL COMMENT '注册地点',
  `registered_capital` varchar(30) DEFAULT NULL COMMENT '注册资金',
  `zip_code` int(6) DEFAULT NULL COMMENT '代码简称',
  `insti_phone` varchar(20) DEFAULT NULL COMMENT '机构联系方式',
  `insti_location` varchar(45) DEFAULT NULL COMMENT '机构所在地',
  `web_url` varchar(100) DEFAULT NULL COMMENT '机构网址',
  `fax_number` varchar(20) DEFAULT NULL COMMENT '传真号',
  `access_type` varchar(5) DEFAULT NULL COMMENT '接受类型',
  PRIMARY KEY (`insti_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of insti_detail
-- ----------------------------
INSERT INTO `insti_detail` VALUES ('1', '3', '清华', 'QH', 'qinghuaCompany', '111', 'aaa', 'AAA', 'beijing', '1000000', '1', '123456789', 'qinghua', 'qinghua@163.com', '123124', '1');
INSERT INTO `insti_detail` VALUES ('2', '4', '北大', 'BD', 'beidaCompany', '222', 'bbb', 'BBB', 'beida', '2000000', '2', '987654321', 'beida', 'beida@163.com', '421321', '2');

-- ----------------------------
-- Table structure for `inventory`
-- ----------------------------
DROP TABLE IF EXISTS `inventory`;
CREATE TABLE `inventory` (
  `sinoId` varchar(50) NOT NULL,
  `payment_date` date DEFAULT NULL COMMENT '最近一期还款日期',
  `not_repay_money` decimal(10,2) DEFAULT NULL COMMENT '未偿金额',
  `current_money` decimal(10,2) DEFAULT NULL COMMENT '当期账单金额',
  `sinotime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`sinoId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of inventory
-- ----------------------------

-- ----------------------------
-- Table structure for `ip_limit`
-- ----------------------------
DROP TABLE IF EXISTS `ip_limit`;
CREATE TABLE `ip_limit` (
  `user_account` varchar(45) NOT NULL COMMENT '用户账户',
  `insti_code` int(10) DEFAULT NULL COMMENT '机构代码',
  `access_ip` varchar(50) DEFAULT NULL COMMENT '入口ip',
  PRIMARY KEY (`user_account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ip_limit
-- ----------------------------

-- ----------------------------
-- Table structure for `loan_application`
-- ----------------------------
DROP TABLE IF EXISTS `loan_application`;
CREATE TABLE `loan_application` (
  `sinoid` varchar(50) NOT NULL COMMENT '本系统唯一标识',
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `cardid` varchar(50) DEFAULT NULL COMMENT '身份证号',
  `cell_phone_num` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `request_time` datetime DEFAULT NULL COMMENT '申请时间',
  `request_money` decimal(10,2) DEFAULT NULL COMMENT '申请金额',
  `request_location` varchar(50) DEFAULT NULL COMMENT '申请地点',
  `request_type` char(2) DEFAULT NULL COMMENT '借款类型（是字典）',
  `sinotime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '操作时间',
  `edu` char(2) DEFAULT NULL COMMENT '学历（是字典）',
  `request_result` char(2) DEFAULT NULL COMMENT '处理结果（是字典）',
  `refuse_reason` char(2) DEFAULT NULL COMMENT '拒绝原因（是字典）',
  `refuse_time` datetime DEFAULT NULL,
  PRIMARY KEY (`sinoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='进件申请表';

-- ----------------------------
-- Records of loan_application
-- ----------------------------

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `sinoid` varchar(45) DEFAULT NULL,
  `insti_code` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `user_account` varchar(45) DEFAULT NULL,
  `cardid` varchar(20) DEFAULT NULL,
  `token` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for `m_dd_city_dic`
-- ----------------------------
DROP TABLE IF EXISTS `m_dd_city_dic`;
CREATE TABLE `m_dd_city_dic` (
  `s_code` varchar(255) DEFAULT NULL COMMENT '省级城市代码',
  `s_name` varchar(255) DEFAULT NULL COMMENT '省级城市名称',
  `c_name` varchar(255) DEFAULT NULL COMMENT '市级城市名称',
  `x_level` varchar(255) DEFAULT NULL COMMENT '城市级别',
  `c_code` varchar(255) NOT NULL DEFAULT '' COMMENT '市级城市代码',
  PRIMARY KEY (`c_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_dd_city_dic
-- ----------------------------
INSERT INTO `m_dd_city_dic` VALUES ('11', '北京市', '北京市', '1', '1100');
INSERT INTO `m_dd_city_dic` VALUES ('12', '天津市', '天津市', '1', '1200');
INSERT INTO `m_dd_city_dic` VALUES ('13', '河北省', '河北省', '1', '1300');
INSERT INTO `m_dd_city_dic` VALUES ('13', '河北省', '石家庄市', '2', '1301');
INSERT INTO `m_dd_city_dic` VALUES ('13', '河北省', '唐山市', '3', '1302');
INSERT INTO `m_dd_city_dic` VALUES ('13', '河北省', '秦皇岛市', '3', '1303');
INSERT INTO `m_dd_city_dic` VALUES ('13', '河北省', '邯郸市', '3', '1304');
INSERT INTO `m_dd_city_dic` VALUES ('13', '河北省', '邢台市', '3', '1305');
INSERT INTO `m_dd_city_dic` VALUES ('13', '河北省', '保定市', '3', '1306');
INSERT INTO `m_dd_city_dic` VALUES ('13', '河北省', '张家口市', '3', '1307');
INSERT INTO `m_dd_city_dic` VALUES ('13', '河北省', '承德市', '3', '1308');
INSERT INTO `m_dd_city_dic` VALUES ('13', '河北省', '沧州市', '3', '1309');
INSERT INTO `m_dd_city_dic` VALUES ('13', '河北省', '廊坊市', '3', '1310');
INSERT INTO `m_dd_city_dic` VALUES ('13', '河北省', '衡水市', '3', '1311');
INSERT INTO `m_dd_city_dic` VALUES ('14', '山西省', '山西省', '1', '1400');
INSERT INTO `m_dd_city_dic` VALUES ('14', '山西省', '太原市', '2', '1401');
INSERT INTO `m_dd_city_dic` VALUES ('14', '山西省', '大同市', '3', '1402');
INSERT INTO `m_dd_city_dic` VALUES ('14', '山西省', '阳泉市', '3', '1403');
INSERT INTO `m_dd_city_dic` VALUES ('14', '山西省', '长治市', '3', '1404');
INSERT INTO `m_dd_city_dic` VALUES ('14', '山西省', '晋城市', '3', '1405');
INSERT INTO `m_dd_city_dic` VALUES ('14', '山西省', '朔州市', '3', '1406');
INSERT INTO `m_dd_city_dic` VALUES ('14', '山西省', '晋中市', '3', '1407');
INSERT INTO `m_dd_city_dic` VALUES ('14', '山西省', '运城市', '3', '1408');
INSERT INTO `m_dd_city_dic` VALUES ('14', '山西省', '忻州市', '3', '1409');
INSERT INTO `m_dd_city_dic` VALUES ('14', '山西省', '临汾市', '3', '1410');
INSERT INTO `m_dd_city_dic` VALUES ('14', '山西省', '吕梁市', '3', '1411');
INSERT INTO `m_dd_city_dic` VALUES ('15', '内蒙古自治区', '内蒙古自治区', '1', '1500');
INSERT INTO `m_dd_city_dic` VALUES ('15', '内蒙古自治区', '呼和浩特市', '2', '1501');
INSERT INTO `m_dd_city_dic` VALUES ('15', '内蒙古自治区', '包头市', '3', '1502');
INSERT INTO `m_dd_city_dic` VALUES ('15', '内蒙古自治区', '乌海市', '3', '1503');
INSERT INTO `m_dd_city_dic` VALUES ('15', '内蒙古自治区', '赤峰市', '3', '1504');
INSERT INTO `m_dd_city_dic` VALUES ('15', '内蒙古自治区', '通辽市', '3', '1505');
INSERT INTO `m_dd_city_dic` VALUES ('15', '内蒙古自治区', '鄂尔多斯市', '3', '1506');
INSERT INTO `m_dd_city_dic` VALUES ('15', '内蒙古自治区', '呼伦贝尔市', '3', '1507');
INSERT INTO `m_dd_city_dic` VALUES ('15', '内蒙古自治区', '巴彦淖尔市', '3', '1508');
INSERT INTO `m_dd_city_dic` VALUES ('15', '内蒙古自治区', '乌兰察布市', '3', '1509');
INSERT INTO `m_dd_city_dic` VALUES ('15', '内蒙古自治区', '兴安盟', '3', '1522');
INSERT INTO `m_dd_city_dic` VALUES ('15', '内蒙古自治区', '锡林郭勒盟', '3', '1525');
INSERT INTO `m_dd_city_dic` VALUES ('15', '内蒙古自治区', '阿拉善盟', '3', '1529');
INSERT INTO `m_dd_city_dic` VALUES ('21', '辽宁省', '辽宁省', '1', '2100');
INSERT INTO `m_dd_city_dic` VALUES ('21', '辽宁省', '沈阳市', '2', '2101');
INSERT INTO `m_dd_city_dic` VALUES ('21', '辽宁省', '大连市', '3', '2102');
INSERT INTO `m_dd_city_dic` VALUES ('21', '辽宁省', '鞍山市', '3', '2103');
INSERT INTO `m_dd_city_dic` VALUES ('21', '辽宁省', '抚顺市', '3', '2104');
INSERT INTO `m_dd_city_dic` VALUES ('21', '辽宁省', '本溪市', '3', '2105');
INSERT INTO `m_dd_city_dic` VALUES ('21', '辽宁省', '丹东市', '3', '2106');
INSERT INTO `m_dd_city_dic` VALUES ('21', '辽宁省', '锦州市', '3', '2107');
INSERT INTO `m_dd_city_dic` VALUES ('21', '辽宁省', '营口市', '3', '2108');
INSERT INTO `m_dd_city_dic` VALUES ('21', '辽宁省', '阜新市', '3', '2109');
INSERT INTO `m_dd_city_dic` VALUES ('21', '辽宁省', '辽阳市', '3', '2110');
INSERT INTO `m_dd_city_dic` VALUES ('21', '辽宁省', '盘锦市', '3', '2111');
INSERT INTO `m_dd_city_dic` VALUES ('21', '辽宁省', '铁岭市', '3', '2112');
INSERT INTO `m_dd_city_dic` VALUES ('21', '辽宁省', '朝阳市', '3', '2113');
INSERT INTO `m_dd_city_dic` VALUES ('21', '辽宁省', '葫芦岛市', '3', '2114');
INSERT INTO `m_dd_city_dic` VALUES ('22', '吉林省', '吉林省', '1', '2200');
INSERT INTO `m_dd_city_dic` VALUES ('22', '吉林省', '长春市', '2', '2201');
INSERT INTO `m_dd_city_dic` VALUES ('22', '吉林省', '吉林市', '3', '2202');
INSERT INTO `m_dd_city_dic` VALUES ('22', '吉林省', '四平市', '3', '2203');
INSERT INTO `m_dd_city_dic` VALUES ('22', '吉林省', '辽源市', '3', '2204');
INSERT INTO `m_dd_city_dic` VALUES ('22', '吉林省', '通化市', '3', '2205');
INSERT INTO `m_dd_city_dic` VALUES ('22', '吉林省', '白山市', '3', '2206');
INSERT INTO `m_dd_city_dic` VALUES ('22', '吉林省', '松原市', '3', '2207');
INSERT INTO `m_dd_city_dic` VALUES ('22', '吉林省', '白城市', '3', '2208');
INSERT INTO `m_dd_city_dic` VALUES ('22', '吉林省', '延边朝鲜族自治州', '3', '2224');
INSERT INTO `m_dd_city_dic` VALUES ('23', '黑龙江省', '黑龙江省', '1', '2300');
INSERT INTO `m_dd_city_dic` VALUES ('23', '黑龙江省', '哈尔滨市', '2', '2301');
INSERT INTO `m_dd_city_dic` VALUES ('23', '黑龙江省', '齐齐哈尔市', '3', '2302');
INSERT INTO `m_dd_city_dic` VALUES ('23', '黑龙江省', '鸡西市', '3', '2303');
INSERT INTO `m_dd_city_dic` VALUES ('23', '黑龙江省', '鹤岗市', '3', '2304');
INSERT INTO `m_dd_city_dic` VALUES ('23', '黑龙江省', '双鸭山市', '3', '2305');
INSERT INTO `m_dd_city_dic` VALUES ('23', '黑龙江省', '大庆市', '3', '2306');
INSERT INTO `m_dd_city_dic` VALUES ('23', '黑龙江省', '伊春市', '3', '2307');
INSERT INTO `m_dd_city_dic` VALUES ('23', '黑龙江省', '佳木斯市', '3', '2308');
INSERT INTO `m_dd_city_dic` VALUES ('23', '黑龙江省', '七台河市', '3', '2309');
INSERT INTO `m_dd_city_dic` VALUES ('23', '黑龙江省', '牡丹江市', '3', '2310');
INSERT INTO `m_dd_city_dic` VALUES ('23', '黑龙江省', '黑河市', '3', '2311');
INSERT INTO `m_dd_city_dic` VALUES ('23', '黑龙江省', '绥化市', '3', '2312');
INSERT INTO `m_dd_city_dic` VALUES ('23', '黑龙江省', '大兴安岭地区', '3', '2327');
INSERT INTO `m_dd_city_dic` VALUES ('31', '上海市', '上海市', '1', '3100');
INSERT INTO `m_dd_city_dic` VALUES ('32', '江苏省', '江苏省', '1', '3200');
INSERT INTO `m_dd_city_dic` VALUES ('32', '江苏省', '南京市', '2', '3201');
INSERT INTO `m_dd_city_dic` VALUES ('32', '江苏省', '无锡市', '3', '3202');
INSERT INTO `m_dd_city_dic` VALUES ('32', '江苏省', '徐州市', '3', '3203');
INSERT INTO `m_dd_city_dic` VALUES ('32', '江苏省', '常州市', '3', '3204');
INSERT INTO `m_dd_city_dic` VALUES ('32', '江苏省', '苏州市', '3', '3205');
INSERT INTO `m_dd_city_dic` VALUES ('32', '江苏省', '南通市', '3', '3206');
INSERT INTO `m_dd_city_dic` VALUES ('32', '江苏省', '连云港市', '3', '3207');
INSERT INTO `m_dd_city_dic` VALUES ('32', '江苏省', '淮安市', '3', '3208');
INSERT INTO `m_dd_city_dic` VALUES ('32', '江苏省', '盐城市', '3', '3209');
INSERT INTO `m_dd_city_dic` VALUES ('32', '江苏省', '扬州市', '3', '3210');
INSERT INTO `m_dd_city_dic` VALUES ('32', '江苏省', '镇江市', '3', '3211');
INSERT INTO `m_dd_city_dic` VALUES ('32', '江苏省', '泰州市', '3', '3212');
INSERT INTO `m_dd_city_dic` VALUES ('32', '江苏省', '宿迁市', '3', '3213');
INSERT INTO `m_dd_city_dic` VALUES ('33', '浙江省', '浙江省', '1', '3300');
INSERT INTO `m_dd_city_dic` VALUES ('33', '浙江省', '杭州市', '2', '3301');
INSERT INTO `m_dd_city_dic` VALUES ('33', '浙江省', '宁波市', '3', '3302');
INSERT INTO `m_dd_city_dic` VALUES ('33', '浙江省', '温州市', '3', '3303');
INSERT INTO `m_dd_city_dic` VALUES ('33', '浙江省', '嘉兴市', '3', '3304');
INSERT INTO `m_dd_city_dic` VALUES ('33', '浙江省', '湖州市', '3', '3305');
INSERT INTO `m_dd_city_dic` VALUES ('33', '浙江省', '绍兴市', '3', '3306');
INSERT INTO `m_dd_city_dic` VALUES ('33', '浙江省', '金华市', '3', '3307');
INSERT INTO `m_dd_city_dic` VALUES ('33', '浙江省', '衢州市', '3', '3308');
INSERT INTO `m_dd_city_dic` VALUES ('33', '浙江省', '舟山市', '3', '3309');
INSERT INTO `m_dd_city_dic` VALUES ('33', '浙江省', '台州市', '3', '3310');
INSERT INTO `m_dd_city_dic` VALUES ('33', '浙江省', '丽水市', '3', '3311');
INSERT INTO `m_dd_city_dic` VALUES ('34', '安徽省', '安徽省', '1', '3400');
INSERT INTO `m_dd_city_dic` VALUES ('34', '安徽省', '合肥市', '2', '3401');
INSERT INTO `m_dd_city_dic` VALUES ('34', '安徽省', '芜湖市', '3', '3402');
INSERT INTO `m_dd_city_dic` VALUES ('34', '安徽省', '蚌埠市', '3', '3403');
INSERT INTO `m_dd_city_dic` VALUES ('34', '安徽省', '淮南市', '3', '3404');
INSERT INTO `m_dd_city_dic` VALUES ('34', '安徽省', '马鞍山市', '3', '3405');
INSERT INTO `m_dd_city_dic` VALUES ('34', '安徽省', '淮北市', '3', '3406');
INSERT INTO `m_dd_city_dic` VALUES ('34', '安徽省', '铜陵市', '3', '3407');
INSERT INTO `m_dd_city_dic` VALUES ('34', '安徽省', '安庆市', '3', '3408');
INSERT INTO `m_dd_city_dic` VALUES ('34', '安徽省', '黄山市', '3', '3410');
INSERT INTO `m_dd_city_dic` VALUES ('34', '安徽省', '滁州市', '3', '3411');
INSERT INTO `m_dd_city_dic` VALUES ('34', '安徽省', '阜阳市', '3', '3412');
INSERT INTO `m_dd_city_dic` VALUES ('34', '安徽省', '宿州市', '3', '3413');
INSERT INTO `m_dd_city_dic` VALUES ('34', '安徽省', '巢湖市', '3', '3414');
INSERT INTO `m_dd_city_dic` VALUES ('34', '安徽省', '六安市', '3', '3415');
INSERT INTO `m_dd_city_dic` VALUES ('34', '安徽省', '亳州市', '3', '3416');
INSERT INTO `m_dd_city_dic` VALUES ('34', '安徽省', '池州市', '3', '3417');
INSERT INTO `m_dd_city_dic` VALUES ('34', '安徽省', '宣城市', '3', '3418');
INSERT INTO `m_dd_city_dic` VALUES ('35', '福建省', '福建省', '1', '3500');
INSERT INTO `m_dd_city_dic` VALUES ('35', '福建省', '福州市', '2', '3501');
INSERT INTO `m_dd_city_dic` VALUES ('35', '福建省', '厦门市', '3', '3502');
INSERT INTO `m_dd_city_dic` VALUES ('35', '福建省', '莆田市', '3', '3503');
INSERT INTO `m_dd_city_dic` VALUES ('35', '福建省', '三明市', '3', '3504');
INSERT INTO `m_dd_city_dic` VALUES ('35', '福建省', '泉州市', '3', '3505');
INSERT INTO `m_dd_city_dic` VALUES ('35', '福建省', '漳州市', '3', '3506');
INSERT INTO `m_dd_city_dic` VALUES ('35', '福建省', '南平市', '3', '3507');
INSERT INTO `m_dd_city_dic` VALUES ('35', '福建省', '龙岩市', '3', '3508');
INSERT INTO `m_dd_city_dic` VALUES ('35', '福建省', '宁德市', '3', '3509');
INSERT INTO `m_dd_city_dic` VALUES ('36', '江西省', '江西省', '1', '3600');
INSERT INTO `m_dd_city_dic` VALUES ('36', '江西省', '南昌市', '2', '3601');
INSERT INTO `m_dd_city_dic` VALUES ('36', '江西省', '景德镇市', '3', '3602');
INSERT INTO `m_dd_city_dic` VALUES ('36', '江西省', '萍乡市', '3', '3603');
INSERT INTO `m_dd_city_dic` VALUES ('36', '江西省', '九江市', '3', '3604');
INSERT INTO `m_dd_city_dic` VALUES ('36', '江西省', '新余市', '3', '3605');
INSERT INTO `m_dd_city_dic` VALUES ('36', '江西省', '鹰潭市', '3', '3606');
INSERT INTO `m_dd_city_dic` VALUES ('36', '江西省', '赣州市', '3', '3607');
INSERT INTO `m_dd_city_dic` VALUES ('36', '江西省', '吉安市', '3', '3608');
INSERT INTO `m_dd_city_dic` VALUES ('36', '江西省', '宜春市', '3', '3609');
INSERT INTO `m_dd_city_dic` VALUES ('36', '江西省', '抚州市', '3', '3610');
INSERT INTO `m_dd_city_dic` VALUES ('36', '江西省', '上饶市', '3', '3611');
INSERT INTO `m_dd_city_dic` VALUES ('37', '山东省', '山东省', '1', '3700');
INSERT INTO `m_dd_city_dic` VALUES ('37', '山东省', '济南市', '2', '3701');
INSERT INTO `m_dd_city_dic` VALUES ('37', '山东省', '青岛市', '3', '3702');
INSERT INTO `m_dd_city_dic` VALUES ('37', '山东省', '淄博市', '3', '3703');
INSERT INTO `m_dd_city_dic` VALUES ('37', '山东省', '枣庄市', '3', '3704');
INSERT INTO `m_dd_city_dic` VALUES ('37', '山东省', '东营市', '3', '3705');
INSERT INTO `m_dd_city_dic` VALUES ('37', '山东省', '烟台市', '3', '3706');
INSERT INTO `m_dd_city_dic` VALUES ('37', '山东省', '潍坊市', '3', '3707');
INSERT INTO `m_dd_city_dic` VALUES ('37', '山东省', '济宁市', '3', '3708');
INSERT INTO `m_dd_city_dic` VALUES ('37', '山东省', '泰安市', '3', '3709');
INSERT INTO `m_dd_city_dic` VALUES ('37', '山东省', '威海市', '3', '3710');
INSERT INTO `m_dd_city_dic` VALUES ('37', '山东省', '日照市', '3', '3711');
INSERT INTO `m_dd_city_dic` VALUES ('37', '山东省', '莱芜市', '3', '3712');
INSERT INTO `m_dd_city_dic` VALUES ('37', '山东省', '临沂市', '3', '3713');
INSERT INTO `m_dd_city_dic` VALUES ('37', '山东省', '德州市', '3', '3714');
INSERT INTO `m_dd_city_dic` VALUES ('37', '山东省', '聊城市', '3', '3715');
INSERT INTO `m_dd_city_dic` VALUES ('37', '山东省', '滨州市', '3', '3716');
INSERT INTO `m_dd_city_dic` VALUES ('37', '山东省', '菏泽市', '3', '3717');
INSERT INTO `m_dd_city_dic` VALUES ('41', '河南省', '河南省', '1', '4100');
INSERT INTO `m_dd_city_dic` VALUES ('41', '河南省', '郑州市', '2', '4101');
INSERT INTO `m_dd_city_dic` VALUES ('41', '河南省', '开封市', '3', '4102');
INSERT INTO `m_dd_city_dic` VALUES ('41', '河南省', '洛阳市', '3', '4103');
INSERT INTO `m_dd_city_dic` VALUES ('41', '河南省', '平顶山市', '3', '4104');
INSERT INTO `m_dd_city_dic` VALUES ('41', '河南省', '安阳市', '3', '4105');
INSERT INTO `m_dd_city_dic` VALUES ('41', '河南省', '鹤壁市', '3', '4106');
INSERT INTO `m_dd_city_dic` VALUES ('41', '河南省', '新乡市', '3', '4107');
INSERT INTO `m_dd_city_dic` VALUES ('41', '河南省', '焦作市', '3', '4108');
INSERT INTO `m_dd_city_dic` VALUES ('41', '河南省', '濮阳市', '3', '4109');
INSERT INTO `m_dd_city_dic` VALUES ('41', '河南省', '许昌市', '3', '4110');
INSERT INTO `m_dd_city_dic` VALUES ('41', '河南省', '漯河市', '3', '4111');
INSERT INTO `m_dd_city_dic` VALUES ('41', '河南省', '三门峡市', '3', '4112');
INSERT INTO `m_dd_city_dic` VALUES ('41', '河南省', '南阳市', '3', '4113');
INSERT INTO `m_dd_city_dic` VALUES ('41', '河南省', '商丘市', '3', '4114');
INSERT INTO `m_dd_city_dic` VALUES ('41', '河南省', '信阳市', '3', '4115');
INSERT INTO `m_dd_city_dic` VALUES ('41', '河南省', '周口市', '3', '4116');
INSERT INTO `m_dd_city_dic` VALUES ('41', '河南省', '驻马店市', '3', '4117');
INSERT INTO `m_dd_city_dic` VALUES ('42', '湖北省', '湖北省', '1', '4200');
INSERT INTO `m_dd_city_dic` VALUES ('42', '湖北省', '武汉市', '2', '4201');
INSERT INTO `m_dd_city_dic` VALUES ('42', '湖北省', '黄石市', '3', '4202');
INSERT INTO `m_dd_city_dic` VALUES ('42', '湖北省', '十堰市', '3', '4203');
INSERT INTO `m_dd_city_dic` VALUES ('42', '湖北省', '宜昌市', '3', '4205');
INSERT INTO `m_dd_city_dic` VALUES ('42', '湖北省', '襄樊市', '3', '4206');
INSERT INTO `m_dd_city_dic` VALUES ('42', '湖北省', '鄂州市', '3', '4207');
INSERT INTO `m_dd_city_dic` VALUES ('42', '湖北省', '荆门市', '3', '4208');
INSERT INTO `m_dd_city_dic` VALUES ('42', '湖北省', '孝感市', '3', '4209');
INSERT INTO `m_dd_city_dic` VALUES ('42', '湖北省', '荆州市', '3', '4210');
INSERT INTO `m_dd_city_dic` VALUES ('42', '湖北省', '黄冈市', '3', '4211');
INSERT INTO `m_dd_city_dic` VALUES ('42', '湖北省', '咸宁市', '3', '4212');
INSERT INTO `m_dd_city_dic` VALUES ('42', '湖北省', '随州市', '3', '4213');
INSERT INTO `m_dd_city_dic` VALUES ('42', '湖北省', '恩施土家族苗族自治州', '3', '4228');
INSERT INTO `m_dd_city_dic` VALUES ('43', '湖南省', '湖南省', '1', '4300');
INSERT INTO `m_dd_city_dic` VALUES ('43', '湖南省', '长沙市', '2', '4301');
INSERT INTO `m_dd_city_dic` VALUES ('43', '湖南省', '株洲市', '3', '4302');
INSERT INTO `m_dd_city_dic` VALUES ('43', '湖南省', '湘潭市', '3', '4303');
INSERT INTO `m_dd_city_dic` VALUES ('43', '湖南省', '衡阳市', '3', '4304');
INSERT INTO `m_dd_city_dic` VALUES ('43', '湖南省', '邵阳市', '3', '4305');
INSERT INTO `m_dd_city_dic` VALUES ('43', '湖南省', '岳阳市', '3', '4306');
INSERT INTO `m_dd_city_dic` VALUES ('43', '湖南省', '常德市', '3', '4307');
INSERT INTO `m_dd_city_dic` VALUES ('43', '湖南省', '张家界市', '3', '4308');
INSERT INTO `m_dd_city_dic` VALUES ('43', '湖南省', '益阳市', '3', '4309');
INSERT INTO `m_dd_city_dic` VALUES ('43', '湖南省', '郴州市', '3', '4310');
INSERT INTO `m_dd_city_dic` VALUES ('43', '湖南省', '永州市', '3', '4311');
INSERT INTO `m_dd_city_dic` VALUES ('43', '湖南省', '怀化市', '3', '4312');
INSERT INTO `m_dd_city_dic` VALUES ('43', '湖南省', '娄底市', '3', '4313');
INSERT INTO `m_dd_city_dic` VALUES ('43', '湖南省', '湘西土家族苗族自治州', '3', '4331');
INSERT INTO `m_dd_city_dic` VALUES ('44', '广东省', '广东省', '1', '4400');
INSERT INTO `m_dd_city_dic` VALUES ('44', '广东省', '广州市', '2', '4401');
INSERT INTO `m_dd_city_dic` VALUES ('44', '广东省', '韶关市', '3', '4402');
INSERT INTO `m_dd_city_dic` VALUES ('44', '广东省', '深圳市', '3', '4403');
INSERT INTO `m_dd_city_dic` VALUES ('44', '广东省', '珠海市', '3', '4404');
INSERT INTO `m_dd_city_dic` VALUES ('44', '广东省', '汕头市', '3', '4405');
INSERT INTO `m_dd_city_dic` VALUES ('44', '广东省', '佛山市', '3', '4406');
INSERT INTO `m_dd_city_dic` VALUES ('44', '广东省', '江门市', '3', '4407');
INSERT INTO `m_dd_city_dic` VALUES ('44', '广东省', '湛江市', '3', '4408');
INSERT INTO `m_dd_city_dic` VALUES ('44', '广东省', '茂名市', '3', '4409');
INSERT INTO `m_dd_city_dic` VALUES ('44', '广东省', '肇庆市', '3', '4412');
INSERT INTO `m_dd_city_dic` VALUES ('44', '广东省', '惠州市', '3', '4413');
INSERT INTO `m_dd_city_dic` VALUES ('44', '广东省', '梅州市', '3', '4414');
INSERT INTO `m_dd_city_dic` VALUES ('44', '广东省', '汕尾市', '3', '4415');
INSERT INTO `m_dd_city_dic` VALUES ('44', '广东省', '河源市', '3', '4416');
INSERT INTO `m_dd_city_dic` VALUES ('44', '广东省', '阳江市', '3', '4417');
INSERT INTO `m_dd_city_dic` VALUES ('44', '广东省', '清远市', '3', '4418');
INSERT INTO `m_dd_city_dic` VALUES ('44', '广东省', '东莞市', '3', '4419');
INSERT INTO `m_dd_city_dic` VALUES ('44', '广东省', '中山市', '3', '4420');
INSERT INTO `m_dd_city_dic` VALUES ('44', '广东省', '潮州市', '3', '4451');
INSERT INTO `m_dd_city_dic` VALUES ('44', '广东省', '揭阳市', '3', '4452');
INSERT INTO `m_dd_city_dic` VALUES ('44', '广东省', '云浮市', '3', '4453');
INSERT INTO `m_dd_city_dic` VALUES ('45', '广西壮族自治区', '广西壮族自治区', '1', '4500');
INSERT INTO `m_dd_city_dic` VALUES ('45', '广西壮族自治区', '南宁市', '2', '4501');
INSERT INTO `m_dd_city_dic` VALUES ('45', '广西壮族自治区', '柳州市', '3', '4502');
INSERT INTO `m_dd_city_dic` VALUES ('45', '广西壮族自治区', '桂林市', '3', '4503');
INSERT INTO `m_dd_city_dic` VALUES ('45', '广西壮族自治区', '梧州市', '3', '4504');
INSERT INTO `m_dd_city_dic` VALUES ('45', '广西壮族自治区', '北海市', '3', '4505');
INSERT INTO `m_dd_city_dic` VALUES ('45', '广西壮族自治区', '防城港市', '3', '4506');
INSERT INTO `m_dd_city_dic` VALUES ('45', '广西壮族自治区', '钦州市', '3', '4507');
INSERT INTO `m_dd_city_dic` VALUES ('45', '广西壮族自治区', '贵港市', '3', '4508');
INSERT INTO `m_dd_city_dic` VALUES ('45', '广西壮族自治区', '玉林市', '3', '4509');
INSERT INTO `m_dd_city_dic` VALUES ('45', '广西壮族自治区', '百色市', '3', '4510');
INSERT INTO `m_dd_city_dic` VALUES ('45', '广西壮族自治区', '贺州市', '3', '4511');
INSERT INTO `m_dd_city_dic` VALUES ('45', '广西壮族自治区', '河池市', '3', '4512');
INSERT INTO `m_dd_city_dic` VALUES ('45', '广西壮族自治区', '来宾市', '3', '4513');
INSERT INTO `m_dd_city_dic` VALUES ('45', '广西壮族自治区', '崇左市', '3', '4514');
INSERT INTO `m_dd_city_dic` VALUES ('46', '海南省', '海南省', '1', '4600');
INSERT INTO `m_dd_city_dic` VALUES ('46', '海南省', '海口市', '2', '4601');
INSERT INTO `m_dd_city_dic` VALUES ('46', '海南省', '三亚市', '3', '4602');
INSERT INTO `m_dd_city_dic` VALUES ('50', '重庆市', '重庆市', '1', '5000');
INSERT INTO `m_dd_city_dic` VALUES ('51', '四川省', '四川省', '1', '5100');
INSERT INTO `m_dd_city_dic` VALUES ('51', '四川省', '成都市', '2', '5101');
INSERT INTO `m_dd_city_dic` VALUES ('51', '四川省', '自贡市', '3', '5103');
INSERT INTO `m_dd_city_dic` VALUES ('51', '四川省', '攀枝花市', '3', '5104');
INSERT INTO `m_dd_city_dic` VALUES ('51', '四川省', '泸州市', '3', '5105');
INSERT INTO `m_dd_city_dic` VALUES ('51', '四川省', '德阳市', '3', '5106');
INSERT INTO `m_dd_city_dic` VALUES ('51', '四川省', '绵阳市', '3', '5107');
INSERT INTO `m_dd_city_dic` VALUES ('51', '四川省', '广元市', '3', '5108');
INSERT INTO `m_dd_city_dic` VALUES ('51', '四川省', '遂宁市', '3', '5109');
INSERT INTO `m_dd_city_dic` VALUES ('51', '四川省', '内江市', '3', '5110');
INSERT INTO `m_dd_city_dic` VALUES ('51', '四川省', '乐山市', '3', '5111');
INSERT INTO `m_dd_city_dic` VALUES ('51', '四川省', '南充市', '3', '5113');
INSERT INTO `m_dd_city_dic` VALUES ('51', '四川省', '眉山市', '3', '5114');
INSERT INTO `m_dd_city_dic` VALUES ('51', '四川省', '宜宾市', '3', '5115');
INSERT INTO `m_dd_city_dic` VALUES ('51', '四川省', '广安市', '3', '5116');
INSERT INTO `m_dd_city_dic` VALUES ('51', '四川省', '达州市', '3', '5117');
INSERT INTO `m_dd_city_dic` VALUES ('51', '四川省', '雅安市', '3', '5118');
INSERT INTO `m_dd_city_dic` VALUES ('51', '四川省', '巴中市', '3', '5119');
INSERT INTO `m_dd_city_dic` VALUES ('51', '四川省', '资阳市', '3', '5120');
INSERT INTO `m_dd_city_dic` VALUES ('51', '四川省', '阿坝藏族羌族自治州', '3', '5132');
INSERT INTO `m_dd_city_dic` VALUES ('51', '四川省', '甘孜藏族自治州', '3', '5133');
INSERT INTO `m_dd_city_dic` VALUES ('51', '四川省', '凉山彝族自治州', '3', '5134');
INSERT INTO `m_dd_city_dic` VALUES ('52', '贵州省', '贵州省', '1', '5200');
INSERT INTO `m_dd_city_dic` VALUES ('52', '贵州省', '贵阳市', '2', '5201');
INSERT INTO `m_dd_city_dic` VALUES ('52', '贵州省', '六盘水市', '3', '5202');
INSERT INTO `m_dd_city_dic` VALUES ('52', '贵州省', '遵义市', '3', '5203');
INSERT INTO `m_dd_city_dic` VALUES ('52', '贵州省', '安顺市', '3', '5204');
INSERT INTO `m_dd_city_dic` VALUES ('52', '贵州省', '铜仁地区', '3', '5222');
INSERT INTO `m_dd_city_dic` VALUES ('52', '贵州省', '黔西南布依族苗族自治州', '3', '5223');
INSERT INTO `m_dd_city_dic` VALUES ('52', '贵州省', '毕节地区', '3', '5224');
INSERT INTO `m_dd_city_dic` VALUES ('52', '贵州省', '黔东南苗族侗族自治州', '3', '5226');
INSERT INTO `m_dd_city_dic` VALUES ('52', '贵州省', '黔南布依族苗族自治州', '3', '5227');
INSERT INTO `m_dd_city_dic` VALUES ('53', '云南省', '云南省', '1', '5300');
INSERT INTO `m_dd_city_dic` VALUES ('53', '云南省', '昆明市', '2', '5301');
INSERT INTO `m_dd_city_dic` VALUES ('53', '云南省', '曲靖市', '3', '5303');
INSERT INTO `m_dd_city_dic` VALUES ('53', '云南省', '玉溪市', '3', '5304');
INSERT INTO `m_dd_city_dic` VALUES ('53', '云南省', '保山市', '3', '5305');
INSERT INTO `m_dd_city_dic` VALUES ('53', '云南省', '昭通市', '3', '5306');
INSERT INTO `m_dd_city_dic` VALUES ('53', '云南省', '丽江市', '3', '5307');
INSERT INTO `m_dd_city_dic` VALUES ('53', '云南省', '普洱市', '3', '5308');
INSERT INTO `m_dd_city_dic` VALUES ('53', '云南省', '临沧市', '3', '5309');
INSERT INTO `m_dd_city_dic` VALUES ('53', '云南省', '楚雄彝族自治州', '3', '5323');
INSERT INTO `m_dd_city_dic` VALUES ('53', '云南省', '红河哈尼族彝族自治州', '3', '5325');
INSERT INTO `m_dd_city_dic` VALUES ('53', '云南省', '文山壮族苗族自治州', '3', '5326');
INSERT INTO `m_dd_city_dic` VALUES ('53', '云南省', '西双版纳傣族自治州', '3', '5328');
INSERT INTO `m_dd_city_dic` VALUES ('53', '云南省', '大理白族自治州', '3', '5329');
INSERT INTO `m_dd_city_dic` VALUES ('53', '云南省', '德宏傣族景颇族自治州', '3', '5331');
INSERT INTO `m_dd_city_dic` VALUES ('53', '云南省', '怒江傈僳族自治州', '3', '5333');
INSERT INTO `m_dd_city_dic` VALUES ('53', '云南省', '迪庆藏族自治州', '3', '5334');
INSERT INTO `m_dd_city_dic` VALUES ('54', '西藏自治区', '西藏自治区', '1', '5400');
INSERT INTO `m_dd_city_dic` VALUES ('54', '西藏自治区', '拉萨市', '2', '5401');
INSERT INTO `m_dd_city_dic` VALUES ('54', '西藏自治区', '昌都地区', '3', '5421');
INSERT INTO `m_dd_city_dic` VALUES ('54', '西藏自治区', '山南地区', '3', '5422');
INSERT INTO `m_dd_city_dic` VALUES ('54', '西藏自治区', '日喀则地区', '3', '5423');
INSERT INTO `m_dd_city_dic` VALUES ('54', '西藏自治区', '那曲地区', '3', '5424');
INSERT INTO `m_dd_city_dic` VALUES ('54', '西藏自治区', '阿里地区', '3', '5425');
INSERT INTO `m_dd_city_dic` VALUES ('54', '西藏自治区', '林芝地区', '3', '5426');
INSERT INTO `m_dd_city_dic` VALUES ('61', '陕西省', '陕西省', '1', '6100');
INSERT INTO `m_dd_city_dic` VALUES ('61', '陕西省', '西安市', '2', '6101');
INSERT INTO `m_dd_city_dic` VALUES ('61', '陕西省', '铜川市', '3', '6102');
INSERT INTO `m_dd_city_dic` VALUES ('61', '陕西省', '宝鸡市', '3', '6103');
INSERT INTO `m_dd_city_dic` VALUES ('61', '陕西省', '咸阳市', '3', '6104');
INSERT INTO `m_dd_city_dic` VALUES ('61', '陕西省', '渭南市', '3', '6105');
INSERT INTO `m_dd_city_dic` VALUES ('61', '陕西省', '延安市', '3', '6106');
INSERT INTO `m_dd_city_dic` VALUES ('61', '陕西省', '汉中市', '3', '6107');
INSERT INTO `m_dd_city_dic` VALUES ('61', '陕西省', '榆林市', '3', '6108');
INSERT INTO `m_dd_city_dic` VALUES ('61', '陕西省', '安康市', '3', '6109');
INSERT INTO `m_dd_city_dic` VALUES ('61', '陕西省', '商洛市', '3', '6110');
INSERT INTO `m_dd_city_dic` VALUES ('62', '甘肃省', '甘肃省', '1', '6200');
INSERT INTO `m_dd_city_dic` VALUES ('62', '甘肃省', '兰州市', '2', '6201');
INSERT INTO `m_dd_city_dic` VALUES ('62', '甘肃省', '嘉峪关市', '3', '6202');
INSERT INTO `m_dd_city_dic` VALUES ('62', '甘肃省', '金昌市', '3', '6203');
INSERT INTO `m_dd_city_dic` VALUES ('62', '甘肃省', '白银市', '3', '6204');
INSERT INTO `m_dd_city_dic` VALUES ('62', '甘肃省', '天水市', '3', '6205');
INSERT INTO `m_dd_city_dic` VALUES ('62', '甘肃省', '武威市', '3', '6206');
INSERT INTO `m_dd_city_dic` VALUES ('62', '甘肃省', '张掖市', '3', '6207');
INSERT INTO `m_dd_city_dic` VALUES ('62', '甘肃省', '平凉市', '3', '6208');
INSERT INTO `m_dd_city_dic` VALUES ('62', '甘肃省', '酒泉市', '3', '6209');
INSERT INTO `m_dd_city_dic` VALUES ('62', '甘肃省', '庆阳市', '3', '6210');
INSERT INTO `m_dd_city_dic` VALUES ('62', '甘肃省', '定西市', '3', '6211');
INSERT INTO `m_dd_city_dic` VALUES ('62', '甘肃省', '陇南市', '3', '6212');
INSERT INTO `m_dd_city_dic` VALUES ('62', '甘肃省', '临夏回族自治州', '3', '6229');
INSERT INTO `m_dd_city_dic` VALUES ('62', '甘肃省', '甘南藏族自治州', '3', '6230');
INSERT INTO `m_dd_city_dic` VALUES ('63', '青海省', '青海省', '1', '6300');
INSERT INTO `m_dd_city_dic` VALUES ('63', '青海省', '西宁市', '2', '6301');
INSERT INTO `m_dd_city_dic` VALUES ('63', '青海省', '海东地区', '3', '6321');
INSERT INTO `m_dd_city_dic` VALUES ('63', '青海省', '海北藏族自治州', '3', '6322');
INSERT INTO `m_dd_city_dic` VALUES ('63', '青海省', '黄南藏族自治州', '3', '6323');
INSERT INTO `m_dd_city_dic` VALUES ('63', '青海省', '海南藏族自治州', '3', '6325');
INSERT INTO `m_dd_city_dic` VALUES ('63', '青海省', '果洛藏族自治州', '3', '6326');
INSERT INTO `m_dd_city_dic` VALUES ('63', '青海省', '玉树藏族自治州', '3', '6327');
INSERT INTO `m_dd_city_dic` VALUES ('63', '青海省', '海西蒙古族藏族自治州', '3', '6328');
INSERT INTO `m_dd_city_dic` VALUES ('64', '宁夏回族自治区', '宁夏回族自治区', '1', '6400');
INSERT INTO `m_dd_city_dic` VALUES ('64', '宁夏回族自治区', '银川市', '2', '6401');
INSERT INTO `m_dd_city_dic` VALUES ('64', '宁夏回族自治区', '石嘴山市', '3', '6402');
INSERT INTO `m_dd_city_dic` VALUES ('64', '宁夏回族自治区', '吴忠市', '3', '6403');
INSERT INTO `m_dd_city_dic` VALUES ('64', '宁夏回族自治区', '固原市', '3', '6404');
INSERT INTO `m_dd_city_dic` VALUES ('64', '宁夏回族自治区', '中卫市', '3', '6405');
INSERT INTO `m_dd_city_dic` VALUES ('65', '新疆维吾尔自治区', '新疆维吾尔自治区', '1', '6500');
INSERT INTO `m_dd_city_dic` VALUES ('65', '新疆维吾尔自治区', '乌鲁木齐市', '2', '6501');
INSERT INTO `m_dd_city_dic` VALUES ('65', '新疆维吾尔自治区', '克拉玛依市', '3', '6502');
INSERT INTO `m_dd_city_dic` VALUES ('65', '新疆维吾尔自治区', '吐鲁番地区', '3', '6521');
INSERT INTO `m_dd_city_dic` VALUES ('65', '新疆维吾尔自治区', '哈密地区', '3', '6522');
INSERT INTO `m_dd_city_dic` VALUES ('65', '新疆维吾尔自治区', '昌吉回族自治州', '3', '6523');
INSERT INTO `m_dd_city_dic` VALUES ('65', '新疆维吾尔自治区', '博尔塔拉蒙古自治州', '3', '6527');
INSERT INTO `m_dd_city_dic` VALUES ('65', '新疆维吾尔自治区', '巴音郭楞蒙古自治州', '3', '6528');
INSERT INTO `m_dd_city_dic` VALUES ('65', '新疆维吾尔自治区', '阿克苏地区', '3', '6529');
INSERT INTO `m_dd_city_dic` VALUES ('65', '新疆维吾尔自治区', '克孜勒苏柯尔克孜自治州', '3', '6530');
INSERT INTO `m_dd_city_dic` VALUES ('65', '新疆维吾尔自治区', '喀什地区', '3', '6531');
INSERT INTO `m_dd_city_dic` VALUES ('65', '新疆维吾尔自治区', '和田地区', '3', '6532');
INSERT INTO `m_dd_city_dic` VALUES ('65', '新疆维吾尔自治区', '伊犁哈萨克自治州', '3', '6540');
INSERT INTO `m_dd_city_dic` VALUES ('65', '新疆维吾尔自治区', '塔城地区', '3', '6542');
INSERT INTO `m_dd_city_dic` VALUES ('65', '新疆维吾尔自治区', '阿勒泰地区', '3', '6543');
INSERT INTO `m_dd_city_dic` VALUES ('71', '台湾省', '台湾省', '1', '7100');
INSERT INTO `m_dd_city_dic` VALUES ('81', '香港特别行政区', '香港特别行政区', '1', '8100');
INSERT INTO `m_dd_city_dic` VALUES ('82', '澳门特别行政区', '澳门特别行政区', '1', '8200');

-- ----------------------------
-- Table structure for `m_dd_comment`
-- ----------------------------
DROP TABLE IF EXISTS `m_dd_comment`;
CREATE TABLE `m_dd_comment` (
  `id` int(10) NOT NULL,
  `keys` char(10) DEFAULT NULL,
  `value` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_dd_comment
-- ----------------------------
INSERT INTO `m_dd_comment` VALUES ('1', '1', '本机构');
INSERT INTO `m_dd_comment` VALUES ('2', '2', '本机构-存量');
INSERT INTO `m_dd_comment` VALUES ('3', '3', '--');
INSERT INTO `m_dd_comment` VALUES ('4', '4', '存量');

-- ----------------------------
-- Table structure for `m_dd_contract_status`
-- ----------------------------
DROP TABLE IF EXISTS `m_dd_contract_status`;
CREATE TABLE `m_dd_contract_status` (
  `id` int(10) NOT NULL,
  `keys` char(2) DEFAULT NULL COMMENT '债权状态',
  `value` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_dd_contract_status
-- ----------------------------
INSERT INTO `m_dd_contract_status` VALUES ('1', '1', '正常');
INSERT INTO `m_dd_contract_status` VALUES ('2', '2', '结清');
INSERT INTO `m_dd_contract_status` VALUES ('3', '3', '展期');
INSERT INTO `m_dd_contract_status` VALUES ('4', '4', '逾期');
INSERT INTO `m_dd_contract_status` VALUES ('5', '5', '核销');
INSERT INTO `m_dd_contract_status` VALUES ('6', '6', '逾期结清');
INSERT INTO `m_dd_contract_status` VALUES ('7', '9', '其他');

-- ----------------------------
-- Table structure for `m_dd_contract_type`
-- ----------------------------
DROP TABLE IF EXISTS `m_dd_contract_type`;
CREATE TABLE `m_dd_contract_type` (
  `id` int(10) NOT NULL,
  `keys` char(10) DEFAULT NULL COMMENT '贷款类型',
  `value` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='贷款类型字典表';

-- ----------------------------
-- Records of m_dd_contract_type
-- ----------------------------
INSERT INTO `m_dd_contract_type` VALUES ('1', '1', '经营');
INSERT INTO `m_dd_contract_type` VALUES ('2', '2', '消费');
INSERT INTO `m_dd_contract_type` VALUES ('3', '3', '其他');

-- ----------------------------
-- Table structure for `m_dd_cr_status`
-- ----------------------------
DROP TABLE IF EXISTS `m_dd_cr_status`;
CREATE TABLE `m_dd_cr_status` (
  `id` int(10) NOT NULL,
  `keys` char(2) DEFAULT NULL COMMENT '合同状态',
  `value` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_dd_cr_status
-- ----------------------------
INSERT INTO `m_dd_cr_status` VALUES ('1', '10', '签约管理代办');
INSERT INTO `m_dd_cr_status` VALUES ('2', '11', '同意贷款');
INSERT INTO `m_dd_cr_status` VALUES ('3', '12', '拒绝贷款');
INSERT INTO `m_dd_cr_status` VALUES ('4', '13', '延迟贷款');
INSERT INTO `m_dd_cr_status` VALUES ('5', '14', '客户取消');
INSERT INTO `m_dd_cr_status` VALUES ('6', '20', '债券管理代办');
INSERT INTO `m_dd_cr_status` VALUES ('7', '21', '贷款结清');
INSERT INTO `m_dd_cr_status` VALUES ('8', '22', '展期');
INSERT INTO `m_dd_cr_status` VALUES ('9', '23', '正常还款');
INSERT INTO `m_dd_cr_status` VALUES ('10', '30', '催收中');
INSERT INTO `m_dd_cr_status` VALUES ('11', '31', '催收还款中');
INSERT INTO `m_dd_cr_status` VALUES ('12', '32', '恢复正常');
INSERT INTO `m_dd_cr_status` VALUES ('13', '33', '逾期已结清');
INSERT INTO `m_dd_cr_status` VALUES ('14', '34', '协议还款');
INSERT INTO `m_dd_cr_status` VALUES ('15', '35', '核销');
INSERT INTO `m_dd_cr_status` VALUES ('16', '39', '其他');
INSERT INTO `m_dd_cr_status` VALUES ('17', '15', '待审批');

-- ----------------------------
-- Table structure for `m_dd_data_from`
-- ----------------------------
DROP TABLE IF EXISTS `m_dd_data_from`;
CREATE TABLE `m_dd_data_from` (
  `id` int(10) NOT NULL COMMENT '数据来源id',
  `keys` char(2) DEFAULT NULL COMMENT '数据来源',
  `value` varchar(20) DEFAULT NULL COMMENT '数据来源',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_dd_data_from
-- ----------------------------
INSERT INTO `m_dd_data_from` VALUES ('1', '1', '页面');
INSERT INTO `m_dd_data_from` VALUES ('2', '2', '接口');
INSERT INTO `m_dd_data_from` VALUES ('3', '3', '存量页面');
INSERT INTO `m_dd_data_from` VALUES ('4', '4', '存量接口');

-- ----------------------------
-- Table structure for `m_dd_deal_state`
-- ----------------------------
DROP TABLE IF EXISTS `m_dd_deal_state`;
CREATE TABLE `m_dd_deal_state` (
  `id` int(10) NOT NULL,
  `keys` char(2) DEFAULT NULL COMMENT '细节状态',
  `value` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_dd_deal_state
-- ----------------------------
INSERT INTO `m_dd_deal_state` VALUES ('1', '1', '受理中');
INSERT INTO `m_dd_deal_state` VALUES ('2', '2', '本人声明');

-- ----------------------------
-- Table structure for `m_dd_edu`
-- ----------------------------
DROP TABLE IF EXISTS `m_dd_edu`;
CREATE TABLE `m_dd_edu` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `keys` char(10) DEFAULT NULL COMMENT '学历',
  `value` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_dd_edu
-- ----------------------------
INSERT INTO `m_dd_edu` VALUES ('1', '1', '初中及以下');
INSERT INTO `m_dd_edu` VALUES ('2', '2', '高中中专技校');
INSERT INTO `m_dd_edu` VALUES ('3', '3', '大专');
INSERT INTO `m_dd_edu` VALUES ('4', '4', '本科');
INSERT INTO `m_dd_edu` VALUES ('5', '5', '硕士');
INSERT INTO `m_dd_edu` VALUES ('6', '6', '博士及以上');

-- ----------------------------
-- Table structure for `m_dd_guara_type`
-- ----------------------------
DROP TABLE IF EXISTS `m_dd_guara_type`;
CREATE TABLE `m_dd_guara_type` (
  `id` int(10) NOT NULL,
  `keys` char(10) DEFAULT NULL COMMENT '贷款形式',
  `value` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_dd_guara_type
-- ----------------------------
INSERT INTO `m_dd_guara_type` VALUES ('1', '1', '信用');
INSERT INTO `m_dd_guara_type` VALUES ('2', '2', '抵押');
INSERT INTO `m_dd_guara_type` VALUES ('3', '3', '质押');
INSERT INTO `m_dd_guara_type` VALUES ('4', '4', '担保');
INSERT INTO `m_dd_guara_type` VALUES ('5', '5', '保证人');
INSERT INTO `m_dd_guara_type` VALUES ('6', '6', '抵押+保证人');
INSERT INTO `m_dd_guara_type` VALUES ('7', '7', '其他');

-- ----------------------------
-- Table structure for `m_dd_insti_type`
-- ----------------------------
DROP TABLE IF EXISTS `m_dd_insti_type`;
CREATE TABLE `m_dd_insti_type` (
  `id` int(10) NOT NULL,
  `keys` char(10) DEFAULT NULL COMMENT '机构类型',
  `value` varchar(20) DEFAULT NULL COMMENT '机构类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_dd_insti_type
-- ----------------------------
INSERT INTO `m_dd_insti_type` VALUES ('1', '1', '消费金融公司');
INSERT INTO `m_dd_insti_type` VALUES ('2', '2', '银行');
INSERT INTO `m_dd_insti_type` VALUES ('3', '3', '小贷公司');
INSERT INTO `m_dd_insti_type` VALUES ('4', '4', '网贷机构');
INSERT INTO `m_dd_insti_type` VALUES ('5', '9', '其他');

-- ----------------------------
-- Table structure for `m_dd_overdue_reason`
-- ----------------------------
DROP TABLE IF EXISTS `m_dd_overdue_reason`;
CREATE TABLE `m_dd_overdue_reason` (
  `id` int(10) NOT NULL,
  `keys` char(10) DEFAULT NULL COMMENT '逾期原因',
  `value` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_dd_overdue_reason
-- ----------------------------
INSERT INTO `m_dd_overdue_reason` VALUES ('1', '1', '能力下降');
INSERT INTO `m_dd_overdue_reason` VALUES ('2', '2', '恶意拖欠');
INSERT INTO `m_dd_overdue_reason` VALUES ('3', '3', '身份欺诈');
INSERT INTO `m_dd_overdue_reason` VALUES ('4', '4', '逃逸');
INSERT INTO `m_dd_overdue_reason` VALUES ('5', '5', '犯罪入狱');
INSERT INTO `m_dd_overdue_reason` VALUES ('6', '6', '疾病');
INSERT INTO `m_dd_overdue_reason` VALUES ('7', '7', '死亡');
INSERT INTO `m_dd_overdue_reason` VALUES ('8', '9', '其他');

-- ----------------------------
-- Table structure for `m_dd_payment_level`
-- ----------------------------
DROP TABLE IF EXISTS `m_dd_payment_level`;
CREATE TABLE `m_dd_payment_level` (
  `id` int(10) NOT NULL,
  `keys` char(10) DEFAULT NULL COMMENT '延迟时间',
  `value` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_dd_payment_level
-- ----------------------------
INSERT INTO `m_dd_payment_level` VALUES ('1', '1', '小于等于30天');
INSERT INTO `m_dd_payment_level` VALUES ('2', '2', '大于30天小于等于60天');
INSERT INTO `m_dd_payment_level` VALUES ('3', '3', '大于60小于等于90天');
INSERT INTO `m_dd_payment_level` VALUES ('4', '4', '大于90天');

-- ----------------------------
-- Table structure for `m_dd_promise_reson`
-- ----------------------------
DROP TABLE IF EXISTS `m_dd_promise_reson`;
CREATE TABLE `m_dd_promise_reson` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `keys` char(10) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL COMMENT '严重失信行为记录',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_dd_promise_reson
-- ----------------------------
INSERT INTO `m_dd_promise_reson` VALUES ('1', '1', '欺诈');
INSERT INTO `m_dd_promise_reson` VALUES ('2', '2', '逾期超90天');
INSERT INTO `m_dd_promise_reson` VALUES ('3', '3', '恶意拖欠');

-- ----------------------------
-- Table structure for `m_dd_refuse_reason`
-- ----------------------------
DROP TABLE IF EXISTS `m_dd_refuse_reason`;
CREATE TABLE `m_dd_refuse_reason` (
  `id` int(10) NOT NULL,
  `key` char(10) DEFAULT NULL COMMENT '拒绝原因',
  `value` varchar(20) DEFAULT NULL COMMENT '拒绝原因',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_dd_refuse_reason
-- ----------------------------
INSERT INTO `m_dd_refuse_reason` VALUES ('1', '1', '信用额度不够');
INSERT INTO `m_dd_refuse_reason` VALUES ('2', '2', '有逾期行为记录');
INSERT INTO `m_dd_refuse_reason` VALUES ('3', '3', '有严重失信行为记录');
INSERT INTO `m_dd_refuse_reason` VALUES ('4', '4', '非本人申请');
INSERT INTO `m_dd_refuse_reason` VALUES ('5', '5', '身份欺诈');
INSERT INTO `m_dd_refuse_reason` VALUES ('6', '6', '提供虚假材料');
INSERT INTO `m_dd_refuse_reason` VALUES ('7', '7', '偿债能力不足');
INSERT INTO `m_dd_refuse_reason` VALUES ('8', '8', '申请业务暂停');
INSERT INTO `m_dd_refuse_reason` VALUES ('9', '9', '其他原因');

-- ----------------------------
-- Table structure for `m_dd_request_result`
-- ----------------------------
DROP TABLE IF EXISTS `m_dd_request_result`;
CREATE TABLE `m_dd_request_result` (
  `id` int(10) NOT NULL,
  `keys` char(10) DEFAULT NULL COMMENT '审批结果',
  `value` varchar(20) DEFAULT NULL COMMENT '审批结果',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_dd_request_result
-- ----------------------------
INSERT INTO `m_dd_request_result` VALUES ('1', '1', '同意贷款');
INSERT INTO `m_dd_request_result` VALUES ('2', '2', '拒绝贷款');
INSERT INTO `m_dd_request_result` VALUES ('3', '3', '延迟处理');
INSERT INTO `m_dd_request_result` VALUES ('4', '4', '客户取消');
INSERT INTO `m_dd_request_result` VALUES ('5', '9', '其他');
INSERT INTO `m_dd_request_result` VALUES ('6', '0', '待审批');

-- ----------------------------
-- Table structure for `m_dd_req_reason`
-- ----------------------------
DROP TABLE IF EXISTS `m_dd_req_reason`;
CREATE TABLE `m_dd_req_reason` (
  `id` int(10) NOT NULL,
  `keys` char(10) DEFAULT NULL COMMENT '查询目的',
  `value` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_dd_req_reason
-- ----------------------------
INSERT INTO `m_dd_req_reason` VALUES ('1', '1', '进件');
INSERT INTO `m_dd_req_reason` VALUES ('2', '2', '贷中');
INSERT INTO `m_dd_req_reason` VALUES ('3', '3', '催收');
INSERT INTO `m_dd_req_reason` VALUES ('4', '4', '存量');
INSERT INTO `m_dd_req_reason` VALUES ('5', '5', '同意贷款');
INSERT INTO `m_dd_req_reason` VALUES ('6', '6', '拒绝贷款');
INSERT INTO `m_dd_req_reason` VALUES ('7', '7', '延迟处理');
INSERT INTO `m_dd_req_reason` VALUES ('8', '8', '客户取消');
INSERT INTO `m_dd_req_reason` VALUES ('9', '9', '贷款结清');
INSERT INTO `m_dd_req_reason` VALUES ('10', '10', '签约');
INSERT INTO `m_dd_req_reason` VALUES ('11', '20', '其他');

-- ----------------------------
-- Table structure for `m_dd_user_type`
-- ----------------------------
DROP TABLE IF EXISTS `m_dd_user_type`;
CREATE TABLE `m_dd_user_type` (
  `id` int(10) NOT NULL,
  `keys` char(10) DEFAULT NULL COMMENT '用户类型',
  `value` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_dd_user_type
-- ----------------------------
INSERT INTO `m_dd_user_type` VALUES ('1', '1', '超级管理员');
INSERT INTO `m_dd_user_type` VALUES ('2', '2', '机构用户');
INSERT INTO `m_dd_user_type` VALUES ('3', '3', '华道管理员');
INSERT INTO `m_dd_user_type` VALUES ('4', '4', '非会员');

-- ----------------------------
-- Table structure for `overdue_status`
-- ----------------------------
DROP TABLE IF EXISTS `overdue_status`;
CREATE TABLE `overdue_status` (
  `sinoid` varchar(50) NOT NULL COMMENT '本系统唯一标识',
  `col_sn` char(1) NOT NULL DEFAULT '' COMMENT '催收次数',
  `payment_level` int(1) DEFAULT NULL COMMENT '逾期时长',
  `overdue_start_time` datetime DEFAULT NULL COMMENT '逾期开始时间',
  `overdue_reason` char(2) DEFAULT NULL COMMENT '逾期原因（数据字典）',
  `overdue_status_mark` char(2) DEFAULT NULL COMMENT '（逾期）处置状态（数据字典）',
  `sinotime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`sinoid`,`col_sn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of overdue_status
-- ----------------------------

-- ----------------------------
-- Table structure for `paid_monthly_amount`
-- ----------------------------
DROP TABLE IF EXISTS `paid_monthly_amount`;
CREATE TABLE `paid_monthly_amount` (
  `sinoid` varchar(50) NOT NULL COMMENT '本系统唯一标识',
  `paymentNumber` int(5) NOT NULL DEFAULT '0' COMMENT '还款次数',
  `paid_money` decimal(10,2) DEFAULT NULL COMMENT '还款金额',
  `paid_time` datetime DEFAULT NULL COMMENT '还款时间',
  `sinotime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '操作时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`sinoid`,`paymentNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of paid_monthly_amount
-- ----------------------------

-- ----------------------------
-- Table structure for `search_detail`
-- ----------------------------
DROP TABLE IF EXISTS `search_detail`;
CREATE TABLE `search_detail` (
  `report_id` varchar(50) NOT NULL COMMENT '生成的报告编号',
  `sinoid` varchar(50) NOT NULL COMMENT '本系统唯一标识',
  `user_account` varchar(50) DEFAULT NULL COMMENT '查询用户名',
  `req_reason` char(2) DEFAULT NULL COMMENT '查询原因，参见数据字典',
  `result_add` varchar(100) DEFAULT NULL COMMENT '返回结果，pdf的地址',
  `req_time` datetime DEFAULT NULL COMMENT '查询时间',
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `cardid` varchar(20) DEFAULT NULL COMMENT '身份证号',
  `sinotime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`report_id`,`sinoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='报告表';

-- ----------------------------
-- Records of search_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_account` varchar(45) NOT NULL COMMENT '登录名',
  `user_psw` varchar(45) DEFAULT NULL COMMENT '密码',
  `user_name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `user_phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `user_mail` varchar(45) DEFAULT NULL COMMENT '邮箱',
  `insti_code` int(10) DEFAULT NULL COMMENT '机构代码',
  `last_time_login` datetime DEFAULT NULL COMMENT '上次登录时间',
  `user_type` char(1) DEFAULT NULL COMMENT '用户类型',
  `qqnum` varchar(50) DEFAULT NULL COMMENT 'QQ号',
  `islock` varchar(50) DEFAULT NULL COMMENT '是否锁定',
  `user_key` varchar(45) DEFAULT NULL COMMENT '公钥，目前=user_account',
  `user_private` varchar(100) DEFAULT NULL COMMENT '私钥，华道分配',
  PRIMARY KEY (`user_account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('aaa', '310dcbbf4cce62f762a2aaa148d556bd', 'zhangsan', '123', 'java@163.com', '2', '2016-09-14 00:00:00', '3', '234234234', '234', '123456', '23423');
INSERT INTO `user` VALUES ('aaa1', '111', 'qjc', '15010540337', 'java@163.com', '1', '2016-09-14 00:00:00', '2', '534259928', '0', '1234567', '456');
INSERT INTO `user` VALUES ('ccc', '000', 'admin', '123456789', 'bbbb@163.com', '1', '2016-09-14 00:00:00', '1', '51259928', '0', '000000', '111111');
INSERT INTO `user` VALUES ('ddd', '444', 'wwt', '465464', 'wwt@163.com', '2', '2016-09-07 15:19:48', '3', '4562313', '0', '789', '123');
