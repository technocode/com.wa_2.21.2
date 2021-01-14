package X;

import android.os.Environment;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1TL  reason: invalid class name */
public class AnonymousClass1TL {
    public static volatile AnonymousClass1TL A01;
    public final AnonymousClass088 A00;

    public AnonymousClass1TL(AnonymousClass088 r1) {
        this.A00 = r1;
    }

    public static AnonymousClass1TL A00() {
        if (A01 == null) {
            synchronized (AnonymousClass1TL.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass1TL(AnonymousClass088.A00());
                }
            }
        }
        return A01;
    }

    public File A01(String str) {
        File A012;
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            Log.e("BloksFileManager/getCapturedMediaDirectory external storage is not writable");
            A012 = null;
        } else {
            A012 = AnonymousClass089.A01(this.A00.A07(), "bloks_captured_media");
            if (A012 != null && !A012.exists() && !A012.mkdirs()) {
                Log.e("BloksFileManager/getCapturedMediaFile: failed to create media directory");
                return null;
            }
        }
        return new File(A012.getPath(), str);
    }
}
