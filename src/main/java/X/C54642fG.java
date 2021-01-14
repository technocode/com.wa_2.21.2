package X;

import android.util.JsonReader;

/* renamed from: X.2fG  reason: invalid class name and case insensitive filesystem */
public class C54642fG extends AbstractC49282Pv {
    public C54642fG(AnonymousClass00S r1, AnonymousClass0Eg r2, AnonymousClass03A r3, AnonymousClass00T r4, AnonymousClass00Y r5, AnonymousClass01X r6, C48692Ni r7) {
        super(r1, r2, r3, r4, r5, r6, r7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02b1, code lost:
        if (r13.equals("height") == false) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0313, code lost:
        if (r23 != null) goto L_0x0315;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x031f, code lost:
        if (r22 != null) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0321, code lost:
        r30 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0386, code lost:
        if (r9.equals("offset") == false) goto L_0x0388;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04e2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:?, code lost:
        r26.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04e8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d8, code lost:
        if (r2.equals("data") == false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014e, code lost:
        if (r11.equals("images") == false) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b1, code lost:
        if (r13.equals("fixed_width_still") == false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x020f, code lost:
        if (r13.equals("height") == false) goto L_0x0211;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0214 A[Catch:{ all -> 0x04e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0234 A[Catch:{ all -> 0x04e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02b6 A[Catch:{ all -> 0x04e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02d6 A[Catch:{ all -> 0x04e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02f5 A[Catch:{ all -> 0x04e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0325 A[Catch:{ all -> 0x04e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x038b A[Catch:{ all -> 0x04e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03a3 A[Catch:{ all -> 0x04e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03c0 A[Catch:{ all -> 0x04e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0109 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00dd A[Catch:{ all -> 0x04e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0153 A[Catch:{ all -> 0x04e2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass02R A01(X.C54642fG r34, java.lang.String r35, X.C44381zx r36) {
        /*
        // Method dump skipped, instructions count: 1400
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54642fG.A01(X.2fG, java.lang.String, X.1zx):X.02R");
    }

    public static final C49252Pr A02(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        int i = -1;
        int i2 = -1;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != -1221029593) {
                if (hashCode != 116079) {
                    if (hashCode == 113126854 && nextName.equals("width")) {
                        i = Integer.parseInt(jsonReader.nextString());
                    }
                } else if (nextName.equals("url")) {
                    str = jsonReader.nextString();
                }
            } else if (nextName.equals("height")) {
                i2 = Integer.parseInt(jsonReader.nextString());
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        if (str != null) {
            return new C49252Pr(str, i, i2);
        }
        return null;
    }
}
