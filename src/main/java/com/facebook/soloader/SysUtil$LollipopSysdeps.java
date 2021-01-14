package com.facebook.soloader;

import X.AnonymousClass11T;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public final class SysUtil$LollipopSysdeps {
    public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) {
        try {
            Os.posix_fallocate(fileDescriptor, 0, j);
        } catch (ErrnoException e) {
            int i = e.errno;
            if (i != OsConstants.EOPNOTSUPP && i != OsConstants.ENOSYS && i != OsConstants.EINVAL) {
                throw new IOException(e.toString(), e);
            }
        }
    }

    public static String[] getSupportedAbis() {
        String[] strArr = Build.SUPPORTED_ABIS;
        TreeSet treeSet = new TreeSet();
        try {
            if (Os.readlink("/proc/self/exe").contains("64")) {
                treeSet.add(AnonymousClass11T.AARCH64.value);
                treeSet.add(AnonymousClass11T.X86_64.value);
            } else {
                treeSet.add(AnonymousClass11T.ARM.value);
                treeSet.add(AnonymousClass11T.X86.value);
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (treeSet.contains(str)) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        } catch (ErrnoException e) {
            Log.e("SysUtil", String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", Arrays.toString(strArr), Integer.valueOf(e.errno), e.getMessage()));
            return strArr;
        }
    }
}
