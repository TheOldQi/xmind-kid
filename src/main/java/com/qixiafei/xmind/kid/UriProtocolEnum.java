package com.qixiafei.xmind.kid;

/**
 * <P>Description: uri的协议枚举. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:    </P>
 * <P>CREATE DATE: 2019/4/30 22:13</P>
 * <P>UPDATE DATE: </P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public enum UriProtocolEnum {

    HTTP("http:", "http协议"),
    EMAIL("mailTo:", "电子邮件"),
    FTP("ftp:", "ftp协议"),
    ABSOLUTE("/", "绝对路径");

    private String code;
    private String desc;

    UriProtocolEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
