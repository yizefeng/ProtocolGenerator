package com.mytech.framework.protocol.generator.element;

import com.mytech.framework.protocol.generator.rule.algorithm.BaseProtocolAlgorithm;

import java.util.List;

/**
 * Created by zengqiang on 2018/10/21.
 * 协议组成单元
 */
public class ProtocolElement {
    //协议单元开始索引
    private int startIndex;
    //协议单元长度
    private int length;
    //协议描述
    private String description;
    //该单元是否固定索引
    private boolean fixedIndex;
    //该单元的字节数据
    private byte[] data;
    //该单元字节数据是否不可变
    private boolean fixedData;
    //该单元的进制数 2 8 10 16
    private int radix;
    //该单元的十进制、十六进制的表现形式
    private String dataStr;
    //是否执行算法
    private boolean algorithmWork;
    //该单元的需执行的算法
    private List<BaseProtocolAlgorithm> algorithms;

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFixedIndex() {
        return fixedIndex;
    }

    public void setFixedIndex(boolean fixedIndex) {
        this.fixedIndex = fixedIndex;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public boolean isFixedData() {
        return fixedData;
    }

    public void setFixedData(boolean fixedData) {
        this.fixedData = fixedData;
    }

    public int getRadix() {
        return radix;
    }

    public void setRadix(int radix) {
        this.radix = radix;
    }

    public String getDataStr() {
        return dataStr;
    }

    public void setDataStr(String dataStr) {
        this.dataStr = dataStr;
    }

    public boolean isAlgorithmWork() {
        return algorithmWork;
    }

    public void setAlgorithmWork(boolean algorithmWork) {
        this.algorithmWork = algorithmWork;
    }

    public List<BaseProtocolAlgorithm> getAlgorithms() {
        return algorithms;
    }

    public void setAlgorithms(List<BaseProtocolAlgorithm> algorithms) {
        this.algorithms = algorithms;
    }

}
