package X;

/* renamed from: X.2KR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2KR extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass0EP A01;
    public final /* synthetic */ AnonymousClass02U A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ AnonymousClass2KR(AnonymousClass0EP r1, AnonymousClass02U r2, String str, long j) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = str;
        this.A00 = j;
    }

    public final void run() {
        this.A01.A02(this.A02, this.A03, Long.valueOf(this.A00));
    }
}
