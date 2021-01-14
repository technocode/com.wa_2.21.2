package X;

import java.util.List;

/* renamed from: X.2KD  reason: invalid class name */
public class AnonymousClass2KD {
    public final /* synthetic */ AnonymousClass2KF A00;

    public AnonymousClass2KD(AnonymousClass2KF r1) {
        this.A00 = r1;
    }

    public byte[] A00() {
        AnonymousClass2KF r2 = this.A00;
        AnonymousClass00E.A07(r2.A02);
        List<Object> list = r2.A07;
        if (list.size() == 0) {
            return null;
        }
        int size = list.size();
        int i = r2.A03;
        byte[] bArr = new byte[(size * i)];
        int i2 = 0;
        for (Object obj : list) {
            System.arraycopy(obj, 0, bArr, i2, i);
            i2 += i;
        }
        return bArr;
    }
}
