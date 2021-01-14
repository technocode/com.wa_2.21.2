package X;

/* renamed from: X.1Se  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class RunnableC27931Se extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass088 A01;
    public final /* synthetic */ AnonymousClass00S A02;
    public final /* synthetic */ AnonymousClass00Y A03;
    public final /* synthetic */ C73193Vv A04;
    public final /* synthetic */ String A05;

    public /* synthetic */ RunnableC27931Se(String str, int i, AnonymousClass088 r3, AnonymousClass00S r4, C73193Vv r5, AnonymousClass00Y r6) {
        this.A05 = str;
        this.A00 = i;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r5;
        this.A03 = r6;
    }

    public final void run() {
        String str = this.A05;
        int i = this.A00;
        AnonymousClass088 r0 = this.A01;
        AnonymousClass00S r2 = this.A02;
        C73193Vv r9 = this.A04;
        AnonymousClass00Y r6 = this.A03;
        long A032 = C006803i.A03(r0.A09(), null);
        r9.A0E("STORAGE_USAGE_MEDIA_SIZE", String.valueOf(A032));
        r9.A0E("STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME", String.valueOf(r2.A05()));
        AnonymousClass21G r22 = new AnonymousClass21G();
        C28051Sr.A1b(r22, 2, str, i);
        r22.A05 = Long.valueOf(A032);
        r6.A0B(r22, null, false);
    }
}
