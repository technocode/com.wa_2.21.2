package X;

import com.whatsapp.Mp4Ops;
import java.io.File;

/* renamed from: X.0eb  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC10420eb extends AnonymousClass0JW {
    public final AnonymousClass009 A00;
    public final Mp4Ops A01;
    public final AnonymousClass00C A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass1VZ A04;
    public final AbstractC02970Eh A05;
    public final String A06;
    public final boolean A07;

    public AbstractC10420eb(Mp4Ops mp4Ops, AnonymousClass009 r2, AnonymousClass00C r3, String str, boolean z, AnonymousClass00S r6, AnonymousClass1VZ r7, AbstractC02970Eh r8) {
        this.A01 = mp4Ops;
        this.A00 = r2;
        this.A02 = r3;
        this.A06 = str;
        this.A05 = r8;
        this.A07 = z;
        this.A04 = r7;
        this.A03 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r2.close();
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01bc, code lost:
        r16 = new X.C49202Pk(r5, r18, r20, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r2.close();
        r8.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01e6 A[SYNTHETIC, Splitter:B:95:0x01e6] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01eb A[Catch:{ IOException -> 0x01ee }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C49202Pk A04() {
        /*
        // Method dump skipped, instructions count: 528
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC10420eb.A04():X.2Pk");
    }

    /* renamed from: A05 */
    public final void A03(C49202Pk r5) {
        File file;
        AbstractC02970Eh r3 = this.A05;
        String str = this.A06;
        byte[] bArr = null;
        if (r5 == null) {
            file = null;
        } else {
            file = r5.A02;
            bArr = r5.A03;
        }
        r3.AG3(str, file, bArr);
        StringBuilder sb = new StringBuilder("gif/cache/");
        sb.append(r5);
        sb.append(" for ");
        AnonymousClass008.A1S(sb, str);
    }
}
