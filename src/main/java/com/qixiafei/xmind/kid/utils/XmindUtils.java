package com.qixiafei.xmind.kid.utils;

import com.qixiafei.xmind.kid.MyTopic;
import org.xmind.core.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <P>Description: 对xmind文件操作的工具. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:    </P>
 * <P>CREATE DATE: 2019/5/5 17:00</P>
 * <P>UPDATE DATE: </P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public class XmindUtils {

    /**
     * 通过文件保存路径获取xmind根节点.
     *
     * @param filePath 本地文件保存路径
     * @return xmind根节点（虚拟节点），若不存在任何根节点，返回null
     * @throws IOException   文件找不到或无法读取等异常
     * @throws CoreException xmind核心代码异常
     */
    public static ITopic getRootByFilePath(final String filePath) throws IOException, CoreException {
        final IWorkbookBuilder builder = Core.getWorkbookBuilder();
        try (final FileInputStream fis = new FileInputStream(filePath)) {
            return getRoot0(builder.loadFromStream(fis));
        }
    }

    /**
     * 传入workbook，得到根节点.
     *
     * @param workbook
     * @return
     */
    private static ITopic getRoot0(IWorkbook workbook) {

        final List<ISheet> sheets = workbook.getSheets();
        final ITopic root;
        if (sheets.size() > 1) {
            final List<ITopic> rootTopics = new ArrayList<>(sheets.size());
            for (ISheet sheet : sheets) {
                rootTopics.add(sheet.getRootTopic());
            }
            root = new MyTopic("虚拟根节点", rootTopics);
        } else if (sheets.size() == 1) {
            root = new MyTopic("虚拟根节点", Collections.singletonList(sheets.get(0).getRootTopic()));
        } else {
            root = null;
        }
        return root;
    }
}
