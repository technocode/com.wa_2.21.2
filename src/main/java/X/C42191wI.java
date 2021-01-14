package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.1wI  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42191wI implements AbstractC27871Rx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ ActivityC004702f A03;
    public final /* synthetic */ AnonymousClass1S0 A04;
    public final /* synthetic */ AnonymousClass1S6 A05;
    public final /* synthetic */ C48052Ks A06;
    public final /* synthetic */ AnonymousClass02N A07;
    public final /* synthetic */ UserJid A08;
    public final /* synthetic */ List A09;

    public /* synthetic */ C42191wI(AnonymousClass1S6 r1, int i, List list, ActivityC004702f r4, int i2, AnonymousClass02N r6, C48052Ks r7, UserJid userJid, long j, AnonymousClass1S0 r11) {
        this.A05 = r1;
        this.A00 = i;
        this.A09 = list;
        this.A03 = r4;
        this.A01 = i2;
        this.A07 = r6;
        this.A06 = r7;
        this.A08 = userJid;
        this.A02 = j;
        this.A04 = r11;
    }

    @Override // X.AbstractC27871Rx
    public final void AHF(C42301wU r19, Bitmap bitmap, boolean z) {
        AnonymousClass1S6 r5 = this.A05;
        int i = this.A00;
        List list = this.A09;
        ActivityC004702f r9 = this.A03;
        int i2 = this.A01;
        AnonymousClass02N r11 = this.A07;
        C48052Ks r12 = this.A06;
        UserJid userJid = this.A08;
        long j = this.A02;
        AnonymousClass1S0 r0 = this.A04;
        C41191ud r3 = new C41191ud();
        r3.A01.A03(new C42161wF(r5, z, i, list, r9, i2, r11, r12, userJid, j, r0, r3), r5.A01.A06);
        r5.A09.ANF(new RunnableEBaseShape2S0300000_I1(r5, r3, bitmap, 18));
    }
}
