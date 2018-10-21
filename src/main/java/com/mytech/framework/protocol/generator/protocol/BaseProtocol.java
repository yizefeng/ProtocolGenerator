package com.mytech.framework.protocol.generator.protocol;

import com.mytech.framework.protocol.generator.element.ProtocolElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zengqiang on 2018/10/21
 * Э��ĸ���
 */
public class BaseProtocol {
    //Э������
    private int type;
    //Э������
    private String name;
    //Э�����
    private String code;

    private List<ProtocolElement> elements = new ArrayList<ProtocolElement>();

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
