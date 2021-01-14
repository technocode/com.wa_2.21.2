package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.2gC  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55222gC implements AbstractC02170Ax {
    public static final /* synthetic */ C55222gC A00 = new C55222gC();

    @Override // X.AbstractC02170Ax
    public final Object get() {
        AnonymousClass01I A002 = AnonymousClass01I.A00();
        C28821Vw A003 = C28821Vw.A00();
        AnonymousClass00G r0 = AnonymousClass00G.A01;
        C55282gI r6 = new C55282gI(r0, AnonymousClass03S.A00(), AnonymousClass0C2.A00(), C28701Vk.A00());
        C55322gM r7 = new C55322gM(r0, C04350Ka.A00(), C04360Kb.A00(), AnonymousClass0GG.A00(), C04410Kg.A00(), AnonymousClass01T.A00(), AnonymousClass0C2.A00(), AnonymousClass0EU.A03, C28781Vs.A00(), AnonymousClass2RO.A00(), C28691Vj.A00());
        C447021d r8 = new C447021d(AnonymousClass01I.A00(), AnonymousClass01A.A00(), C014308b.A00(), C55262gG.A00, C55272gH.A00, C28701Vk.A00(), C28691Vj.A00());
        C55332gN r9 = new C55332gN(new Handler(Looper.getMainLooper()), r0, AnonymousClass03S.A00(), AnonymousClass0C2.A00(), C28781Vs.A00(), C28691Vj.A00());
        if (AnonymousClass2RD.A02 == null) {
            synchronized (AnonymousClass2RD.class) {
                if (AnonymousClass2RD.A02 == null) {
                    AnonymousClass2RD.A02 = new AnonymousClass2RD(r0, C28841Vy.A00());
                }
            }
        }
        C55292gJ r10 = new C55292gJ(AnonymousClass2RD.A02);
        C28631Vd A004 = C28631Vd.A00();
        C55342gO r12 = new C55342gO(new AnonymousClass0Yz("hangup_call", null, null), C28701Vk.A00(), AnonymousClass0Z0.A00());
        C55342gO r13 = new C55342gO(new AnonymousClass0Yz("reject_call", null, null), C28701Vk.A00(), AnonymousClass0Z0.A00());
        C55312gL r14 = new C55312gL(AnonymousClass0DG.A00(), C28711Vl.A00());
        if (AnonymousClass2RI.A01 == null) {
            synchronized (AnonymousClass2RI.class) {
                if (AnonymousClass2RI.A01 == null) {
                    AnonymousClass2RI.A01 = new AnonymousClass2RI(C28751Vp.A00());
                }
            }
        }
        return new AnonymousClass2RJ(A002, A003, r6, r7, r8, r9, r10, A004, r12, r13, r14, AnonymousClass2RI.A01, new C55302gK(AnonymousClass00S.A00(), C006903j.A00(), AnonymousClass0DG.A00(), AnonymousClass01K.A00(), AnonymousClass0BB.A00(), AnonymousClass01Q.A00(), C447621j.A00(), C28691Vj.A00()), C014708f.A00(), AnonymousClass2RO.A00());
    }
}
