package X;

/* renamed from: X.2j0  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56672j0 implements AbstractC03150Ez {
    public final /* synthetic */ AnonymousClass0CH A00;
    public final /* synthetic */ AnonymousClass0M3 A01;

    public /* synthetic */ C56672j0(AnonymousClass0CH r1, AnonymousClass0M3 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        AnonymousClass0CH r5 = this.A00;
        AnonymousClass0M3 r4 = this.A01;
        StringBuilder A0S = AnonymousClass008.A0S("MediaDownloadManager/DownloadResult/Failed due to expiration of media; mediaHash; message.key=");
        C007303n r3 = r4.A0n;
        A0S.append(r3);
        A0S.append(", message.mediaHash = ");
        AnonymousClass008.A1S(A0S, r4.A06);
        r5.A0H.A02(r3, 11, null);
        r5.A0V.A0N(r4);
    }
}
