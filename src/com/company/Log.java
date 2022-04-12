package com.company;

enum Type{
    Type1, Type2, Type3
}

public class Log {
    Type type;
    int Count;

    public Log(Type type) {
        this.type = type;
        switch (type){
            case Type1:
                Count = 1;
                break;
            case Type2:
                Count = 2;
                break;
            case Type3:
                Count = 3;
                break;
        }
    }

    public Type getType() {
        return type;
    }

    public int getCount() {
        return Count;
    }
}
