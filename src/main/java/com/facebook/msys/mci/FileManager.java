package com.facebook.msys.mci;

import X.C002601j;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;

public class FileManager {
    public static final String CACHE_SCHEMA = "cache://";
    public static final String FILE_SCHEMA = "file://";
    public static final String TAG = "FileManager";
    public static File mCacheDir;
    public static boolean sInitialized;

    public static native void nativeInitialize();

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0035, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean copyFile(java.lang.String r4, java.lang.String r5) {
        /*
            java.io.File r1 = getFileFromPathWithOptionalScheme(r4)
            java.io.File r4 = getFileFromPathWithOptionalScheme(r5)
            boolean r0 = r4.exists()
            r3 = 0
            if (r0 == 0) goto L_0x0010
            return r3
        L_0x0010:
            tryToCreateDirectoryOfFile(r5)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0036 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0036 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x002f }
            r1.<init>(r4)     // Catch:{ all -> 0x002f }
            copyInputStreamIntoOutputStream(r2, r1)     // Catch:{ all -> 0x0028 }
            r1.close()
            r0 = 1
            r2.close()
            return r0
        L_0x0028:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            throw r0
        L_0x002f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0035 }
        L_0x0035:
            throw r0
        L_0x0036:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.FileManager.copyFile(java.lang.String, java.lang.String):boolean");
    }

    public static void copyInputStreamIntoOutputStream(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static boolean createDirectory(String str) {
        File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
        if (!fileFromPathWithOptionalScheme.exists() || !fileFromPathWithOptionalScheme.isDirectory()) {
            return fileFromPathWithOptionalScheme.mkdirs();
        }
        return true;
    }

    public static boolean deleteItem(String str) {
        return deleteItemRecursive(getFileFromPathWithOptionalScheme(str));
    }

    public static boolean deleteItemRecursive(File file) {
        if (!file.isDirectory()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        boolean z = true;
        for (File file2 : listFiles) {
            if (!file2.isDirectory() ? !z || !file2.delete() : !z || !deleteItemRecursive(file2)) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!file.delete() || !z) {
            return false;
        }
        return true;
    }

    public static String getCacheDirectory() {
        return mCacheDir.toString();
    }

    public static synchronized File getFileFromPathWithOptionalScheme(String str) {
        synchronized (FileManager.class) {
            if (str.startsWith(FILE_SCHEMA)) {
                try {
                    return new File(new URI(str));
                } catch (URISyntaxException e) {
                    throw new RuntimeException(e);
                }
            } else if (str.startsWith(CACHE_SCHEMA)) {
                return new File(mCacheDir, str.substring(8));
            } else {
                return new File(str);
            }
        }
    }

    public static synchronized boolean initialize(File file) {
        synchronized (FileManager.class) {
            C002601j.A01("FileManager.initialize");
            try {
                if (sInitialized) {
                    return false;
                }
                mCacheDir = file;
                nativeInitialize();
                sInitialized = true;
                C002601j.A00();
                return true;
            } finally {
                C002601j.A00();
            }
        }
    }

    public static boolean itemExists(String str) {
        return getFileFromPathWithOptionalScheme(str).exists();
    }

    public static String[] listDirectory(String str) {
        File[] listFiles = getFileFromPathWithOptionalScheme(str).listFiles();
        if (listFiles == null) {
            return null;
        }
        int length = listFiles.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = listFiles[i].getAbsolutePath();
        }
        return strArr;
    }

    public static boolean moveFile(String str, String str2) {
        File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
        File fileFromPathWithOptionalScheme2 = getFileFromPathWithOptionalScheme(str2);
        if (fileFromPathWithOptionalScheme.equals(fileFromPathWithOptionalScheme2) || fileFromPathWithOptionalScheme.renameTo(fileFromPathWithOptionalScheme2)) {
            return true;
        }
        if (copyFile(str, str2)) {
            return fileFromPathWithOptionalScheme.delete();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] readFile(java.lang.String r6) {
        /*
            java.io.File r1 = getFileFromPathWithOptionalScheme(r6)     // Catch:{ IOException -> 0x0034 }
            java.lang.String r6 = "Cannot read more than 2GB into an array"
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0034 }
            r5.<init>(r1, r0)     // Catch:{ IOException -> 0x0034 }
            long r3 = r5.length()     // Catch:{ all -> 0x002d }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0022
            int r0 = (int) r3     // Catch:{ all -> 0x002d }
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x002d }
            r5.readFully(r0)     // Catch:{ all -> 0x002d }
            r5.close()
            return r0
        L_0x0022:
            java.lang.String r0 = "FileUtils"
            android.util.Log.e(r0, r6)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r6)
            throw r0
        L_0x002d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0033 }
        L_0x0033:
            throw r0
        L_0x0034:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.FileManager.readFile(java.lang.String):byte[]");
    }

    public static void tryToCreateDirectoryOfFile(String str) {
        File parentFile = getFileFromPathWithOptionalScheme(str).getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0029, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean writeDataToFile(byte[] r1, java.lang.String r2) {
        /*
            tryToCreateDirectoryOfFile(r2)
            java.io.File r0 = getFileFromPathWithOptionalScheme(r2)
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x002a }
            r2.<init>(r1)     // Catch:{ IOException -> 0x002a }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0023 }
            r1.<init>(r0)     // Catch:{ all -> 0x0023 }
            copyInputStreamIntoOutputStream(r2, r1)     // Catch:{ all -> 0x001c }
            r1.close()
            r0 = 1
            r2.close()
            return r0
        L_0x001c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0022 }
        L_0x0022:
            throw r0
        L_0x0023:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0029 }
        L_0x0029:
            throw r0
        L_0x002a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.FileManager.writeDataToFile(byte[], java.lang.String):boolean");
    }
}
