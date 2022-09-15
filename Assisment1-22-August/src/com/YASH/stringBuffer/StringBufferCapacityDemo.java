package com.YASH.stringBuffer;

public class StringBufferCapacityDemo
{
    public static void main(String[] args)
    {
        StringBuffer sb=new StringBuffer();
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
        sb.append("welcome");
        sb.trimToSize();
        System.out.println(sb.capacity());
    }
}