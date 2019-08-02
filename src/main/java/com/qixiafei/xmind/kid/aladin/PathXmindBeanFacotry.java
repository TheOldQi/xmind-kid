package com.qixiafei.xmind.kid.aladin;

import com.qixiafei.xmind.kid.TargetEnum;
import com.qixiafei.xmind.kid.aladin.json.PathXmindToJson;

/**
 * <P>Description: 输入为xmind路径的转换bean工厂. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:    </P>
 * <P>CREATE DATE: 2019/4/30 22:25</P>
 * <P>UPDATE DATE: </P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public class PathXmindBeanFacotry {


    public PathXmindToTarget getBean(final TargetEnum target) {

        switch (target) {
            case JSON:
                return PathXmindToJson.getInstance();
            default:
                return null;
        }

    }


}
