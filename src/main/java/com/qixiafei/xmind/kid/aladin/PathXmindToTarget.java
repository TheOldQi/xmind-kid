package com.qixiafei.xmind.kid.aladin;

import com.qixiafei.xmind.kid.UriProtocolEnum;
import org.xmind.core.CoreException;

import java.io.IOException;
import java.io.OutputStream;

/**
 * <P>Description: 路径类xmind文件转换成目标格式. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:    </P>
 * <P>CREATE DATE: 2019/4/30 22:06</P>
 * <P>UPDATE DATE: </P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public interface PathXmindToTarget {


    /**
     * 转换xmind文件到x格式，输出到入参输出流.
     *
     * @param xmindPath xmind文件的路径
     * @param os        输出流
     */
    void parse(final String xmindPath, final OutputStream os) throws IOException, CoreException;

    /**
     * 转换xmind文件到x格式，输出到入参uri地址（可以是http：，mailTo：，ftp“：,绝对路径，).
     *
     * @param xmindPath xmind文件的路径
     * @param targetUri 输出目标资源路径，uri头遵循
     * @see UriProtocolEnum
     */
    void parse(final String xmindPath, final String targetUri);

    /**
     * 转换xmind文件到x格式，输出到返回值字节数组.
     *
     * @param xmindPath xmind文件的路径
     * @return 转换到指定格式文件的字节数组
     */
    byte[] parse(final String xmindPath) throws IOException, CoreException;
}
