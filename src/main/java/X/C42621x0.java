package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1x0  reason: invalid class name and case insensitive filesystem */
public class C42621x0 implements AnonymousClass0O4 {
    public final Context A00;
    public final AnonymousClass01I A01;
    public final AnonymousClass1SP A02;
    public final AnonymousClass1SQ A03;
    public final AnonymousClass00S A04;
    public final AnonymousClass01X A05;
    public final UserJid A06;

    public C42621x0(AnonymousClass00S r1, Context context, AnonymousClass1SQ r3, UserJid userJid, AnonymousClass01I r5, AnonymousClass01X r6, AnonymousClass1SP r7) {
        this.A04 = r1;
        this.A00 = context;
        this.A03 = r3;
        this.A06 = userJid;
        this.A01 = r5;
        this.A05 = r6;
        this.A02 = r7;
    }

    @Override // X.AnonymousClass0O4
    public AnonymousClass0SD A3B(Class cls) {
        return new C42611wz(this.A04, this.A00, this.A03, this.A06, this.A01, this.A02, this.A05);
    }
}
