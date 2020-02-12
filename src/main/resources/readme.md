### 数据库文件
#### 创建表
```sql
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nick_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
);
DROP TABLE IF EXISTS `product_comment`;
CREATE TABLE `product_comment`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(11) NULL DEFAULT NULL,
  `user_id` int(11) NULL DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ;
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `cover_image` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `price` decimal(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) 
```
#### 初始化数据
```sql
INSERT INTO `user` VALUES (1, 'zs', 'aqweqwe');
INSERT INTO `user` VALUES (2, 'ls', 'aqweqwe');
INSERT INTO `user` VALUES (3, 'ww', 'aqweqwe');
INSERT INTO `user` VALUES (4, 'ws', 'aqweqwe');

INSERT INTO `product` VALUES (1, '商品1', 'xxx', 2.00);
INSERT INTO `product` VALUES (2, '商品2', 'xxx', 2.00);
INSERT INTO `product` VALUES (3, '商品3', 'xxx', 2.00);
INSERT INTO `product` VALUES (4, '商品4', 'xxx', 2.00);

INSERT INTO `product_comment` VALUES (1, 1, 1, 'xxsa', '2020-02-12 15:23:35');
INSERT INTO `product_comment` VALUES (2, 2, 3, 'xxsa', '2020-02-12 15:23:35');
INSERT INTO `product_comment` VALUES (3, 3, 4, 'xxsa', '2020-02-12 15:23:35');
INSERT INTO `product_comment` VALUES (4, 4, 1, 'xxsa', '2020-02-12 15:23:35');
INSERT INTO `product_comment` VALUES (5, 1, 2, 'xxsa', '2020-02-12 15:23:35');

```