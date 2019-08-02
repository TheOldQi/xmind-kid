package com.qixiafei.xmind.kid;

import com.alibaba.fastjson.JSON;
import com.qixiafei.xmind.kid.aladin.PathXmindBeanFacotry;
import org.xmind.core.CoreException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * <P>Description: 程序入口. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:    </P>
 * <P>CREATE DATE: 2019/4/30 22:06</P>
 * <P>UPDATE DATE: </P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public class XmindParser {


    private PathXmindBeanFacotry pathXmindBeanFacotry = new PathXmindBeanFacotry();

    /**
     * 转换xmind文件到targetEnum指定格式，输出到入参输出流.
     *
     * @param xmindPath xmind文件的路径
     * @param target    目标格式枚举值
     * @param os        输出流
     */
    public void parse(final String xmindPath, final TargetEnum target, final OutputStream os) throws IOException, CoreException {
        pathXmindBeanFacotry.getBean(target).parse(xmindPath, os);
    }

    public static void main(String[] args) throws IOException, CoreException {
        if (args.length != 2) {
            System.out.println("请使用java -jar xmind-kid.jar [xmind全路径] [目标json全路径] 的方式运行该程序");
            return;
        }
        XmindParser parser = new XmindParser();
        long start = System.currentTimeMillis();
        byte[] parse = parser.parse(args[0], TargetEnum.JSON);
        try (final FileOutputStream fos = new FileOutputStream(args[1])) {
            fos.write(parse);
        }
        System.out.println("转换完成，耗时：" + (System.currentTimeMillis() - start));

    }


    private static class Test {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(final String name) {
            this.name = name;
        }
    }

    /**
     * 转换xmind文件到targetEnum指定格式，输出到入参uri地址（可以是http：，mailTo：，ftp“：,绝对路径，).
     *
     * @param xmindPath xmind文件的路径
     * @param target    目标格式枚举值
     * @param targetUri 输出目标资源路径，uri头遵循
     * @see UriProtocolEnum
     */
    public void parse(final String xmindPath, final TargetEnum target, final String targetUri) {
        pathXmindBeanFacotry.getBean(target).parse(xmindPath, targetUri);
    }

    /**
     * 转换xmind文件到targetEnum指定格式，输出到返回值字节数组.
     *
     * @param xmindPath xmind文件的路径
     * @param target    目标格式枚举值t
     * @return 转换到指定格式文件的字节数组
     */
    public byte[] parse(final String xmindPath, final TargetEnum target) throws IOException, CoreException {
        return pathXmindBeanFacotry.getBean(target).parse(xmindPath);
    }
}
