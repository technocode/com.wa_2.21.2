package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.2OK  reason: invalid class name */
public class AnonymousClass2OK {
    public static volatile AnonymousClass2OK A02;
    public final AnonymousClass2OJ A00;
    public final MessageDigest A01;

    public AnonymousClass2OK(AnonymousClass2OJ r4) {
        this.A00 = r4;
        try {
            this.A01 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            StringBuilder sb = new StringBuilder("ABOfflineAssign assign will fail due to MD5 algorithm not found: ");
            sb.append(e);
            throw new RuntimeException(sb.toString());
        }
    }
}
