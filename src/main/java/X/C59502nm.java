package X;

import android.app.Application;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2nm  reason: invalid class name and case insensitive filesystem */
public class C59502nm extends AbstractC02610Ct {
    public static final List A01 = Arrays.asList(null, "filter_pop.png", "filter_bw.png", "filter_cool.png", "filter_chrome.png", "filter_film.png");
    public static volatile C59502nm A02;
    public final HashMap A00 = new HashMap();

    public C59502nm(AnonymousClass00G r2, AnonymousClass00S r3, AnonymousClass009 r4, AnonymousClass00T r5, AnonymousClass0CL r6, C02640Cw r7, AnonymousClass03U r8, AnonymousClass04j r9, C02660Cy r10, AnonymousClass00D r11) {
        super(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
    }

    public static C59502nm A00() {
        if (A02 == null) {
            synchronized (C59502nm.class) {
                if (A02 == null) {
                    A02 = new C59502nm(AnonymousClass00G.A01, AnonymousClass00S.A00(), AnonymousClass009.A00(), C002101e.A00(), AnonymousClass0CL.A00(), C02640Cw.A00(), AnonymousClass03U.A00(), AnonymousClass04j.A00(), C02660Cy.A00(), AnonymousClass00D.A00());
                }
            }
        }
        return A02;
    }

    public final File A0K(String str, boolean z) {
        Application application = this.A09.A00;
        if (!z) {
            return new File(application.getFilesDir(), AnonymousClass008.A0K("downloadable/filter_", str));
        }
        return new File(application.getCacheDir(), AnonymousClass008.A0L("downloadable/filter_", str, "_tmp"));
    }

    public synchronized HashMap A0L() {
        HashMap hashMap = this.A00;
        if (!hashMap.isEmpty()) {
            Log.d("FilterManager/getFiles/downloadedFiles has value");
            return hashMap;
        }
        AnonymousClass2NI A012 = A01();
        if (A012 == null) {
            Log.d("FilterManager/getFiles/localIdhash is null");
            return hashMap;
        }
        Log.d("FilterManager/getFiles/localIdhash is not null");
        File A0K = A0K(A012.A01(0), false);
        if (!A0K.exists()) {
            A0D(null, null, 0);
            return hashMap;
        }
        String[] list = A0K.list();
        if (list == null) {
            A0D(null, null, 0);
            return hashMap;
        }
        String absolutePath = A0K.getAbsolutePath();
        for (String str : list) {
            hashMap.put(str, new File(absolutePath, str));
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A0M(int r5, X.AnonymousClass2NH r6) {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59502nm.A0M(int, X.2NH):void");
    }
}
