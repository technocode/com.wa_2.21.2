package X;

import android.os.Process;
import com.whatsapp.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.011  reason: invalid class name */
public class AnonymousClass011 {
    public static Method A00;
    public static final int[] A01 = {4096};

    static {
        try {
            A00 = Process.class.getMethod("readProcFile", String.class, int[].class, String[].class, long[].class, float[].class);
        } catch (Exception unused) {
            A00 = null;
            Log.e("procreader/native API inaccessible");
        }
    }
}
