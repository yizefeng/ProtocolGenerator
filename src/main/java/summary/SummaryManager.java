package summary;

/**
 * Created by zengqiang on 2018/10/25.
 */
public class SummaryManager {

    public void getMaxByHour(Long companyId, Long lineId, String date, String code, int hour){

    }

    public void getMinByHour(Long companyId, Long lineId, String date, String code, int hour){

    }

    public void getMaxByDay(Long companyId, Long lineId, String date, String code, int day){

    }

    public void getMinByDay(Long companyId, Long lineId, String date, String code, int day){

    }

    //根据小时获取数据
    public void getByHour(Long companyId, Long lineId, String date, String code, int hour){

    }

    //根据天获取
    public void getByDay(Long companyId, Long lineId, String date, String code, int day){

    }

    /***
     * 在dtu连上的时候做处理
     * @param comanyId
     * @param lineId
     */
    public void preCreateDBResult(Long comanyId, Long lineId){

    }

    /***
     * 更新或插入操作
     * @param companyId
     * @param lineId
     */
    public void updateOrInsert(Long companyId, Long lineId){
        Long id = null;
        if(lineId == null){
            id = getCompanySummaryId(companyId);
            updateById(id);
        }else{
            id = getLineSumamryId(companyId, lineId);
            updateById(id);
        }
        if(id == null){
            //insert();
        }
    }

    //根据id更新
    private void updateById(Long id) {

    }

    private Long getLineSumamryId(Long companyId, Long lineId) {
        return null;
    }

    private Long getCompanySummaryId(Long companyId) {
        return null;
    }

}
