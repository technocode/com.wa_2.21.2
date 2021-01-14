package X;

import android.content.ContentValues;
import com.whatsapp.util.Log;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.LinkedList;

/* renamed from: X.1Yq  reason: invalid class name */
public class AnonymousClass1Yq {
    public final AnonymousClass05A A00;

    public AnonymousClass1Yq(AnonymousClass05A r1) {
        this.A00 = r1;
    }

    public AnonymousClass239 A00(AnonymousClass0OD r15) {
        AnonymousClass239 r5;
        synchronized (AnonymousClass1Yp.A02) {
            try {
                AnonymousClass1Yt A002 = this.A00.A00(r15);
                if (A002.A00.isEmpty() || (1 << 3) != new C68213Ch(A002.A00().A00.A02).A01.length) {
                    try {
                        byte[] bArr = new byte[32];
                        SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
                        C68213Ch r2 = new C68213Ch(bArr);
                        try {
                            int nextInt = SecureRandom.getInstance("SHA1PRNG").nextInt(Integer.MAX_VALUE);
                            byte[][] bArr2 = r2.A01;
                            C29451Yn A03 = C05360Of.A03();
                            LinkedList linkedList = A002.A00;
                            linkedList.clear();
                            AnonymousClass238 r12 = A03.A00;
                            AbstractC29461Yo r0 = A03.A01;
                            if (r0 != null) {
                                linkedList.add(new C29471Yu(nextInt, 0, bArr2, r12, new AnonymousClass3XF(r0)));
                                this.A00.A01.A0T(C002001d.A0v(r15), A002.A01());
                            } else {
                                throw null;
                            }
                        } catch (NoSuchAlgorithmException e) {
                            throw new AssertionError(e);
                        }
                    } catch (NoSuchAlgorithmException e2) {
                        throw new AssertionError(e2);
                    }
                }
                C29471Yu A003 = A002.A00();
                int i = A003.A00.A01;
                int i2 = new C68213Ch(A003.A00.A02).A00;
                byte[][] bArr3 = new C68213Ch(A003.A00.A02).A01;
                C77763gx r02 = A003.A00.A03;
                if (r02 == null) {
                    r02 = C77763gx.A03;
                }
                r5 = new AnonymousClass239(i, i2, bArr3, C05360Of.A02(r02.A02.A01()));
            } catch (C29361Ye | C29371Yf e3) {
                throw new AssertionError(e3);
            }
        }
        return r5;
    }

    public void A01(AnonymousClass0OD r10, AnonymousClass239 r11) {
        synchronized (AnonymousClass1Yp.A02) {
            AnonymousClass1Yt A002 = this.A00.A00(r10);
            A002.A00.addFirst(new C29471Yu(r11.A00, r11.A01, r11.A04, r11.A02, AnonymousClass3XE.A00));
            if (A002.A00.size() > 5) {
                A002.A00.removeLast();
            }
            C001000o r4 = this.A00.A01;
            AnonymousClass0E6 A0u = C002001d.A0u(r10.A01);
            String str = r10.A00;
            byte[] A01 = A002.A01();
            r4.A0H.A00();
            if (!AnonymousClass2A2.A00.getRawString().equals(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("signalCoordinator/savefastratchetsenderkey/invalidgroupid ");
                sb.append(str);
                Log.w(sb.toString());
            } else {
                AnonymousClass0BK A02 = r4.A07.A00.A02();
                ContentValues contentValues = new ContentValues();
                contentValues.put("group_id", str);
                contentValues.put("sender_id", A0u.A01);
                contentValues.put("device_id", Integer.valueOf(A0u.A00));
                contentValues.put("record", A01);
                A02.A05("fast_ratchet_sender_keys", contentValues, "SignalFastRatchetSenderKeyStore/saveFastRatchetSenderKey");
                AnonymousClass04v r0 = r4.A05;
                r0.A00.A01(new AnonymousClass0E7());
            }
        }
    }
}
