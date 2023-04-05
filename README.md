# Java2023

## 开始

### 配置开发环境

Java是一种广泛使用的编程语言，许多开发人员使用Java来创建各种各样的应用程序和系统。要开始使用Java进行开发，您需要设置开发环境。

下面是设置Java开发环境的步骤：

下载JDK：首先，您需要下载并安装Java开发工具包（JDK）。可以在Oracle官网上下载JDK。

安装JDK：下载完成后，请按照安装向导的指示安装JDK。

配置环境变量：安装JDK后，您需要将Java的安装路径添加到系统环境变量中。这可以通过编辑系统变量来完成。

配置环境变量是设置Java开发环境中非常重要的步骤之一，因为环境变量可以让操作系统知道Java安装在哪个路径下。在Windows系统中，您可以按照以下步骤设置Java环境变量：

1. 打开控制面板：点击“开始”菜单，然后在菜单中找到“控制面板”，点击进入。
2. 打开“系统”：在控制面板中，找到“系统和安全”选项，然后点击“系统”。
3. 点击“高级系统设置”：在“系统”页面中，找到“高级系统设置”选项，然后点击。
4. 打开“环境变量”：在“高级”选项卡下，找到“环境变量”按钮，并点击打开环境变量设置页面。
5. 设置系统变量：在环境变量设置页面中，可以看到“系统变量”和“用户变量”两个选项卡。为了设置Java环境变量，需要在“系统变量”中找到“Path”变量，并点击“编辑”。
6. 添加Java安装路径：在编辑系统变量页面中，点击“新建”按钮，并输入Java安装路径。Java安装路径通常是在“C:\Program Files\Java\jdk(version)\bin”目录下，其中(version)表示Java版本号。例如，如果您安装的是Java 16，则路径为“C:\Program Files\Java\jdk-16\bin”。
7. 保存设置：完成Java路径的添加后，点击“确定”按钮，然后关闭所有打开的对话框，以保存环境变量设置。

安装集成开发环境（IDE）：集成开发环境（IDE）是编写、调试和测试Java代码的工具。有许多流行的Java IDE可供选择，例如Eclipse和IntelliJ IDEA。

IntelliJ IDEA是一种流行的Java集成开发环境（IDE），它可以帮助开发人员编写、调试和测试Java代码。下面是在Windows系统上安装IntelliJ IDEA的步骤：

1. 下载IntelliJ IDEA：首先，您需要从官方网站上下载IntelliJ IDEA的安装文件。进入官网 <https://www.jetbrains.com/idea/download/> ，选择适合您系统的版本并下载。
2. 运行安装程序：下载完成后，双击安装程序并按照向导中的指示进行安装。
3. 启动IntelliJ IDEA：安装完成后，您可以在“开始”菜单中找到IntelliJ IDEA的快捷方式，双击打开应用程序。
4. 配置IntelliJ IDEA：当您第一次启动IntelliJ IDEA时，系统将提示您选择一些配置选项，例如语言、主题和快捷键等。根据自己的喜好进行设置即可。
5. 创建新项目：在IntelliJ IDEA中，您可以创建新的Java项目。点击“File”菜单，选择“New”->“Project”，然后选择Java项目类型。在弹出的窗口中，输入项目名称和存储位置，然后点击“Finish”按钮。
6. 编写Java代码：完成项目创建后，您可以开始编写Java代码。在IntelliJ IDEA中，可以创建Java文件、类和方法，并使用自动补全和其他辅助功能来编写高质量的代码。
7. 运行Java代码：完成代码编写后，您可以使用IntelliJ IDEA来运行和测试Java代码。在IntelliJ IDEA的工具栏中，有一个“Run”按钮，可以用来运行当前项目或文件。您也可以通过快捷键“Shift+F10”来运行代码。

以上是在Windows系统上安装和使用IntelliJ IDEA的基本步骤。IntelliJ IDEA是一种功能强大的Java IDE，还有许多其他的高级特性和插件可供使用。希望这些信息能够帮助您开始使用IntelliJ IDEA进行Java开发。

### 解剖Java程序

Java程序由一系列的类、方法、变量和语句组成。以下是Java程序的主要组成部分：

1. 类：Java程序由一个或多个类组成。每个类代表着一个独立的代码单元，并且包含了该代码单元的属性和方法。Java程序中的每个类都必须有一个类名，并且该类名与文件名相同（带有.java扩展名）。
2. 方法：类中的方法是执行特定任务的代码块。Java程序中的每个方法都必须有一个方法名，并且可以包含一些可选的参数和返回值类型。方法可以被其他方法调用，也可以被Java程序的外部调用。
3. 变量：变量是用于存储数据的容器。Java程序中的变量可以是基本数据类型（如整数、浮点数、字符和布尔值）或引用数据类型（如类、数组和接口等）。变量必须先声明，然后才能被使用。
4. 语句：Java程序中的语句用于执行特定的操作，例如分支语句（if、switch）、循环语句（for、while）、跳转语句（break、continue）和异常处理语句（try、catch）等。语句可以被组合在一起，形成复杂的程序逻辑。

Java程序通常遵循以下基本结构：

```java
public class MyClass {
    // 成员变量声明
    // 构造方法
    // 成员方法
    public static void main(String[] args) {
        // 程序入口点
    }
}
```

其中，类定义了程序的基本属性和方法；main()方法是程序的入口点，程序将从该方法开始执行；成员变量和成员方法定义了类的特定行为和数据。

Java程序的解剖涵盖了Java程序的基本结构和组成部分，为程序员提供了一个良好的基础，使他们能够编写高质量的Java代码。

### 第一个Java程序

下面我们将在IntelliJ IDEA环境下编写第一个Java程序的演示步骤：

启动IntelliJ IDEA并创建新项目。点击IntelliJ IDEA主界面上的“Create New Project”按钮，选择Java选项，然后选择Java SDK版本和项目类型。在“Project name”字段中输入项目名称，然后单击“Finish”按钮创建新项目。

创建新的Java类。在IntelliJ IDEA项目中创建新的Java类。右键单击项目名称，选择“New”>“Java Class”选项。在弹出的对话框中输入类名，然后单击“OK”按钮。这将创建一个新的Java类文件并打开编辑器。

编写Java代码。在新的Java类文件中，输入Java代码以实现所需的功能。例如，以下代码将打印“Hello World！”到控制台：

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

运行程序。在编辑器中右键单击Java类文件，然后选择“Run HelloWorld.main()”选项。这将编译和运行程序，并在控制台中输出“Hello World！”。
恭喜，您已经成功地在IntelliJ IDEA环境下编写和运行了第一个Java程序。在此基础上，您可以继续学习Java编程，并探索更多高级功能和技术。

### Java代码是如何执行的

Java代码执行过程可以分为以下几个步骤：

1. 编写代码：程序员使用Java编程语言编写代码，将程序的业务逻辑和行为转换为可执行的Java代码。
2. 编译代码：编译器将Java源代码翻译成Java字节码文件，这些文件包含了程序的执行指令和数据。
3. 类加载：Java虚拟机（JVM）将Java字节码文件加载到内存中，并解析字节码文件中的类、方法、变量和其他数据结构。
4. 字节码验证：Java虚拟机对字节码进行验证，以确保字节码文件的完整性和安全性。这个过程涉及对字节码的格式、语法和语义进行检查，以防止字节码文件包含恶意代码或其他安全漏洞。
5. 字节码解释：Java虚拟机对字节码进行解释，将其转换为机器代码并执行。Java虚拟机具有自己的指令集和执行引擎，它可以在不同的硬件和操作系统平台上运行Java程序。
6. 运行程序：Java程序在Java虚拟机上运行，它可以调用其他类和库来实现更复杂的功能和业务逻辑。Java程序可以在控制台、图形界面或Web应用程序中运行，并与用户交互。
7. 垃圾回收：Java虚拟机通过垃圾回收机制自动管理内存，释放不再使用的对象和数据，以确保程序的性能和稳定性。

总体来说，Java程序的执行过程是由Java编译器、Java虚拟机和运行时库等组件共同协作完成的。Java虚拟机作为Java程序的执行引擎，提供了一个安全、可移植和高效的运行环境，使得Java程序可以在不同的平台上运行，并具有良好的可维护性和扩展性。

<img src="/images/001.png" style="width:400px">

### 关于Java的一些趣事

以下是一些关于Java编程语言的趣事：

1. Java的名字最初是Oak，取自于创始人詹姆斯·高斯林（James Gosling）办公室外的一棵橡树，但是由于Oak已经被注册为商标，所以后来改名为Java。
2. Java的标志是一杯咖啡，这是由于Java在诞生时，它的创始人詹姆斯·高斯林（James Gosling）和他的团队经常在加拿大温哥华的一家咖啡店里开会。
3. Java语言的创始人詹姆斯·高斯林（James Gosling）在开发Java语言时曾经考虑过使用C++语言，但是由于C++语言在内存管理方面存在缺陷，他最终选择了开发一种新的语言。
4. Java语言中有一个特殊的类叫做“HelloWorld”，这个类通常用于演示新手如何编写Java程序，并输出“Hello, World!”。
5. Java语言是目前世界上应用最广泛的编程语言之一，几乎涵盖了所有领域，从手机应用到企业级应用，再到科学计算和物联网等等。

## 类型

### 指南

这一节我们将开始学习Java的变量及类型，它们包括以下几个方面：

1. 变量：Java中的变量用于存储数据，在程序运行期间可以改变其值。变量需要先声明，然后才能使用。变量的声明包括变量的名称和类型。
2. 基本数据类型：Java中的基本数据类型有八种，包括整型（byte、short、int、long）、浮点型（float、double）、字符型（char）和布尔型（boolean）。每种基本数据类型都有其特定的范围和取值方式。
3. 引用数据类型：Java中的引用数据类型包括类、接口、数组和枚举。引用数据类型指向对象的内存地址，而不是对象本身的值。Java程序员可以创建自己的引用数据类型。
4. 类型转换：Java中的类型转换包括自动类型转换和强制类型转换。自动类型转换是指在不丢失数据的情况下，将一个数据类型转换为另一个数据类型；而强制类型转换是指在可能会丢失数据的情况下，将一个数据类型转换为另一个数据类型。
5. 变量作用域：Java中的变量作用域指的是变量的可见范围。变量的作用域取决于变量的声明位置和声明方式。在作用域之外，变量将无法访问或使用。

以上是Java的变量和类型的简要介绍，它们是Java编程的基础知识，理解它们对于编写Java程序至关重要。

### 变量

Java的变量是用来存储数据的容器，变量需要先声明后使用。Java变量的命名规则如下：

* 变量名由字母、数字和下划线（_）组成，不能以数字开头。
* 变量名不能包含空格和特殊字符，如 @、#、$、% 等。
* 变量名是区分大小写的。
* 变量名不能使用Java的关键字和保留字，如public、static、class等。

Java变量的命名应该遵循以下规则：

* 变量名应该有意义，描述变量所表示的内容。
* 变量名应该采用驼峰命名法，即首字母小写，后面的每个单词首字母大写。例如：firstName、lastName。
* 对于常量，应该全部大写，单词之间用下划线分隔。例如：MAX_VALUE。

命名规则对于Java程序的可读性和维护性非常重要，良好的命名规范可以使代码更易于理解和维护。

Java中的变量声明包括变量的名称和类型。Java的变量可以分为局部变量、成员变量和静态变量三种。

* 局部变量：局部变量是在方法、代码块或构造函数中声明的变量，其作用域仅限于声明所在的代码块中。局部变量必须初始化后才能使用。下面是一个声明和初始化局部变量的例子：

```java
public class Example {
    public void method() {
        int x = 5; // 声明和初始化一个整型局部变量
        System.out.println(x); // 输出 x 的值，输出结果为 5
    }
}
```

* 成员变量：成员变量是在类中声明的变量，其作用域在整个类中都有效，需要使用类的对象来访问它。成员变量不必在声明时初始化，如果不初始化，其默认值将为0或null。下面是一个声明成员变量的例子：

```java
public class Example {
    int x; // 声明一个整型成员变量
    String str; // 声明一个字符串成员变量

    public void method() {
        x = 5; // 给成员变量赋值
        str = "Hello, World!"; // 给成员变量赋值
        System.out.println(x); // 输出 x 的值，输出结果为 5
        System.out.println(str); // 输出 str 的值，输出结果为 "Hello, World!"
    }
}
```

* 静态变量：静态变量是在类中使用static关键字声明的变量，其作用域在整个类中都有效，不需要使用类的对象来访问它。静态变量不必在声明时初始化，如果不初始化，其默认值将为0或null。下面是一个声明静态变量的例子：

```java
public class Example {
    static int x; // 声明一个静态整型变量
    static String str; // 声明一个静态字符串变量

    public static void method() {
        x = 5; // 给静态变量赋值
        str = "Hello, World!"; // 给静态变量赋值
        System.out.println(x); // 输出 x 的值，输出结果为 5
        System.out.println(str); // 输出 str 的值，输出结果为 "Hello, World!"
    }
}
```

以上是Java变量的介绍和例子，变量是Java编程中的基本概念，理解和掌握变量的使用对于编写Java程序至关重要。

### 基本类型

Java有8种基本数据类型，也称为原生类型。它们是：

* boolean：表示布尔值，只有两个可能的值，true和false。
* byte：表示8位有符号的二进制补码整数，取值范围为-128至127。
* short：表示16位有符号的二进制补码整数，取值范围为-32,768至32,767。
* int：表示32位有符号的二进制补码整数，取值范围为-2^31至2^31-1。
* long：表示64位有符号的二进制补码整数，取值范围为-2^63至2^63-1。
* float：表示32位单精度浮点数，IEEE 754标准。
* double：表示64位双精度浮点数，IEEE 754标准。
* char：表示16位Unicode字符，取值范围为'\u0000'（或0）至'\uffff'（或65535）。

这些数据类型可以分为两类：整型和浮点型。整型包括byte、short、int和long，浮点型包括float和double。boolean和char是特殊类型，不属于任何一类。

Java的基本数据类型有固定的大小和范围，这意味着它们可以直接存储在计算机内存中，因此比对象类型更高效。在Java中，变量必须先声明为特定类型的变量，然后才能使用它们。

下面是一些基本类型的示例：

```java
boolean flag = true;
byte b = 127;
short s = 32767;
int i = 2147483647;
long l = 9223372036854775807L;
float f = 3.14f;
double d = 3.141592653589793;
char c = 'A';
```

在Java中，基本数据类型是按值传递的，这意味着当将一个基本类型的值传递给一个方法时，该方法将获得该值的副本，而不是原始值本身。此外，Java还提供了对每个基本类型的包装类，例如Integer、Double等，它们可以用于将基本类型的值封装为对象。

### 引用类型

Java中除了8种基本类型外，还有一种引用类型，也称为对象类型。引用类型的变量存储的是对象的引用，而不是对象本身的值。当创建一个对象时，实际上是在堆内存中分配了一个对象，并返回了一个引用，该引用指向该对象。

Java的引用类型包括类、接口、数组等。以下是一些引用类型的示例：

```java
// 类引用类型
String str = "Hello World";

// 接口引用类型
List<String> list = new ArrayList<>();

// 数组引用类型
int[] nums = {1, 2, 3, 4};
```

在Java中，可以使用new关键字创建一个对象，并返回一个引用。例如，以下代码创建了一个名为person的Person对象，并将其引用分配给p变量：

```java
Person p = new Person();
```

在上面的代码中，Person是一个自定义类，p是一个引用变量，指向新创建的Person对象。我们可以通过p变量访问Person对象的属性和方法。

与基本类型不同，引用类型是按引用传递的。当将一个引用类型的值传递给一个方法时，该方法将获得该值的副本，但是该副本是指向相同对象的引用。因此，在方法内对对象进行的更改将影响该对象的所有引用。

```java
public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = p1;

        p1.setName("Alice");
        System.out.println(p2.getName());  // 输出 "Alice"
    }
}
```

在上面的代码中，p1和p2是两个不同的引用变量，但它们都指向同一个Person对象。当我们在p1上调用setName方法时，该方法更改了该对象的名称属性。因此，当我们在p2上调用getName方法时，它返回了更新后的名称。这说明了引用类型是按引用传递的。

### 原生类型VS引用类型

Java的数据类型可以分为两类：原生类型和引用类型。原生类型也称为基本类型，它们是Java语言的内置类型，可以用于定义变量和方法参数，并且具有一些特殊的语言支持。引用类型是指向对象的指针，可以用来访问和操作对象的属性和方法。

* 下面是Java基本类型和引用类型之间的一些主要区别：
* 存储方式：基本类型的值存储在栈内存中，而引用类型的值存储在堆内存中，栈中只存储引用。
* 大小：基本类型的大小在不同的平台上是相同的，而引用类型的大小在不同的平台上可能会有所不同，因为它们指向的对象的大小是动态的。
* 默认值：基本类型的变量在声明时会自动初始化为默认值，而引用类型的变量的默认值是null。
* 传递方式：当传递基本类型的变量时，传递的是变量的值副本，而不是变量本身。当传递引用类型的变量时，传递的是指向对象的引用副本。
* 包装器类：Java提供了一些包装器类，可以将基本类型包装成对象，以便在需要对象而不是基本类型的情况下使用。例如，Integer类用于表示int类型的值。这些包装器类提供了一些附加的方法和功能，例如将基本类型转换为字符串，以及将字符串转换为基本类型。

总的来说，基本类型在Java中更高效、更简单，用于存储简单数据类型的值；而引用类型则更加灵活，可以用于存储复杂对象的值，同时需要更多的内存和处理器时间。程序员需要根据应用程序的需求和性能要求来选择使用哪种数据类型。

### String

Java中的String是一种引用类型，用于表示一个字符串对象。在Java中，字符串是不可变的，这意味着一旦字符串对象被创建，就无法更改其值。字符串的常用方法包括length()、charAt()、substring()等等。

下面是一个例子，演示如何使用Java中的字符串：

```java
// 创建一个字符串
String str = "Hello, World!";

// 获取字符串的长度
int len = str.length();
System.out.println("Length: " + len);

// 获取字符串的第一个字符
char firstChar = str.charAt(0);
System.out.println("First Character: " + firstChar);

// 获取子字符串
String subStr = str.substring(7);
System.out.println("Sub String: " + subStr);
```

这个例子创建了一个字符串对象，并使用length()方法获取了字符串的长度。然后，使用charAt()方法获取了字符串的第一个字符，并使用substring()方法获取了字符串的子字符串。最后，将这些结果打印到控制台上。

除了这些基本的操作之外，Java中的字符串还有许多其他的方法和操作，例如拼接字符串、替换字符串、转换大小写等等。字符串在Java中是一个非常常用和重要的数据类型，它们被广泛用于各种应用程序中。

### 转义字符

在Java中，转义字符是以反斜杠（\）开头的特殊字符序列。它们用于表示一些无法直接输入或打印的字符，例如换行符、制表符、引号等等。下面是一些常用的Java转义字符：

* `\n`：换行符
* `\t`：制表符
* `\'`：单引号
* `\"`：双引号
* `\\`：反斜杠

这些转义字符可以用在Java字符串中，例如：

```java
String str = "Hello\nWorld!";
System.out.println(str);
```

这个例子创建了一个包含换行符的字符串，并使用println()方法将其打印到控制台上。输出结果如下：

```bash
Hello
World!
```

除了字符串中的转义字符之外，Java还支持在字符字面值中使用转义字符。例如：

```java
char ch = '\n';
System.out.println("A" + ch + "B");
```

这个例子创建了一个包含换行符的字符，并将其与字符串“A”和“B”拼接起来。输出结果如下：

```bash
A
B
```

在Java中，转义字符非常有用，它们允许我们在字符串和字符中表示各种特殊字符和控制字符。了解和使用这些转义字符可以使我们更加灵活地处理字符串和字符数据。

### Arrays

在Java中，数组是一种容器，可以存储一组相同类型的数据。Java数组具有以下特点：

* 数组长度固定，一旦创建，其长度不能再改变。
* 数组可以包含任何类型的元素，包括基本类型和对象类型。
* 数组中的元素可以通过索引访问，索引从0开始，最大索引为数组长度减1。
* 数组可以作为参数传递给方法，也可以作为方法的返回值。

Java数组的声明方式如下：

```java
// 声明一个包含5个int类型元素的数组
int[] intArray = new int[5];

// 声明一个包含3个String类型元素的数组
String[] stringArray = new String[3];
```

Java数组的初始化方式有两种：

* 静态初始化：在声明数组的同时为数组元素赋初值。

```java
// 声明并初始化一个包含3个int类型元素的数组
int[] intArray = {1, 2, 3};

// 声明并初始化一个包含2个String类型元素的数组
String[] stringArray = {"Hello", "World"};
```

* 动态初始化：在声明数组时仅指定数组长度，然后在后续的代码中为数组元素赋值。

```java
// 声明一个包含5个int类型元素的数组，并逐个赋值
int[] intArray = new int[5];
intArray[0] = 1;
intArray[1] = 2;
intArray[2] = 3;
intArray[3] = 4;
intArray[4] = 5;

// 声明一个包含3个String类型元素的数组，并逐个赋值
String[] stringArray = new String[3];
stringArray[0] = "Hello";
stringArray[1] = "World";
stringArray[2] = "!";
```

ava数组可以使用以下方法：

* length：获取数组长度。
* clone()：复制一个数组。
* toString()：将数组转换为字符串形式。
* Arrays.sort()：对数组进行排序。

例如：

```java
int[] intArray = {3, 1, 4, 1, 5, 9, 2, 6, 5};
System.out.println("数组长度为：" + intArray.length);
System.out.println("原始数组为：" + Arrays.toString(intArray));

int[] newArray = intArray.clone();
Arrays.sort(newArray);
System.out.println("排序后的数组为：" + Arrays.toString(newArray));
```

这个例子创建了一个包含9个整数的数组，并使用length方法获取数组长度。然后，使用clone()方法复制了原始数组，并使用Arrays.sort()方法对复制后的数组进行排序。最后，使用toString()方法将数组转换为字符串形式，并将其打印到控制台上。输出结果如下：

```bash
数组长度为：9
原始数组为：[3, 1, 4, 1, 5, 9, 2, 6, 5]
```

下面我将继续详细介绍Java数组的相关内容。

Java数组的常用方法包括以下几个：

* length：用于获取数组的长度，返回一个int类型的值，表示数组中元素的个数。
* clone：用于复制一个数组，返回一个新的数组，与原数组具有相同的元素值，但是它们是不同的对象。
* toString：用于将数组转换成一个字符串，返回一个String类型的值。
* sort：用于对数组进行排序，可以对数字和字符串类型的数组进行排序。
* binarySearch：用于在已经排序的数组中查找指定的元素，返回该元素在数组中的位置。

下面是一个使用Java数组方法的示例：

```java
public class ArrayDemo {
    public static void main(String[] args) {
        // 创建一个长度为5的int类型数组
        int[] numbers = { 10, 20, 15, 22, 35 };

        // 使用length方法获取数组长度并打印
        System.out.println("数组长度为：" + numbers.length);

        // 使用clone方法复制数组
        int[] numbersCopy = numbers.clone();
        System.out.println("原始数组为：" + Arrays.toString(numbers));
        System.out.println("复制的数组为：" + Arrays.toString(numbersCopy));

        // 使用toString方法将数组转换成字符串
        String numbersString = Arrays.toString(numbers);
        System.out.println("数组转换成的字符串为：" + numbersString);

        // 使用sort方法对数组进行排序
        Arrays.sort(numbers);
        System.out.println("排序后的数组为：" + Arrays.toString(numbers));

        // 使用binarySearch方法查找数组中的元素
        int index = Arrays.binarySearch(numbers, 22);
        System.out.println("元素22在数组中的位置为：" + index);
    }
}
```

输出结果为：

```bash
数组长度为：5
原始数组为：[10, 20, 15, 22, 35]
复制的数组为：[10, 20, 15, 22, 35]
数组转换成的字符串为：[10, 20, 15, 22, 35]
排序后的数组为：[10, 15, 20, 22, 35]
元素22在数组中的位置为：3
```

通过上述示例可以看到，Java数组提供了一系列便捷的方法，可以方便地进行操作。

### 多维数组

Java的多维数组是指数组中每个元素也是一个数组的数组。多维数组的定义方式与一维数组类似，只需要在类型后面加上方括号来表示数组的维度。以下是一个二维数组的例子：

```java
int[][] matrix = new int[3][4];
```

上述代码定义了一个3行4列的二维数组。我们也可以使用初始化列表来初始化多维数组，例如：

```java
int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
```

上述代码初始化了一个3行3列的二维数组，并赋予了相应的值。我们可以通过以下方式来访问多维数组中的元素：

```java
int x = matrix[1][2]; // 获取第2行第3列的元素
```

Java中的多维数组实际上是一个数组的数组，因此它可以拥有任意多个维度。以下是一个三维数组的例子：

```java
int[][][] cube = new int[3][4][5];
```

上述代码定义了一个3维数组，其中第1维有3个元素，每个元素是一个二维数组，第2维有4个元素，每个元素是一个一维数组，第3维有5个元素，每个元素是一个整数。我们可以使用类似于二维数组的方式来访问三维数组中的元素：

```java
int x = cube[1][2][3]; // 获取第2个二维数组中的第3个一维数组中的第4个元素
```

在使用多维数组时，需要注意数组的大小与元素访问的边界，避免出现数组越界的情况。同时，多维数组的使用场景相对较少，通常可以使用其他的数据结构来代替多维数组。

### 常量

Java中的常量是指一旦被定义后，其值不能被更改的变量。常量可以用来表示程序中不变的值，如π的值3.14159等。Java中常量的定义方式与变量不同，常量通常使用关键字final定义。

下面是定义一个常量的语法格式：

```java
final dataType CONSTANT_NAME = value;
```

其中，dataType指定了常量的数据类型，CONSTANT_NAME为常量的名字，value为常量的值。

以下是定义几个常量的示例：

```java
final int MAX_NUM = 100;
final double PI = 3.14159;
final String GREETING = "Hello";
```

使用常量的好处是可以提高代码的可读性和可维护性，因为常量值在代码中只需定义一次，如果需要修改常量值，则只需在定义常量的地方进行修改即可，而不需要修改代码中所有使用该常量的地方。

常量还可以被用在switch语句中：

```java
final int MONDAY = 1;
final int TUESDAY = 2;
final int WEDNESDAY = 3;
final int THURSDAY = 4;
final int FRIDAY = 5;
final int SATURDAY = 6;
final int SUNDAY = 7;

int dayOfWeek = 4;
switch (dayOfWeek) {
    case MONDAY:
        System.out.println("Today is Monday");
        break;
    case TUESDAY:
        System.out.println("Today is Tuesday");
        break;
    case WEDNESDAY:
        System.out.println("Today is Wednesday");
        break;
    case THURSDAY:
        System.out.println("Today is Thursday");
        break;
    case FRIDAY:
        System.out.println("Today is Friday");
        break;
    case SATURDAY:
        System.out.println("Today is Saturday");
        break;
    case SUNDAY:
        System.out.println("Today is Sunday");
        break;
    default:
        System.out.println("Invalid day of week");
}
```

在上面的示例中，定义了一组常量来表示每个星期几的值，然后在switch语句中使用这些常量来比较变量dayOfWeek的值。

### 算术表达式

Java的算术表达式是指使用算术运算符对值进行计算的表达式。Java提供了丰富的算术运算符，包括加法（+），减法（-），乘法（*），除法（/），取余（%）等。

以下是关于Java算术表达式的一些重要事项：

* 算术表达式的优先级：Java遵循数学上的运算符优先级。优先级高的运算符先进行计算。如果有相同优先级的运算符，则从左到右进行计算。
* 整数相除：在Java中，如果两个整数进行除法运算，则结果为整数，即向下取整。例如，7 / 2 的结果为3。
* 取余运算：取余运算（%）返回被除数除以除数后的余数。例如，7 % 2 的结果为1。

以下是一些算术表达式的例子：

```java
int a = 10;
int b = 5;

// 加法
int c = a + b; // c的值为15

// 减法
int d = a - b; // d的值为5

// 乘法
int e = a * b; // e的值为50

// 除法
int f = a / b; // f的值为2

// 取余
int g = a % b; // g的值为0
```

注意，在上述示例中，a和b是整数类型。如果它们是浮点数类型，则结果也将是浮点数类型。

### 运算符优先级

Java中的操作符（或运算符）根据优先级进行计算。优先级高的操作符将先被计算，而优先级相同的操作符将从左至右进行计算。如果需要改变计算次序，则可以使用括号来改变优先级。

以下是Java中常见的操作符及其优先级（从高到低）：

* 后缀运算符（如 ++ 和 --）
* 一元运算符（如 +、-、!、~）
* 乘法和除法运算符（如 *、/、%）
* 加法和减法运算符（如 +、-）
* 移位运算符（如 <<、>>、>>>）
* 按位与运算符（如 &）
* 按位异或运算符（如 ^）
* 按位或运算符（如 |）
* 逻辑与运算符（如 &&）
* 逻辑或运算符（如 ||）
* 条件运算符（如 ? :）
* 赋值运算符（如 =、+=、-=、*=、/=、%=）

下面是一个例子，演示操作符的优先级：

```java
int a = 10, b = 5, c = 2;
int result = a + b * c; // 优先计算乘法运算符，然后再计算加法运算符
System.out.println(result); // 输出20

result = (a + b) * c; // 使用括号改变计算次序
System.out.println(result); // 输出30
```

在上面的例子中，当计算 a + b *c 时，由于乘法运算符的优先级高于加法运算符，所以 b* c 先被计算，其结果为10，然后再加上a的值10，结果为20。而当使用括号来改变计算次序时， (a + b) 先被计算，其结果为15，然后再乘以c的值2，结果为30。

### 强制类型转换

Java 强制类型转换（casting）指的是将一个数据类型的值转换为另一个数据类型的过程。Java 中的类型转换分为两种：隐式转换和显式转换。

隐式转换，也称为扩大转换（widening），是在将一个较小数据类型的值分配给较大数据类型的变量时自动发生的。例如，如果我们将一个 int 类型的值分配给一个 long 类型的变量，转换将自动发生，因为 long 可以容纳比 int 更大范围的值。

```java
int x = 10;
long y = x; // 隐式转换
```

显式转换，也称为缩小转换（narrowing），需要程序员显式地指定从较大数据类型到较小数据类型的转换。例如，如果我们将一个 double 类型的值分配给一个 int 类型的变量，就需要进行显式转换。

```java
double x = 10.5;
int y = (int) x; // 显式转换
```

需要注意的是，显式转换可能会导致数据或精度的损失，因此应谨慎使用。例如，在上面的例子中，当 x 被转换为 int 类型时，其小数部分将被截断，所以 y 的值将是 10 而不是 10.5。

总之，在 Java 中进行强制类型转换允许我们将一个数据类型转换为另一个数据类型。当将一个较小数据类型的值分配给一个较大数据类型的变量时会自动发生隐式转换，而显式转换需要程序员显式指定从较大数据类型到较小数据类型的转换。

### 数学类

Java Math 类是 Java 中的一个标准库类，它包含了各种用于数学计算的静态方法，可以用于执行许多基本数学运算，例如指数、对数、三角函数、舍入、随机数等。使用 Math 类可以避免手动实现这些数学运算，从而提高代码的可读性和可维护性。

下面介绍一些 Java Math 类中的常用方法。

* abs(x)：返回 x 的绝对值。

```java
int x = Math.abs(-10); // x 的值为 10
```

* sqrt(x)：返回 x 的平方根。

```java
double y = Math.sqrt(16); // y 的值为 4.0
```

* pow(x, y)：返回 x 的 y 次方。

```java
double z = Math.pow(2, 3); // z 的值为 8.0
```

* sin(x)、cos(x)、tan(x)：返回 x 的正弦、余弦和正切值（单位为弧度）。

```java
double a = Math.sin(Math.PI / 2); // a 的值为 1.0
```

* exp(x)：返回自然数 e 的 x 次方。

```java
double b = Math.exp(1); // b 的值为 e 的值，即 2.718281828459045
```

* log(x)、log10(x)：返回 x 的自然对数和以 10 为底的对数。

```java
double c = Math.log(Math.E); // c 的值为 1.0
```

* ceil(x)、floor(x)：返回不小于 x 的最小整数和不大于 x 的最大整数。

```java
double d = Math.ceil(2.1); // d 的值为 3.0
double e = Math.floor(2.9); // e 的值为 2.0
```

* round(x)：返回最接近 x 的整数，四舍五入。

```java
int f = Math.round(2.5); // f 的值为 3
```

* random()：返回一个带正号的 double 值，大于等于 0.0 且小于 1.0。

```java
double g = Math.random(); // g 的值为大于等于 0.0 且小于 1.0 的随机 double 值
```

需要注意的是，Math 类中的方法都是静态方法，所以不需要创建 Math 类的实例即可使用。此外，由于 Math 类中的方法都是静态方法，所以我们可以直接使用类名调用这些方法，例如 Math.abs(-10)。

总之，Java Math 类是一个非常有用的类，它提供了许多数学计算方面的工具方法，可以方便地执行各种数学运算。了解并熟练使用 Math 类中的常用方法可以极大地提高代码的编写效率

### 格式化数字

Java 提供了多种格式化数字的方式，下面介绍几种常用的方式。

* DecimalFormat 类：DecimalFormat 类提供了非常灵活的数字格式化方式。通过实例化 DecimalFormat 类，可以根据需求设置数字格式，例如小数位数、千位分隔符等。示例代码如下：

```java
double num = 1234567.89;
DecimalFormat df = new DecimalFormat("#,###.00");
String formattedNum = df.format(num);
System.out.println(formattedNum); // 输出为 1,234,567.89
```

在上述代码中，我们首先定义了一个 double 类型的数字 num，然后实例化了一个 DecimalFormat 对象 df，并将格式字符串 #,###.00 传递给它的构造函数。最后，我们通过调用 format() 方法将 num 进行格式化，并将格式化后的字符串赋值给变量 formattedNum。在这个示例中，格式化后的字符串为 1,234,567.89。

* String.format() 方法：String.format() 方法可以用于格式化各种类型的数据，包括数字。我们可以在格式化字符串中使用占位符 %d、%f 等来表示要格式化的数字的类型和格式。示例代码如下：

```java
int num1 = 123;
double num2 = 123.45;
String formattedNum1 = String.format("%,d", num1);
String formattedNum2 = String.format("%.2f", num2);
System.out.println(formattedNum1); // 输出为 123
System.out.println(formattedNum2); // 输出为 123.45
```

在上述代码中，我们使用了 %d 和 %f 占位符分别表示要格式化的数字为整数和浮点数。我们还可以在占位符前添加其他格式选项，例如使用 , 表示千位分隔符，使用 . 表示小数点等。

* NumberFormat 类：NumberFormat 类是一个抽象类，它提供了格式化数字的基本方法。我们可以通过调用其静态方法 getNumberInstance() 获取一个默认的 NumberFormat 对象，或者通过实例化 DecimalFormat、PercentFormat 等子类来创建自定义的格式化器。示例代码如下：

```java
double num = 0.1234;
NumberFormat nf = NumberFormat.getPercentInstance();
nf.setMaximumFractionDigits(2);
String formattedNum = nf.format(num);
System.out.println(formattedNum); // 输出为 12.34%
```

在上述代码中，我们首先定义了一个 double 类型的数字 num，然后调用 NumberFormat.getPercentInstance() 方法获取一个默认的百分比格式化器。我们还通过调用 setMaximumFractionDigits() 方法设置百分比格式化器的最大小数位数为 2。最后，我们通过调用 format() 方法将 num 进行格式化，并将格式化后的字符串赋值给变量 formattedNum。在这个示例在这个示例中，格式化后的字符串为 12.34%。

除了上述介绍的三种方式外，Java 还提供了其他一些格式化数字的类和方法，例如 DecimalFormatSymbols 类用于设置数字格式中的符号、NumberFormat.getCurrencyInstance() 方法用于格式化货币等。选择合适的格式化方式取决于具体的需求和场景。

### 读取输入

在Java中，有几种常用的方法可以读取用户输入或从外部来源（如文件）中读取输入。以下是其中几种方法：

* Scanner类：该类提供了从用户或文件中读取各种类型的输入，包括整数、浮点数、字符串和字符的方法。以下是一个示例：

```java
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的姓名：");
        String name = scanner.nextLine();
        System.out.println("您好，" + name + "！");
    }
}
```

在这个示例中，我们创建了一个Scanner对象，使用System.in从控制台读取输入。nextLine()方法用于读取用户输入的字符字符串。

* BufferedReader类：该类提供了一种更高效的方式从文件或控制台读取输入。它使用缓冲区批量读取字符，比逐个读取字符更快。以下是一个示例：

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入您的姓名：");
        String name = reader.readLine();
        System.out.println("您好，" + name + "！");
    }
}
```

在这个示例中，我们创建了一个BufferedReader对象，使用System.in从控制台读取输入。readLine()方法用于读取用户输入的文本行。

* Console类：该类提供了从控制台读取输入的方法。它仅在Java 6或更高版本中可用。以下是一个示例：

```java
import java.io.Console;

public class Example {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.err.println("没有控制台。");
            System.exit(1);
        }
        String name = console.readLine("请输入您的姓名：");
        console.printf("您好，%s！", name);
    }
}
```

在这个示例中，我们使用System.console()获取控制台的引用。如果控制台不可用，则打印错误消息并退出程序。readLine()方法用于读取用户输入的文本行，而printf()用于将消息显示到控制台上。

### 贷款偿还计算器

输入贷款总金额、年利率以及贷款期限，计算每月还款金额及支付的利息。

```java
import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        // 获取贷款金额、年利率和贷款期限
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入贷款金额（元）：");
        double loanAmount = scanner.nextDouble();
        System.out.print("请输入年利率（%）：");
        double annualInterestRate = scanner.nextDouble() / 100.0;
        System.out.print("请输入贷款期限（年）：");
        int loanTermInYears = scanner.nextInt();

        // 计算每月还款金额和总支付利息
        int numberOfPayments = loanTermInYears * 12;
        double monthlyInterestRate = annualInterestRate / 12.0;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
        double totalPayment = monthlyPayment * numberOfPayments;
        double totalInterest = totalPayment - loanAmount;

        // 输出结果
        System.out.printf("每月还款金额为：%.2f元\n", monthlyPayment);
        System.out.printf("总支付利息为：%.2f元\n", totalInterest);
    }
}
```

该程序通过使用Scanner类从控制台读取用户输入的贷款金额、年利率和贷款期限。然后使用标准公式计算每月还款金额和总支付利息，最后将结果输出到控制台。请注意，该程序假设每月偿还贷款的金额是固定的，因此它并不考虑贷款本金在还款期内的变化。实际情况中，可能存在一些变化，例如固定利率或变动利率的贷款。

## 流程控制

### 简介

Java的流程控制语句允许程序在执行时按照特定的条件执行代码块，控制程序的执行流程。以下是Java中的三种主要流程控制语句：

* if语句：if语句用于根据给定的条件来决定是否执行一段代码块。如果条件为真，那么执行代码块；否则，跳过该代码块。以下是一个if语句的示例：

```java
int x = 10;
if (x > 5) {
    System.out.println("x大于5");
}
```

在这个示例中，如果x的值大于5，那么就会打印出"x大于5"。

* for循环：for循环用于多次执行一段代码块，通常用于迭代数组或集合中的元素。以下是一个for循环的示例：

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

在这个示例中，for循环将从0开始计数，一直循环到9。在每次循环中，都会打印出当前计数器的值。

* while循环：while循环用于在给定的条件为真的情况下重复执行一段代码块。以下是一个while循环的示例：

```java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
}
```

在这个示例中，while循环将一直循环，直到计数器i达到10。在每次循环中，都会打印出当前计数器的值，并将计数器增加1。

### 比较操作符

Java中的比较操作符用于比较两个值并返回一个布尔值（true或false）。Java中有以下比较操作符：

1. `==`：相等操作符，用于检查两个值是否相等。如果两个值相等，则返回true，否则返回false。请注意，这是比较值的操作符，不是比较对象的操作符。如果比较对象，请使用`.equals()`方法。

```java
int a = 10;
int b = 10;
if (a == b) {
    System.out.println("a和b相等");
}

// 输出：a和b相等
```

```java
String str1 = "hello";
String str2 = "hello";
if (str1 == str2) {
    System.out.println("str1和str2引用同一个对象");
}

// 输出：str1和str2引用同一个对象
```

```java
String str3 = new String("hello");
String str4 = new String("hello");
if (str3 == str4) {
    System.out.println("str3和str4引用同一个对象");
} else {
    System.out.println("str3和str4引用不同的对象");
}

// 输出：str3和str4引用不同的对象
```

2. `!=`：不等操作符，用于检查两个值是否不相等。如果两个值不相等，则返回true，否则返回false。

```java
int c = 10;
int d = 20;
if (c != d) {
    System.out.println("c和d不相等");
}

// 输出：c和d不相等
```

3. `<`：小于操作符，用于检查一个值是否小于另一个值。如果第一个值小于第二个值，则返回true，否则返回false。

```java
int e = 10;
int f = 20;
if (e < f) {
    System.out.println("e小于f");
}

// 输出：e小于f
```

```java
String str5 = "abc";
String str6 = "def";
if (str5.compareTo(str6) < 0) {
    System.out.println("str5小于str6");
}

// 输出：str5小于str6
```

4. `>`：大于操作符，用于检查一个值是否大于另一个值。如果第一个值大于第二个值，则返回true，否则返回false。

```java
int g = 10;
int h = 20;
if (h > g) {
    System.out.println("h大于g");
}

// 输出：h大于g
```

```java
String str7 = "def";
String str8 = "abc";
if (str7.compareTo(str8) > 0) {
    System.out.println("str7大于str8");
}

输出：str7大于str8
```

5. `<=`：小于等于操作符，用于检查一个值是否小于或等于另一个值。如果第一个值小于或等于第二个值，则返回true，否则返回false。

```java
int i = 10;
int j = 10;
if (i <= j) {
    System.out.println("i小于等于j");
}

输出：i小于等于j
```

6. `>=`：大于等于操作符，用于检查一个值是否大于或等于另一个值。如果第一个值大于或等于第二个值，则返回true，否则返回false。

```java
int k = 20;
int l = 10;
if (k >= l) {
    System.out.println("k大于等于l");
}

输出：k大于等于l
```

请注意，在比较操作符中，字符串比较是基于字符串的字典顺序进行的。这意味着对于字符串的比较，将对字符串的每个字符进行比较，直到找到不同的字符为止。例如，字符串"abc"将被视为小于字符串"def"。

此外，Java还支持使用`instanceof`操作符来比较对象类型。该操作符用于检查一个对象是否属于某个类或其子类的实例。如果对象是该类或其子类的实例，则返回true，否则返回false。例如，`object instanceof String`将检查对象是否是String类或其子类的实例。

```java
Object obj2 = new Object();
if (obj2 instanceof String) {
    System.out.println("obj2是String类的实例");
} else {
    System.out.println("obj2不是String类的实例");
}

输出：obj2不是String类的实例
```

### 逻辑操作符

Java 的逻辑操作符用于对布尔类型的值进行逻辑运算，其结果也是布尔类型的值。Java 的逻辑操作符包括以下几种：

* 逻辑与操作符 (&&)：表示两个表达式的结果都为 true 时，整个逻辑表达式的结果才为 true。

```java
boolean a = true;
boolean b = false;
boolean c = a && b; // false
```

* 逻辑或操作符 (||)：表示两个表达式中至少有一个结果为 true 时，整个逻辑表达式的结果就为 true。

```java
boolean a = true;
boolean b = false;
boolean c = a || b; // true
```

* 逻辑非操作符 (!)：表示对一个表达式的结果取反，即将 true 变为 false，将 false 变为 true。

```java
boolean a = true;
boolean b = !a; // false
```

这些逻辑操作符常常用于条件语句和循环语句中，以进行条件判断和控制程序流程。下面是一个示例：

```java
int x = 5;
int y = 10;

if (x > 0 && y > 0) {
    System.out.println("x 和 y 都大于 0");
}

if (x == 0 || y == 0) {
    System.out.println("x 或 y 中至少有一个为 0");
}

if (!(x > y)) {
    System.out.println("x 不大于 y");
}
```

在这个示例中，使用了逻辑与、逻辑或和逻辑非操作符，根据不同的条件输出不同的结果。

### if语句

在Java中，if语句是用于根据特定条件执行代码块的一种条件语句。if语句有多种形式，包括：

基本if语句
if-else语句
嵌套if语句
else-if语句（也称为if-else-if语句）
下面我们分别对这些形式进行详细讲解并演示。

1. 基本if语句

基本if语句的语法如下：

```java
if (condition) {
    // 如果条件为真，执行此处的代码块
}
```

如果条件为真，就会执行if语句后面的代码块。如果条件为假，则跳过该代码块，继续执行程序的下一条语句。

以下是一个演示基本if语句的示例：

```java
int x = 10;
if (x > 5) {
    System.out.println("x大于5");
}
```

在上面的示例中，如果变量x的值大于5，则会输出“x大于5”。

2. if-else语句

if-else语句的语法如下：

```java
if (condition) {
    // 如果条件为真，执行此处的代码块
} else {
    // 如果条件为假，执行此处的代码块
}
```

如果条件为真，就会执行if语句后面的代码块；否则，就会执行else语句后面的代码块。

以下是一个演示if-else语句的示例：

```java
int x = 3;
if (x > 5) {
    System.out.println("x大于5");
} else {
    System.out.println("x小于等于5");
}
```

在上面的示例中，如果变量x的值小于等于5，则会输出“x小于等于5”。

3. 嵌套if语句

嵌套if语句是在if语句中再嵌套另一个if语句。它的语法如下：

```java
if (condition1) {
    if (condition2) {
        // 如果两个条件都为真，执行此处的代码块
    }
}
```

如果两个条件都为真，就会执行嵌套的if语句后面的代码块。

以下是一个演示嵌套if语句的示例：

```java
int x = 5;
int y = 10;
if (x > 0) {
    if (y > 0) {
        System.out.println("x和y都是正数");
    }
}
```

在上面的示例中，如果变量x和y的值都大于0，则会输出“x和y都是正数”。

4. else-if语句（也称为if-else-if语句）

else-if语句是在if语句中添加一个或多个附加条件。它的语法如下：

```java
if (condition1) {
    // 如果条件1为真，执行此处的代码块
} else if (condition2) {
    // 如果条件2为真，执行此处的代码块
} else if (condition3) {
    // 如果条件3为真，执行此处的代码块
} else {
    // 如果所有条件都为假，执行此处的代码块
}
```

else-if语句可以在if语句后面添加多个附加条件。如果第一个条件为假，会检查下一个条件，以此类推，直到找到为真的条件。如果所有条件都为假，则会执行else语句后面的代码块。

以下是一个演示else-if语句的示例：

```java
int x = 7;

if (x < 0) {
    System.out.println("x是负数");
} else if (x > 0) {
    System.out.println("x是正数");
} else {
    System.out.println("x是0");
}
```

在上面的示例中，如果变量x的值为负数，则会输出“x是负数”；如果x的值为正数，则会输出“x是正数”；如果x的值为0，则会输出“x是0”。

在Java编程语言中，有一些语法糖（syntactic sugar）可以简化if语句的写法，让代码更加简洁易读。下面列举一些简化if语句的例子：

1. 三目运算符
   三目运算符是一种简化if语句的方式，它可以用来根据条件选择不同的值。三目运算符由一个问号和一个冒号组成，语法如下：

```java
condition ? value1 : value2
```

如果condition为true，则返回value1，否则返回value2。下面是一个使用三目运算符的例子：

```java
int x = 10;
String result = (x > 0) ? "x is positive" : "x is non-positive";
```

如果x大于0，则result的值为"x is positive"，否则result的值为"x is non-positive"。

2. 空合并运算符
   空合并运算符（null coalescing operator）是Java 8引入的一种语法糖，它可以用来简化if语句，处理空值的情况。空合并运算符由两个问号组成，语法如下：

```java
value1 ?? value2
```

如果value1不为null，则返回value1，否则返回value2。下面是一个使用空合并运算符的例子：

```java
String str = null;
String result = str ?? "default value";
```

如果str为null，则result的值为"default value"，否则result的值为str的值。

### switch语句

如果有多个条件需要判断，可以使用switch语句来简化if语句的写法。switch语句可以根据一个表达式的值来匹配多个分支，从而选择执行不同的代码块。

下面是一个简单的switch语句的示例：

```java
int dayOfWeek = 3;
String dayName;

switch (dayOfWeek) {
    case 1:
        dayName = "Monday";
        break;
    case 2:
        dayName = "Tuesday";
        break;
    case 3:
        dayName = "Wednesday";
        break;
    case 4:
        dayName = "Thursday";
        break;
    case 5:
        dayName = "Friday";
        break;
    case 6:
        dayName = "Saturday";
        break;
    case 7:
        dayName = "Sunday";
        break;
    default:
        dayName = "Invalid day of week";
        break;
}

System.out.println("The day of the week is " + dayName);
```

在这个例子中，首先定义了一个变量dayOfWeek，它表示一周的第几天。然后使用switch语句根据dayOfWeek的值选择执行哪个代码块。

在switch语句中，case关键字用于指定一个选项，后面跟随该选项的值。如果dayOfWeek的值与某个选项的值相同，则执行该选项对应的代码块。在代码块的最后使用break关键字表示跳出switch语句。

default关键字用于指定一个默认选项，它在所有选项都不匹配的情况下执行。在这个例子中，如果dayOfWeek的值既不是1-7中的任何一个，那么就会执行default选项对应的代码块。

需要注意的是，在每个代码块的最后都必须有一个break语句，否则程序会继续执行下一个代码块，直到遇到break为止。

Java 12引入了一种新的语法糖，叫做条件表达式（switch expressions），它可以在switch语句中使用更加简洁的写法。条件表达式由->符号连接一个表达式和一个执行语句组成，语法如下：

```java
case value -> expression
```

下面是一个使用条件表达式的例子：

```java
int dayOfWeek = 3;
String result = switch (dayOfWeek) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    default -> "Invalid day of week";
};
System.out.println(result);
```

这个代码使用条件表达式简化了switch语句的写法，将每个分支的执行语句直接写成一个表达式，从而使代码更加简洁易读。如果dayOfWeek的值为1，则result的值为"Monday"；如果dayOfWeek的值为2，则result的值为"Tuesday"；如果dayOfWeek的值为3，则result的值为"Wednesday"；否则result的值为"Invalid day of week"。注意，在使用条件表达式时，需要将整个switch语句放在一个代码块中，而且每个分支的执行语句必须是一个表达式。

### `if`、`switch`语句练习

练习：

1. 使用if语句，判断一个整数是否是偶数。
2. 使用if语句，判断一个字符是否是元音字母。
3. 使用if语句，判断一个年份是否是闰年。
4. 使用if语句，判断一个字符串是否是回文字符串。
5. 使用if语句，找出三个整数中的最大值。
6. 使用switch语句，根据成绩等级输出相应的评价。
7. 使用switch语句，输出今天是星期几。
8. 使用switch语句，将一个数字转换为对应的英文单词（仅支持1到5）。
9. 使用switch语句，计算两个数的运算结果（加、减、乘、除）。
10. 使用switch语句，将一个月份转换为对应的季节。

答案：

1. 使用if语句，判断一个整数是否是偶数。

```java
int num = 10;
if (num % 2 == 0) {
    System.out.println(num + " is even");
} else {
    System.out.println(num + " is odd");
}
```

2. 使用if语句，判断一个字符是否是元音字母。

```java
char c = 'a';
if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
    System.out.println(c + " is a vowel");
} else {
    System.out.println(c + " is a consonant");
}
```

3. 使用if语句，判断一个年份是否是闰年。

```java
int year = 2024;
if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
    System.out.println(year + " is a leap year");
} else {
    System.out.println(year + " is not a leap year");
}
```

4. 使用if语句，判断一个字符串是否是回文字符串。

```java
String str = "racecar";
boolean isPalindrome = true;
for (int i = 0; i < str.length() / 2; i++) {
    if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
        isPalindrome = false;
        break;
    }
}
if (isPalindrome) {
    System.out.println(str + " is a palindrome string");
} else {
    System.out.println(str + " is not a palindrome string");
}
```

5. 使用if语句，找出三个整数中的最大值。

```java
int a = 10, b = 20, c = 15;
int max = a;
if (b > max) {
    max = b;
}
if (c > max) {
    max = c;
}
System.out.println("The maximum value is " + max);
```

6. 使用switch语句，根据成绩等级输出相应的评价。

```java
char grade = 'A';
switch (grade) {
    case 'A':
        System.out.println("Excellent!");
        break;
    case 'B':
        System.out.println("Good!");
        break;
    case 'C':
        System.out.println("Average.");
        break;
    case 'D':
        System.out.println("Below average.");
        break;
    case 'F':
        System.out.println("Fail.");
        break;
    default:
        System.out.println("Invalid grade.");
        break;
}
```

7. 使用switch语句，输出今天是星期几。

```java
int dayOfWeek = 5;
switch (dayOfWeek) {
    case 1:
        System.out.println("Today is Monday");
        break;
    case 2:
        System.out.println("Today is Tuesday");
        break;
    case 3:
        System.out.println("Today is Wednesday");
        break;
    case 4:
        System.out.println("Today is Thursday");
        break;
    case 5:
        System.out.println("Today is Friday");
        break;
    case 6:
        System.out.println("Today is Saturday");
        break;
    case 7:
        System.out.println("Today is Sunday");
        break;
    default:
        System.out.println("Invalid day of week.");
        break;
}
```

8. 使用switch语句，将一个数字转换为对应的英文单词（仅支持1到5）。

```java
int number = 3;
String word;
switch (number) {
    case 1:
        word = "one";
        break;
    case 2:
        word = "two";
        break;
    case 3:
        word = "three";
        break;
    case 4:
        word = "four";
        break;
    case 5:
        word = "five";
        break;
    default:
        word = "Invalid number";
        break;
}
System.out.println(number + " is " + word);
```

9. 使用switch语句，计算两个数的运算结果（加、减、乘、除）。

```java
int num1 = 10, num2 = 5;
char operator = '+';
double result;
switch (operator) {
    case '+':
        result = num1 + num2;
        break;
    case '-':
        result = num1 - num2;
        break;
    case '*':
        result = num1 * num2;
        break;
    case '/':
        result = num1 / (double) num2;
        break;
    default:
        result = 0;
        System.out.println("Invalid operator");
        break;
}
System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
```

10. 使用switch语句，将一个月份转换为对应的季节。

```java
int month = 3;
String season;
switch (month) {
    case 1:
    case 2:
    case 12:
        season = "Winter";
        break;
    case 3:
    case 4:
    case 5:
        season = "Spring";
        break;
    case 6:
    case 7:
    case 8:
        season = "Summer";
        break;
    case 9:
    case 10:
    case 11:
        season = "Fall";
        break;
    default:
        season = "Invalid month";
        break;
}
System.out.println(month + " is in " + season);
```

### `for`循环

`for` 循环是Java中最常用的循环结构之一，它可以用来重复执行一段代码，直到指定的条件不再满足为止。在循环的每次迭代中，都会执行循环体内的代码，并更新循环控制变量的值。下面是 `for` 循环的基本语法：

```java
for (initialization; condition; update) {
    // code to be executed
}
```

其中:

* `initialization`：用于初始化循环控制变量的值，只在循环开始时执行一次。
* `condition`：循环的终止条件，只要满足条件，循环就会继续执行。
* `update`：用于更新循环控制变量的值，每次循环结束后执行一次。
* 循环体内的代码：需要重复执行的代码块。

下面是一个示例，使用 for 循环输出数字 1 到 10：

```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

在这个例子中，循环控制变量 `i` 被初始化为 1，循环条件是 `i <= 10`，每次循环结束后 `i` 的值会自增 1，直到 `i` 的值大于 10 时，循环就结束了。在循环体内，使用 `System.out.println(i)` 将当前的 `i` 值输出到控制台。

除了基本的 `for` 循环语法，Java还提供了增强型的 `for` 循环，也称为 `foreach` 循环。它可以用来遍历数组和集合类中的元素，使代码更加简洁易读。下面是 foreach 循环的语法：

```java
for (variable : collection) {
    // code to be executed
}
```

其中：

* `variable`：定义一个循环控制变量，用于依次引用集合中的每个元素。
* `collection`：要遍历的集合对象，可以是数组或其他实现了 `Iterable` 接口的集合类。

下面是一个示例，使用 `foreach` 循环遍历一个字符串数组：

```java
String[] names = {"Alice", "Bob", "Charlie", "David"};

for (String name : names) {
    System.out.println(name);
}
```

在这个例子中，`names` 是一个字符串数组，通过 `for (String name : names)` 定义了一个循环控制变量 `name`，它会依次引用 `names` 中的每个元素，然后在循环体内使用 `System.out.println(name)` 输出元素的值。

### `while`循环

Java 的 `while` 循环是一种基本的循环结构，它可以用于在满足特定条件时重复执行代码块。和 `for` 循环不同，`while` 循环没有明确的循环计数器，而是根据指定的循环条件来判断是否执行循环体。

下面是 `while` 循环的语法：

```java
while (condition) {
    // code to be executed
}
```

其中：

* `condition`：循环条件，只要条件满足，就会重复执行循环体内的代码。
* 循环体内的代码：需要重复执行的代码块。

下面是一个示例，使用 while 循环输出数字 1 到 10：

```java
int i = 1;

while (i <= 10) {
    System.out.println(i);
    i++;
}
```

在这个例子中，循环条件是 `i <= 10`，只要 `i` 的值小于等于 `10`，就会重复执行循环体内的代码。循环体内使用 `System.out.println(i)` 输出当前的 `i` 值，并使用 `i++` 自增 `i` 的值，确保每次循环 `i` 的值都会增加 `1`。

和 `for` 循环一样，`while` 循环也可以使用 `break` 和 `continue` 语句来控制循环的流程。下面是一个示例，使用 `while` 循环输出数字 `1` 到 `10`，但只输出奇数：

```java
int i = 1;

while (i <= 10) {
    if (i % 2 == 0) {
        i++;
        continue;  // 跳过本次循环，继续下一次循环
    }

    System.out.println(i);
    i++;
}
```

在这个例子中，使用 `if (i % 2 == 0)` 判断当前的 `i` 是否为偶数，如果是偶数，就使用 `continue` 跳过本次循环，继续下一次循环。如果 `i` 是奇数，就输出 `i` 的值，并使用 `i++` 自增 `i` 的值。

### `brea`和`continue`语句

`break` 和 `continue` 是两个常用的控制语句，可以用于在循环结构中控制程序的流程。

`break`:

`break` 语句用于跳出循环结构，即使循环条件还没有满足。在 `for` 循环和 `while` 循环中，使用 `break` 可以在循环体内部提前终止循环。

下面是一个使用 `break` 的 `for` 循环示例，它用于在找到数组中第一个负数后停止循环：

```java
int[] numbers = {1, 2, 3, -4, 5, 6};

for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] < 0) {
        System.out.println("Found negative number: " + numbers[i]);
        break;  // 找到第一个负数，跳出循环
    }

    System.out.println("Current number: " + numbers[i]);
}
```

在这个例子中，使用 `break` 在找到数组中第一个负数后停止循环。如果不使用 `break`，程序会继续执行循环，直到遍历完整个数组。

下面是一个使用 `break` 的 `while` 循环示例，它用于从键盘读取用户输入，直到输入了 "quit"：

```java
Scanner scanner = new Scanner(System.in);

while (true) {
    System.out.println("Enter a value (or 'quit' to exit):");
    String input = scanner.nextLine();

    if (input.equals("quit")) {
        System.out.println("Exiting...");
        break;  // 输入了 "quit"，跳出循环
    }

    System.out.println("You entered: " + input);
}
```

在这个例子中，使用 `break` 在输入了 "quit" 后停止循环。由于循环条件为 `true`，因此循环会一直执行，直到输入了 "quit"。

`continue`：

`continue` 语句用于跳过循环中的某次迭代，继续下一次迭代。在 `for` 循环和 `while` 循环中，使用 `continue` 可以在循环体内部跳过某些特定的迭代。

下面是一个使用 `continue` 的 `for` 循环示例，它用于在遇到偶数时跳过当前迭代：

```java
int[] numbers = {1, 2, 3, 4, 5, 6};

for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] % 2 == 0) {
        System.out.println("Skipping even number: " + numbers[i]);
        continue;  // 当前数为偶数，跳过本次迭代，继续下一次迭代
    }

    System.out.println("Current number: " + numbers[i]);
}
```

下面是一个使用 `continue` 的 `while` 循环示例，它用于打印 1 到 10 中的奇数：

```java
int i = 1;

while (i <= 10) {
    if (i % 2 == 0) {
        i++;
        continue;  // 当前数为偶数，跳过本次迭代，继续下一次迭代
    }

    System.out.println("Odd number: " + i);
    i++;
}
```

两个例子中，使用 `continue` 跳过了偶数的打印。如果不使用 `continue`，程序会打印所有的数字。

需要注意的是，在循环内部使用 `continue` 和 `break` 时，需要确保它们不会影响循环的正常运行。否则，可能会导致程序出现逻辑错误或死循环等问题。因此，使用 `break` 和 `continue` 时需要慎重。

### 项目贷款计算器

贷款计算器的原理是根据用户输入的贷款总额、贷款期限和年利率，计算出每月需要还款的金额和还款总额。具体实现过程包括以下几个步骤：

1. 读取用户输入的贷款总额、贷款期限和年利率等参数。
2. 根据年利率计算每月的利率，即将年利率除以12。
3. 计算还款总期数，即贷款期限乘以12个月。
4. 使用贷款总额、月利率和还款总期数，计算出每月需要还款的金额。计算公式为：月还款金额 = 贷款总额 * 月利率 * (1 + 月利率) ^ 还款总期数 / ((1 + 月利率) ^ 还款总期数 - 1)。
5. 使用每月还款金额和还款总期数，计算出还款总额，即还款总额 = 每月还款金额 * 还款总期数。
6. 输出计算结果。

贷款计算程序的核心是数学公式，需要使用数学知识进行计算。同时，还需要注意数据类型的选择和精度的处理，以保证计算结果的正确性。

### 实现贷款计算器

```java
package me.ereach.mortgage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取贷款总额
        System.out.print("请输入贷款总额（万元）：");
        double totalLoan = scanner.nextDouble() * 10000;

        // 读取贷款期限
        System.out.print("请输入贷款期限（年）：");
        int loanTerm = scanner.nextInt();

        // 读取年利率
        System.out.print("请输入年利率（%）：");
        double annualInterestRate = scanner.nextDouble() / 100;

        // 计算每月还款金额
        double monthlyInterestRate = annualInterestRate / 12;
        int totalPayments = loanTerm * 12;
        double monthlyPayment = (totalLoan * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments))
                / (Math.pow(1 + monthlyInterestRate, totalPayments) - 1);

        // 计算还款总额
        double totalPayment = monthlyPayment * totalPayments;

        // 输出计算结果
        System.out.printf("每月还款金额为：%.2f 元%n", monthlyPayment);
        System.out.printf("还款总额为：%.2f 元%n", totalPayment);
    }
}
```

执行该程序：

```bash
请输入贷款总额（万元）：30
请输入贷款期限（年）：20
请输入年利率（%）：4.2
每月还款金额为：1849.71 元
还款总额为：443930.93 元

Process finished with exit code 0
```

## 编写干净的代码

### 干净代码指南

编写干净的 Java 代码需要遵循一些最佳实践和编程规范。以下是一些建议：

1. 代码风格：遵循统一的代码风格，如使用相同的缩进、命名规范等。可以使用代码格式化工具来自动化风格一致性。
2. 注释：在代码中添加注释，解释代码的目的和作用。注释应该简洁明了，不过度解释。
3. 函数和方法：函数和方法应该尽量保持短小精悍，一般不应该超过 20 行。函数和方法应该只做一件事，并尽可能保持单一职责原则。
4. 变量和常量：变量和常量应该命名清晰明了，能够表达其作用和含义。避免使用单个字母或缩写来表示变量或常量。
5. 错误处理：需要正确地处理错误和异常，避免让程序崩溃或出现不可预料的行为。应该使用 try-catch 块捕获异常，并根据异常类型处理错误情况。
6. 单元测试：编写单元测试用例，对代码进行测试并确保其正确性。单元测试可以使用测试框架，如 JUnit。
7. 代码复用：尽可能避免写重复的代码，通过抽象出共通的部分实现代码复用。可以使用继承、组合等方式实现代码复用。
8. 模块化：将代码分解成模块，每个模块实现一个清晰的功能。模块之间应该尽可能保持低耦合度，高内聚度。
9. 异步编程：在需要并发执行的任务上使用异步编程，提高程序的并发性能。可以使用线程、Future/Promise、CompletableFuture 等方式实现异步编程。
10. 性能优化：在需要进行性能优化时，需要使用性能测试工具评估性能，并使用性能优化技术，如缓存、调整算法、减少 IO 操作等。

以上是编写干净的 Java 代码的一些建议和规范，这些规范可以让代码更加易读、易懂、易扩展和易维护。