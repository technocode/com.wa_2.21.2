package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.0Em  reason: invalid class name and case insensitive filesystem */
public class C03020Em {
    public static volatile C03020Em A02;
    public File A00;
    public File A01;

    public C03020Em(AnonymousClass00G r4) {
        this.A01 = new File(r4.A00.getFilesDir(), "crash_sentinel");
        this.A00 = new File(r4.A00.getFilesDir(), "crash_in_video_sentinel");
    }

    public static C03020Em A00() {
        if (A02 == null) {
            synchronized (C03020Em.class) {
                if (A02 == null) {
                    A02 = new C03020Em(AnonymousClass00G.A01);
                }
            }
        }
        return A02;
    }

    public void A01() {
        if (this.A00.exists() && !this.A00.delete()) {
            Log.w("crashlogs/failed-delete-crash-sentinel-file");
        }
    }
}
