# First_computer_course
## 程序猿训练营

### 基础部分

1. C语言与操作系统 编程入门
2. 使用java解决常见算法笔试题

## 环境搭建
这里使用VS Code 进行编程的学习
使用VS Code的优点有如下几条：
* 丰富的插件支持，可以支持多种编程语言
* 调试方便，变量信息一览无余。
* 有代码高亮、补全功能
* 这个很重要，界面很好看
* 安装包只有60M不到，体积小 启动快


### 1. c语言环境

由于VS Code本身只是编辑器，所以搭建开发环境前，需要下载好[MinGW](https://osdn.net/projects/mingw/downloads/68260/mingw-get-setup.exe/)。*将mingw写入系统环境变量*，在c语言文件所在文件夹打开cmd命令行，输入：

```bash
gcc test.c -o test.exe // 编译生成对应的.exe文件

执行test.exe 文件
```

VS Code安装C的插件C/C++ for Visual Studio Code(在VSCode中按Ctrl + Shift + X，搜索安装一下即可)，

### 2. java 环境

同样需要安装java的编译器和jdk，并写入环境变量中,保证下面的命令可以正常执行```java -version```

安装maven，并写入环境变量，保证```mvn -v```可以正常执行

在VScode中安装java的插件 Java Extension Pack 在命令行输入

```bash
javac Hello.java
java Hello 
```

