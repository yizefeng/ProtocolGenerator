package collector;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * Created by zengqiang on 2018/10/25.
 * �ɼ��¼� ��Ųɼ���Ϣ
 */
public class CollectEvent{
    //�ɼ�Ƶ��
    private int frequency;
    //����Ĳɼ�˳��
    private int sequence;

    //�㲥�ɼ��¼�
    public void broadcast(){
        Vector<CollectListener> listeners = CollectManager.newInstance().getListeners();
        if(listeners == null || listeners.size() == 0){
            System.out.println("�޲ɼ�����");
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