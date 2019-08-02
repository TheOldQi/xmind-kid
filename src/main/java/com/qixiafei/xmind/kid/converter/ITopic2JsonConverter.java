package com.qixiafei.xmind.kid.converter;

import com.alibaba.fastjson.JSONObject;
import org.xmind.core.ITopic;

/**
 * <P>Description: 根据xmind根节点转换成JSON格式. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:    </P>
 * <P>CREATE DATE: 2019/4/30 23:41</P>
 * <P>UPDATE DATE: </P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public class ITopic2JsonConverter {

    /**
     * 遍历ITopic根节点的所有子节点（包含根节点）.
     *
     * @param root topic根节点
     * @return json字符串
     */
    public static String toJson(ITopic root) {

        final JSONObject result = new JSONObject();
        toJson0(result, root);
        return result.toJSONString();
    }

    /**
     * 内部方法，通过递归将fatherTopic所有子节点内容写入father的json对象，实现对JSON格式的转换.
     *
     * @param father      JSON对象父对象
     * @param fatherTopic topic父节点
     */
    private static void toJson0(JSONObject father, ITopic fatherTopic) {
        if (fatherTopic.getAllChildren().isEmpty()) {
            return;
        }

        for (ITopic childrenTopic : fatherTopic.getAllChildren()) {
            final JSONObject children = new JSONObject();
            father.put(childrenTopic.getTitleText(), children);
            toJson0(children, childrenTopic);
        }
    }
}
