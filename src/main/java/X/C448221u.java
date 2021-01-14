package X;

import java.util.HashMap;

/* renamed from: X.21u  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C448221u implements AbstractC03150Ez {
    public final /* synthetic */ AnonymousClass0EX A00;
    public final /* synthetic */ AnonymousClass1WL A01;

    public /* synthetic */ C448221u(AnonymousClass0EX r1, AnonymousClass1WL r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        AnonymousClass0EX r3 = this.A00;
        AnonymousClass1WL r2 = this.A01;
        StringBuilder A0S = AnonymousClass008.A0S("ProfilePicturePlainFileDownloadManager/callback/remove downloader from map/jid = ");
        A0S.append(r2.A03);
        A0S.append(", type = ");
        AnonymousClass008.A1K(A0S, r2.A02);
        HashMap hashMap = r3.A09;
        synchronized (hashMap) {
            hashMap.remove(obj);
        }
    }
}
