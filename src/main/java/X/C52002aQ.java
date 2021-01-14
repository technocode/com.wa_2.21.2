package X;

import android.app.Activity;

/* renamed from: X.2aQ  reason: invalid class name and case insensitive filesystem */
public final class C52002aQ extends AnonymousClass1PD {
    public C10730f6 A00;
    public Runnable A01;
    public final ActivityC004802g A02;
    public final C02780Dk A03;
    public final AnonymousClass0GG A04;
    public final C39561rj A05;
    public final AnonymousClass0MG A06;
    public final AbstractC004502c A07;
    public final AnonymousClass02M A08;
    public final AnonymousClass03B A09;
    public final C000300f A0A;
    public final AnonymousClass0XP A0B;
    public final AnonymousClass0GZ A0C;
    public final C04360Kb A0D;
    public final AnonymousClass01A A0E;
    public final C014308b A0F;
    public final C47242Ha A0G;
    public final C47282He A0H;
    public final AnonymousClass2J6 A0I;
    public final AnonymousClass00S A0J;
    public final AnonymousClass00D A0K;
    public final AnonymousClass01X A0L;
    public final AnonymousClass0AQ A0M;
    public final C02590Cr A0N;
    public final AnonymousClass0M9 A0O;
    public final AnonymousClass02N A0P;
    public final AnonymousClass00T A0Q;

    public C52002aQ(ActivityC004802g r5, AnonymousClass00S r6, AnonymousClass0GZ r7, AnonymousClass02M r8, AnonymousClass00T r9, AnonymousClass03B r10, C02590Cr r11, C000300f r12, C04360Kb r13, C02780Dk r14, AnonymousClass01A r15, AnonymousClass0M9 r16, C014308b r17, AnonymousClass01X r18, AnonymousClass0GG r19, C47282He r20, AnonymousClass0XP r21, AnonymousClass00D r22, C47242Ha r23, AnonymousClass0AQ r24, AbstractC004502c r25, AnonymousClass0MG r26, C39561rj r27, AnonymousClass02N r28, AnonymousClass2J6 r29) {
        this.A02 = r5;
        this.A0J = r6;
        this.A0C = r7;
        this.A08 = r8;
        this.A0Q = r9;
        this.A09 = r10;
        this.A0N = r11;
        this.A0A = r12;
        this.A0D = r13;
        this.A03 = r14;
        this.A0E = r15;
        this.A0O = r16;
        this.A0F = r17;
        this.A0L = r18;
        this.A04 = r19;
        this.A0H = r20;
        this.A0B = r21;
        this.A0K = r22;
        this.A0G = r23;
        this.A0M = r24;
        this.A07 = r25;
        this.A06 = r26;
        this.A05 = r27;
        this.A0P = r28;
        this.A0I = r29;
        this.A01 = new RunnableEBaseShape2S0300000_I1(this, r25, r27, 23);
    }

    @Override // X.AnonymousClass1PD
    public void onActivityDestroyed(Activity activity) {
        this.A01 = null;
        C10730f6 r0 = this.A00;
        if (r0 != null) {
            r0.A04();
            this.A00 = null;
        }
    }
}
