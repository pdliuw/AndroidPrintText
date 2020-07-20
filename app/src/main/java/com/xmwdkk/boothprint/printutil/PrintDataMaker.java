package com.xmwdkk.boothprint.printutil;

import java.util.List;

/**
 * Print
 *
 * @author air
 */

public interface PrintDataMaker {
    List<byte[]> getPrintData(int type);
}
