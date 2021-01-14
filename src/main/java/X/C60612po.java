package X;

import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.concurrent.Executor;

/* renamed from: X.2po  reason: invalid class name and case insensitive filesystem */
public class C60612po extends AbstractRunnableC459527e {
    public final long A00;
    public final C04080Iy A01;
    public final AnonymousClass009 A02;
    public final String A03;
    public final Collection A04;

    public C60612po(AnonymousClass02M r7, AnonymousClass009 r8, Collection collection, String str, long j) {
        StringBuilder sb = new StringBuilder("mediafilefindjob/new; job=");
        sb.append(this);
        Log.d(sb.toString());
        this.A02 = r8;
        this.A03 = str;
        this.A04 = collection;
        this.A00 = j;
        Executor executor = r7.A06;
        C04080Iy r4 = new C04080Iy();
        executor.execute(new RunnableEBaseShape0S0100100_I0(r4, 10000, 0));
        this.A01 = r4;
    }

    @Override // X.AbstractC27381Pn, X.AbstractRunnableC459527e
    public void cancel() {
        StringBuilder sb = new StringBuilder("mediafilefindjob/cancel job=");
        sb.append(this);
        Log.d(sb.toString());
        super.cancel();
        this.A01.A01();
    }
}
