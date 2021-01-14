package X;

import com.whatsapp.util.Log;

/* renamed from: X.0Z5  reason: invalid class name */
public class AnonymousClass0Z5 implements AnonymousClass0IN {
    public final /* synthetic */ AnonymousClass0XN A00;

    public AnonymousClass0Z5(AnonymousClass0XN r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0IN
    public void AAB(String str, int i, int i2, long j) {
        throw new UnsupportedOperationException();
    }

    @Override // X.AnonymousClass0IN
    public void AAC(String str, int i, AnonymousClass0RO r5) {
        StringBuilder sb = new StringBuilder("ContactQuerySync/result sid=");
        sb.append(str);
        sb.append(" index=");
        sb.append(i);
        Log.i(sb.toString());
        this.A00.A0A.put(str, r5);
    }

    @Override // X.AnonymousClass0IN
    public void AAD(String str, int i, int i2, long j) {
        throw new UnsupportedOperationException();
    }
}
