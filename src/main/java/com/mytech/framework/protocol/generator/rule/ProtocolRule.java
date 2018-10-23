package com.mytech.framework.protocol.generator.rule;

import com.mytech.framework.protocol.generator.element.ProtocolElement;

import java.util.List;

/**
 * Created by zengqiang on 2018/10/21.
 * 协议规则 主要是协议帧格式的定义和协议的使用规则
 */
public abstract class ProtocolRule {
    //识别协议
    protected abstract boolean reconginze(byte[] b);

    //协议校验
    protected abstract boolean validate(byte[] b);

    //封装协议
    protected abstract byte[] wrap(List<ProtocolElement> list);

    //解析协议
    protected abstract List<ProtocolElement> parse(byte[] b);
}
