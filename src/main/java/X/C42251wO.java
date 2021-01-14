package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1wO  reason: invalid class name and case insensitive filesystem */
public final class C42251wO implements AnonymousClass1S1 {
    public final /* synthetic */ int A00 = 6;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Intent A02;
    public final /* synthetic */ AnonymousClass02M A03;
    public final /* synthetic */ C41191ud A04;
    public final /* synthetic */ AnonymousClass1S3 A05;
    public final /* synthetic */ UserJid A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public C42251wO(String str, AnonymousClass02M r3, AnonymousClass1S3 r4, UserJid userJid, boolean z, Context context, Intent intent, C41191ud r9) {
        this.A07 = str;
        this.A03 = r3;
        this.A05 = r4;
        this.A06 = userJid;
        this.A08 = z;
        this.A01 = context;
        this.A02 = intent;
        this.A04 = r9;
    }

    @Override // X.AnonymousClass1S1
    public void AFw(String str, int i) {
        if (this.A07.equals(str)) {
            AnonymousClass02M r3 = this.A03;
            r3.A02.post(new RunnableEBaseShape6S0200000_I1_1(this, this.A05, 34));
            this.A04.A00(Boolean.FALSE);
        }
    }

    @Override // X.AnonymousClass1S1
    public void AFx(C48092Kw r12, String str) {
        String str2 = this.A07;
        if (str2.equals(str)) {
            AnonymousClass02M r3 = this.A03;
            r3.A02.post(new RunnableEBaseShape6S0200000_I1_1(this, this.A05, 35));
            AnonymousClass2D8.A04(this.A06, str2, this.A08, null, null, this.A01, this.A02, this.A00);
            this.A04.A00(Boolean.TRUE);
        }
    }
}
