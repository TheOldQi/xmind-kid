package com.qixiafei.xmind.kid.aladin.json;

import com.qixiafei.xmind.kid.aladin.PathXmindToTarget;
import com.qixiafei.xmind.kid.converter.ITopic2JsonConverter;
import com.qixiafei.xmind.kid.utils.XmindUtils;
import org.xmind.core.CoreException;
import org.xmind.core.ITopic;

import java.io.IOException;

/**
 * <P>Description: path类xmind转json基类. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:    </P>
 * <P>CREATE DATE: 2019/5/5 17:15</P>
 * <P>UPDATE DATE: </P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public abstract class AbstractPathXmindToJson implements PathXmindToTarget {

    /**
     * 根据xmind文件地址获取内容转json的json串.
     *
     * @param xmindPath xmind文件保存地址
     * @return
     * @throws IOException
     * @throws CoreException
     */
    protected String getJson(final String xmindPath) throws IOException, CoreException {
        final ITopic root = XmindUtils.getRootByFilePath(xmindPath);
        return ITopic2JsonConverter.toJson(root);
    }


}
