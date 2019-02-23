# Java Design Pattern

## 创建型模式

- 简单工厂模式

  简单工厂模式通过向工厂中的静态方法传递参数来获取对应的对象实例。

- 工厂方法模式

  工厂方法模式通过抽象类或者接口抽象出工厂类的共同方法，每个产品对应一个工厂子类（或工厂实现类）。

- 抽象工厂模式

  抽象工厂模式涉及到产品族和产品等级结构，通常一个产品族一个工厂。

- 建造者模式

  建造者模式关键思想在于一步一步构建一个复杂对象。

- 原型模式

  **定义**: 使用原型实例指定待创建的对象的类型，并通过复制这个原型来创建新的对象。

  原型模式指创建相同或相似的对象，实现关键在于复制，实现`clonable`接口的`clone()`方法，或者通过写入流中再写出实现深复制。**原型管理器**的实现也是一个要点。

- 单例模式

  **定义**:  确保一个类只有一个实例，并提供一个全局访问点来访问这个唯一实例。

  单例模式的四种写法：
  
  - 饿汉单例模式
  
  - 使用`synchronized`实现线程安全的懒汉单例模式
  
  - 使用双重锁机制和`volatile`实现线程安全的懒汉单例模式
  
  - 使用IoDH利用Java虚拟机实现线程安全的懒汉单例模式 


## 结构型模式

- 适配器模式

  **定义**: 将一个类的接口转换成客户希望的另一个接口。适配器模式让那些接口不兼容的类可以一起工作。

  - 类适配器: 一般只存在继承和实现关系。
  
  - 对象适配器: 存在关联、继承或实现关系。
  
  - 默认适配器: 通过一个抽象类实现所有的目标方法，但实现并不写出具体的逻辑，而是使用空方法，再去继承这个抽象类进而只实现一部分目标方法。
  
  - 双向适配器: 目标类也可以是适配类。

- 桥接模式

  **定义**: 将抽象部分与它的实现部分解耦，使得两者都能够独立变化。
  
  实现桥接模式的关键在于将系统的两个独立的维度分开，并使用关联关系而不是继承关系来连接这两个独立的维度，从而降低类的个数和系统复杂度。

- 组合模式

  **定义**: 组合多个对象形成**树形结构**以表示具有部分—整体关系的层次结构。组合模式让客户端可以统一对待单个对象和组合对象。
  
  组合模式的典型实现就是操作系统的**目录结构**：文件夹——文件。
  
  组合模式又可以分为**透明组合模式**和**安全组合模式**。

- 装饰模式

  **定义**: 动态地给一个对象增加一些额外的职责。就扩展功能而言，装饰模式提供了一种比使用子类更灵活的替代方案。
  
  一般而言，装饰模式可以多重装饰，即透明装饰模式。而半透明装饰模式只能实现一次装饰，但是可以单独调用增添的功能。

- 外观模式

  **定义**: 为子系统中的一组接口提供一个统一的入口。外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
  
  外观模式的外观类相当于服务员，你作为客户端只需要跟服务员交互，具体的实现细节客户端不需要管。

- 享元模式

  **定义**: 运用共享技术有效地支持大量细粒度对象的复用。
  
  享元模式中通过提供享元池用于存储已经创建好的享元对象。通过享元模式创建的对象是同一对象，即使用`==`判断的结果为`true`，而在原型模式中创建的对象内容是一样的，但不是同一个对象。

  享元模式典型的实现就是`String`类。

- 代理模式

  **定义**: 给一个对象提供一个代理或占位符，并由代理对象来控制对原对象的访问。
  
  代理模式跟适配器模式、装饰模式、外观模式都有些类似，代理类可以动态地增加一些功能，可以实现对真实对象的访问控制等等。
  
  代理模式分为很多种，如远程代理、保护代理、虚拟代理、缓冲代理、只能引用代理等等。远程代理的实现机制如RMI(Remote Method Invocation)。
  
  代理模式的分类还可以分为：
  
  - 静态代理
  
  - 动态代理(JDK动态代理、CGLIB动态代理等)，使用极为广泛，是许多框架中的极为重要的设计模式，如Spring。

## 行为型模式

  行为型模式关注系统中**对象之间的交互**，研究系统在运行时**对象之间的相互同行与协作**，进一步**明确对象的职责**。
  
- 职责链模式
  
  **定义**: 避免将一个请求的发送者与接收者耦合在一起，让多个对象都有机会处理请求。将接收请求的对象连接成一条链，并且沿着这条链传递请求，直到有一个对象能够处理它为止。
  
  职责链式模式还分为一下两种：
  
  - 纯的职责链模式：一个请求处理者要么处理请求，要么不处理请求，将其交给下家。
  
  - 不纯的职责链模式：一个请求处理者可以处理部分请求，然后将请求交给下家。（一个请求对象还可以最终不被任何请求处理者对象所接受并处理）