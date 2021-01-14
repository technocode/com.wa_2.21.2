package X;

import androidx.core.view.inputmethod.InputContentInfoCompat;
import com.whatsapp.util.Log;

/* renamed from: X.1MA  reason: invalid class name */
public class AnonymousClass1MA {
    public static final String[] A01 = {"image/gif", "video/x.looping_mp4", "image/jpeg", "image/jpg", "image/png", "image/webp.wasticker"};
    public InputContentInfoCompat A00;

    public AnonymousClass1M9 A00(InputContentInfoCompat inputContentInfoCompat, int i) {
        try {
            InputContentInfoCompat inputContentInfoCompat2 = this.A00;
            if (inputContentInfoCompat2 != null) {
                inputContentInfoCompat2.releasePermission();
            }
        } catch (Exception e) {
            Log.e("conversation/InputContentInfoCompat#releasePermission() failed.", e);
        } catch (Throwable th) {
            this.A00 = null;
            throw th;
        }
        this.A00 = null;
        String[] strArr = A01;
        for (String str : strArr) {
            if (inputContentInfoCompat.mImpl.getDescription().hasMimeType(str)) {
                if ((i & 1) != 0) {
                    try {
                        inputContentInfoCompat.requestPermission();
                    } catch (Exception e2) {
                        Log.e("conversation/InputContentInfoCompat#requestPermission() failed.", e2);
                        return null;
                    }
                }
                StringBuilder A0S = AnonymousClass008.A0S("conversation/onCommitContent: ");
                A0S.append(inputContentInfoCompat.mImpl.getContentUri().toString());
                Log.i(A0S.toString());
                this.A00 = inputContentInfoCompat;
                return new AnonymousClass1M9(inputContentInfoCompat.mImpl.getContentUri(), str);
            }
        }
        return null;
    }
}
