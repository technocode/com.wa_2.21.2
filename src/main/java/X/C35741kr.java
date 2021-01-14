package X;

/* renamed from: X.1kr  reason: invalid class name and case insensitive filesystem */
public final class C35741kr implements AnonymousClass1A4 {
    public final /* synthetic */ AnonymousClass1AF A00;
    public final /* synthetic */ Runnable A01;

    public C35741kr(AnonymousClass1AF r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    @Override // X.AnonymousClass1A4
    public final void AS1(Throwable th) {
        this.A00.A01.post(this.A01);
    }
}
