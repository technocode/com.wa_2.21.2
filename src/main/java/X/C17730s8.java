package X;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.0s8  reason: invalid class name and case insensitive filesystem */
public class C17730s8 {
    public static final String A00 = AbstractC17610rq.A01("WrkDbPathHelper");
    public static final String[] A01 = {"-journal", "-shm", "-wal"};

    public static void A00(Context context) {
        String format;
        File file;
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        if (Build.VERSION.SDK_INT >= 23 && databasePath.exists()) {
            AbstractC17610rq A002 = AbstractC17610rq.A00();
            String str = A00;
            A002.A02(str, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap hashMap = new HashMap();
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                File databasePath2 = context.getDatabasePath("androidx.work.workdb");
                if (i < 23) {
                    file = context.getDatabasePath("androidx.work.workdb");
                } else {
                    file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
                }
                hashMap.put(databasePath2, file);
                String[] strArr = A01;
                for (String str2 : strArr) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(databasePath2.getPath());
                    sb.append(str2);
                    File file2 = new File(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(file.getPath());
                    sb2.append(str2);
                    hashMap.put(file2, new File(sb2.toString()));
                }
            }
            for (File file3 : hashMap.keySet()) {
                File file4 = (File) hashMap.get(file3);
                if (file3.exists() && file4 != null) {
                    if (file4.exists()) {
                        AbstractC17610rq.A00().A05(str, String.format("Over-writing contents of %s", file4), new Throwable[0]);
                    }
                    if (file3.renameTo(file4)) {
                        format = String.format("Migrated %s to %s", file3, file4);
                    } else {
                        format = String.format("Renaming %s to %s failed", file3, file4);
                    }
                    AbstractC17610rq.A00().A02(str, format, new Throwable[0]);
                }
            }
        }
    }
}
