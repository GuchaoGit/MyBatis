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

## 配置文件
* configuration 配置
* properties 属性
  * 首先读取properties元素体内指定的属性
  * 然后根据 properties 元素中的 resource 属性读取类路径下属性文件或根据 url 属性指定的路径读取属性文件，并覆盖已读取的同名属性
  * 最后读取作为方法参数传递的属性，并覆盖已读取的同名属性
```
<properties resource="config.properties"/>
```
* settings 设置  
[settings](https://mybatis.org/mybatis-3/zh/configuration.html#settings) 是 MyBatis 极为重要的设置，它们会改变 MyBatis 的运行时行为，如开启二级缓存、开启延迟加载等
* typeAliases 类型别名  
[MyBatis中内建的别名](https://mybatis.org/mybatis-3/zh/configuration.html#typeAliases)
* [typeHandlers](https://mybatis.org/mybatis-3/zh/configuration.html#typeHandlers) 类型处理器  
作用是实现 JDBC 类型和 Java 类型的之间的转换
* objectFactory 对象工厂
* plugins 插件
* environments 环境
  * environment 环境变量
  * transactionManager 事务管理器 两种[JDBC|MANAGED]
* databaseIdProvider 数据库厂商标识
* mappers 映射器
  * 通过resource加载单个映射文件  <mapper resource="com/guc/mybatis/mapper/UserMapper.xml"/>
  * 通过 mapper 接口对象加载单个映射文件   <mapper class="com.guc.mybatis.mapper.UserMapper"/>
  * 通过完全限定资源定位符   <mapper url="file:///E:/IdeaProjects/mybatis/src/main/java/com/guc/mybatis/mapper/UserMapper.xml"/>
  * 通过mapper接口包加载整个包的映射文件   <package name="com.guc.mybatis.mapper"/>
  
## 映射文件[Mapper](https://mybatis.org/mybatis-3/zh/sqlmap-xml.html)
映射文件的顶级元素
* cache:给定命名空间的缓存配置
* cache-ref:其他命名空间缓存配置的引用。
* resultMap:描述如何从数据库结果集中来加载对象。
* sql:可被其他语句引用的可重用语句块。
```
<sql id="selectAllUser">
    select * from user
</sql>

<select id="selectUserById" parameterType="int" resultType="User">
     <include refid="selectAllUser"/>
            where id=#{id}
</select>
```
* insert/update/delete/select 映射插入、更新、删除、查询语句。
