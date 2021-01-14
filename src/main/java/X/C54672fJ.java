package X;

import android.text.TextUtils;
import android.util.JsonReader;

/* renamed from: X.2fJ  reason: invalid class name and case insensitive filesystem */
public class C54672fJ extends AbstractC49282Pv {
    public C54672fJ(AnonymousClass00S r1, AnonymousClass0Eg r2, AnonymousClass03A r3, AnonymousClass00T r4, AnonymousClass00Y r5, AnonymousClass01X r6, C48692Ni r7) {
        super(r1, r2, r3, r4, r5, r6, r7);
    }

    public static final AnonymousClass02R A01(JsonReader jsonReader) {
        int[] iArr = new int[2];
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (true) {
            int i = 0;
            if (!jsonReader.hasNext()) {
                break;
            }
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != -318184504) {
                if (hashCode != 116079) {
                    if (hashCode == 3083499 && nextName.equals("dims")) {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            if (i < 2) {
                                iArr[i] = jsonReader.nextInt();
                                i++;
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endArray();
                    }
                } else if (nextName.equals("url")) {
                    str = jsonReader.nextString();
                }
            } else if (nextName.equals("preview")) {
                str2 = jsonReader.nextString();
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return new AnonymousClass02R(null, null);
        }
        int i2 = iArr[0];
        int i3 = iArr[1];
        return new AnonymousClass02R(new C49252Pr(str, i2, i3), new C49252Pr(str2, i2, i3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e4, code lost:
        if (r4.equals("results") == false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0160, code lost:
        if (r14.equals("id") == false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a5, code lost:
        if (r14.equals("tinymp4") == false) goto L_0x01a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0165 A[Catch:{ all -> 0x02e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01aa A[Catch:{ all -> 0x02e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c3 A[Catch:{ all -> 0x02e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01e6 A[Catch:{ all -> 0x02e8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass02R A02(X.C54672fJ r28, java.lang.String r29, X.C44381zx r30) {
        /*
        // Method dump skipped, instructions count: 890
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54672fJ.A02(X.2fJ, java.lang.String, X.1zx):X.02R");
    }
}
