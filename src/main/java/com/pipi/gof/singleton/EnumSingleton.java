package com.pipi.gof.singleton;

public class EnumSingleton {

    //私有化构造函数
    private EnumSingleton(){ }
 
    //定义一个静态枚举类
    static enum SingletonEnum{

        INSTANCE;

        private EnumSingleton instance;
        
        //私有化枚举的构造函数
        private SingletonEnum(){
            instance = new EnumSingleton();
        }
        
        public EnumSingleton getInstnce(){
            return instance;
        }

    }
 
    //对外暴露一个获取对象的静态方法
    public static EnumSingleton getInstance(){
        return SingletonEnum.INSTANCE.getInstnce();
    }

}
