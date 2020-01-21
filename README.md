# MyBatis
MyBatis框架基础
## MyBatis优点
* 简单小巧易于上手，方便浏览修改 SQL 语句
* 解除 SQL 与程序代码的耦合
* 提供映射标签，支持对象与数据库的 ORM 字段关系映射
* 提供 xml 标签，支持编写动态 SQL  
Mybatis 也是基于 JDBC 的。Java 与数据库操作仅能通过 JDBC 完成。 Mybatis 和 Hibernate 都屏蔽 JDBC API 的底层访问细节，使我们不用于 JDBC API 打交道就可以访问数据库。但是，Hibernate 是全自动的 ORM 映射工具，可以自动生成 SQL 语句，Mybatis 需要在 xml 配置文件中写 SQL 语句；因为 Hibernate 是自动生成 SQL 语句的，在写复杂查询时，Hibernate 实现比 Mybatis 复杂的多  

## 入门程序
* 配置文件mybatis.cfg.xml
* 实体类User
* 创建方法接口UserMapper和定义映射文件UserMapper.xml
* 日志记录log4j.properties
* 测试运行
