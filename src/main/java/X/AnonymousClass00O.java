package X;

import android.content.Context;
import com.facebook.soloader.SoLoader;
import com.whatsapp.AbstractAppShell;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.00O  reason: invalid class name */
public class AnonymousClass00O {
    public static volatile AnonymousClass00O A06;
    public Boolean A00 = null;
    public String A01;
    public Set A02 = new HashSet();
    public boolean A03 = false;
    public final AnonymousClass00Q A04;
    public final AnonymousClass00T A05;

    public AnonymousClass00O(AnonymousClass00T r2, AnonymousClass00Q r3) {
        this.A05 = r2;
        this.A04 = r3;
    }

    public static AnonymousClass00O A00() {
        if (A06 == null) {
            synchronized (AnonymousClass00O.class) {
                if (A06 == null) {
                    A06 = new AnonymousClass00O(C002101e.A00(), AnonymousClass00Q.A00());
                }
            }
        }
        return A06;
    }

    public static boolean A01(Context context, String str) {
        if (!new File(new File(new File(context.getFilesDir(), "decompressed"), AbstractAppShell.COMPRESSED_LIBS_ARCHIVE_NAME), AnonymousClass008.A0L("lib", str, ".so")).exists()) {
            AnonymousClass008.A19("whatsappassetdecompressor/load-library-from-archive File missing: ", str);
            return false;
        }
        try {
            boolean A032 = SoLoader.A03(str);
            StringBuilder sb = new StringBuilder();
            sb.append("whatsappassetdecompressor/load-library-from-archive ");
            sb.append(str);
            sb.append(A032 ? " loaded" : " failed");
            Log.d(sb.toString());
            return A032;
        } catch (UnsatisfiedLinkError e) {
            StringBuilder sb2 = new StringBuilder("whatsappassetdecompressor/load-library-from-archive error: ");
            sb2.append(str);
            Log.w(sb2.toString(), e);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(android.content.Context r10) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00O.A02(android.content.Context):boolean");
    }
}
