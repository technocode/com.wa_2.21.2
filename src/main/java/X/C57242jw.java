package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.2jw  reason: invalid class name and case insensitive filesystem */
public class C57242jw implements AbstractC50062Tg {
    public final AbstractC50062Tg A00;
    public final AnonymousClass1XO A01;
    public final String A02;
    public final String A03;
    public final MessageDigest A04;
    public final MessageDigest A05;

    public C57242jw(AbstractC50062Tg r4, String str, String str2, AnonymousClass1XO r7) {
        MessageDigest messageDigest;
        this.A00 = r4;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = r7;
        MessageDigest messageDigest2 = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            Log.e("encryptedstreamdownload/digest error", e);
            messageDigest = null;
        }
        this.A05 = messageDigest;
        try {
            messageDigest2 = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e2) {
            Log.e("encryptedstreamdownload/digest error", e2);
        }
        this.A04 = messageDigest2;
    }

    @Override // X.AbstractC50062Tg
    public OutputStream ALt(AbstractC28621Va r7) {
        MessageDigest messageDigest;
        MessageDigest messageDigest2 = this.A05;
        if (messageDigest2 != null && (messageDigest = this.A04) != null) {
            return new DigestOutputStream(new AnonymousClass2KH(new DigestOutputStream(this.A00.ALt(r7), messageDigest), C28051Sr.A0c(C002001d.A3o(Base64.decode(this.A02, 0), this.A01.A03, 80)), r7.getContentLength()), messageDigest2);
        }
        throw new AnonymousClass2TZ(1);
    }
}
