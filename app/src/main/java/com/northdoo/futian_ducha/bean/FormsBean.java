package com.northdoo.futian_ducha.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/6/6.
 */

public class FormsBean
{

    /**
     * form : [{"name":"INSTANCE_GUID","value":"{AC1D3524-FFFF-FFFF-D2BC-5B3200000469}","lable":"实例id","type":"hidden","isMustInput":1},{"name":"DOCTITLE","value":"","lable":"发文标题","type":"textarea","isMustInput":2},{"name":"CREATETIME"},{"name":"COMDOC_CLASSIFY","value":"","lable":"文类","type":"select-one","isMustInput":1,"option":[{"value":"命令","key":"命令"},{"value":"决定","key":"决定"},{"value":"公告","key":"公告"},{"value":"通告","key":"通告"},{"value":"通知","key":"通知"},{"value":"通报","key":"通报"},{"value":"议案","key":"议案"},{"value":"报告","key":"报告"},{"value":"请示","key":"请示"},{"value":"批复","key":"批复"},{"value":"意见","key":"意见"},{"value":"函","key":"函"},{"value":"会议纪要","key":"会议纪要"},{"value":"回复","key":"回复"},{"value":"审计报告","key":"审计报告"},{"value":"审计通知书","key":"审计通知书"}]},{"name":"SECRETGRADE","value":"","lable":"密度","type":"select-one","isMustInput":1,"option":[{"value":"秘密","key":"秘密"},{"value":"机密","key":"机密"},{"value":"绝密","key":"绝密"}]},{"name":"URGENTGRADE","value":"","lable":"等级","type":"select-one","isMustInput":1,"option":[{"value":"普通","key":"普通"},{"value":"急件","key":"急件"},{"value":"特急","key":"特急"}]},{"name":"TOPIC","value":"","lable":"主题词","type":"textarea","isMustInput":1},{"name":"NEEDRECEIPT","value":"","lable":"需要回执","type":"select","isMustInput":1,"option":[{"value":0,"key":"不需要回执"},{"value":"[{\"value\":1,\"key\":\"普通回执\"},{\"value\":2,\"key\":\"会议回执\"}]","key":"需要回执（确认回执类型>>"}]},{"name":"ISDISPATCH","value":"","lable":"需要催办","type":"checkbox","isMustInput":1,"option":[{"value":0,"key":"不需要催办"},{"value":1,"key":"需要催办"}]},{"name":"ISENCRYPT"},{"name":"TASK_EXPIREDATE","value":"","lable":"（催办设置>>起始时间","type":"date","isMustInput":1},{"name":"TASK_EXPIREDDAY","value":"","lable":"催办期限","type":"text","isMustInput":1},{"name":"XMLCONTENT"},{"name":"DOCCONTENT"},{"name":"LEADERDIRECTION","value":"","lable":"区领导意见","type":"textarea","isMustInput":1},{"name":"REINSTANCEGUID"},{"name":"ISBACKRESULT","value":"","lable":"反馈办理结果回执","type":"select-one","isMustInput":1,"option":[{"value":"yes","key":"是"},{"value":"no","key":"否"}]},{"name":"TIMELIMIT","value":"","lable":"办理截止日期","type":"date","isMustInput":1},{"name":"ISUNTREAD"},{"name":"ISLIMIT","value":"","lable":"办理期限","type":"checkbox","isMustInput":1,"option":[{"value":1,"key":"有"},{"value":0,"key":"无"}]},{"name":"FILE_NO","value":"","lable":"文号","type":"text","isMustInput":1},{"name":"FENBANNUM"},{"name":"LAIWENDANWEI"},{"name":"LAIWENQUDAO"},{"name":"LIGHT"},{"name":"HOST_DEPARTMENT","value":"","lable":"主办单位id","type":"hidden","isMustInput":1},{"name":"HOST_DEPARTMENTNAME","value":"","lable":"主办单位","type":"text","isMustInput":1},{"name":"ISCLEAR"}]
     * result : success
     */

    private String result;
    private List<FormBean> form;

    public String getResult()
    {
        return result;
    }

    public void setResult(String result)
    {
        this.result = result;
    }

    public List<FormBean> getForm()
    {
        return form;
    }

    public void setForm(List<FormBean> form)
    {
        this.form = form;
    }

    public static class FormBean
    {
        /**
         * name : INSTANCE_GUID
         * value : {AC1D3524-FFFF-FFFF-D2BC-5B3200000469}
         * lable : 实例id
         * type : hidden
         * isMustInput : 1
         * option : [{"value":"命令","key":"命令"},{"value":"决定","key":"决定"},{"value":"公告","key":"公告"},{"value":"通告","key":"通告"},{"value":"通知","key":"通知"},{"value":"通报","key":"通报"},{"value":"议案","key":"议案"},{"value":"报告","key":"报告"},{"value":"请示","key":"请示"},{"value":"批复","key":"批复"},{"value":"意见","key":"意见"},{"value":"函","key":"函"},{"value":"会议纪要","key":"会议纪要"},{"value":"回复","key":"回复"},{"value":"审计报告","key":"审计报告"},{"value":"审计通知书","key":"审计通知书"}]
         */

        private String name;
        private String value;
        private String lable;
        private String type;
        private int isMustInput;
        private List<OptionBean> option;

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getValue()
        {
            return value;
        }

        public void setValue(String value)
        {
            this.value = value;
        }

        public String getLable()
        {
            return lable;
        }

        public void setLable(String lable)
        {
            this.lable = lable;
        }

        public String getType()
        {
            return type;
        }

        public void setType(String type)
        {
            this.type = type;
        }

        public int getIsMustInput()
        {
            return isMustInput;
        }

        public void setIsMustInput(int isMustInput)
        {
            this.isMustInput = isMustInput;
        }

        public List<OptionBean> getOption()
        {
            return option;
        }

        public void setOption(List<OptionBean> option)
        {
            this.option = option;
        }

        public static class OptionBean
        {
            /**
             * value : 命令
             * key : 命令
             */

            private String value;
            private String key;

            public String getValue()
            {
                return value;
            }

            public void setValue(String value)
            {
                this.value = value;
            }

            public String getKey()
            {
                return key;
            }

            public void setKey(String key)
            {
                this.key = key;
            }
        }
    }
}
