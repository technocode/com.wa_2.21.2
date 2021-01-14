package X;

import com.whatsapp.gallerypicker.VideoPreviewFragment;

/* renamed from: X.2ed  reason: invalid class name and case insensitive filesystem */
public class C54272ed implements AnonymousClass2PJ {
    public final /* synthetic */ VideoPreviewFragment A00;

    public C54272ed(VideoPreviewFragment videoPreviewFragment) {
        this.A00 = videoPreviewFragment;
    }

    @Override // X.AnonymousClass2PJ
    public String A9J() {
        return this.A00.A0K.getAbsolutePath();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        r0 = move-exception;
     */
    @Override // X.AnonymousClass2PJ
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap ABl() {
        /*
            r3 = this;
            X.0Md r2 = new X.0Md     // Catch:{ Exception -> 0x0023, NoSuchMethodError -> 0x0021 }
            r2.<init>()     // Catch:{ Exception -> 0x0023, NoSuchMethodError -> 0x0021 }
            com.whatsapp.gallerypicker.VideoPreviewFragment r0 = r3.A00     // Catch:{ all -> 0x001a }
            java.io.File r0 = r0.A0K     // Catch:{ all -> 0x001a }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x001a }
            r2.setDataSource(r0)     // Catch:{ all -> 0x001a }
            r0 = 1
            android.graphics.Bitmap r0 = r2.getFrameAtTime(r0)     // Catch:{ all -> 0x001a }
            r2.close()
            return r0
        L_0x001a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001c }
        L_0x001c:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0020 }
        L_0x0020:
            throw r0
        L_0x0021:
            r1 = move-exception
            goto L_0x0024
        L_0x0023:
            r1 = move-exception
        L_0x0024:
            java.lang.String r0 = "videopreview/getvideothumb"
            com.whatsapp.util.Log.e(r0, r1)
            com.whatsapp.gallerypicker.VideoPreviewFragment r0 = r3.A00
            java.io.File r0 = r0.A0K
            android.graphics.Bitmap r0 = X.C002001d.A0V(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54272ed.ABl():android.graphics.Bitmap");
    }
}
