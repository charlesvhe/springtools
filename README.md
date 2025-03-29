# VSCode 替代 IDEA intelliJ Community 调研

## 背景
随着AI能力越来越强大，IDEA在AI编程领域毫无建树，AI编程工具公司不可能为每个IDE定制插件，同时插件能力有限无法完全控制IDE。越来越多的AI编程工具公司，使用VSCode定制AI IDE，作为Java开发有必要学习使用VSCode来进行开发，以便使用AI IDE提升开发效率，解放生产力。
时下最火的Cursor、国内字节跳动的Trae均为基于VSCode的独立IDE，其他初创AI编码插件也不再支持IDEA。据开源社区反馈与自身实际使用体验，Cursor其效果大大优于Copilot。讯飞AI工程院与教育BG也对其青睐有加。

## 培训前提
* 通读官方文档 1H https://code.visualstudio.com/docs/java/java-tutorial
* 快捷键表 打印粘贴
    * https://code.visualstudio.com/shortcuts/keyboard-shortcuts-windows.pdf
    * https://code.visualstudio.com/shortcuts/keyboard-shortcuts-macos.pdf

## 安装插件列表
* 搜索Extension Pack for Java插件包，按需选择
    * Language Support for Java™ by Red Hat
    * Debugger for Java
    * Maven for Java
    * Project Manager for Java
    * Visual Studio IntelliCode
* Spring Boot Tools 配置文件提示
* Database Client Database/No-SQL管理工具
* httpYac - Rest Client .http文件编辑、API测试工具 https://httpyac.github.io/guide/request.html
* Git Graph 图形化Git工具
* XML by Red Hat    XML自动提示及格式化
* YAML by Red Hat   K8S自动提示，格式化

## 创建Java项目、SpringBoot项目
* CMD+P >java:Create Maven
* https://start.spring.io
* CMD+I AI创建

## 演示Spring配置文件编辑
CMD+P

## 对象搜索跳转、Call/Type Hierarchy、重构

## 万能快捷键 CMD+P ? | CMD+P >

## 演示debug hot code replace
* 搜索配置 hot code replace，改为自动

## 演示条件断点
* 断点上右键
* 配置搜索 Exception Breakpoint: Exception Types填写全限定名，勾选caught exceptions

## 演示调试变量值、WATCH

## 演示启动参数、环境变量

## 缺点
* Maven无法灵活的导入外部类（导入整个目录下的jar），解决方案：使用Gradle作为构建工具
* Maven命令参数配置不便，解决方案：控制台手动输入命令与参数
* WATCH使用不便
* 插件繁多需要自己探索适合自己的
* 某些情况下可能需要逐级注释依赖module，先构建被依赖module，然后clean package

    结论：VSCode具备替代IDEA intelliJ Community能力，主力开发工具可以使用Cursor，在必要时使用IDEA打开同项目同时使用

## Cursor配置Proxy后REST Client插件不兼容
Windows下无问题，集团解决中，开另一个VSCode使用该插件

## Cursor使用技巧
* 通读 https://cursor101.com/zh 4H
* 可以关闭 Features-》Auto-apply to files 避免误覆盖现有代码，多提交git以防本地代码被搞砸
* 熟记两个快捷键 CMD+I 呼叫chat框（全局上下文更广泛），CMD+K inline生成代码（当前上下文更准确）
* 可以将某个子文件夹或多个关联文件拖入到chat框作为上下文，缩小范围
* 可以将官方文档配置到 Features-》Docs 作为上下文，提问时使用@引用进行提问，使用@Web让其联网搜索
* 可以将项目的关键设计放入Notepad，需要时引用作为上下文，使回答更加准确
* 可以配置全局规则Rules，首次启动时会添加 “Always respond in 中文”
* 多使用长句准确描述需求可以产生更好的结果，多让其提建议而不是提命令让其执行，使用多轮对话完善需求
* 多加限定不让其放飞自我 “尽量不大改代码框架的前提下，给出最合适的代码方案” “不要新建类，在当前类里新增方法”

* “非必要不要使用搜索引擎”，优先使用Cursor提问，需要深度探索时再使用搜索引擎
* “通读一次官方文档之后，非必要不要翻官方文档”，优先使用Cursor提问，需要深度探索时再使用阅读官方文档


# IDEA Ultimate替换调研 ----------归档
IDEA Ultimate替换候选IDE：IDEA Community、VS Code

Eclipse生态过于老旧，较新的工具均不支持，因此淘汰：
![Copilot](doc/Copilot.JPG)
![CodeWisperer](doc/CodeWisperer.JPG)

# 典型应用开发工作流
- 新建工程
- 编写代码
- 调试测试 Debug/Profiling/UnitTest
- 代码仓库 Git/SVN
- 数据库管理
- Restful/gRPC接口测试

# IDEA Ultimate/Community、VS Code 对比
<table>
<tr><td>功能</td><td>IDEA Ultimate</td><td>IDEA Community</td><td>VS Code</td></tr>
<tr><td>价格</td><td>US $599/年</td><td>免费</td><td>免费</td></tr>
<tr><td>Java、Groovy、Kotlin、Scala</td><td>支持</td><td>支持</td><td>插件</td></tr>
<tr><td>XML、JSON、YAML、Markdown</td><td>支持</td><td>支持</td><td>插件</td></tr>
<tr><td>Python、Rust</td><td>支持</td><td>插件</td><td>插件</td></tr>
<tr><td>Go</td><td>支持</td><td>不支持</td><td>插件</td></tr>
<tr><td>JavaScript、TypeScript、CSS、Sass、SCSS、Less</td><td>支持</td><td>不支持</td><td>插件</td></tr>
<tr><td>Maven、Gradle、Ant</td><td>支持</td><td>支持</td><td>插件</td></tr>
<tr><td>Git、SVN</td><td>支持</td><td>支持</td><td>支持</td></tr>
<tr><td>Database Tools</td><td>支持</td><td>插件</td><td>插件</td></tr>
<tr><td>Restful Client</td><td>支持</td><td>Postman</td><td>插件</td></tr>
<tr><td>gRPC Client</td><td>Postman</td><td>Postman</td><td>插件</td></tr>
<tr><td>Debugger、Decompiler、Bytecode、UnitTest</td><td>支持</td><td>支持</td><td>支持</td></tr>
<tr><td>Profiling tools</td><td>支持</td><td>jVisualVM</td><td>插件</td></tr>
<tr><td>框架Spring*</td><td>支持</td><td>插件</td><td>插件</td></tr>
<tr><td>框架Micronaut, Quarkus, JPA</td><td>支持</td><td>插件</td><td>插件</td></tr>
<tr><td>模版Thymeleaf, Freemarker, Velocity</td><td>支持</td><td>不支持</td><td>插件</td></tr>
</table>

结论：
- IDEA Ultimate：开发体验最好，费用较高，性价比低，效率提升不如使用Copilot（$100/年）
- IDEA Community：基础Java开发体验与Ultimate版一致，Spring、JPA、Thymeleaf等框架支持由三方插件提供，功能丰富程度较差
- VS Code：基础Java开发体验与IDEA Community版基本一致，多语言支持最好，插件生态非常繁荣，插件配置较繁琐

参考：
https://www.jetbrains.com/products/compare/?product=idea&product=idea-ce

# IDEA Ultimate/Community、VS Code Spring框架支持对比
以IDEA Ultimate为基准，功能满足百分比：
<table>
<tr><td>功能</td><td>IDEA Ultimate</td><td>IDEA Community</td><td>VS Code（Spring官方SpringTools4插件）</td></tr>
<tr><td>SpringBoot工程创建</td><td>100%</td><td>在线start.spring.io（100%）或 bootify.io（200%）</td><td>100%</td></tr>
<tr><td>代码提示</td><td>100%</td><td>具备基础代码补全，无自动添加Spring注解功能（90%）</td><td>100%</td></tr>
<tr><td>代码导航</td><td>100%</td><td>具备基础类、对象跳转，无Bean依赖图（90%）</td><td>具备基础类、对象跳转，无Bean依赖图（90%）</td></tr>
<tr><td>通过Endpoints/Bean列表跳转到代码</td><td>100%</td><td>无</td><td>100%</td></tr>
<tr><td>一键运行</td><td>100%</td><td>配置Main函数入口（100%）</td><td>100%</td></tr>
<tr><td>Actuator Endpoints列表</td><td>100%</td><td>访问/actuators（100%）</td><td>访问/actuators（100%）</td></tr>
<tr><td>application.properties/yaml补全</td><td>100%</td><td>wl Spring Assistant插件（100%）</td><td>（100%）</td></tr>
<tr><td>通过Endpoints下拉列表发送测试Restful请求</td><td>100%</td><td>Postman手写URL（95%）</td><td>Rest Client插件手写URL（95%）</td></tr>
<tr><td>数据库管理工具</td><td>100%</td><td>Database Navigator插件，无JPA生成，bootify.io在线生成（90%）</td><td>Database Client插件，无JPA生成，bootify.io在线生成（90%）</td></tr>
</table>

结论：
- IDEA Ultimate：提供的原生Spring框架支持功能较为鸡肋
- IDEA Community：可通过插件或三方工具达到Ultimate版95%的效率
- VS Code：Spring官方提供SpringTools4插件，可达到IDEA Ultimate版99%的效率

参考：
https://lp.jetbrains.com/intellij-idea-spring/
https://spring.io/tools

# IDEA Community、VS Code 进行Spring开发工作流插件/软件

## IDEA Community
- 新建项目工程：在线项目生成 start.spring.io，bootify.io 可生成全套Controller、Service、JPARepository
- 编写代码：Spring配置提示wl Spring Assistant，快捷键提示 Key promoter X；代码静测/规范检查 Alibaba Java Coding Guidelines；FindBugs
- 调试测试 Debug/Profiling/UnitTest：JDK 自带jVisualVM软件；MAT（Memory Analyzer Tool）软件
- 代码仓库 Git/SVN：Git Commit Template
- 数据库管理：Database Navigator
- Restful/gRPC接口测试：Postman软件

## VS Code
- 安装语言插件包：Extension Pack for Java
- 安装Spring官方插件包（STS4）：Spring Boot Extension Pack
- 新建项目工程：STS4插件自带，或在线项目生成 start.spring.io，bootify.io 可生成全套Controller、Service、JPARepository
- 编写代码：代码静测/规范检查 Alibaba Java Coding Guidelines；各种转码、加密小工具（可自定义脚本）Swissknife
- 调试测试 Debug/Profiling/UnitTest：JDK 自带jVisualVM软件；MAT（Memory Analyzer Tool）软件
- 代码仓库 Git/SVN：Git Graph
- 数据库管理：Database Client
- Restful/gRPC接口测试：REST Client

结论：
- IDEA Community可完全取代IDEA Ultimate进行Spring开发，效率无明显下降（统计口径：本人近10年IDEA Community使用经验结论，以及医疗十几名P3、P4研发，开源社区、技术社群调研，平安集团已全员使用）
- 在本身从事多语言开发，对VS Code使用熟练度较高的情况下，可以尝试使用VS Code开发Java/Spring项目，与IDEA Community比效率无明显下降，部分场景有效率提升（本人3个月试用经验，丰富的插件可提升效率，开源社区、技术社群调研国内较少使用开发Java）
- Eclipse已经淘汰，很少使用（开源社区、技术社群调研）
