package X;

import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;

/* renamed from: X.0H8  reason: invalid class name */
public class AnonymousClass0H8 {
    public static volatile AnonymousClass0H8 A01;
    public final AnonymousClass0B3 A00;

    public AnonymousClass0H8(AnonymousClass0B3 r1) {
        this.A00 = r1;
    }

    public File A00(String str) {
        File A012 = this.A00.A01();
        if (A012.exists() || A012.mkdirs()) {
            return new File(A012, AnonymousClass008.A0K(str, ".png"));
        }
        return null;
    }

    public File A01(byte[] bArr, AnonymousClass33N r5) {
        File A002 = A00(r5.A0D);
        if (A002 == null || !C006803i.A0p(new ByteArrayInputStream(bArr), A002)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("ThirdPartyStickerManager/cacheTrayIcon to: ");
        sb.append(A002);
        Log.d(sb.toString());
        return A002;
    }

    public void A02(String str) {
        File A002 = A00(str);
        if (A002 != null && C006803i.A0m(A002)) {
            StringBuilder A0S = AnonymousClass008.A0S("ThirdPartyStickerTrayIconCache/removeCachedTrayIcon: ");
            A0S.append(A002.toString());
            Log.d(A0S.toString());
        }
    }
}
