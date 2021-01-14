package X;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.2uC  reason: invalid class name and case insensitive filesystem */
public class C62072uC {
    public final AnonymousClass0OS[] A00;

    public C62072uC(AnonymousClass0OS[] r1) {
        this.A00 = r1;
    }

    public String A00() {
        AnonymousClass0OS[] r7 = this.A00;
        int length = r7.length;
        if (length <= 0) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            StringBuilder sb = new StringBuilder();
            for (AnonymousClass0OS r1 : r7) {
                sb.append(r1.A02);
                sb.append(r1.A03);
            }
            return Base64.encodeToString(instance.digest(sb.toString().trim().getBytes()), 0);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
