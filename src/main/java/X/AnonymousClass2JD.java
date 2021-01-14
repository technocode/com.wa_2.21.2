package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

/* renamed from: X.2JD  reason: invalid class name */
public final class AnonymousClass2JD {
    public View A00;
    public AnonymousClass2J9 A01;
    public AnonymousClass2JA A02;
    public C52012aR A03;
    public C52022aS A04;
    public ArrayList A05;
    public boolean A06;
    public boolean A07;
    public final ViewGroup A08;
    public final ListView A09;
    public final ActivityC004802g A0A;
    public final AnonymousClass0GG A0B;
    public final C39681rv A0C;
    public final AbstractC004502c A0D;
    public final AnonymousClass01I A0E;
    public final C000300f A0F;
    public final AnonymousClass01A A0G;
    public final AnonymousClass2JC A0H;
    public final AnonymousClass00D A0I;
    public final AnonymousClass01X A0J;
    public final C006903j A0K;
    public final AnonymousClass01T A0L;
    public final AnonymousClass098 A0M;
    public final C016909b A0N;
    public final AnonymousClass01P A0O;
    public final AnonymousClass0EO A0P;
    public final AnonymousClass02N A0Q;
    public final C02360Br A0R;
    public final AnonymousClass09D A0S;
    public final AnonymousClass36W A0T;

    public AnonymousClass2JD(ActivityC004802g r5, AnonymousClass01I r6, C006903j r7, C000300f r8, AnonymousClass098 r9, AnonymousClass01A r10, C02360Br r11, AnonymousClass01X r12, AnonymousClass0GG r13, AnonymousClass0EO r14, C016909b r15, AnonymousClass09V r16, AnonymousClass01P r17, AnonymousClass00D r18, AnonymousClass01T r19, AnonymousClass09D r20, AbstractC004502c r21, C39681rv r22, AnonymousClass02N r23, ListView listView, AnonymousClass2JC r25) {
        this.A0A = r5;
        this.A0E = r6;
        this.A0K = r7;
        this.A0F = r8;
        this.A0M = r9;
        this.A0G = r10;
        this.A0R = r11;
        this.A0J = r12;
        this.A0B = r13;
        this.A0P = r14;
        this.A0N = r15;
        this.A0O = r17;
        this.A0I = r18;
        this.A0L = r19;
        this.A0S = r20;
        this.A0D = r21;
        this.A0C = r22;
        this.A0Q = r23;
        this.A09 = listView;
        this.A0H = r25;
        this.A0T = new AnonymousClass36W(r6, r10, r15, r16);
        ViewGroup viewGroup = (ViewGroup) r5.getLayoutInflater().inflate(R.layout.conversation_header, (ViewGroup) listView, false);
        this.A08 = viewGroup;
        this.A00 = viewGroup.findViewById(R.id.progress);
        listView.addHeaderView(this.A08);
    }

    public final void A00(C007003k r30, boolean z) {
        if (this.A01 == null) {
            ActivityC004802g r13 = this.A0A;
            AnonymousClass2J9 r12 = new AnonymousClass2J9(r13);
            this.A01 = r12;
            C006903j r0 = this.A0K;
            C000300f r14 = this.A0F;
            AnonymousClass098 r10 = this.A0M;
            C02360Br r9 = this.A0R;
            AnonymousClass01X r8 = this.A0J;
            AnonymousClass0GG r7 = this.A0B;
            AnonymousClass01P r6 = this.A0O;
            AnonymousClass00D r5 = this.A0I;
            AnonymousClass01T r4 = this.A0L;
            AbstractC004502c r3 = this.A0D;
            C39681rv r15 = this.A0C;
            r12.A00(r13, r0, r14, r10, r9, r8, r7, r6, r5, r4, r3, new RunnableEBaseShape9S0100000_I1_4(r15, 6), new RunnableEBaseShape9S0100000_I1_4(r15, 5), r30, this.A0H.A00);
            this.A09.addFooterView(this.A01);
        }
        this.A01.A0J = z;
    }
}
