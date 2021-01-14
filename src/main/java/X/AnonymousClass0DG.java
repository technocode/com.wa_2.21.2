package X;

import com.whatsapp.util.Log;

/* renamed from: X.0DG  reason: invalid class name */
public class AnonymousClass0DG {
    public static volatile AnonymousClass0DG A0D;
    public final AnonymousClass09F A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass0DH A02;
    public final AnonymousClass09A A03;
    public final C014408c A04;
    public final C006903j A05;
    public final AnonymousClass0AB A06;
    public final AnonymousClass094 A07;
    public final C014508d A08;
    public final AnonymousClass095 A09;
    public final C015708p A0A;
    public final AnonymousClass09U A0B;
    public final AnonymousClass0AS A0C;

    public AnonymousClass0DG(AnonymousClass02M r1, C014408c r2, C006903j r3, AnonymousClass095 r4, AnonymousClass0DH r5, AnonymousClass09F r6, AnonymousClass0AB r7, AnonymousClass0AS r8, C015708p r9, AnonymousClass09A r10, C014508d r11, AnonymousClass094 r12, AnonymousClass09U r13) {
        this.A01 = r1;
        this.A04 = r2;
        this.A05 = r3;
        this.A09 = r4;
        this.A02 = r5;
        this.A00 = r6;
        this.A06 = r7;
        this.A0C = r8;
        this.A0A = r9;
        this.A03 = r10;
        this.A08 = r11;
        this.A07 = r12;
        this.A0B = r13;
    }

    public static AnonymousClass0DG A00() {
        if (A0D == null) {
            synchronized (AnonymousClass0DG.class) {
                if (A0D == null) {
                    A0D = new AnonymousClass0DG(AnonymousClass02M.A00(), C014408c.A00(), C006903j.A00(), AnonymousClass095.A00(), AnonymousClass0DH.A00(), AnonymousClass09F.A00(), AnonymousClass0AB.A00(), AnonymousClass0AS.A00(), C015708p.A00(), AnonymousClass09A.A02, C014508d.A00(), AnonymousClass094.A00(), AnonymousClass09U.A00());
                }
            }
        }
        return A0D;
    }

    public void A01(AnonymousClass02N r5) {
        C08560bL A052 = this.A05.A05(r5);
        if (A052 == null) {
            AnonymousClass008.A13("msgstore/reset-show-group-description/no chat ", r5);
        } else if (!A052.A0S) {
            AnonymousClass008.A12("msgstore/reset-show-group-description/nop ", r5);
        } else {
            A052.A0S = false;
            this.A03.A01(new RunnableEBaseShape2S0200000_I0_1(this, A052, 20), 5);
        }
    }

    public final void A02(AnonymousClass02N r20, AbstractC007503q r21, int i, int i2, boolean z) {
        C007303n r0;
        C08560bL A052 = this.A05.A05(r20);
        C007303n r7 = null;
        if (A052 == null) {
            StringBuilder A0W = AnonymousClass008.A0W("msgstore/setchatseen/nochat/", r20, "/");
            if (r21 != null) {
                r7 = r21.A0n;
            }
            A0W.append(r7);
            Log.i(A0W.toString());
            return;
        }
        StringBuilder A0W2 = AnonymousClass008.A0W("msgstore/setchatseen/", r20, "/");
        A0W2.append(A052.A0H());
        A0W2.append("/");
        if (r21 != null) {
            r0 = r21.A0n;
        } else {
            r0 = null;
        }
        A0W2.append(r0);
        A0W2.append("/");
        A0W2.append(i);
        Log.i(A0W2.toString());
        int i3 = 0;
        boolean z2 = false;
        if (A052.A03 == -1) {
            z2 = true;
        }
        if (r21 != null) {
            AnonymousClass095 r3 = this.A09;
            AnonymousClass02N r2 = r21.A0n.A00;
            if (r2 != null) {
                i3 = r3.A01(r2, r21.A0p);
            } else {
                throw null;
            }
        }
        boolean A0J = A052.A0J(i, i2, i3);
        long A032 = AnonymousClass0FI.A03(r21);
        long j = A052.A0G;
        if (A032 == 1) {
            A032 = Math.max(A052.A0F, A052.A0I);
        }
        if (j < A032 || A0J || A052.A0F == 0) {
            if (A052.A0F == 0) {
                A052.A0F = this.A09.A07(A052.A0T);
                A052.A0N = null;
            }
            if (A052.A0E != 1) {
                A052.A0E = 1;
            }
            A052.A0G = A032;
            this.A03.A01(new AnonymousClass2KQ(this, z, z2, r20, A052), 2);
        }
    }

    public void A03(AnonymousClass02N r6, boolean z) {
        if (z) {
            this.A0C.A01(3, r6);
        }
        C08560bL A052 = this.A05.A05(r6);
        if (A052 == null) {
            StringBuilder sb = new StringBuilder("msgstore/archive/no chat ");
            sb.append(r6);
            sb.append(" ");
            sb.append(z);
            Log.w(sb.toString());
        } else if (A052.A0R == z) {
            StringBuilder sb2 = new StringBuilder("msgstore/archive/nop ");
            sb2.append(r6);
            sb2.append(" ");
            sb2.append(z);
            Log.w(sb2.toString());
        } else {
            A052.A0R = z;
            this.A00.A01();
            this.A03.A01(new RunnableEBaseShape0S0210000_I0(this, A052, z, 3), 3);
        }
    }

    public final void A04(boolean z) {
        boolean z2;
        synchronized (this.A07) {
            C006903j r3 = this.A05;
            synchronized (r3) {
                z2 = r3.A00;
            }
            if (!z2) {
                AnonymousClass0R6 r2 = new AnonymousClass0R6(this);
                StringBuilder sb = new StringBuilder();
                sb.append("msgstore-manager/initializeChats lazily:");
                sb.append(z);
                Log.d(sb.toString());
                synchronized (r3) {
                    r3.A0A();
                    boolean z3 = false;
                    if (r3.A02 == null) {
                        z3 = true;
                    }
                    AnonymousClass00E.A07(z3);
                    r3.A02 = r2;
                    if (!z) {
                        r3.A0A();
                    }
                }
            }
        }
    }

    public boolean A05(AnonymousClass02N r7) {
        C08560bL A052 = this.A05.A05(r7);
        if (A052 != null) {
            return (A052.A03 == 0 && A052.A04 == 0 && A052.A0G == Math.max(A052.A0F, A052.A0I)) ? false : true;
        }
        return false;
    }
}
