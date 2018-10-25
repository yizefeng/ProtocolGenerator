package collector;

import summary.DateUtil;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by zengqiang on 2018/10/25.
 */
public class CollectManager {
    private static CollectManager manager = new CollectManager();
    //�ɼ�˳��
    private AtomicInteger daySequence = new AtomicInteger();
    //�ɼ������б�
    private Vector<CollectListener> listeners = new Vector<CollectListener>();

    private CollectManager(){
    }

    public synchronized static CollectManager newInstance(){
        if(manager == null){
            manager = new CollectManager();
        }
        return manager;
    }

    public void reset(){
        daySequence.set(1);
    }

    //��ʼִ�еĲɼ������ʱ�򣬸��ݷ��ӳ�ʼ������
    public int initSequence(){
        return DateUtil.toMinites(new Date());
    }

    public int getDaySequence() {
        return daySequence.getAndIncrement();
    }

    public void addListener(CollectListener listener){
        listeners.add(listener);
    }

    public void removeListener(CollectListener listener){
        listeners.remove(listener);
    }

    public synchronized Vector<CollectListener> getListeners() {
        return listeners;
    }

}
