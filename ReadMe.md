# 诗与远方

在JAVA程序员路上，自己还是个小学生，希望自己能够在学习的路上

坚持到底、自律、执行力，为了诗与远方，脚踏实地。
## 更新记录
1. 集成JPA
2. 集成shiro.
    * 访问http://localhost:7000/login1.JPG 可以看到登录成功返回token
        
        {
            "code": 0,
            "msg": "SUCCESS",
            "data": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE1MjMyNzgzNTMsInVzZXJuYW1lIjoiemhiIn0.CvNmIPF_dDTFdW18lvoAUpjQ5D1Re--v3T62wHOLDPo"
        }
        
        * 访问http://localhost:7000/auth2.JPG 可以看到认证成功
        
        {
            "code": 0,
            "msg": "You are authenticated",
            "data": null
        }
3. 集成JPA
    具体参考链接
    
    [Shiro+JWT+Spring Boot Restful简易教程](https://juejin.im/post/59f1b2766fb9a0450e755993)