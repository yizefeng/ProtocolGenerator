package com.mytech.framework.protocol.generator.element;

import com.mytech.framework.protocol.generator.rule.algorithm.BaseProtocolAlgorithm;

import java.util.List;

/**
 * Created by zengqiang on 2018/10/21.
 * Э����ɵ�Ԫ
 */
public class ProtocolElement {
    //Э�鵥Ԫ��ʼ����
    private int startIndex;
    //Э�鵥Ԫ����
    private int length;
    //Э������
    private String description;
    //�õ�Ԫ�Ƿ�̶�����
    private boolean fixedIndex;
    //�õ�Ԫ���ֽ�����
    private byte[] data;
    //�õ�Ԫ�ֽ������Ƿ񲻿ɱ�
    private boolean fixedData;
    //�õ�Ԫ�Ľ����� 2 8 10 16
    private int radix;
    //�õ�Ԫ��ʮ���ơ�ʮ�����Ƶı�����ʽ
    private String dataStr;
    //�Ƿ�ִ���㷨
    private boolean algorithmWork;
    //�õ�Ԫ����ִ�е��㷨
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
