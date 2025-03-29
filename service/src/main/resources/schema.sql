CREATE TABLE `config_meta` (
  `id` SERIAL,
  `app_id` VARCHAR(64) NOT NULL,
  `code` VARCHAR(64) NOT NULL,
  `property` VARCHAR(64) NOT NULL,
  `column_name` VARCHAR(64) NOT NULL,
  `description` VARCHAR(128) DEFAULT '' ,
  `sort` SMALLINT DEFAULT '0',
  `gmt_create` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  `gmt_modified` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
);

CREATE TABLE `config_item` (
  `id` SERIAL,
  `app_id` VARCHAR(64) NOT NULL,
  `meta_code` VARCHAR(64) NOT NULL,
  `parent_id` BIGINT DEFAULT '0',
  `sort` SMALLINT DEFAULT '0',
  `varchar1` VARCHAR(512) DEFAULT '',
  `varchar2` VARCHAR(512) DEFAULT '',
  `varchar3` VARCHAR(512) DEFAULT '',
  `varchar4` VARCHAR(512) DEFAULT '',
  `varchar5` VARCHAR(512) DEFAULT '',
  `text1` TEXT,
  `text2` TEXT,
  `text3` TEXT,
  `decimal1` DECIMAL(19,4) DEFAULT '0.0000',
  `decimal2` DECIMAL(19,4) DEFAULT '0.0000',
  `decimal3` DECIMAL(19,4) DEFAULT '0.0000',
  `timestamp1` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  `timestamp2` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  `timestamp3` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  `gmt_create` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  `gmt_modified` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
);

COMMIT;

INSERT INTO `config_meta` VALUES
(1,'platform','userType','code','varchar1','类型编码',10,'2018-05-10 17:54:31','2018-05-10 21:14:08'),
(2,'platform','userType','name','varchar2','类型名',20,'2018-05-10 17:54:31','2018-05-10 21:14:08'),
(3,'platform','userType','description','varchar3','说明',30,'2018-05-10 17:54:31','2018-05-10 20:32:23'),
(4,'platform','userType','img','varchar4','图标',40,'2018-05-10 17:54:31','2018-05-10 20:32:23');

INSERT INTO `config_item`(`id`, `app_id`, `meta_code`, `varchar1`, `varchar2`, `varchar3`, `varchar4`, `gmt_create`, `gmt_modified`) VALUES
(1,'platform','userType','user','普通用户','刚注册还未认证用户','1.jpg','2018-05-10 17:54:31','2018-05-10 21:14:08'),
(2,'platform','userType','member','会员','已认证用户','2.jpg','2018-05-10 17:54:31','2018-05-10 21:14:08'),
(3,'platform','userType','VIP1','铜牌会员','铜牌会员','3.jpg','2018-05-10 17:54:31','2018-05-10 21:14:08'),
(4,'platform','userType','VIP2','银牌会员','银牌会员','4.jpg','2018-05-10 17:54:31','2018-05-10 21:14:08'),
(5,'platform','userType','VIP3','金牌会员','金牌会员','5.jpg','2018-05-10 17:54:31','2018-05-10 21:14:08'),
(6,'platform','userType','VVIP','VVIP','VVIP','6.jpg','2018-05-10 17:54:31','2018-05-10 21:14:08');

COMMIT;
