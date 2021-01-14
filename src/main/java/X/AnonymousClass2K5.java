package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Pair;
import java.lang.ref.WeakReference;

/* renamed from: X.2K5  reason: invalid class name */
public class AnonymousClass2K5 extends AsyncTask {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Bitmap.CompressFormat A03;
    public final Bitmap A04;
    public final Rect A05;
    public final Uri A06;
    public final AnonymousClass00C A07 = AnonymousClass00C.A00();
    public final AnonymousClass03P A08 = AnonymousClass03P.A00();
    public final WeakReference A09;
    public final boolean A0A;

    public AnonymousClass2K5(Activity activity, Uri uri, Bitmap.CompressFormat compressFormat, int i, Bitmap bitmap, Rect rect, boolean z, int i2, int i3) {
        this.A09 = new WeakReference(activity);
        this.A06 = uri;
        this.A03 = compressFormat;
        this.A01 = i;
        this.A04 = bitmap;
        this.A05 = rect;
        this.A0A = z;
        this.A00 = i2;
        this.A02 = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.util.Pair] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // android.os.AsyncTask
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doInBackground(java.lang.Object[] r13) {
        /*
        // Method dump skipped, instructions count: 297
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2K5.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Object obj) {
        Pair pair = (Pair) obj;
        super.onPostExecute(pair);
        this.A04.recycle();
        if (pair != null) {
            ((Activity) this.A09.get()).setResult(((Number) pair.first).intValue(), (Intent) pair.second);
        }
        ((Activity) this.A09.get()).finish();
    }
}
