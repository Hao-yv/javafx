

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `countID` int(11) NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `UserType` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 1001, '1001', '1001', 'student');
INSERT INTO `users` VALUES (2, 1002, '1002', '1002', 'student');
INSERT INTO `users` VALUES (3, 1003, '1003', '1003', 'student');
INSERT INTO `users` VALUES (4, 1004, '1004', '1004', 'student');
INSERT INTO `users` VALUES (5, 1005, '1005', '1005', 'teacher');
INSERT INTO `users` VALUES (6, 1006, '1006', '1006', 'teacher');
INSERT INTO `users` VALUES (7, 1007, '1007', '1007', 'teacher');
INSERT INTO `users` VALUES (8, 1007, '1008', '1008', 'admin');

SET FOREIGN_KEY_CHECKS = 1;
