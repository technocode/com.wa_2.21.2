package X;

import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.057  reason: invalid class name */
public class AnonymousClass057 {
    public final C000300f A00;
    public final AnonymousClass05A A01;
    public final AnonymousClass058 A02;
    public final AnonymousClass051 A03;
    public final AnonymousClass04y A04;
    public final AnonymousClass04z A05;
    public final AnonymousClass059 A06;
    public final C001000o A07;
    public final C001400w A08;

    public AnonymousClass057(C000300f r2, C001400w r3, C001000o r4, AnonymousClass04y r5, AnonymousClass04z r6, AnonymousClass050 r7, AnonymousClass051 r8, AnonymousClass052 r9, AnonymousClass054 r10) {
        this.A00 = r2;
        this.A08 = r3;
        this.A07 = r4;
        this.A05 = r6;
        this.A02 = new AnonymousClass058(r3, r4, r7);
        this.A06 = new AnonymousClass059(r3, r9);
        this.A04 = r5;
        this.A03 = r8;
        this.A01 = new AnonymousClass05A(r3, r4, r10);
    }

    public static AnonymousClass1XQ A00(int i, C29511Yz r6) {
        try {
            byte[] A002 = new C29451Yn(C05360Of.A02(r6.A00.A03.A01()), new AnonymousClass3XA(r6.A00.A02.A01())).A00.A00();
            int length = A002.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(A002, 1, bArr, 0, length);
            return new AnonymousClass1XQ(C05360Of.A05(i), bArr, null);
        } catch (C29361Ye e) {
            throw new AssertionError(e);
        }
    }

    public C29351Yd A01() {
        try {
            AnonymousClass1Q5 A032 = this.A03.A03();
            AnonymousClass1Yc r2 = new AnonymousClass1Yc(A032.A01);
            AnonymousClass3XA r1 = new AnonymousClass3XA(A032.A00);
            Log.i("axolotl loading identity key pair");
            return new C29351Yd(r2, r1);
        } catch (C29361Ye unused) {
            throw new SQLiteException("Invalid public key stored in identities table");
        }
    }

    public AnonymousClass1Z0 A02(AnonymousClass0OC r6) {
        AnonymousClass1UN A0D = this.A07.A0D(C002001d.A0u(r6));
        try {
            LinkedList linkedList = new LinkedList();
            Iterator it = A0D.A02.iterator();
            while (it.hasNext()) {
                linkedList.add(((AnonymousClass1UO) it.next()).A00);
            }
            C77673go r2 = (C77673go) C77683gp.A03.AQb();
            AnonymousClass3AO r0 = A0D.A01.A00;
            r2.A02();
            C77683gp r1 = (C77683gp) r2.A00;
            if (r0 != null) {
                r1.A02 = r0;
                r1.A00 |= 1;
                r2.A04(linkedList);
                return new AnonymousClass1Z0(r2.A01().A09());
            }
            throw null;
        } catch (IOException unused) {
            throw new AssertionError("serialize/deserialize failed from Session object");
        }
    }

    public void A03(AnonymousClass0OC r4, AnonymousClass1Yc r5) {
        AnonymousClass0QZ r2;
        if (r5 != null) {
            try {
                r2 = new AnonymousClass0QZ(C001801b.A08(r5.A00.A00()));
            } catch (AnonymousClass1UK unused) {
                throw new AssertionError("Conversion between ECPublicKey and CurvePublicKey should never fail");
            }
        } else {
            r2 = null;
        }
        this.A07.A0N(C002001d.A0u(r4), r2);
    }

    public void A04(AnonymousClass0OC r7, AnonymousClass1Z0 r8) {
        this.A08.A00();
        try {
            if (r8.A01.A00.A05.A01().length != 0) {
                AnonymousClass0E6 A0u = C002001d.A0u(r7);
                AnonymousClass04z r3 = this.A05;
                LinkedList linkedList = new LinkedList();
                Iterator it = r8.A00.iterator();
                while (it.hasNext()) {
                    linkedList.add(((AnonymousClass1Z1) it.next()).A00);
                }
                C77673go r2 = (C77673go) C77683gp.A03.AQb();
                AnonymousClass3AO r0 = r8.A01.A00;
                r2.A02();
                C77683gp r1 = (C77683gp) r2.A00;
                if (r0 != null) {
                    r1.A02 = r0;
                    r1.A00 |= 1;
                    r2.A04(linkedList);
                    r3.A02(A0u, r2.A01().A09());
                    return;
                }
                throw null;
            }
            throw new IOException("Alice base key missing from session");
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot store invalid session", e);
        }
    }
}
