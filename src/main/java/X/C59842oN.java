package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1_1;
import com.whatsapp.util.ViewOnClickCListenerShape13S0100000_I1_2;
import java.util.List;

/* renamed from: X.2oN  reason: invalid class name and case insensitive filesystem */
public final class C59842oN extends C53392d8 implements AbstractC49292Px {
    public int A00;
    public ObjectAnimator A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public ImageView A0C;
    public ImageView A0D;
    public ImageView A0E;
    public RecyclerView A0F;
    public C54392eq A0G;
    public C54452ew A0H;
    public C54492f0 A0I;
    public C69873Iw A0J;
    public AnonymousClass33U A0K = new C54342el(this);
    public AnonymousClass33U A0L;
    public AnonymousClass3R6 A0M;
    public final AbstractC16450pp A0N = new C54352em(this);
    public final C000300f A0O;
    public final AnonymousClass03P A0P;
    public final C002701k A0Q;
    public final AnonymousClass00Y A0R;
    public final C03400Ga A0S;
    public final AnonymousClass0Gd A0T;
    public final AbstractC49282Pv A0U;
    public final AnonymousClass0Gb A0V;
    public final C03460Gi A0W;
    public final C04230Jo A0X;
    public final AnonymousClass0D1 A0Y;
    public final C03620Gz A0Z;
    public final C03570Gt A0a;
    public final C71953Qy A0b;
    public final C662733o A0c;
    public final AnonymousClass00T A0d;

    public C59842oN(C002701k r17, Activity activity, AnonymousClass0Eg r19, C06170Sb r20, AnonymousClass00T r21, C03400Ga r22, AnonymousClass0Gb r23, AnonymousClass00Y r24, C02590Cr r25, C000300f r26, C03460Gi r27, C02600Cs r28, AnonymousClass0Gd r29, C03930Ii r30, C04230Jo r31, AnonymousClass03P r32, AnonymousClass01X r33, AbstractC49282Pv r34, C53492dM r35, AnonymousClass00D r36, AnonymousClass022 r37, KeyboardPopupLayout keyboardPopupLayout, ImageButton imageButton, WaEditText waEditText, C03620Gz r41, C03570Gt r42, AnonymousClass0D1 r43, C662733o r44, C71953Qy r45) {
        super(activity, r19, r20, r25, r28, r30, r32, r33, r35, r36, r37, keyboardPopupLayout, imageButton, waEditText);
        this.A0Q = r17;
        this.A0d = r21;
        this.A0S = r22;
        this.A0V = r23;
        this.A0R = r24;
        this.A0O = r26;
        this.A0W = r27;
        this.A0T = r29;
        this.A0X = r31;
        this.A0P = r32;
        this.A0Z = r41;
        this.A0U = r34;
        this.A0a = r42;
        this.A0Y = r43;
        this.A0c = r44;
        this.A0b = r45;
        RunnableEBaseShape13S0100000_I1_8 runnableEBaseShape13S0100000_I1_8 = new RunnableEBaseShape13S0100000_I1_8(r31, 0);
        if (((C03410Gc) r31).A03 != null) {
            ((C03410Gc) runnableEBaseShape13S0100000_I1_8.A00).A07();
        } else {
            r31.A0A.execute(runnableEBaseShape13S0100000_I1_8);
        }
    }

    @Override // X.C53392d8
    public void A05() {
        AbstractC16450pp r5;
        Activity activity;
        C71953Qy r0;
        AnonymousClass0D1 r14;
        C03620Gz r13;
        super.A05();
        C000300f r142 = this.A0O;
        if (r142.A0D(AbstractC000400g.A2N)) {
            activity = ((AnonymousClass1MI) this).A02;
            AnonymousClass0Eg r02 = super.A0M;
            AnonymousClass00T r15 = this.A0d;
            C03400Ga r132 = this.A0S;
            AnonymousClass0Gb r12 = this.A0V;
            AnonymousClass00Y r11 = this.A0R;
            C03460Gi r10 = this.A0W;
            AnonymousClass0Gd r9 = this.A0T;
            AnonymousClass03P r8 = this.A0P;
            AnonymousClass01X r7 = super.A0H;
            AbstractC49282Pv r6 = this.A0U;
            AnonymousClass022 r3 = super.A0N;
            ViewGroup viewGroup = ((C53392d8) this).A04;
            r5 = this.A0N;
            this.A0H = new C54452ew(activity, r02, r15, r132, r12, r11, r142, r10, r9, r8, r7, r6, r3, viewGroup, r5, this);
        } else {
            this.A06 = ((C53392d8) this).A04.findViewById(R.id.gif_trending);
            this.A04 = ((C53392d8) this).A04.findViewById(R.id.gif_trending_additions);
            RecyclerView recyclerView = (RecyclerView) ((C53392d8) this).A04.findViewById(R.id.gif_trending_grid);
            this.A0F = recyclerView;
            r5 = this.A0N;
            recyclerView.A0l(r5);
            activity = ((AnonymousClass1MI) this).A02;
            this.A0F.A0j(new C54362en(activity.getResources().getDimensionPixelSize(R.dimen.selected_contacts_top_offset)));
            this.A05 = ((C53392d8) this).A04.findViewById(R.id.progress_container);
            this.A07 = ((C53392d8) this).A04.findViewById(R.id.no_results);
            this.A08 = ((C53392d8) this).A04.findViewById(R.id.retry_panel);
            ((C53392d8) this).A04.findViewById(R.id.retry_button).setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1_1(this, 49));
            C59832oM r1 = new C59832oM(this);
            this.A0I = r1;
            this.A0F.setAdapter(r1);
            this.A0F.A0i = true;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
            gridLayoutManager.A01 = new C54372eo(this, gridLayoutManager);
            this.A0F.setLayoutManager(gridLayoutManager);
        }
        this.A09 = ((C53392d8) this).A04.findViewById(R.id.search_button);
        this.A0D = (ImageView) ((C53392d8) this).A04.findViewById(R.id.gif_tab);
        this.A0C = (ImageView) ((C53392d8) this).A04.findViewById(R.id.emoji_tab);
        this.A0B = ((C53392d8) this).A04.findViewById(R.id.sticker_tab);
        this.A0E = (ImageView) ((C53392d8) this).A04.findViewById(R.id.sticker_tab_icon);
        this.A0A = ((C53392d8) this).A04.findViewById(R.id.sticker_onboarding_badge);
        this.A02 = ((C53392d8) this).A04.findViewById(R.id.emoji_group_layout);
        this.A03 = ((C53392d8) this).A04.findViewById(R.id.pager);
        this.A0D.setVisibility(0);
        this.A0C.setVisibility(0);
        C03570Gt r62 = this.A0a;
        if (!(r62 == null || (r14 = this.A0Y) == null || (r13 = this.A0Z) == null || this.A0L == null)) {
            C002701k r03 = this.A0Q;
            AnonymousClass00T r152 = this.A0d;
            AnonymousClass00Y r122 = this.A0R;
            C04230Jo r112 = this.A0X;
            AnonymousClass01X r102 = super.A0H;
            AnonymousClass00D r92 = ((AnonymousClass1MI) this).A05;
            AnonymousClass3R6 r16 = new AnonymousClass3R6(r03, activity, r152, r122, r112, r102, r13, r62, r92, ((C53392d8) this).A04, this.A0J, r14, r5, this.A0c, this.A0b);
            this.A0M = r16;
            r16.A04 = this.A0K;
            if (!r92.A00.getBoolean("sticker_picker_initial_download", false)) {
                Log.d("EmojiAndGifPopupWindow/sticker pref is already set to false");
                C54382ep r17 = new C54382ep(this);
                Log.d("StickerRepository/getInstalledStickerPacksAsync/begin");
                r62.A0R.ANC(new AnonymousClass3QT(r62, r17), new Object[0]);
            } else {
                A0B();
            }
        }
        View view = this.A09;
        int i = 8;
        if (super.A0L.A02) {
            i = 0;
        }
        view.setVisibility(i);
        this.A0C.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 0));
        this.A0D.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 1));
        this.A0E.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 2));
        this.A09.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1_1(this, 48));
        if (this.A0Q.A0E(291) && (r0 = this.A0b) != null) {
            C02270Bi r18 = r0.A01;
            if (r18.A01() != null && !((List) r18.A01()).isEmpty()) {
                A0C(2);
                return;
            }
        }
        A0C(((AnonymousClass1MI) this).A05.A00.getInt("emoji_popup_window_tab_state", 0));
    }

    @Override // X.C53392d8
    public void A07() {
        AnonymousClass3R1 r0;
        super.A07();
        A0A();
        AnonymousClass3R6 r2 = this.A0M;
        if (r2 != null) {
            ((AbstractC63952xH) r2).A0A.getViewTreeObserver().addOnGlobalLayoutListener(r2.A0K);
            C662733o r1 = r2.A0X;
            r1.A02 = r2;
            if (r1.A03 != null || ((r0 = r1.A01) != null && !((AnonymousClass0JW) r0).A00.isCancelled())) {
                List list = r1.A03;
                if (list != null) {
                    r1.A04(list, null);
                }
            } else {
                r1.A03();
            }
            r2.A0N.A0B(new AnonymousClass21D(), null, false);
        }
    }

    public void A09() {
        if (isShowing()) {
            dismiss();
        }
        AnonymousClass3R6 r0 = this.A0M;
        if (r0 != null) {
            r0.A0X.A02 = null;
        }
        C54452ew r02 = this.A0H;
        if (r02 != null) {
            r02.A06.A00(r02.A05);
        }
        ObjectAnimator objectAnimator = this.A01;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.A01 = null;
        }
    }

    public final void A0A() {
        View view = this.A06;
        if (view != null && view.getVisibility() == 0) {
            this.A08.setVisibility(8);
            this.A05.setVisibility(0);
            this.A0I.A09(null);
            C59832oM r1 = new C59832oM(this);
            this.A0I = r1;
            this.A0F.setAdapter(r1);
            this.A0I.A09(this.A0U.A01());
        }
    }

    public final void A0B() {
        Log.d("EmojiAndGifPopupWindow/showStickerTab/set sticker tab visibility to visible");
        this.A0B.setVisibility(0);
        if (!((AnonymousClass1MI) this).A05.A00.getBoolean("sticker_store_onboarding_badge_shown", false)) {
            this.A0A.setVisibility(0);
            ObjectAnimator objectAnimator = this.A01;
            if (objectAnimator == null) {
                objectAnimator = ObjectAnimator.ofPropertyValuesHolder(this.A0A, PropertyValuesHolder.ofFloat("scaleX", 1.4f), PropertyValuesHolder.ofFloat("scaleY", 1.4f), PropertyValuesHolder.ofFloat("alpha", 0.4f, 0.0f));
                this.A01 = objectAnimator;
            }
            objectAnimator.setDuration(1500L);
            this.A01.setRepeatCount(-1);
            this.A01.setRepeatMode(1);
            this.A01.start();
            return;
        }
        this.A0A.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r1 = r7.A0C;
        r0 = com.google.android.search.verification.client.R.drawable.ic_emoticon_normal;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r8 != 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r0 = com.google.android.search.verification.client.R.drawable.ic_emoticon_selected;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r1.setImageResource(r0);
        r1 = r7.A0D;
        r0 = com.google.android.search.verification.client.R.drawable.ic_gif_normal;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r8 != 1) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r0 = com.google.android.search.verification.client.R.drawable.ic_gif_selected;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        r1.setImageResource(r0);
        r1 = r7.A0E;
        r0 = com.google.android.search.verification.client.R.drawable.ic_sticker_normal;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r8 != 2) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r0 = com.google.android.search.verification.client.R.drawable.ic_sticker_selected;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r1.setImageResource(r0);
        A0D(r7.A09, r8);
        ((X.C53392d8) r7).A04.findViewById(com.google.android.search.verification.client.R.id.delete_symbol_tb).setVisibility(r3);
        ((X.C53392d8) r7).A04.findViewById(com.google.android.search.verification.client.R.id.sticker_store_button).setVisibility(r5);
        r0 = r7.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r0 == null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (r8 != 0) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        r0.requestFocus();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        r7.A03.setVisibility(r3);
        r1 = r7.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r1 == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        ((X.AbstractC63952xH) r1).A0A.setVisibility(r5);
        r2 = r1.A0W;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        if (r2 == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        r2.A08.setVisibility(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007a, code lost:
        if (r5 != 0) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        r1 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        if (r1 < 0) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        r2.A09.A0M(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        r1 = r7.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0087, code lost:
        if (r1 == null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0089, code lost:
        ((X.AbstractC63952xH) r1).A0A.setVisibility(r4);
        r0 = r1.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0090, code lost:
        if (r0 == null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0092, code lost:
        r0.A06.setVisibility(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0097, code lost:
        r0 = r7.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0099, code lost:
        if (r0 == null) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009b, code lost:
        r0.setVisibility(r4);
        r7.A04.setVisibility(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a3, code lost:
        r7.A02.setVisibility(r3);
        r7.A00 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ab, code lost:
        r0.clearFocus();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00af, code lost:
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r8 != 2) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r8 == 0) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(int r8) {
        /*
        // Method dump skipped, instructions count: 185
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59842oN.A0C(int):void");
    }

    public final void A0D(View view, int i) {
        int i2 = 8;
        if (i == 0) {
            if (super.A0L.A02) {
                i2 = 0;
            }
            view.setVisibility(i2);
        } else if (i == 1) {
            view.setVisibility(0);
        } else if (i == 2) {
            if (super.A0L.A02 && this.A0Q.A0E(240)) {
                i2 = 0;
            }
            view.setVisibility(i2);
        }
    }

    @Override // X.AbstractC49292Px
    public void AGa(C49262Ps r2) {
        AbstractC03730Hk r0;
        A06();
        C54392eq r02 = this.A0G;
        if (r02 != null && (r0 = r02.A03.A00) != null) {
            r0.AGa(r2);
        }
    }

    @Override // X.AnonymousClass1MI
    public void dismiss() {
        AbstractC49282Pv r3 = this.A0U;
        if (r3 != null) {
            this.A0d.ANF(new RunnableEBaseShape10S0100000_I1_5(r3, 2));
        }
        AnonymousClass3R6 r2 = this.A0M;
        if (r2 != null) {
            ((AbstractC63952xH) r2).A0A.getViewTreeObserver().removeGlobalOnLayoutListener(r2.A0K);
        }
        AnonymousClass008.A0k(((AnonymousClass1MI) this).A05, "emoji_popup_window_tab_state", this.A00);
        super.dismiss();
    }
}
