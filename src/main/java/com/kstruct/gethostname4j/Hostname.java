package com.kstruct.gethostname4j;

import com.sun.jna.Library;
import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.Pointer;

public class Hostname {
    // This is the standard, stable way of mapping, which supports extensive
    // customization and mapping of Java to native types.

    private interface CLibrary extends Library {
        CLibrary INSTANCE = (CLibrary)
            Native.loadLibrary((Platform.isWindows() ? "msvcrt" : "c"),
                               CLibrary.class);

        void printf(String format, Object... args);
        int gethostname(Pointer hostname, int bufferSize);
    }

    public static String getHostname() {
        int hostnameBufferSize = 4097;
        Memory hostnameBuffer = new Memory(hostnameBufferSize);
        
        CLibrary.INSTANCE.gethostname(hostnameBuffer, hostnameBufferSize);
        
        return hostnameBuffer.getString(0);
    }
    
    public static void main(String[] args) {
        int hostnameBufferSize = 4097;
        Memory hostnameBuffer = new Memory(hostnameBufferSize);
        
        CLibrary.INSTANCE.gethostname(hostnameBuffer, hostnameBufferSize);
        
        System.out.println(hostnameBuffer.getString(0));
    }
}
