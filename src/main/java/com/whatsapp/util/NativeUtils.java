package com.whatsapp.util;

import java.io.FileDescriptor;
import java.net.Socket;

public final class NativeUtils {
    public static native int getBytesInSocketOutputQueue(int i);

    public static native int getFileDescriptorForFileDescriptor(FileDescriptor fileDescriptor);

    public static native int getFileDescriptorForSocket(Socket socket);

    public static native void nativeInit();

    static {
        nativeInit();
    }
}
