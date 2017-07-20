# basic
spring脚手架
springmvc 脚手架 
备用

2017-07-19 集成了动态数据源和mybatis

2017-07-20 1:57 集成了rabbitmq

2017-07-20 5:20 集成了dubbo 遇到了tomcat7 版本 memery leak bug问题，改为tomcat8启动正常,services为服务module，basic_spring依赖service的服务，提供dubbo服务，basic_springmvc 依赖services的API，调用basic_spring的服务