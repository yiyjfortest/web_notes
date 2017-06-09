package po;

import java.util.Date;

public class Paramter {
    private Integer paramterId;

    private String paramenterName1;

    private String paramenterName2;

    private String paramenterName3;

    private String paramenterName4;

    private String paramenterName5;

    private String special;

    private Date creatTime;

    private Integer effective;

    public Integer getParamterId() {
        return paramterId;
    }

    public void setParamterId(Integer paramterId) {
        this.paramterId = paramterId;
    }

    public String getParamenterName1() {
        return paramenterName1;
    }

    public void setParamenterName1(String paramenterName1) {
        this.paramenterName1 = paramenterName1 == null ? null : paramenterName1.trim();
    }

    public String getParamenterName2() {
        return paramenterName2;
    }

    public void setParamenterName2(String paramenterName2) {
        this.paramenterName2 = paramenterName2 == null ? null : paramenterName2.trim();
    }

    public String getParamenterName3() {
        return paramenterName3;
    }

    public void setParamenterName3(String paramenterName3) {
        this.paramenterName3 = paramenterName3 == null ? null : paramenterName3.trim();
    }

    public String getParamenterName4() {
        return paramenterName4;
    }

    public void setParamenterName4(String paramenterName4) {
        this.paramenterName4 = paramenterName4 == null ? null : paramenterName4.trim();
    }

    public String getParamenterName5() {
        return paramenterName5;
    }

    public void setParamenterName5(String paramenterName5) {
        this.paramenterName5 = paramenterName5 == null ? null : paramenterName5.trim();
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special == null ? null : special.trim();
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Integer getEffective() {
        return effective;
    }

    public void setEffective(Integer effective) {
        this.effective = effective;
    }
}