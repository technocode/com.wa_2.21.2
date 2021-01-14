package com.whatsapp.util;

import X.AnonymousClass008;
import android.system.ErrnoException;
import android.system.Os;
import java.io.File;

public class FileUtils$OsRename {
    public static int attempt(File file, File file2) {
        try {
            Os.rename(file.getAbsolutePath(), file2.getAbsolutePath());
            return -1;
        } catch (ErrnoException e) {
            StringBuilder A0S = AnonymousClass008.A0S("MMS Os.rename also failed, from=");
            A0S.append(file.getAbsolutePath());
            A0S.append(" to=");
            A0S.append(file2.getAbsolutePath());
            A0S.append(" errno=");
            A0S.append(e.errno);
            Log.e(A0S.toString(), e);
            return e.errno;
        }
    }
}
