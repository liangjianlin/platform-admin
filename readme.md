# API 集成平台
## 技术架构
 - spring boot
 - Restful API
### 项目模块化
 - web
 - order
 - user
 - redis
 - product
 - analysis
 - common-service-facade
## 客户端接入
 - 客户端从服务端获取分配的clientName和clientToken
 - 客户端所有的请求需要带上以下的参数
  > client 客户端 
  > signature 签名由服务器分配的客户端Token、nonce、timestamp 存放到一个数组进行字典排序后sha1获取的字符串 
  > nonce 随机字符串 
  > timestamp 请求当前时间的时间戳