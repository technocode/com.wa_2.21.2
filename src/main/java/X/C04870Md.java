package X;

import android.media.MediaMetadataRetriever;
import com.whatsapp.util.Log;
import java.io.Closeable;

/* renamed from: X.0Md  reason: invalid class name and case insensitive filesystem */
public class C04870Md extends MediaMetadataRetriever implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        release();
        Closeable closeable = null;
        if (0 != 0) {
            try {
                closeable.close();
            } catch (Throwable th) {
                Log.e(th);
            }
        }
    }
}
