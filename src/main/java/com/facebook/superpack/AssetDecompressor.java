package com.facebook.superpack;

import java.io.InputStream;

public class AssetDecompressor {
    public static native String[] decompress(InputStream inputStream, String str, String str2);

    public static native int get_architecture();

    public static native int sync_file_to_disk(String str);

    public static native void testDecompressorLibraryUsable(byte[] bArr);
}
