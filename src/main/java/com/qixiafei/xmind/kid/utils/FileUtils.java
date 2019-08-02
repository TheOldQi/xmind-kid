package com.qixiafei.xmind.kid.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:    </P>
 * <P>CREATE DATE: 2019/4/30 22:34</P>
 * <P>UPDATE DATE: </P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public class FileUtils {

    private FileUtils() {
    }

    private static final int DEFAULT_BLOCK_SIZE = 1 << 12; // 4096
    private static final int MAX_FILE_SIZE = 1 << 30;//1G


    /**
     * 读取目标文件到字节数组.
     *
     * @param path 文件绝对路径
     * @return 文件内容字节数组
     */
    public static byte[] toBytes(final String path) throws IOException {
        final File file = new File(path);
        long available = file.length();
        if (available > MAX_FILE_SIZE) {
            throw new RuntimeException("要读取的文件：" + path + "，大小超过了1G,建议采用流的方式读取");
        }
        byte[] result = new byte[(int) available];

        try (final FileInputStream fis = new FileInputStream(file)) {
            fis.read(result);
            return result;
        }
    }


}
