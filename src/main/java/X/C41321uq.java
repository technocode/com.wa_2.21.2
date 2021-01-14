package X;

import java.io.BufferedInputStream;
import java.io.File;
import java.net.HttpURLConnection;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1uq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C41321uq implements AbstractC000900m {
    public final /* synthetic */ AnonymousClass00T A00;
    public final /* synthetic */ BufferedInputStream A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ HttpURLConnection A03;
    public final /* synthetic */ AtomicBoolean A04;

    public /* synthetic */ C41321uq(AnonymousClass00T r1, File file, AtomicBoolean atomicBoolean, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) {
        this.A00 = r1;
        this.A02 = file;
        this.A04 = atomicBoolean;
        this.A03 = httpURLConnection;
        this.A01 = bufferedInputStream;
    }

    @Override // X.AbstractC000900m
    public final void AEa(AnonymousClass0JF r8) {
        this.A00.ANF(new RunnableEBaseShape0S0400000_I0(this.A02, this.A04, this.A03, this.A01, 3));
    }
}
