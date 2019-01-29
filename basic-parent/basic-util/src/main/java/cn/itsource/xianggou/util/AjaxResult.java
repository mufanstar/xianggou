package cn.itsource.xianggou.util;

public class AjaxResult {

    private Boolean isSuccess;

    private String message;

    private Object resultDate;

    public Boolean getSuccess() {
        return isSuccess;
    }

    public AjaxResult setSuccess(Boolean success) {
        isSuccess = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getResultDate() {
        return resultDate;
    }

    public AjaxResult setResultDate(Object resultDate) {
        this.resultDate = resultDate;
        return this;
    }

    public static AjaxResult getInstance(){
        return new AjaxResult();
    }
}
