package com.northdoo.futian_ducha.bean;

/**
 * Created by Administrator on 2018/3/20.
 */

public class WorkFlowBean
{

    /**
     * map : {"title":"深福建发〔2018〕17号 关于印发《深圳市福田区建设工程（施工）票决定标工作指引》的通知","instanceGUID":"{AC1D3524-0000-0000-4216-20E4FFFFFFC6}","ID":"toworkflow","Workflow_GUID":"{09BFCB06-FFFF-FFFF-F7DF-40190000007B}"}
     */

    private MapBean map;

    public MapBean getMap()
    {
        return map;
    }

    public void setMap(MapBean map)
    {
        this.map = map;
    }

    public static class MapBean
    {
        /**
         * title : 深福建发〔2018〕17号 关于印发《深圳市福田区建设工程（施工）票决定标工作指引》的通知
         * instanceGUID : {AC1D3524-0000-0000-4216-20E4FFFFFFC6}
         * ID : toworkflow
         * Workflow_GUID : {09BFCB06-FFFF-FFFF-F7DF-40190000007B}
         */
        private String title;
        private String instanceGUID;
        private String ID;
        private String Workflow_GUID;

        public String getTitle()
        {
            return title;
        }

        public void setTitle(String title)
        {
            this.title = title;
        }

        public String getInstanceGUID()
        {
            return instanceGUID;
        }

        public void setInstanceGUID(String instanceGUID)
        {
            this.instanceGUID = instanceGUID;
        }

        public String getID()
        {
            return ID;
        }

        public void setID(String ID)
        {
            this.ID = ID;
        }

        public String getWorkflow_GUID()
        {
            return Workflow_GUID;
        }

        public void setWorkflow_GUID(String Workflow_GUID)
        {
            this.Workflow_GUID = Workflow_GUID;
        }
    }
}
