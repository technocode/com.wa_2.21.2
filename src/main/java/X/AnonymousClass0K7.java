package X;

import com.whatsapp.Mp4Ops;
import com.whatsapp.stickers.WebpUtils;

/* renamed from: X.0K7  reason: invalid class name */
public class AnonymousClass0K7 {
    public static volatile AnonymousClass0K7 A04;
    public final AnonymousClass09V A00;
    public final AnonymousClass0A7 A01;
    public final C002701k A02;
    public final AnonymousClass0K8 A03;

    public AnonymousClass0K7(C002701k r1, AnonymousClass09V r2, AnonymousClass0K8 r3, AnonymousClass0A7 r4) {
        this.A02 = r1;
        this.A00 = r2;
        this.A03 = r3;
        this.A01 = r4;
    }

    public static AnonymousClass0K7 A00() {
        if (A04 == null) {
            synchronized (AnonymousClass0K7.class) {
                if (A04 == null) {
                    C002701k A002 = C002701k.A00();
                    AnonymousClass09V A003 = AnonymousClass09V.A00();
                    if (AnonymousClass0K8.A0Z == null) {
                        synchronized (AnonymousClass0K8.class) {
                            if (AnonymousClass0K8.A0Z == null) {
                                AnonymousClass0K8.A0Z = new AnonymousClass0K8(AnonymousClass00G.A01, AnonymousClass00S.A00(), Mp4Ops.A00(), C002701k.A00(), AnonymousClass02M.A00(), AnonymousClass009.A00(), C002101e.A00(), WebpUtils.A00(), AnonymousClass088.A00(), AnonymousClass0CK.A00(), AnonymousClass0CL.A00(), AnonymousClass0CM.A00(), C000300f.A00(), AnonymousClass0CN.A00(), AnonymousClass0CP.A00(), AnonymousClass0CT.A00(), C02220Bc.A00(), AnonymousClass0AH.A03(), C02550Cn.A01(), C02570Cp.A01(), C02460Cc.A01(), C02240Be.A00(), AnonymousClass01K.A00(), AnonymousClass0BB.A00(), AnonymousClass0Ci.A00(), AnonymousClass0BV.A00(), AnonymousClass00C.A00(), C02580Cq.A01(), AnonymousClass0EN.A00(), AnonymousClass0FM.A00(), AnonymousClass0FO.A01(), AnonymousClass0CW.A00(), AnonymousClass022.A00(), AnonymousClass0AK.A00());
                            }
                        }
                    }
                    A04 = new AnonymousClass0K7(A002, A003, AnonymousClass0K8.A0Z, AnonymousClass0A7.A00());
                }
            }
        }
        return A04;
    }
}
