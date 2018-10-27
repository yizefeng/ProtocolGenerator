package collector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zengqiang on 2018/10/25.
 * �ɼ�ʱ�����
 */
public abstract class CollectListener{
    /***�㼶������***/
    //�ϼ�������
    private CollectListener parent;
    //�Ӽ����� ���ڼ����ɼ��¼�
    private List<CollectListener> subListeners = new ArrayList<CollectListener>();
    //�Ӽ�������ַӳ�� ����Ѱַ��������Ϣ�¼�
    private Map<String, CollectListener> addrMapping = new HashMap<String, CollectListener>();


    public void receiveMsg(byte[] msg){
        if(subListeners == null || subListeners.size() == 0){
            handleMsg(msg);
        }else{
            dispatch(msg);
        }
    }

    //ִ�вɼ�����
    public void collect(CollectEvent event){

    }

    //�ַ���Ϣ���ƶ���subListener
    protected void dispatch(byte[] msg){
        String addr = getSubListenerAddr(msg);
        CollectListener listener = getSubLIstenerByAddr(addr);
        if(listener != null){
            listener.handleMsg(msg);
        }
    }

    protected abstract String getSubListenerAddr(byte[] msg);

    //������Ϣ
    protected abstract void handleMsg(byte[] msg);


    public void sendMsg(byte[] msg){
        if(parent != null){
            parent.sendMsg(msg);
        }else{
            sendOut(msg);
        }
    }

    //����socket��������
    public void sendOut(byte[] msg){

    }

    public CollectListener getParent() {
        return parent;
    }

    public void setParent(CollectListener parent) {
        this.parent = parent;
    }

    public List<CollectListener> getSubListeners() {
        return subListeners;
    }

    public void addSubListeners(CollectListener listener){
        subListeners.add(listener);
    }

    public void removeSubListener(CollectListener listener){
        subListeners.remove(listener);
    }

    public void addAddrMapping(String addr, CollectListener listener){
        addrMapping.put(addr, listener);
    }

    public void removeAddrMapping(String addr){
        addrMapping.remove(addr);
    }

    protected CollectListener getSubLIstenerByAddr(String addr){
        return addrMapping.get(addr);
    };
}
