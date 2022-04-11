# TDD @FizzBuzz

## 开发环境
 - JDK11+
 
## 业务目标

### FizzBuzz
设计一个程序，该程序能打印1到100之间的数字，包含1，100。
- Given 需要打印的数字是6（3的倍数），When 打印，Then 打印`"Fizz"`
- Given 需要打印的数字是10（5的倍数），When 打印，Then 打印`"Buzz"`
- Given 需要打印的数字是15（同时是3和5的倍数），When 打印，Then 打印`"FizzBuzz"`
- Given 需要打印的数字是2（不是3或者5的倍数），When 打印，Then 打印`"2"`
- Given 需要打印的数字是100（超出限制），When 打印，Then 抛出异常

## Tasking

| Task | Input | Output |
|:---|:---|:---|
| 1 | 15, 30, 45, 60, 75, 90 |  `"FizzBuzz"` |
| 2 | 3, 6, 12, 18, 21, 99 |  `"Fizz"` |
| 3 | 5, 10, 20, 85, 95, 100 |  `"Buzz"` |
| 4 | 1, 2, 4, 94, 97, 98 |  `"1"`, `"2"`, `"4"`, `"94"`, `"97"`, `"98"` |
| 5 | 0, 101 |  `IllegalArgumentException` |


## 编码路线
`master`分支一共有5个tag（`Task1`，`Task2`，`Task3`，`Task4`，`Task5`），它们分别对应5个Task。Clone下代码库之后，`checkout`到最开始的提交，一步一步往后面`checkout`即可查看所有步骤，`Task4`与`Task5`之间有1次Refactor的`commit`。


## 参考资料
- [JUnit 5用户指南](https://gitee.com/liushide/junit5_cn_doc/blob/master/junit5UserGuide_zh_cn.md#https://gitee.com/link?target=https%3A%2F%2Fgithub.com%2Fjunit-team%2Fjunit5-samples%2Ftree%2Fr5.0.2%2Fjunit5-gradle-consumer)
- [Gradle 用户指南](https://docs.gradle.org/current/userguide/userguide.html)