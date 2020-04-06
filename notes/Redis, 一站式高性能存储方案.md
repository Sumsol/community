## Spring整合Redis
pom.xml中添加jar包 -> application.properties中配置RedisProperties -> config中编写RedisConfig配置类 -> 创建RedisTests.java测试类

## 点赞
创建RedisKeyUtil工具类 -> 创建LikeSevice类 -> 创建LikeController类 -> 修改discuss-detail.html -> 创建discuss.js -> HomeController中添加显示赞功能 -> DiscussPostController中添加显示赞功能

## 我收到的赞
RedisKeyUtil中添加getUserLikeKey -> LikeService中重构like方法，添加findUserLikeCount方法 -> 修改LikeController的like方法 -> 修改discuss-detail.html和discuss.js方法 -> UserController中添加getProfilePage方法 -> 修改profile.html

## 关注、取消关注
RedisKeyUtil中添加getFolloweeKey和getFollowerKey方法 -> 创建FollowService类 -> 创建FollowController类 -> 修改profile.js -> FollowService中添加新方法 -> 修改profile.html

