package X;

import android.content.Context;

/* renamed from: X.2nk  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC59482nk extends AbstractC53152cc {
    public final Context A00;

    public AbstractC59482nk(Context context) {
        this.A00 = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        r0 = new java.lang.StringBuilder("failed to load SVG from ");
        r0.append(r3);
        com.whatsapp.util.Log.e(r0.toString(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033 A[ExcHandler: 0uA (e X.0uA), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Picture A00(android.content.Context r2, java.lang.String r3) {
        /*
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ 0uA -> 0x0033, IOException -> 0x0031 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 0uA -> 0x0033, IOException -> 0x0031 }
            r1.<init>()     // Catch:{ 0uA -> 0x0033, IOException -> 0x0031 }
            java.lang.String r0 = "graphics/"
            r1.append(r0)     // Catch:{ 0uA -> 0x0033, IOException -> 0x0031 }
            r1.append(r3)     // Catch:{ 0uA -> 0x0033, IOException -> 0x0031 }
            java.lang.String r1 = r1.toString()     // Catch:{ 0uA -> 0x0033, IOException -> 0x0031 }
            X.0uJ r0 = new X.0uJ     // Catch:{ 0uA -> 0x0033, IOException -> 0x0031 }
            r0.<init>()     // Catch:{ 0uA -> 0x0033, IOException -> 0x0031 }
            java.io.InputStream r1 = r2.open(r1)     // Catch:{ 0uA -> 0x0033, IOException -> 0x0031 }
            X.0u5 r0 = r0.A0P(r1)     // Catch:{ all -> 0x002c }
            r1.close()     // Catch:{ IOException -> 0x0025, 0uA -> 0x0033 }
        L_0x0025:
            if (r0 == 0) goto L_0x0045
            android.graphics.Picture r0 = r0.A00()
            return r0
        L_0x002c:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x0030, 0uA -> 0x0033 }
        L_0x0030:
            throw r0
        L_0x0031:
            r2 = move-exception
            goto L_0x0034
        L_0x0033:
            r2 = move-exception
        L_0x0034:
            java.lang.String r1 = "failed to load SVG from "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
        L_0x0045:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC59482nk.A00(android.content.Context, java.lang.String):android.graphics.Picture");
    }
}
