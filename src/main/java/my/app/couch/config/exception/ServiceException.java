package my.app.couch.config.exception;

import my.app.couch.model.code.ResCode;

public class ServiceException extends RuntimeException {

    private ResCode resCode;

    public ServiceException(ResCode resCode){
        super();
        this.resCode = resCode;
    }

    public String getResCode() {
        return resCode.getResCode();
    }

    public String getResMsg() {
        return resCode.getResMsg();
    }
}
