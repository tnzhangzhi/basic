# basic
spring脚手架
springmvc 脚手架 
备用

2017-07-19 集成了动态数据源和mybatis

2017-07-20 1:57 集成了rabbitmq

2017-07-20 5:20 集成了dubbo ,services为服务module，basic_spring依赖service，提供dubbo服务，basic_springmvc 依赖services的API，调用basic_spring的服务(遇到同一个tomcat启动dubbo服务和消费问题，修改部署方式可以解决)