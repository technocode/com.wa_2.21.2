package X;

import android.os.Build;
import com.whatsapp.util.OpusRecorder;
import java.io.File;

/* renamed from: X.37X  reason: invalid class name */
public class AnonymousClass37X {
    public final OpusRecorder A00;
    public final File A01;

    public AnonymousClass37X(String str) {
        int i = 1;
        if (Build.MANUFACTURER.equals("Google") && Build.MODEL.equals("Pixel 2 XL")) {
            i = 5;
        }
        String A0K = AnonymousClass008.A0K(str, ".opus");
        this.A01 = new File(A0K);
        this.A00 = new OpusRecorder(A0K, i);
    }
}
