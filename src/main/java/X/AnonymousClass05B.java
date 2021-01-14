package X;

import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/* renamed from: X.05B  reason: invalid class name */
public class AnonymousClass05B {
    public static final Random A03 = new Random();
    public final AnonymousClass057 A00;
    public final AnonymousClass00S A01;
    public final C001400w A02;

    public AnonymousClass05B(AnonymousClass00S r1, C001400w r2, AnonymousClass057 r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    public static final AnonymousClass1UF A00(byte[] bArr, int i, Exception exc) {
        int length;
        if (exc != null) {
            Log.w("axolotl", exc);
        }
        if (i != 0) {
            return new AnonymousClass1UF(null, i);
        }
        if (bArr == null || (length = bArr.length) == 0) {
            Log.w("SignalCoordinator/createDecryptionResult axolotl derived null or empty plaintext from message");
            return new AnonymousClass1UF(null, -1000);
        }
        int i2 = bArr[length - 1] & 255;
        if (i2 == 0) {
            Log.w("MessageUtil/removePadding/ axolotl derived plaintext has invalid padding");
        } else if (i2 >= length) {
            Log.w("MessageUtil/removePadding/ axolotl derived entire plaintext as padding");
        } else {
            int i3 = length - i2;
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, 0, bArr2, 0, i3);
            if (bArr2.length != 0) {
                return new AnonymousClass1UF(bArr2, 0);
            }
        }
        return new AnonymousClass1UF(null, -10000);
    }

    public static final boolean A01(AnonymousClass2B5 r2, AnonymousClass2B5 r3) {
        AnonymousClass2B6 r0 = r2.A02;
        if (r0 == null) {
            r0 = AnonymousClass2B6.A03;
        }
        byte[] A09 = r0.A09();
        AnonymousClass2B6 r02 = r3.A02;
        if (r02 == null) {
            r02 = AnonymousClass2B6.A03;
        }
        if (MessageDigest.isEqual(A09, r02.A09())) {
            AnonymousClass2B6 r03 = r2.A03;
            if (r03 == null) {
                r03 = AnonymousClass2B6.A03;
            }
            byte[] A092 = r03.A09();
            AnonymousClass2B6 r04 = r3.A03;
            if (r04 == null) {
                r04 = AnonymousClass2B6.A03;
            }
            return MessageDigest.isEqual(A092, r04.A09());
        }
    }

    public static final boolean A02(AnonymousClass2B5 r2, AnonymousClass2B5 r3) {
        AnonymousClass2B6 r0 = r2.A02;
        if (r0 == null) {
            r0 = AnonymousClass2B6.A03;
        }
        byte[] A09 = r0.A09();
        AnonymousClass2B6 r02 = r3.A03;
        if (r02 == null) {
            r02 = AnonymousClass2B6.A03;
        }
        if (MessageDigest.isEqual(A09, r02.A09())) {
            AnonymousClass2B6 r03 = r2.A03;
            if (r03 == null) {
                r03 = AnonymousClass2B6.A03;
            }
            byte[] A092 = r03.A09();
            AnonymousClass2B6 r04 = r3.A02;
            if (r04 == null) {
                r04 = AnonymousClass2B6.A03;
            }
            return MessageDigest.isEqual(A092, r04.A09());
        }
    }

    public static byte[] A03(byte[] bArr) {
        int nextInt = A03.nextInt(16) + 1;
        int length = bArr.length;
        int i = length + nextInt;
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        Arrays.fill(bArr2, length, i, (byte) nextInt);
        return bArr2;
    }

    public AnonymousClass1UJ A04() {
        C29351Yd A012 = this.A00.A01();
        AbstractC29461Yo r2 = A012.A01;
        return new AnonymousClass1UJ(new AnonymousClass0QZ(new C05770Qa(A012.A00.A00.A00, (byte) 5)), new AnonymousClass1UD(((AnonymousClass3XA) r2).A00, (byte) r2.A9V()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bb, code lost:
        if (r7 != null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1XQ A05() {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05B.A05():X.1XQ");
    }

    public C29431Yl A06(AnonymousClass0E6 r8) {
        AnonymousClass057 r2 = this.A00;
        return new C29431Yl(r2, r2, r2.A06, r2, new AnonymousClass0OC(r8.A01, r8.A00));
    }

    public void A07() {
        AnonymousClass057 r7 = this.A00;
        int A06 = r7.A00.A06(AbstractC000400g.A2w);
        int A002 = r7.A04.A00();
        if (A002 >= A06) {
            StringBuilder sb = new StringBuilder("skipping key generation because already more than ");
            sb.append(A06);
            sb.append(" are unsent");
            Log.i(sb.toString());
            return;
        }
        while (true) {
            A06 -= A002;
            if (A06 > 0) {
                A002 = Math.min(A06, 50);
                int A012 = r7.A03.A01();
                StringBuilder sb2 = new StringBuilder("axolotl generating ");
                sb2.append(A002);
                sb2.append(" new prekeys starting from ");
                sb2.append(A012);
                sb2.append(" and recording them in the db");
                Log.i(sb2.toString());
                ArrayList arrayList = new ArrayList();
                LinkedList linkedList = new LinkedList();
                int i = A012 - 1;
                for (int i2 = 0; i2 < A002; i2++) {
                    linkedList.add(new C29511Yz(((i + i2) % 16777214) + 1, C05360Of.A03()));
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    AnonymousClass2B9 r0 = ((C29511Yz) it.next()).A00;
                    arrayList.add(new AnonymousClass1Q6(r0.A01, r0.A09()));
                }
                r7.A07.A0V(arrayList, ((A012 + A002) % 16777214) + 1);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r3 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A08() {
        /*
            r4 = this;
            X.057 r1 = r4.A00
            X.00w r0 = r1.A08
            r0.A00()
            X.04y r0 = r1.A04
            X.04x r0 = r0.A01
            X.0BK r3 = r0.A01()
            r2 = 0
            java.lang.String r1 = "SELECT COUNT(*) FROM prekeys WHERE sent_to_server = 0 AND direct_distribution = 0"
            java.lang.String r0 = "SignalPreKeyStore/hasUnsentPreKeys"
            android.database.Cursor r3 = r3.A07(r1, r2, r0)
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x003b
            r2 = 0
            int r0 = r3.getInt(r2)     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0026
            r2 = 1
        L_0x0026:
            r3.close()
            java.lang.String r1 = "axolotl has unsent prekeys: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i(r0)
            return r2
        L_0x003b:
            java.lang.String r1 = "Unable to count unsent entries in prekeys table"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        L_0x0043:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            if (r3 == 0) goto L_0x004b
            r3.close()     // Catch:{ all -> 0x004b }
        L_0x004b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05B.A08():boolean");
    }
}
