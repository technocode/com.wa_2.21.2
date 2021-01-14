package X;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;

/* renamed from: X.2ZC  reason: invalid class name */
public abstract class AnonymousClass2ZC extends AnonymousClass1PD {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public ViewStub A04;
    public ImageView A05;
    public ProgressBar A06;
    public TextView A07;
    public TextView A08;
    public C11930hF A09;
    public C11930hF A0A;
    public WaImageView A0B;
    public C10840fI A0C;
    public C007003k A0D;
    public RunnableEBaseShape1S0400000_I1 A0E;
    public boolean A0F = false;
    public final ActivityC004802g A0G;
    public final C09050cD A0H;
    public final AnonymousClass02M A0I;
    public final C002301g A0J;
    public final AnonymousClass1PN A0K;
    public final AnonymousClass0HJ A0L;
    public final AnonymousClass0BP A0M = new AnonymousClass2ZB(this);
    public final AnonymousClass08B A0N;
    public final C014308b A0O;
    public final AnonymousClass0HK A0P;
    public final AnonymousClass01X A0Q;
    public final AnonymousClass0AQ A0R;
    public final C02590Cr A0S;
    public final AnonymousClass02N A0T;
    public final AnonymousClass31y A0U;
    public final AnonymousClass00T A0V;

    public AnonymousClass2ZC(ActivityC004802g r2, AnonymousClass02M r3, C002301g r4, AnonymousClass00T r5, C02590Cr r6, AnonymousClass0HJ r7, C09050cD r8, C014308b r9, AnonymousClass01X r10, AnonymousClass1PN r11, AnonymousClass08B r12, AnonymousClass31y r13, AnonymousClass0HK r14, AnonymousClass0AQ r15, AnonymousClass02N r16, C007003k r17) {
        this.A0G = r2;
        this.A0I = r3;
        this.A0J = r4;
        this.A0V = r5;
        this.A0S = r6;
        this.A0L = r7;
        this.A0H = r8;
        this.A0O = r9;
        this.A0Q = r10;
        this.A0K = r11;
        this.A0N = r12;
        this.A0U = r13;
        this.A0P = r14;
        this.A0R = r15;
        this.A0T = r16;
        this.A0D = r17;
    }

    public void A00() {
        C007003k A022 = this.A0R.A02(this.A0T);
        this.A0D = A022;
        this.A0A.A03(A022, null);
        C10840fI r0 = this.A0C;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        C10840fI r2 = new C10840fI(this.A0J, this.A0L, this.A0P, this.A0D, this.A05);
        this.A0C = r2;
        this.A0V.ANC(r2, new Void[0]);
        A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r12.A0F(r11.A0D) != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
        // Method dump skipped, instructions count: 485
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2ZC.A01():void");
    }

    @Override // X.AnonymousClass1PD
    public void onActivityCreated(Activity activity, Bundle bundle) {
        ActivityC004802g r2 = this.A0G;
        AnonymousClass0S2 A092 = r2.A09();
        if (A092 != null) {
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(A092.A01()).inflate(R.layout.conversation_actionbar, (ViewGroup) null, false);
            this.A02 = viewGroup;
            this.A03 = (ViewGroup) viewGroup.findViewById(R.id.conversation_contact);
            this.A0B = (WaImageView) AnonymousClass0Q7.A0D(this.A02, R.id.ephemeral_status);
            ViewGroup viewGroup2 = this.A03;
            C014308b r7 = this.A0O;
            AnonymousClass01X r8 = this.A0Q;
            AnonymousClass31y r9 = this.A0U;
            this.A0A = new C11930hF(viewGroup2, R.id.conversation_contact_name, r7, r8, r9);
            View findViewById = this.A03.findViewById(R.id.conversation_contact_status_holder);
            this.A01 = findViewById;
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2HV(this));
            this.A00 = this.A03.findViewById(R.id.business_holder);
            this.A08 = (TextView) this.A03.findViewById(R.id.conversation_contact_status);
            this.A09 = new C11930hF(this.A01, R.id.business_name, r7, r8, r9);
            this.A07 = (TextView) this.A03.findViewById(R.id.business_separator);
            this.A05 = (ImageView) this.A02.findViewById(R.id.conversation_contact_photo);
            if (r8.A02().A06 && Build.VERSION.SDK_INT < 19) {
                this.A03.setLayoutTransition(null);
            }
            this.A03.setClickable(true);
            View findViewById2 = this.A02.findViewById(R.id.back);
            if (Build.VERSION.SDK_INT > 21) {
                AnonymousClass0S2 A093 = r2.A09();
                if (A093 != null) {
                    findViewById2.setBackground(new C06470Tj(r8, C004302a.A03(A093.A01(), R.drawable.conversation_navigate_up_background)));
                    int dimensionPixelSize = r2.getResources().getDimensionPixelSize(R.dimen.conversation_navigation_up_padding);
                    AnonymousClass0SE.A06(r8, findViewById2, dimensionPixelSize, dimensionPixelSize);
                } else {
                    throw null;
                }
            }
            findViewById2.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(activity, 12));
            this.A04 = (ViewStub) this.A02.findViewById(R.id.change_photo_progress_stub);
            AnonymousClass0S2 A094 = r2.A09();
            if (A094 != null) {
                A094.A0B(true);
                AnonymousClass0S2 A095 = r2.A09();
                if (A095 != null) {
                    A095.A05(this.A02);
                    this.A0N.A01(this.A0M);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass1PD
    public void onActivityDestroyed(Activity activity) {
        C10840fI r0 = this.A0C;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            this.A0C = null;
        }
        this.A0N.A00(this.A0M);
    }
}
