package X;

import com.whatsapp.util.Log;

/* renamed from: X.0Jl  reason: invalid class name and case insensitive filesystem */
public class C04200Jl {
    public static volatile C04200Jl A06;
    public boolean A00;
    public final AnonymousClass088 A01;
    public final AnonymousClass02M A02;
    public final AnonymousClass00C A03;
    public final AnonymousClass0HO A04;
    public final C04210Jm A05;

    public C04200Jl(AnonymousClass02M r1, AnonymousClass088 r2, C04210Jm r3, AnonymousClass00C r4, AnonymousClass0HO r5) {
        this.A02 = r1;
        this.A01 = r2;
        this.A05 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }

    public static C04200Jl A00() {
        if (A06 == null) {
            synchronized (AnonymousClass00C.class) {
                if (A06 == null) {
                    AnonymousClass02M A002 = AnonymousClass02M.A00();
                    AnonymousClass009.A00();
                    AnonymousClass088 A003 = AnonymousClass088.A00();
                    C04210Jm A004 = C04210Jm.A00();
                    C03020Em.A00();
                    A06 = new C04200Jl(A002, A003, A004, AnonymousClass00C.A00(), AnonymousClass0HO.A00());
                }
            }
        }
        return A06;
    }

    public void A01() {
        AnonymousClass00C r4 = this.A03;
        if (!r4.A00) {
            if (!r4.A01) {
                this.A01.A0H();
                if (!this.A00) {
                    this.A00 = true;
                    Log.i("media-state-manager/refresh-media-state/writable-media");
                    C04210Jm r3 = this.A05;
                    if (r3.A03 == null) {
                        synchronized (r3) {
                            if (r3.A03 == null) {
                                r3.A03 = new AnonymousClass0PI(r3.A00.A05, r3.A01);
                            }
                        }
                    }
                    r3.A03.A00();
                }
            }
            AnonymousClass0HO r32 = this.A04;
            if (r32.A03(r32.A05.A00)) {
                Log.d("media-state-manager/refresh-media-state/deferredbackup");
                r32.A02(-1, new C52602bO(r32, null));
            }
            this.A02.A0E(new RunnableEBaseShape3S0100000_I0_3(r4, 14));
        }
    }
}
