package nari.mip.card.controller.responsebean;

/**
 * restful接口 响应对象
 */
public class ResponseBean {

    /**
     * 响应返回码
     */
    private String retcode;

    /**
     * 响应消息
     */
    private String retmsg;

    /**
     * 响应体
     */
    private Object body;

    /**
     * 分页插件
     */
    private Object pagination;

    public String getRetcode() {
        return retcode;
    }

    public void setRetcode(String retcode) {
        this.retcode = retcode;
    }

    public String getRetmsg() {
        return retmsg;
    }

    public void setRetmsg(String retmsg) {
        this.retmsg = retmsg;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public Object getPagination() {
        return pagination;
    }

    public void setPagination(Object pagination) {
        this.pagination = pagination;
    }

    /**
     * 一次性设置返回对象，返回体可以为null，返回码和返回消息不建议为null
     *
     * @param retcode    返回码
     * @param retmsg     返回消息
     * @param body       返回体
     * @param pagination 分页插件
     */
    public void setAll(String retcode, String retmsg, Object body, Object pagination) {
        this.retcode = retcode;
        this.retmsg = retmsg;
        this.body = body;
        this.pagination = pagination;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ResponseBean [retcode=");
        builder.append(retcode);
        builder.append(", retmsg=");
        builder.append(retmsg);
        builder.append(", body=");
        builder.append(body);
        builder.append("，pagination=");
        builder.append(pagination);
        builder.append("]");
        return builder.toString();
    }
}
