package X;

/* renamed from: X.1rM  reason: invalid class name and case insensitive filesystem */
public class C39351rM implements AnonymousClass2PJ {
    public final long A00;
    public final /* synthetic */ AnonymousClass1KT A01;

    public C39351rM(AnonymousClass1KT r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    @Override // X.AnonymousClass2PJ
    public String A9J() {
        return Long.toString(this.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r0 = move-exception;
     */
    @Override // X.AnonymousClass2PJ
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap ABl() {
        /*
            r6 = this;
            r4 = 0
            X.0Md r5 = new X.0Md     // Catch:{ Exception -> 0x002a, OutOfMemoryError -> 0x0028 }
            r5.<init>()     // Catch:{ Exception -> 0x002a, OutOfMemoryError -> 0x0028 }
            X.1KT r0 = r6.A01     // Catch:{ all -> 0x0021 }
            com.whatsapp.AudioPickerActivity r0 = r0.A0E     // Catch:{ all -> 0x0021 }
            android.content.Context r3 = r0.getApplicationContext()     // Catch:{ all -> 0x0021 }
            android.net.Uri r2 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x0021 }
            long r0 = r6.A00     // Catch:{ all -> 0x0021 }
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r2, r0)     // Catch:{ all -> 0x0021 }
            r5.setDataSource(r3, r0)     // Catch:{ all -> 0x0021 }
            byte[] r4 = r5.getEmbeddedPicture()     // Catch:{ all -> 0x0021 }
            r5.close()
            goto L_0x003c
        L_0x0021:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0027 }
        L_0x0027:
            throw r0
        L_0x0028:
            r2 = move-exception
            goto L_0x002b
        L_0x002a:
            r2 = move-exception
        L_0x002b:
            java.lang.String r1 = "audiofilelistactivity/albumartloader "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.d(r0)
        L_0x003c:
            if (r4 != 0) goto L_0x0041
            android.graphics.Bitmap r0 = X.AnonymousClass1RK.A05
            return r0
        L_0x0041:
            r1 = 0
            int r0 = r4.length     // Catch:{ OutOfMemoryError -> 0x0048 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r4, r1, r0)     // Catch:{ OutOfMemoryError -> 0x0048 }
            return r0
        L_0x0048:
            android.graphics.Bitmap r0 = X.AnonymousClass1RK.A05
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39351rM.ABl():android.graphics.Bitmap");
    }
}
