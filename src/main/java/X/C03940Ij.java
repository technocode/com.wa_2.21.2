package X;

import com.whatsapp.EmojiPicker$EmojiWeight;

/* renamed from: X.0Ij  reason: invalid class name and case insensitive filesystem */
public class C03940Ij implements AbstractC03430Gf {
    public static volatile C03940Ij A01;
    public final AnonymousClass00G A00;

    public C03940Ij(AnonymousClass00G r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC03430Gf
    public AnonymousClass2QD A3H(Object obj, float f) {
        return new EmojiPicker$EmojiWeight((int[]) obj, f);
    }

    @Override // X.AbstractC03430Gf
    public Object A6b(String str) {
        int length = str.length();
        int i = 0;
        int[] iArr = new int[str.codePointCount(0, length)];
        int i2 = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            iArr[i2] = codePointAt;
            i += Character.charCount(codePointAt);
            i2++;
        }
        return iArr;
    }

    @Override // X.AbstractC03430Gf
    public String A70(Object obj) {
        int[] iArr = (int[]) obj;
        return new String(iArr, 0, iArr.length);
    }

    /* JADX WARNING: Removed duplicated region for block: B:140:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC03430Gf
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List AAW() {
        /*
        // Method dump skipped, instructions count: 772
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03940Ij.AAW():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        r0 = move-exception;
     */
    @Override // X.AbstractC03430Gf
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AM3(java.util.List r4) {
        /*
            r3 = this;
            X.00G r0 = r3.A00     // Catch:{ IOException -> 0x0027 }
            android.app.Application r0 = r0.A00     // Catch:{ IOException -> 0x0027 }
            java.io.File r2 = r0.getFilesDir()     // Catch:{ IOException -> 0x0027 }
            java.lang.String r0 = "emoji"
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0027 }
            r1.<init>(r2, r0)     // Catch:{ IOException -> 0x0027 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0027 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0027 }
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0027 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0027 }
            r1.writeObject(r4)     // Catch:{ all -> 0x0020 }
            r1.close()
            return
        L_0x0020:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0026 }
        L_0x0026:
            throw r0
        L_0x0027:
            r0 = move-exception
            com.whatsapp.util.Log.e(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03940Ij.AM3(java.util.List):void");
    }
}
