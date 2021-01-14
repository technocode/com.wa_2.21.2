package X;

import com.whatsapp.util.Log;

/* renamed from: X.2fM  reason: invalid class name and case insensitive filesystem */
public class C54702fM extends AnonymousClass0JW {
    public final /* synthetic */ C54682fK A00;
    public final /* synthetic */ AnonymousClass2Q7 A01;

    public C54702fM(AnonymousClass2Q7 r1, C54682fK r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass0JW
    public void A00(Object[] objArr) {
        boolean booleanValue = ((Boolean[]) objArr)[0].booleanValue();
        this.A01.A09.AOP(booleanValue);
        this.A00.A00(booleanValue);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        r18.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04cd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x051a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x051b, code lost:
        if (r20 != null) goto L_0x051d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:?, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0520, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass0JW
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A02(java.lang.Object[] r36) {
        /*
        // Method dump skipped, instructions count: 1432
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54702fM.A02(java.lang.Object[]):java.lang.Object");
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Boolean bool = (Boolean) obj;
        AbstractC03920Ih r0 = this.A01.A09;
        boolean booleanValue = bool.booleanValue();
        r0.AOP(booleanValue);
        this.A00.A00(booleanValue);
        StringBuilder sb = new StringBuilder("dictionaryloader/prepare/hasDictionary= ");
        sb.append(bool);
        Log.d(sb.toString());
    }
}
