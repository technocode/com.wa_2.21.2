package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: X.00o  reason: invalid class name and case insensitive filesystem */
public class C001000o {
    public static volatile C001000o A0K;
    public AnonymousClass05B A00;
    public AnonymousClass05C A01;
    public final AnonymousClass01M A02;
    public final AnonymousClass01I A03;
    public final C000300f A04;
    public final AnonymousClass04v A05;
    public final AnonymousClass04x A06;
    public final AnonymousClass054 A07;
    public final AnonymousClass051 A08;
    public final AnonymousClass053 A09;
    public final AnonymousClass04y A0A;
    public final AnonymousClass050 A0B;
    public final AnonymousClass04z A0C;
    public final AnonymousClass052 A0D;
    public final AnonymousClass00D A0E;
    public final AnonymousClass056 A0F;
    public final AnonymousClass055 A0G = new AnonymousClass055();
    public final C001400w A0H;
    public final C002701k A0I;
    public final JniBridge A0J;

    public C001000o(AnonymousClass00G r16, AnonymousClass00S r17, C002701k r18, JniBridge jniBridge, AnonymousClass01I r20, C000300f r21, AnonymousClass04q r22, C001400w r23, AnonymousClass01M r24, AnonymousClass04v r25, AnonymousClass00D r26) {
        AnonymousClass04x r2 = new AnonymousClass04x(r16, r17, r22);
        AnonymousClass04y r9 = new AnonymousClass04y(r17, r2, r21);
        AnonymousClass04z r10 = new AnonymousClass04z(r17, r2);
        AnonymousClass050 r11 = new AnonymousClass050(r17, r2);
        AnonymousClass051 r12 = new AnonymousClass051(r17, r2);
        AnonymousClass052 r13 = new AnonymousClass052(r17, r2);
        AnonymousClass053 r5 = new AnonymousClass053(r17, r2);
        AnonymousClass054 r14 = new AnonymousClass054(r17, r2);
        AnonymousClass056 r1 = new AnonymousClass056(this);
        this.A0F = r1;
        this.A0I = r18;
        this.A0J = jniBridge;
        this.A03 = r20;
        this.A06 = r2;
        this.A04 = r21;
        this.A0H = r23;
        this.A02 = r24;
        this.A0A = r9;
        this.A0C = r10;
        this.A05 = r25;
        this.A0E = r26;
        this.A0B = r11;
        this.A08 = r12;
        this.A0D = r13;
        this.A09 = r5;
        this.A07 = r14;
        this.A00 = new AnonymousClass05B(r17, r23, new AnonymousClass057(r21, r23, this, r9, r10, r11, r12, r13, r14));
        this.A01 = new AnonymousClass05C(r17, jniBridge, r21, r9);
        r2.A00 = r1;
    }

    public static C001000o A00() {
        if (A0K == null) {
            synchronized (C001000o.class) {
                if (A0K == null) {
                    A0K = new C001000o(AnonymousClass00G.A01, AnonymousClass00S.A00(), C002701k.A00(), JniBridge.getInstance(), AnonymousClass01I.A00(), C000300f.A00(), AnonymousClass04q.A00(), C001400w.A02, AnonymousClass01M.A00(), AnonymousClass04v.A00(), AnonymousClass00D.A00());
                }
            }
        }
        return A0K;
    }

    public static AnonymousClass1XQ A01(int i, byte[] bArr) {
        byte[] A012 = ((AnonymousClass2B9) AnonymousClass078.A02(AnonymousClass2B9.A04, bArr)).A03.A01();
        int length = A012.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(A012, 1, bArr2, 0, length);
        return new AnonymousClass1XQ(C05360Of.A05(i), bArr2, null);
    }

    public static void A02(AnonymousClass1UN r1) {
        if (r1.A01.A00.A05.A01().length == 0) {
            throw new IOException("Alice base key missing from session");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A03(X.AnonymousClass0E6 r27, byte[] r28, byte r29, X.AnonymousClass1XQ r30, X.AnonymousClass1XQ r31, byte[] r32) {
        /*
        // Method dump skipped, instructions count: 304
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001000o.A03(X.0E6, byte[], byte, X.1XQ, X.1XQ, byte[]):int");
    }

    public AnonymousClass1UF A04(AnonymousClass0E6 r9, byte[] bArr, AnonymousClass1UE r11) {
        AbstractC29331Ya r0;
        this.A0H.A00();
        if (this.A0I.A0E(182)) {
            JniBridge jniBridge = this.A01.A03;
            C21030xz r02 = new C21030xz((NativeHolder) JniBridge.jvidispatchOIOOOO(2, (long) r9.A00, r9.A01, r11, jniBridge.getWajContext(), bArr));
            byte[] A002 = r02.A00();
            JniBridge.getInstance();
            return new AnonymousClass1UF(A002, (int) JniBridge.jvidispatchIIO(1, (long) 38, r02.A00));
        }
        C29431Yl A062 = this.A00.A06(r9);
        try {
            AnonymousClass23C r1 = new AnonymousClass23C(bArr);
            if (r11 != null) {
                r0 = new C43431yM(r11);
            } else {
                r0 = new C43441yN();
            }
            return AnonymousClass05B.A00(A062.A04(r1, r0), 0, null);
        } catch (C29381Yg e) {
            return AnonymousClass05B.A00(null, -1005, e);
        } catch (C29341Yb e2) {
            return AnonymousClass05B.A00(null, -1001, e2);
        } catch (C29401Yi e3) {
            return AnonymousClass05B.A00(null, -1007, e3);
        } catch (C29411Yj e4) {
            return AnonymousClass05B.A00(null, -1008, e4);
        }
    }

    public AnonymousClass1UF A05(AnonymousClass0E6 r9, byte[] bArr, AnonymousClass1UE r11) {
        AbstractC29331Ya r0;
        this.A0H.A00();
        if (this.A0I.A0E(182)) {
            JniBridge jniBridge = this.A01.A03;
            C21030xz r02 = new C21030xz((NativeHolder) JniBridge.jvidispatchOIOOOO(3, (long) r9.A00, r9.A01, r11, jniBridge.getWajContext(), bArr));
            byte[] A002 = r02.A00();
            JniBridge.getInstance();
            return new AnonymousClass1UF(A002, (int) JniBridge.jvidispatchIIO(1, (long) 38, r02.A00));
        }
        C29431Yl A062 = this.A00.A06(r9);
        try {
            AnonymousClass23A r1 = new AnonymousClass23A(bArr);
            if (r11 != null) {
                r0 = new C43431yM(r11);
            } else {
                r0 = new C43441yN();
            }
            return AnonymousClass05B.A00(A062.A03(r1, r0), 0, null);
        } catch (C29341Yb e) {
            return AnonymousClass05B.A00(null, -1001, e);
        } catch (C29381Yg e2) {
            return AnonymousClass05B.A00(null, -1005, e2);
        } catch (C29371Yf e3) {
            return AnonymousClass05B.A00(null, -1003, e3);
        } catch (C29361Ye e4) {
            return AnonymousClass05B.A00(null, -1002, e4);
        } catch (C29441Ym e5) {
            return AnonymousClass05B.A00(null, -1010, e5);
        } catch (C29391Yh e6) {
            return AnonymousClass05B.A00(null, -1006, e6);
        } catch (C29401Yi e7) {
            return AnonymousClass05B.A00(null, -1007, e7);
        }
    }

    public AnonymousClass1UF A06(AnonymousClass0OE r12, byte[] bArr, AnonymousClass1UE r14) {
        AbstractC29331Ya r0;
        this.A0H.A00();
        if (this.A0I.A0E(188)) {
            JniBridge jniBridge = this.A01.A03;
            String str = r12.A01;
            AnonymousClass0E6 r02 = r12.A00;
            C21030xz r03 = new C21030xz((NativeHolder) JniBridge.jvidispatchOIOOOOO(1, (long) r02.A00, str, r02.A01, r14, jniBridge.getWajContext(), bArr));
            byte[] A002 = r03.A00();
            JniBridge.getInstance();
            return new AnonymousClass1UF(A002, (int) JniBridge.jvidispatchIIO(1, (long) 38, r03.A00));
        }
        AnonymousClass1Yp r1 = new AnonymousClass1Yp(this.A00.A00.A01, C002001d.A2L(r12));
        if (r14 != null) {
            try {
                r0 = new C43431yM(r14);
            } catch (C29401Yi e) {
                return AnonymousClass05B.A00(null, -1007, e);
            } catch (C29381Yg e2) {
                return AnonymousClass05B.A00(null, -1005, e2);
            } catch (C29341Yb e3) {
                return AnonymousClass05B.A00(null, -1001, e3);
            } catch (C29411Yj e4) {
                return AnonymousClass05B.A00(null, -1008, e4);
            }
        } else {
            r0 = new C43441yN();
        }
        return AnonymousClass05B.A00(r1.A01(bArr, r0), 0, null);
    }

    public AnonymousClass1UG A07(AnonymousClass0E6 r9, byte[] bArr) {
        this.A0H.A00();
        if (this.A0I.A0E(187)) {
            JniBridge jniBridge = this.A01.A03;
            AnonymousClass0y0 r0 = new AnonymousClass0y0((NativeHolder) JniBridge.jvidispatchOIOOO(0, (long) r9.A00, r9.A01, jniBridge.getWajContext(), bArr));
            JniBridge.getInstance();
            NativeHolder nativeHolder = r0.A00;
            JniBridge.getInstance();
            JniBridge.getInstance();
            return new AnonymousClass1UG((byte[]) JniBridge.jvidispatchOIO(0, (long) 34, nativeHolder), (int) JniBridge.jvidispatchIIO(1, (long) 35, nativeHolder), (int) JniBridge.jvidispatchIIO(1, (long) 36, nativeHolder));
        }
        AbstractC29491Yx A022 = this.A00.A06(r9).A02(AnonymousClass05B.A03(bArr));
        int A9V = A022.A9V();
        int i = 1;
        if (A9V != 2) {
            if (A9V != 3) {
                throw new IllegalStateException("SignalMessageType is neither message nor pre_key_message");
            }
            i = 2;
        }
        return new AnonymousClass1UG(A022.ANr(), i, 0);
    }

    public AnonymousClass1UG A08(AnonymousClass0OE r14, byte[] bArr) {
        this.A0H.A00();
        if (this.A0I.A0E(189)) {
            JniBridge jniBridge = this.A01.A03;
            String str = r14.A01;
            AnonymousClass0E6 r0 = r14.A00;
            AnonymousClass0y0 r02 = new AnonymousClass0y0((NativeHolder) JniBridge.jvidispatchOIOOOO(1, (long) r0.A00, str, r0.A01, jniBridge.getWajContext(), bArr));
            JniBridge.getInstance();
            NativeHolder nativeHolder = r02.A00;
            JniBridge.getInstance();
            JniBridge.getInstance();
            return new AnonymousClass1UG((byte[]) JniBridge.jvidispatchOIO(0, (long) 34, nativeHolder), (int) JniBridge.jvidispatchIIO(1, (long) 35, nativeHolder), (int) JniBridge.jvidispatchIIO(1, (long) 36, nativeHolder));
        }
        AnonymousClass05B r2 = this.A00;
        new AnonymousClass1Yq(r2.A00.A01).A00(C002001d.A2L(r14));
        try {
            return new AnonymousClass1UG(new AnonymousClass1Yp(r2.A00.A01, C002001d.A2L(r14)).A00(AnonymousClass05B.A03(bArr)), 4, 0);
        } catch (C29411Yj unused) {
            return new AnonymousClass1UG(null, 0, -1008);
        }
    }

    public AnonymousClass1UI A09(String str, List list, String str2, List list2) {
        Object obj;
        if (this.A04.A0D(AbstractC000400g.A2g)) {
            AnonymousClass05C r0 = this.A01;
            List A002 = r0.A00(list);
            if (A002 == null) {
                Log.e("wamsys/generateFingerprint/local-identity-key-conversion-failed");
                return null;
            }
            List A003 = r0.A00(list2);
            if (A003 == null) {
                Log.e("wamsys/generateFingerprint/remote-identity-key-conversion-failed");
                return null;
            }
            NativeHolder nativeHolder = (NativeHolder) JniBridge.jvidispatchOOOOOO(str, str2, r0.A03.getWajContext(), A002, A003);
            if (nativeHolder != null) {
                AnonymousClass0y3 r1 = new AnonymousClass0y3(nativeHolder);
                try {
                    JniBridge instance = JniBridge.getInstance();
                    NativeHolder nativeHolder2 = r1.A00;
                    if (instance != null) {
                        String str3 = (String) JniBridge.jvidispatchOIO(2, (long) 43, nativeHolder2);
                        if (JniBridge.getInstance() != null) {
                            AnonymousClass1UH r3 = new AnonymousClass1UH(str3, (String) JniBridge.jvidispatchOIO(2, (long) 44, nativeHolder2));
                            JniBridge.getInstance();
                            return new AnonymousClass1UI(r3, (AnonymousClass2B5) AnonymousClass078.A02(AnonymousClass2B5.A04, (byte[]) JniBridge.jvidispatchOIO(0, (long) 42, nativeHolder2)));
                        }
                        throw null;
                    }
                    throw null;
                } catch (C04190Jk unused) {
                    Log.e("wamsys/generateFingerprint/protobuf-parsing-failed");
                    return null;
                }
            } else {
                Log.e("wamsys/generateFingerprint/processing-fingerprints-failed");
                return null;
            }
        } else {
            AnonymousClass05B r32 = this.A00;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new AnonymousClass0QZ((C05770Qa) it.next()));
            }
            C001400w r2 = r32.A02;
            if (r2.A01()) {
                obj = r32.A04().A01;
            } else {
                try {
                    obj = r2.A00.submit(new AnonymousClass1UA(r32)).get();
                } catch (InterruptedException | ExecutionException unused2) {
                    Log.e("SignalCoordinatorDefault/generateFingerprint/getPublicKey interrupted");
                    return null;
                }
            }
            arrayList.add(obj);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new AnonymousClass0QZ((C05770Qa) it2.next()));
            }
            AnonymousClass1UH r33 = new AnonymousClass1UH(C002001d.A1s(str, arrayList), C002001d.A1s(str2, arrayList2));
            byte[] A3l = C002001d.A3l(arrayList);
            byte[] A3l2 = C002001d.A3l(arrayList2);
            AbstractC04160Jh A0B2 = AnonymousClass2B5.A04.AQb();
            A0B2.A02();
            AnonymousClass2B5 r12 = (AnonymousClass2B5) A0B2.A00;
            r12.A00 |= 1;
            r12.A01 = 0;
            AnonymousClass2B6 r9 = AnonymousClass2B6.A03;
            AbstractC04160Jh A0B3 = r9.AQb();
            byte[] bytes = str.getBytes();
            AnonymousClass071 A004 = AnonymousClass071.A00(bytes, 0, bytes.length);
            A0B3.A02();
            AnonymousClass2B6 r13 = (AnonymousClass2B6) A0B3.A00;
            r13.A00 |= 2;
            r13.A02 = A004;
            AnonymousClass071 A005 = AnonymousClass071.A00(A3l, 0, A3l.length);
            A0B3.A02();
            AnonymousClass2B6 r14 = (AnonymousClass2B6) A0B3.A00;
            r14.A00 |= 1;
            r14.A01 = A005;
            A0B2.A02();
            AnonymousClass2B5 r15 = (AnonymousClass2B5) A0B2.A00;
            if (r15 != null) {
                r15.A02 = (AnonymousClass2B6) A0B3.A01();
                r15.A00 |= 2;
                AbstractC04160Jh A0B4 = r9.AQb();
                byte[] bytes2 = str2.getBytes();
                AnonymousClass071 A006 = AnonymousClass071.A00(bytes2, 0, bytes2.length);
                A0B4.A02();
                AnonymousClass2B6 r16 = (AnonymousClass2B6) A0B4.A00;
                r16.A00 |= 2;
                r16.A02 = A006;
                AnonymousClass071 A007 = AnonymousClass071.A00(A3l2, 0, A3l2.length);
                A0B4.A02();
                AnonymousClass2B6 r17 = (AnonymousClass2B6) A0B4.A00;
                r17.A00 |= 1;
                r17.A01 = A007;
                A0B2.A02();
                AnonymousClass2B5 r18 = (AnonymousClass2B5) A0B2.A00;
                if (r18 != null) {
                    r18.A03 = (AnonymousClass2B6) A0B4.A01();
                    r18.A00 |= 4;
                    return new AnonymousClass1UI(r33, (AnonymousClass2B5) A0B2.A01());
                }
                throw null;
            }
            throw null;
        }
    }

    public AnonymousClass0QZ A0A(AnonymousClass0E6 r5) {
        AnonymousClass051 r3 = this.A08;
        byte[] A052 = r3.A05(r5);
        if (A052 == null) {
            return null;
        }
        try {
            return new AnonymousClass0QZ(C001801b.A08(A052));
        } catch (AnonymousClass1UK e) {
            StringBuilder sb = new StringBuilder("axolotl identity key for ");
            sb.append(r5);
            sb.append(" decoded as invalid");
            Log.e(sb.toString(), e);
            r3.A04(r5);
            return null;
        }
    }

    public AnonymousClass1UJ A0B() {
        C001400w r2 = this.A0H;
        if (r2.A01()) {
            return this.A00.A04();
        }
        try {
            return (AnonymousClass1UJ) r2.A00.submit(new AnonymousClass1U8(this)).get();
        } catch (InterruptedException | ExecutionException e) {
            Log.w("SignalCoordinator/getIdentityKeyPair", e);
            throw new RuntimeException(e);
        }
    }

    public AnonymousClass1UM A0C(AnonymousClass0OE r4) {
        this.A0H.A00();
        return new AnonymousClass1UM(new AnonymousClass1Ys(this.A00.A00.A02).A00(C002001d.A2L(r4)).ANr(), 0);
    }

    public AnonymousClass1UN A0D(AnonymousClass0E6 r4) {
        AnonymousClass04z r2 = this.A0C;
        byte[] A032 = r2.A03(r4);
        if (A032 == null) {
            return new AnonymousClass1UN();
        }
        try {
            AnonymousClass1UN r0 = new AnonymousClass1UN(A032);
            A02(r0);
            return r0;
        } catch (IOException unused) {
            r2.A01(r4);
            return new AnonymousClass1UN();
        }
    }

    public AnonymousClass1UQ A0E() {
        C001400w r2 = this.A0H;
        if (r2.A01()) {
            return A0F();
        }
        try {
            return (AnonymousClass1UQ) r2.A00.submit(new AnonymousClass1U9(this)).get();
        } catch (InterruptedException | ExecutionException e) {
            Log.w("SignedPreKeyStore/getLatestSignedPrekeyRecord", e);
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        if (r1 != null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0098, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0099, code lost:
        if (r1 != null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass1UQ A0F() {
        /*
        // Method dump skipped, instructions count: 159
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001000o.A0F():X.1UQ");
    }

    public AnonymousClass1XQ A0G() {
        this.A0H.A00();
        AnonymousClass1UQ A0E2 = A0E();
        Log.i("axolotl loaded the latest signed pre key for sending");
        return C001801b.A0I(A0E2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (r6 != null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c8, code lost:
        if (r8 != null) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cd, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1XQ A0H() {
        /*
        // Method dump skipped, instructions count: 206
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001000o.A0H():X.1XQ");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r4 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A0I(java.util.List r8) {
        /*
            r7 = this;
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>(r8)
            X.04z r5 = r7.A0C
            android.database.Cursor r4 = r5.A00(r8)
        L_0x000b:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0039
            r0 = 0
            byte[] r3 = r4.getBlob(r0)     // Catch:{ all -> 0x003d }
            r0 = 1
            long r0 = r4.getLong(r0)     // Catch:{ all -> 0x003d }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x003d }
            r0 = 2
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x003d }
            X.0E6 r1 = new X.0E6     // Catch:{ all -> 0x003d }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x003d }
            X.1UN r0 = new X.1UN     // Catch:{ IOException -> 0x0035 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0035 }
            A02(r0)     // Catch:{ IOException -> 0x0035 }
            r6.remove(r1)     // Catch:{ IOException -> 0x0035 }
            goto L_0x000b
        L_0x0035:
            r5.A01(r1)
            goto L_0x000b
        L_0x0039:
            r4.close()
            return r6
        L_0x003d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            if (r4 == 0) goto L_0x0045
            r4.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001000o.A0I(java.util.List):java.util.Set");
    }

    public void A0J() {
        AnonymousClass04x r3 = this.A06;
        synchronized (r3) {
            r3.close();
            String str = r3.A05;
            if (str != null) {
                File databasePath = r3.A03.A00.getDatabasePath(str);
                C001801b.A1p(databasePath, "axolotl");
                if (databasePath.delete()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("deleted ");
                    sb.append(databasePath);
                    Log.i(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("failed to delete ");
                    sb2.append(databasePath);
                    Log.e(sb2.toString());
                }
            }
        }
        if (this.A04.A0D(AbstractC000400g.A2f)) {
            this.A0J.initWajContext();
        }
    }

    public void A0K() {
        this.A0H.A00();
        if (this.A04.A0D(AbstractC000400g.A2f)) {
            AnonymousClass05C r6 = this.A01;
            int A002 = r6.A01.A00();
            int A062 = r6.A00.A06(AbstractC000400g.A2w);
            if (A002 >= A062) {
                StringBuilder sb = new StringBuilder("skipping key generation because already more than ");
                sb.append(A062);
                sb.append(" are unsent");
                Log.i(sb.toString());
                return;
            }
            int i = A062 - A002;
            while (i > 0) {
                int min = Math.min(i, 50);
                StringBuilder sb2 = new StringBuilder("wa-msys generating ");
                sb2.append(min);
                sb2.append(" new prekeys");
                sb2.append(" and recording them in the db");
                Log.i(sb2.toString());
                int jvidispatchIIO = (int) JniBridge.jvidispatchIIO(4, (long) min, r6.A03.getWajContext());
                if (jvidispatchIIO <= 0) {
                    StringBuilder sb3 = new StringBuilder("wa-msys generated 0 keys when expected to generate ");
                    sb3.append(min);
                    sb3.append(" keys");
                    Log.e(sb3.toString());
                    return;
                }
                i -= jvidispatchIIO;
            }
            return;
        }
        this.A00.A07();
    }

    public void A0L() {
        this.A0H.A00();
        AnonymousClass057 r1 = this.A00.A00;
        r1.A08.A00();
        AnonymousClass04x r2 = r1.A04.A01;
        AnonymousClass0BK A022 = r2.A02();
        ContentValues contentValues = new ContentValues();
        contentValues.put("sent_to_server", Boolean.FALSE);
        contentValues.put("upload_timestamp", (Long) 0L);
        A022.A00("prekeys", contentValues, "sent_to_server != 0", null, "SignalPreKeyStore/markAllPreKeysAsUnsentToServer");
        Log.i("axolotl recorded no prekeys as received by server");
        AnonymousClass008.A0v("axolotl deleted prekey upload timestamps:", r2.A02().A01("prekey_uploads", null, null, "SignalPreKeyStore/deleteAllPreKeyUploads"));
    }

    public void A0M(AnonymousClass0E6 r3) {
        DeviceJid A0G2;
        this.A0H.A00();
        AnonymousClass051 r0 = this.A08;
        byte[] A052 = r0.A05(r3);
        boolean A042 = r0.A04(r3);
        if (A052 != null && A042 && (A0G2 = C001801b.A0G(r3)) != null) {
            this.A02.A04(A0G2);
        }
    }

    public void A0N(AnonymousClass0E6 r3, AnonymousClass0QZ r4) {
        this.A0H.A00();
        if (!this.A03.A08(C001801b.A0G(r3))) {
            A0O(r3, r4);
        } else {
            Log.e("SignalCoordinator/saveIdentity - Not allowed to save my companion identity");
        }
    }

    public final void A0O(AnonymousClass0E6 r8, AnonymousClass0QZ r9) {
        AnonymousClass0QZ A0A2 = A0A(r8);
        AnonymousClass051 r3 = this.A08;
        byte[] bArr = null;
        if (r9 != null) {
            bArr = r9.A00.A00();
        }
        AnonymousClass0BK A022 = r3.A00.A02();
        ContentValues contentValues = new ContentValues();
        contentValues.put("recipient_id", r8.A01);
        contentValues.put("device_id", Integer.valueOf(r8.A00));
        if (bArr != null) {
            contentValues.put("public_key", bArr);
        } else {
            contentValues.putNull("public_key");
        }
        contentValues.put("timestamp", Long.valueOf(r3.A01.A05() / 1000));
        long A052 = A022.A05("identities", contentValues, "SignalIdentityKeyStore/saveIdentity");
        StringBuilder sb = new StringBuilder("axolotl saved identity for ");
        sb.append(r8);
        sb.append(" with resultant row id ");
        sb.append(A052);
        Log.i(sb.toString());
        DeviceJid A0G2 = C001801b.A0G(r8);
        if (A0G2 == null) {
            return;
        }
        if (r9 == null) {
            if (A0A2 != null) {
                this.A02.A04(A0G2);
            }
        } else if (A0A2 == null) {
            this.A02.A02(A0G2);
        } else if (!r9.equals(A0A2)) {
            this.A02.A03(A0G2);
        }
    }

    public void A0P(AnonymousClass0E6 r8, C007303n r9) {
        String str;
        this.A0H.A00();
        AnonymousClass0BK A022 = this.A09.A00.A02();
        StringBuilder A0S = AnonymousClass008.A0S("msg_key_remote_jid = ? AND recipient_id = ? AND device_id = ? AND msg_key_from_me");
        if (r9.A02) {
            str = " != ";
        } else {
            str = " = ";
        }
        String A0Q = AnonymousClass008.A0Q(A0S, str, "0 AND ", "msg_key_id", " = ?");
        AnonymousClass02N r0 = r9.A00;
        if (r0 != null) {
            int i = 3;
            long A012 = (long) A022.A01("message_base_key", A0Q, new String[]{r0.getRawString(), r8.A01, String.valueOf(r8.A00), r9.A01}, "SignalMessageBaseKeyStore/removeMessageBaseKey");
            if (A012 <= 0) {
                i = 5;
            }
            StringBuilder sb = new StringBuilder("axolotl deleted ");
            sb.append(A012);
            sb.append(" message base key rows for ");
            sb.append(r9);
            Log.log(i, sb.toString());
            return;
        }
        throw null;
    }

    public void A0Q(AnonymousClass0E6 r7, C007303n r8, byte[] bArr) {
        this.A0H.A00();
        AnonymousClass053 r2 = this.A09;
        if (r2 != null) {
            AnonymousClass02N r0 = r8.A00;
            if (r0 != null) {
                String rawString = r0.getRawString();
                AnonymousClass0BK A022 = r2.A00.A02();
                ContentValues contentValues = new ContentValues();
                contentValues.put("msg_key_remote_jid", rawString);
                contentValues.put("recipient_id", r7.A01);
                contentValues.put("device_id", Integer.valueOf(r7.A00));
                contentValues.put("msg_key_from_me", Boolean.valueOf(r8.A02));
                contentValues.put("msg_key_id", r8.A01);
                contentValues.put("last_alice_base_key", bArr);
                contentValues.put("timestamp", Long.valueOf(r2.A01.A05() / 1000));
                long A052 = A022.A05("message_base_key", contentValues, "SignalMessageBaseKeyStore/saveMessageBaseKey");
                StringBuilder sb = new StringBuilder("axolotl saved a message base key for ");
                sb.append(r8);
                sb.append(" with row id ");
                sb.append(A052);
                Log.i(sb.toString());
                return;
            }
            throw null;
        }
        throw null;
    }

    public void A0R(AnonymousClass0OE r6) {
        this.A0H.A00();
        String str = r6.A01;
        if (!AnonymousClass2A2.A00.getRawString().equals(str)) {
            AnonymousClass008.A19("signalCoordinator/removefastratchetsenderkey/invalidgroupid ", str);
            return;
        }
        AnonymousClass0BK A022 = this.A07.A00.A02();
        AnonymousClass0E6 r2 = r6.A00;
        A022.A01("fast_ratchet_sender_keys", "group_id=? AND sender_id=? AND device_id=?", new String[]{str, r2.A01, String.valueOf(r2.A00)}, "SignalFastRatchetSenderKeyStore/removeFastRatchetSenderKey");
        AnonymousClass04v r0 = this.A05;
        r0.A00.A01(new AnonymousClass0E7());
    }

    public void A0S(AnonymousClass0OE r8) {
        this.A0H.A00();
        String str = r8.A01;
        try {
            Jid jid = Jid.get(str);
            if (jid instanceof AnonymousClass02X) {
                AnonymousClass02X r4 = (AnonymousClass02X) jid;
                AnonymousClass050 r2 = this.A0B;
                if (r2 != null) {
                    StringBuilder sb = new StringBuilder("SenderKeyStore/removeSenderKey/");
                    sb.append(r8);
                    Log.i(sb.toString());
                    AnonymousClass0BK A022 = r2.A00.A02();
                    AnonymousClass0E6 r22 = r8.A00;
                    A022.A01("sender_keys", "group_id = ? AND sender_id = ? AND device_id = ?", new String[]{str, r22.A01, String.valueOf(r22.A00)}, "SignalSenderKeyStore/removeSenderKey");
                    AnonymousClass04v r0 = this.A05;
                    r0.A01.A01(new AnonymousClass1Q2(r4));
                    return;
                }
                throw null;
            }
            throw new AnonymousClass02Y(str);
        } catch (AnonymousClass02Y unused) {
            AnonymousClass008.A19("senderkeystore/removesenderkey/invalidgroupid ", str);
        }
    }

    public void A0T(AnonymousClass0OE r6, byte[] bArr) {
        this.A0H.A00();
        String str = r6.A01;
        if (!AnonymousClass2A2.A00.getRawString().equals(str)) {
            AnonymousClass008.A19("signalCoordinator/savefastratchetsenderkey/invalidgroupid ", str);
            return;
        }
        AnonymousClass0BK A022 = this.A07.A00.A02();
        ContentValues contentValues = new ContentValues();
        contentValues.put("group_id", str);
        AnonymousClass0E6 r2 = r6.A00;
        contentValues.put("sender_id", r2.A01);
        contentValues.put("device_id", Integer.valueOf(r2.A00));
        contentValues.put("record", bArr);
        A022.A05("fast_ratchet_sender_keys", contentValues, "SignalFastRatchetSenderKeyStore/saveFastRatchetSenderKey");
        AnonymousClass04v r0 = this.A05;
        r0.A00.A01(new AnonymousClass0E7());
    }

    /* JADX INFO: finally extract failed */
    public void A0U(AnonymousClass0OE r20, byte[] bArr) {
        this.A0H.A01();
        String str = r20.A01;
        try {
            Jid jid = Jid.get(str);
            if (jid instanceof AnonymousClass02X) {
                AnonymousClass02X r4 = (AnonymousClass02X) jid;
                AnonymousClass050 r2 = this.A0B;
                if (r2 != null) {
                    StringBuilder sb = new StringBuilder("SenderKeyStore/saveSenderKey/");
                    sb.append(r20);
                    Log.i(sb.toString());
                    AnonymousClass0BK A022 = r2.A00.A02();
                    SQLiteDatabase sQLiteDatabase = A022.A00;
                    sQLiteDatabase.beginTransaction();
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("record", bArr);
                        long A052 = r2.A01.A05() / 1000;
                        AnonymousClass0E6 r0 = r20.A00;
                        String str2 = r0.A01;
                        int i = r0.A00;
                        long A002 = (long) A022.A00("sender_keys", contentValues, "group_id = ? AND sender_id = ? AND device_id = ?", new String[]{str, str2, String.valueOf(i)}, "SignalSenderKeyStore/saveSenderKeyUpdate");
                        if (A002 == 0) {
                            contentValues.put("group_id", str);
                            contentValues.put("sender_id", str2);
                            contentValues.put("device_id", Integer.valueOf(i));
                            contentValues.put("timestamp", Long.valueOf(A052));
                            A002 = A022.A03("sender_keys", contentValues, "SignalSenderKeyStore/saveSenderKey");
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SenderKeyStore/saveSenderKey/result/");
                        sb2.append(A002);
                        Log.i(sb2.toString());
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        AnonymousClass04v r02 = this.A05;
                        r02.A01.A01(new AnonymousClass1Q2(r4));
                    } catch (Throwable th) {
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                } else {
                    throw null;
                }
            } else {
                throw new AnonymousClass02Y(str);
            }
        } catch (AnonymousClass02Y unused) {
            AnonymousClass008.A19("senderkeystore/storesenderkey/invalidgroupid ", str);
        }
    }

    public void A0V(List list, int i) {
        this.A0H.A00();
        if (list.size() != 0) {
            SQLiteDatabase sQLiteDatabase = this.A06.A02().A00;
            sQLiteDatabase.beginTransaction();
            try {
                AnonymousClass0BK A022 = this.A0A.A01.A02();
                ContentValues contentValues = new ContentValues();
                sQLiteDatabase = A022.A00;
                sQLiteDatabase.beginTransaction();
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AnonymousClass1Q6 r3 = (AnonymousClass1Q6) it.next();
                        contentValues.clear();
                        contentValues.put("prekey_id", Integer.valueOf(r3.A00));
                        contentValues.put("record", r3.A01);
                        Boolean bool = Boolean.FALSE;
                        contentValues.put("sent_to_server", bool);
                        contentValues.put("direct_distribution", bool);
                        A022.A03("prekeys", contentValues, "SignalPreKeyStore/savePreKeys");
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    AnonymousClass0BK A023 = this.A08.A00.A02();
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("next_prekey_id", Integer.valueOf(i));
                    A023.A00("identities", contentValues2, "recipient_id = ? AND device_id = ? ", new String[]{"-1", String.valueOf(0)}, "SignalIdentityKeyStore/saveNextPreKeyId");
                    sQLiteDatabase.setTransactionSuccessful();
                } finally {
                    sQLiteDatabase.endTransaction();
                }
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
    }

    public boolean A0W(AnonymousClass0E6 r5) {
        AnonymousClass04z r3 = this.A0C;
        byte[] A032 = r3.A03(r5);
        if (A032 == null) {
            return false;
        }
        try {
            A02(new AnonymousClass1UN(A032));
            return true;
        } catch (IOException unused) {
            r3.A01(r5);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bb, code lost:
        if (r3 != null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0X(X.AnonymousClass0E6 r13, X.C007303n r14) {
        /*
        // Method dump skipped, instructions count: 195
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001000o.A0X(X.0E6, X.03n):boolean");
    }

    public byte[] A0Y() {
        this.A0H.A00();
        byte[] bArr = A0B().A01.A00.A01;
        Log.i("axolotl fetched identity key for sending");
        return bArr;
    }
}
