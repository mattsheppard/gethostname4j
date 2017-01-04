package com.kstruct.gethostname4j;

import com.sun.jna.Library;
import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.Kernel32Util;

public class Hostname {
    private interface UnixCLibrary extends Library {
        UnixCLibrary INSTANCE = (UnixCLibrary) Native.loadLibrary("c", UnixCLibrary.class);
        public int gethostname(byte[] hostname, int bufferSize);
    }

    public static String getHostname() {
        if (Platform.isWindows()) {
            return Kernel32Util.getComputerName();
        } else {
            byte[] hostnameBuffer = new byte[4097];
            
            UnixCLibrary.INSTANCE.gethostname(hostnameBuffer, hostnameBuffer.length);
            
            return Native.toString(hostnameBuffer);
        }
    }
}
