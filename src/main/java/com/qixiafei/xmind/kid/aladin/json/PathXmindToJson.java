package com.qixiafei.xmind.kid.aladin.json;

import com.qixiafei.xmind.kid.Constants;
import org.xmind.core.CoreException;

import java.io.IOException;
import java.io.OutputStream;

/**
 * <P>Description: 将文件路径为文件来源的xmind文件转换成json格式. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:    </P>
 * <P>CREATE DATE: 2019/4/30 22:17</P>
 * <P>UPDATE DATE: </P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public class PathXmindToJson extends AbstractPathXmindToJson {

    private static PathXmindToJson THIS = new PathXmindToJson();

    public static PathXmindToJson getInstance() {
        return THIS;
    }


    private PathXmindToJson() {
    }

    @Override
    public void parse(final String xmindPath, final OutputStream os) throws IOException, CoreException {
        final String json = getJson(xmindPath);
        os.write(json.getBytes(Constants.UTF_8_CHARSHET));
        os.flush();
    }

    @Override
    public void parse(final String xmindPath, final String targetUri) {

    }

    @Override
    public byte[] parse(final String xmindPath) throws IOException, CoreException {
        final String json = getJson(xmindPath);
        return json.getBytes(Constants.UTF_8_CHARSHET);
    }
}
