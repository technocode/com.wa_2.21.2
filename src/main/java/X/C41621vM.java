package X;

import java.net.HttpURLConnection;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1vM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C41621vM implements AbstractC000900m {
    public final /* synthetic */ AnonymousClass1RE A00;
    public final /* synthetic */ HttpURLConnection A01;
    public final /* synthetic */ AtomicBoolean A02;

    public /* synthetic */ C41621vM(AnonymousClass1RE r1, AtomicBoolean atomicBoolean, HttpURLConnection httpURLConnection) {
        this.A00 = r1;
        this.A02 = atomicBoolean;
        this.A01 = httpURLConnection;
    }

    @Override // X.AbstractC000900m
    public final void AEa(AnonymousClass0JF r6) {
        this.A00.A0A.ANF(new RunnableEBaseShape6S0200000_I1_1(this.A02, this.A01, 26));
    }
}
