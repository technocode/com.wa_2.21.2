package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiSecureQrCodeDisplayActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.3SI  reason: invalid class name */
public class AnonymousClass3SI extends AnonymousClass0JW {
    public final Bitmap A00;
    public final AnonymousClass088 A01;
    public final AnonymousClass3G3 A02;
    public final WeakReference A03;

    public AnonymousClass3SI(Context context, Bitmap bitmap, AnonymousClass088 r4, AnonymousClass3G3 r5) {
        this.A03 = new WeakReference(context);
        this.A00 = bitmap;
        this.A01 = r4;
        this.A02 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass0JW
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A02(java.lang.Object[] r8) {
        /*
            r7 = this;
            java.lang.String r0 = "PAY: ShareQrCodeUtil start share QR code background job"
            com.whatsapp.util.Log.i(r0)
            java.lang.String r0 = "android.intent.action.SEND"
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r0)
            java.lang.String r0 = "image/*"
            r6.setType(r0)
            X.088 r0 = r7.A01
            java.io.File r1 = r0.A07()
            java.lang.String r0 = "qrcode.jpg"
            java.io.File r1 = X.AnonymousClass089.A01(r1, r0)
            java.lang.ref.WeakReference r0 = r7.A03
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            android.net.Uri r5 = X.C006803i.A06(r0, r1)
            r4 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0050 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0050 }
            android.graphics.Bitmap r0 = r7.A00     // Catch:{ all -> 0x0049 }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0)     // Catch:{ all -> 0x0049 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0049 }
            r0 = 100
            r2.compress(r1, r0, r3)     // Catch:{ all -> 0x0049 }
            r3.close()
            java.lang.String r0 = "android.intent.extra.STREAM"
            r6.putExtra(r0, r5)
            android.content.Intent r4 = android.content.Intent.createChooser(r6, r4)
            return r4
        L_0x0049:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0
        L_0x0050:
            r1 = move-exception
            java.lang.String r0 = "PAY: ShareQrCodeUtil cannot process qr code for sharing"
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3SI.A02(java.lang.Object[]):java.lang.Object");
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Intent intent = (Intent) obj;
        IndiaUpiSecureQrCodeDisplayActivity indiaUpiSecureQrCodeDisplayActivity = this.A02.A00;
        if (intent == null || intent.resolveActivity(indiaUpiSecureQrCodeDisplayActivity.getPackageManager()) == null) {
            ((ActivityC004702f) indiaUpiSecureQrCodeDisplayActivity).A0F.A06(R.string.share_qr_code_failed, 1);
            return;
        }
        indiaUpiSecureQrCodeDisplayActivity.startActivityForResult(intent, 1006);
        indiaUpiSecureQrCodeDisplayActivity.A00.setDrawingCacheEnabled(false);
    }
}
