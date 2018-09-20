package com.pipi.gof.singleton;

/**
 1. 饿汉模式 EagerSingleton
    没有加锁，执行效率会提高。基于 classloader 机制避免了多线程的同步问题。
    类加载时就初始化，浪费内存。

 2. 懒汉模式 SluggardSingleton
    第一次调用才初始化，避免内存浪费。
    必须加锁 synchronized 才能保证单例，较复杂。

 3. 静态内部类 StaticInnerClassSingleton
    利用了 classloader 机制来保证初始化 instance 时只有一个线程。
    能达到双检锁方式一样的功效，但实现更简单。

 4. 枚举 EnumSingleton
    这是实现单例模式的最佳方法。
    它更简洁，自动支持序列化机制，绝对防止多次实例化。
    不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。


 保证一个类仅有一个实例，并提供一个访问它的全局访问点。

 1、单例类只能有一个实例。
 2、单例类必须自己创建自己的唯一实例。
 3、单例类必须给所有其他对象提供这一实例。
*/
