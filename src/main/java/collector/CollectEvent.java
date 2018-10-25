package collector;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * Created by zengqiang on 2018/10/25.
 * 采集事件 存放采集信息
 */
public class CollectEvent{
    //采集频率
    private int frequency;
    //当天的采集顺序
    private int sequence;

    //广播采集事件
    public void broadcast(){
        Vector<CollectListener> listeners = CollectManager.newInstance().getListeners();
        if(listeners == null || listeners.size() == 0){
            System.out.println("无采集对象！");
            return;
        }
        for(Iterator<CollectListener> it = listeners.iterator(); it.hasNext();){
            CollectListener listener = it.next();

        }
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }


}