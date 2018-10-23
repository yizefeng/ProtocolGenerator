package com.mytech.framework.protocol.generator.rule;

import com.mytech.framework.protocol.generator.element.ProtocolElement;

import java.util.List;

/**
 * Created by zengqiang on 2018/10/21.
 * Э����� ��Ҫ��Э��֡��ʽ�Ķ����Э���ʹ�ù���
 */
public abstract class ProtocolRule {
    //ʶ��Э��
    protected abstract boolean reconginze(byte[] b);

    //Э��У��
    protected abstract boolean validate(byte[] b);

    //��װЭ��
    protected abstract byte[] wrap(List<ProtocolElement> list);

    //����Э��
    protected abstract List<ProtocolElement> parse(byte[] b);
}
