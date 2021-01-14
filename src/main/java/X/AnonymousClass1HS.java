package X;

import android.media.MediaScannerConnection;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1HS  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1HS implements MediaScannerConnection.OnScanCompletedListener {
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ AtomicInteger A01;

    public /* synthetic */ AnonymousClass1HS(AtomicInteger atomicInteger, Runnable runnable) {
        this.A01 = atomicInteger;
        this.A00 = runnable;
    }

    public final void onScanCompleted(String str, Uri uri) {
        AtomicInteger atomicInteger = this.A01;
        Runnable runnable = this.A00;
        StringBuilder sb = new StringBuilder("fmessageio/rescan/scan completed: file=");
        sb.append(str);
        sb.append(" uri=");
        sb.append(uri);
        Log.i(sb.toString());
        if (atomicInteger.decrementAndGet() <= 0 && runnable != null) {
            runnable.run();
        }
    }
}
