package X;

import android.text.TextUtils;
import android.util.Base64;
import java.security.SecureRandom;

/* renamed from: X.0Cl  reason: invalid class name and case insensitive filesystem */
public class C02530Cl {
    public static C02530Cl A01;
    public final byte[] A00;

    public C02530Cl(AnonymousClass00D r5) {
        byte[] bArr;
        String string = r5.A00.getString("upload_token_random_bytes", null);
        if (TextUtils.isEmpty(string) || (bArr = Base64.decode(string, 3)) == null) {
            bArr = new byte[32];
            new SecureRandom().nextBytes(bArr);
            AnonymousClass008.A0m(r5, "upload_token_random_bytes", Base64.encodeToString(bArr, 3));
        }
        this.A00 = bArr;
    }
}
