# TEST TO JOIN PROJECT

该项目主要为有意愿加入本团队的人提供测试和加入报名的渠道，部分测试完成后内容需要上传至数据库，并发送一份副本至管理员邮箱。

## 项目执行人

总负责人: **Silence_Lurker潜默**

前端负责人：**John Sii**

## 项目说明

项目的目的是进行打算加入的人员的考核，对人员的能力进行评估分析，除基础客观题以外，剩下的题均由管理组进行评估并最终给出能力的判断。

## 项目分析

（2023.01.12  Silence_Lurker）根据当前的项目分析，主要有三类对象：

- 需求人员类型
- 加入者
- 考核信息
- 管理员

后端服务需要发送邮件提醒管理组用户有新的用户提交了考核信息。

需要的功能：

- 邮件发送
- 数据的接收与保存
- 文件加密接收发送

<!-- start -- 以下部分非代码实现需要 -- start -->

需要的人才：

- 项目设计师
- UI设计师（不需要代码基础，但需要对自己的设计有足够的了解）
- 前端工程师

所有人需要的能力：

- 团队合作能力
- 学习能力
- 不钻牛角尖（否则容易使项目无法对接）
- 有编写文档的能力

<!-- end -- 以上部分非代码实现需要 -- end -->

### 成员及对象具体分析

#### 需求人员类型(Job)

| 属性 | 数据类型 | 描述 | require |
| -- | -- | -- | -- |
| id(key) | Integer | 目标加入类型 | true |
| name | String | 类型名称 | true |
| description | String | 描述 | true |

#### 加入者（Player）

| 属性 | 数据类型 | 描述 | require |
| -- | -- | -- | -- |
| id | UUID(String) | 用户的独立ID | true |
| email | String(255) | 用户邮箱 | false |

#### 考核信息（Question）

| 属性 | 数据类型 | 描述 | require |
| -- | -- | -- | -- |
| id | UUID(String) | 考核信息的独立ID | true |
| question | String | 考核题干信息 | true |
| answer | String(File) | 考核题目解答 | true |
| true_answer | String(File) | 题目标准答案 | true |
| score | double(.2) | 考核结果评分 ***(初始传递值默认为0.0，若非0.0则直接拒收数据但不提示)***  | false |
| type | String | 考核题目类型 | true |

#### 管理员（Admin） ~~（或者叫评分员？）~~

| 属性 | 数据类型 | 描述 | require |
| -- | -- | -- | -- |
| id | UUID(String) | 管理员的独立ID | true |
| email | String(255) | 管理员的邮箱 | true |
| random_key | UUID(String) | 登录用随机秘钥 | false |

## 接口信息

以配置路径为基础设置的对应URL的信息和返回值

### 目标信息

> GET /api/test

获取基础数据信息

Request:None

返回数据：

```json
{
    "code": ,//状态码
    "data":{
        //Job对象数组
        "jobs":[
            {
                "id":,// job的id信息，用作提交选单获取对应的题目
                "name":"",// job的类型（名称），用作页面显示
                "description":""// job负责工作类型和需求的描述
            },
            {
                "id":,// job的id信息，用作提交选单获取对应的题目
                "name":"",// job的类型（名称），用作页面显示
                "description":""// job负责工作类型和需求的描述
            }
            // 以此类推………………
        ]

    }
}
```

### 题干信息

> GET /api/test

获取题干信息

Request:

| 属性 | 数据类型 | 描述 | require |
| -- | -- | -- | -- |
| jid | Integer | Job ID | true |

返回数据：

```json
{
    "code":,// 状态码
    "data":{
        "question":{
            
        }
    }
}
```

## 项目进度

### 2023.01.12

项目立项，编写项目文档和接口文档，确立当前需求人物信息

### 2023.01.14

完善API信息，等待前端设计文档进行对接
