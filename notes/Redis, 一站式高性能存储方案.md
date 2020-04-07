## Spring整合Redis
pom.xml中添加jar包 -> application.properties中配置RedisProperties -> config中编写RedisConfig配置类 -> 创建RedisTests.java测试类

## 点赞
创建RedisKeyUtil工具类 -> 创建LikeSevice类 -> 创建LikeController类 -> 修改discuss-detail.html -> 创建discuss.js -> HomeController中添加显示赞功能 -> DiscussPostController中添加显示赞功能

## 我收到的赞
RedisKeyUtil中添加getUserLikeKey -> LikeService中重构like方法，添加findUserLikeCount方法 -> 修改LikeController的like方法 -> 修改discuss-detail.html和discuss.js方法 -> UserController中添加getProfilePage方法 -> 修改profile.html

## 关注、取消关注
RedisKeyUtil中添加getFolloweeKey和getFollowerKey方法 -> 创建FollowService类 -> 创建FollowController类 -> 修改profile.js -> FollowService中添加新方法 -> 修改profile.html

## 关注列表、粉丝列表
FollowService中添加findFollowers和findFollowees方法 -> FollowController中添加getFollowees和getFollowers方法 -> 修改profile.html -> 修改followee.html和follower.html 

## 优化登录模块
RedisKeyUtil中添加getKaptchaKey方法 -> LoginController中重构getKaptcha和login方法
RedisKeyUtil中添加getTicketKey方法 -> 不推荐使用LoginTicketMapper -> 重构UserServer中的相关方法
RedisKeyUtil中添加getUserKey方法 -> UserServier中添加缓存方法和修改相应方法