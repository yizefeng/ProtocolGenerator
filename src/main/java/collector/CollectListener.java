package collector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/**
 * Created by zengqiang on 2018/10/25.
 * 采集时间监听
 */
public abstract class CollectListener{
    /***层级监听器***/
    //上级监听器
    private CollectListener parent;
    //子监听器 用于监听采集事件
    private List<CollectListener> subListeners = new ArrayList<CollectListener>();
    //子监听器地址映射 用于寻址，处理消息事件
    private Map<String, CollectListener> addrMapping = new HashMap<String, CollectListener>();


    public void receiveMsg(byte[] msg){
        if(subListeners == null || subListeners.size() == 0){
            handleMsg(msg);
        }else{
            dispatch(msg);
        }
    }

    //执行采集命令
    public void collect(CollectEvent event){

    }

    //分发消息到制定的subListener
    protected void dispatch(byte[] msg){

    };

    //处理消息
    protected void handleMsg(byte[] msg){

    };


    public void sendMsg(byte[] msg){
        if(parent != null){
            parent.sendMsg(msg);
        }else{
            sendOut(msg);
        }
    }

    //采用socket发出命令
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

    public void setSubListeners(List<CollectListener> subListeners) {
        this.subListeners = subListeners;
    }

    public void addSubListeners(CollectListener subListener){
        subListeners.add(subListener);
    }

    public void removeSubListener(CollectListener subListener){
        subListeners.remove(subListener);
    }
}
