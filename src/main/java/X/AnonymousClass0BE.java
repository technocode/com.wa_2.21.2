package X;

import android.net.Uri;

/* renamed from: X.0BE  reason: invalid class name */
public class AnonymousClass0BE {
    public static volatile AnonymousClass0BE A03;
    public AnonymousClass00C A00;
    public AnonymousClass00G A01;
    public AnonymousClass00D A02;

    public AnonymousClass0BE(AnonymousClass00G r1, AnonymousClass00C r2, AnonymousClass00D r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    public static final Uri A00(String str, String str2, String str3) {
        Uri.Builder appendPath = new Uri.Builder().scheme("content").authority("com.whatsapp.provider.MigrationContentProvider").appendPath(str);
        if (str2 != null) {
            appendPath.appendQueryParameter("query_param_country_code", str2);
        }
        if (str3 != null) {
            appendPath.appendQueryParameter("query_param_phone_number", str3);
        }
        return appendPath.build();
    }

    public static AnonymousClass0BE A01() {
        if (A03 == null) {
            synchronized (AnonymousClass0BE.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass0BE(AnonymousClass00G.A01, AnonymousClass00C.A00(), AnonymousClass00D.A00());
                }
            }
        }
        return A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02(java.io.FileDescriptor r5, java.io.File r6) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BE.A02(java.io.FileDescriptor, java.io.File):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r1 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A03(java.lang.String r4, java.io.File r5) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BE.A03(java.lang.String, java.io.File):int");
    }
}
