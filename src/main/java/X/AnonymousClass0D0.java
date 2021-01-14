package X;

import android.app.Application;
import android.util.SparseArray;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: X.0D0  reason: invalid class name */
public class AnonymousClass0D0 extends AbstractC02620Cu {
    public static volatile AnonymousClass0D0 A01;
    public final SparseArray A00 = new SparseArray();

    public AnonymousClass0D0(AnonymousClass00G r2, AnonymousClass00S r3, AnonymousClass009 r4, AnonymousClass00T r5, AnonymousClass0CL r6, C02640Cw r7, AnonymousClass03U r8, AnonymousClass04j r9, C02660Cy r10, AnonymousClass00D r11) {
        super(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
    }

    @Override // X.AbstractC02620Cu
    public Map A04(String str, int i, String str2, String str3, String str4) {
        Map A04 = super.A04(str, i, str2, str3, null);
        ((AbstractMap) A04).put("id", Integer.toString(i));
        return A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a7, code lost:
        throw r0;
     */
    @Override // X.AbstractC02620Cu
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0F(X.AbstractC28621Va r8, java.lang.String r9, int r10) {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0D0.A0F(X.1Va, java.lang.String, int):boolean");
    }

    public synchronized SparseArray A0G(int i) {
        SparseArray sparseArray = this.A00;
        if (sparseArray.get(i) != null) {
            Log.d("DoodleEmojiManager/getFiles/downloadedFiles has value");
            return sparseArray;
        }
        AnonymousClass2NI A012 = A01();
        if (A012 == null) {
            Log.d("DoodleEmojiManager/getFiles/localIdhash is null");
            return sparseArray;
        }
        A0I(i, A012.A01(i));
        return sparseArray;
    }

    public final File A0H(String str, boolean z, int i) {
        Application application = this.A09.A00;
        if (!z) {
            File filesDir = application.getFilesDir();
            StringBuilder sb = new StringBuilder();
            sb.append("downloadable/doodle_emoji_");
            sb.append(i);
            sb.append("_");
            sb.append(str);
            return new File(filesDir, sb.toString());
        }
        File cacheDir = application.getCacheDir();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("downloadable/doodle_emoji_");
        sb2.append(i);
        sb2.append("_");
        sb2.append(str);
        sb2.append("_tmp");
        return new File(cacheDir, sb2.toString());
    }

    public final void A0I(int i, String str) {
        if (str != null) {
            File A0H = A0H(str, false, i);
            if (!A0H.exists()) {
                A0D(null, null, i);
                return;
            }
            String[] list = A0H.list();
            if (list == null) {
                A0D(null, null, i);
                return;
            }
            String absolutePath = A0H.getAbsolutePath();
            for (String str2 : list) {
                this.A00.put(Integer.parseInt(str2.split("\\.")[0].split("e")[1]), new File(absolutePath, str2));
            }
        }
    }
}
