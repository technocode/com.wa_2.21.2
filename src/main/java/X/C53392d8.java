package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.AbsListView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.EmojiPopupFooter;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1_1;

/* renamed from: X.2d8  reason: invalid class name and case insensitive filesystem */
public class C53392d8 extends AnonymousClass1MI {
    public int A00 = R.drawable.ib_emoji;
    public int A01;
    public int A02 = R.drawable.input_kbd;
    public int A03;
    public ViewGroup A04;
    public AbstractC26561Lk A05;
    public C26621Lq A06;
    public EmojiPopupFooter A07;
    public AbstractC48622Na A08;
    public AnonymousClass2dD A09;
    public C48672Ng A0A;
    public Runnable A0B;
    public final View A0C;
    public final AbsListView.OnScrollListener A0D = new AnonymousClass2NY(this);
    public final ImageButton A0E;
    public final AbstractC26561Lk A0F = new AnonymousClass2d7(this);
    public final WaEditText A0G;
    public final AnonymousClass01X A0H;
    public final C02600Cs A0I;
    public final C02590Cr A0J;
    public final C03930Ii A0K;
    public final C53492dM A0L;
    public final AnonymousClass0Eg A0M;
    public final AnonymousClass022 A0N;

    public C53392d8(Activity activity, AnonymousClass0Eg r11, C06170Sb r12, C02590Cr r13, C02600Cs r14, C03930Ii r15, AnonymousClass03P r16, AnonymousClass01X r17, C53492dM r18, AnonymousClass00D r19, AnonymousClass022 r20, AnonymousClass1MF r21, ImageButton imageButton, WaEditText waEditText) {
        super(activity, r12, r16, r19, r21);
        View view = (View) r21;
        this.A0C = view;
        this.A0M = r11;
        this.A0J = r13;
        this.A0I = r14;
        this.A0K = r15;
        this.A0H = r17;
        this.A0L = r18;
        this.A0N = r20;
        this.A0E = imageButton;
        this.A0G = waEditText;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2NT(this));
        imageButton.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 46));
    }

    public void A05() {
        Activity activity = super.A02;
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        activity.getLayoutInflater().inflate(R.layout.emoji_picker_horizontal, (ViewGroup) relativeLayout, true);
        ViewGroup viewGroup = (ViewGroup) relativeLayout.findViewById(R.id.emoji_view);
        this.A04 = viewGroup;
        viewGroup.getLayoutParams().height = -1;
        this.A04.setVisibility(0);
        setContentView(relativeLayout);
        if (AnonymousClass0SE.A01) {
            relativeLayout.setLayoutDirection(3);
        }
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new BitmapDrawable());
        setTouchable(true);
        setFocusable(true);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        setAnimationStyle(0);
        View findViewById = this.A04.findViewById(R.id.fallback_divider);
        int i = 8;
        if (Build.VERSION.SDK_INT < 21) {
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
        C26621Lq r5 = new C26621Lq(activity, this.A0J, this.A0I, this.A0K, this.A0H, super.A05, this.A0N, this.A04, this.A0D);
        this.A06 = r5;
        r5.A0B = this.A0F;
        r5.A07 = this.A0C;
        EmojiPopupFooter emojiPopupFooter = (EmojiPopupFooter) this.A04.findViewById(R.id.footer_toolbar);
        this.A07 = emojiPopupFooter;
        emojiPopupFooter.setClickable(true);
        ImageView imageView = this.A06.A09;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        View findViewById2 = this.A04.findViewById(R.id.gif_tab);
        View findViewById3 = this.A04.findViewById(R.id.emoji_tab);
        View findViewById4 = this.A04.findViewById(R.id.search_button);
        findViewById2.setVisibility(8);
        findViewById3.setVisibility(8);
        if (!(this instanceof C59842oN)) {
            this.A0L.A00 = new AnonymousClass2d0(findViewById4);
        } else {
            C59842oN r52 = (C59842oN) this;
            ((C53392d8) r52).A0L.A00 = new C54302eh(r52, findViewById4);
        }
        C53492dM r1 = this.A0L;
        if (r1.A02) {
            i = 0;
        }
        findViewById4.setVisibility(i);
        r1.A01();
        findViewById4.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1_1(this, 41));
        this.A04.findViewById(R.id.delete_symbol_tb).setVisibility(0);
        ImageView imageView2 = this.A06.A09;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        setTouchInterceptor(new AnonymousClass2NS(this));
        setFocusable(false);
    }

    public void A06() {
        if (this.A07.getVisibility() != 0) {
            this.A07.setVisibility(0);
        }
        Animation animation = this.A07.getAnimation();
        if (animation instanceof AnonymousClass2NZ) {
            animation.cancel();
        }
        this.A07.setTopOffset(0);
    }

    public void A07() {
        AnonymousClass1MF r2 = super.A03;
        View view = (View) r2;
        view.getHandler().removeCallbacks(super.A07);
        r2.lock();
        r2.setKeyboardPopup(this);
        if (this.A06 == null) {
            A05();
        }
        C26621Lq r6 = this.A06;
        if (r6 != null) {
            if (C26621Lq.A0S == null) {
                HandlerThread handlerThread = new HandlerThread("Emoji Thread");
                C26621Lq.A0S = handlerThread;
                handlerThread.start();
                Context applicationContext = r6.A0G.getApplicationContext();
                C26621Lq.A0U = new HandlerC26591Ln(applicationContext, r6.A0N, C26621Lq.A0S.getLooper());
                C26621Lq.A0T = new HandlerC26581Lm(applicationContext.getMainLooper());
                r6.A0M.A0L(1);
            } else {
                r6.A0M.A0L(0);
            }
            r6.A0A.getViewTreeObserver().addOnGlobalLayoutListener(r6.A0I);
            ImageButton imageButton = this.A0E;
            if (imageButton != null) {
                imageButton.setImageResource(this.A02);
                imageButton.setContentDescription(this.A0H.A06(R.string.keyboard_button_description));
            }
            int A012 = A01(-1);
            super.A01 = A012;
            setHeight(A012);
            setWidth(-1);
            showAtLocation(view, 48, 0, 1000000);
            A06();
            WaEditText waEditText = this.A0G;
            A02(new C38731qM(waEditText), new RunnableEBaseShape6S0100000_I1_1(this, 13), waEditText);
            return;
        }
        throw null;
    }

    public void A08(AbstractC26561Lk r3) {
        this.A05 = r3;
        C26621Lq r1 = this.A06;
        if (r1 != null) {
            r1.A0B = this.A0F;
        }
    }
}
