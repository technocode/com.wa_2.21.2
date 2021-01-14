package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0400000_I1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.doodle.DoodleView;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.page.StatusPlaybackPageItem$1;
import com.whatsapp.status.playback.page.StatusPlaybackPageItem$3;
import com.whatsapp.status.playback.widget.StatusPlaybackProgressView;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.ui.media.MediaCaptionTextView;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.3Pv  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC71663Pv extends AbstractC659532f {
    public BottomSheetBehavior A00;
    public AbstractC659732h A01;
    public StatusPlaybackProgressView A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07 = true;
    public final Handler A08 = new Handler(Looper.getMainLooper());
    public final C26481Lc A09;
    public final AnonymousClass02M A0A = AnonymousClass02M.A00();
    public final C04350Ka A0B = C04350Ka.A00();
    public final C04380Kd A0C;
    public final AnonymousClass01X A0D;
    public final AnonymousClass01K A0E;
    public final C02330Bo A0F;
    public final AnonymousClass09E A0G = AnonymousClass09E.A00();
    public final C02560Co A0H;
    public final AbstractC71533Pi A0I;
    public final AbstractC660332o A0J = new C71583Pn(this);
    public final C04370Kc A0K = C04370Kc.A00();
    public final C04600Kz A0L = new C04600Kz(true);
    public final C04600Kz A0M = new C04600Kz(true);
    public final C04600Kz A0N = new C04600Kz(true);
    public final AnonymousClass00T A0O = C002101e.A00();
    public final Runnable A0P = new RunnableEBaseShape12S0100000_I1_7(this, 44);

    public abstract void A0J();

    public AbstractC71663Pv(AbstractC71533Pi r3) {
        C02780Dk.A02();
        C02770Dj.A00();
        this.A0F = C02330Bo.A00();
        this.A0D = AnonymousClass01X.A00();
        this.A0H = C02560Co.A01;
        this.A0E = AnonymousClass01K.A00();
        AnonymousClass0BB.A00();
        this.A09 = C26481Lc.A00();
        this.A0C = C04380Kd.A00();
        this.A0I = r3;
    }

    @Override // X.AbstractC659532f
    public View A00(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View view = this.A0I.A00.A0A;
        if (view != null) {
            this.A02 = (StatusPlaybackProgressView) view.findViewById(R.id.playback_progress);
            View inflate = layoutInflater.inflate(R.layout.status_playback_page, (ViewGroup) null, false);
            AbstractC659732h A0C2 = A0C();
            A0C2.A03 = inflate.findViewById(R.id.content_sheet);
            A0C2.A09 = (ViewGroup) inflate.findViewById(R.id.content);
            A0C2.A07 = inflate.findViewById(R.id.click_handler);
            A0C2.A0B = (TextView) inflate.findViewById(R.id.control_btn);
            A0C2.A04 = inflate.findViewById(R.id.control_frame);
            A0C2.A0F = (MediaCaptionTextView) inflate.findViewById(R.id.caption);
            A0C2.A01 = inflate.findViewById(R.id.caption_container);
            A0C2.A02 = inflate.findViewById(R.id.caption_padding);
            A0C2.A08 = (ViewGroup) inflate.findViewById(R.id.bottom_sheet);
            A0C2.A06 = inflate.findViewById(R.id.status_details_background);
            A0C2.A00 = inflate.findViewById(R.id.cancel_btn);
            A0C2.A0E = (CircularProgressBar) inflate.findViewById(R.id.progress_bar);
            A0C2.A0C = (TextView) inflate.findViewById(R.id.error);
            A0C2.A0A = (ViewGroup) inflate.findViewById(R.id.info);
            A0C2.A0D = (TextView) inflate.findViewById(R.id.info_btn);
            A0C2.A05 = inflate.findViewById(R.id.extra_padding);
            return inflate;
        }
        throw null;
    }

    @Override // X.AbstractC659532f
    public void A01() {
        AnonymousClass2MM r0;
        super.A01();
        AnonymousClass32V A0B2 = A0B();
        if (A0B2 instanceof C71493Pe) {
            AnonymousClass2MM r02 = ((C71493Pe) A0B2).A01;
            if (r02 != null) {
                r02.A02.dismiss();
            }
        } else if ((A0B2 instanceof AnonymousClass3PY) && (r0 = ((AnonymousClass3PY) A0B2).A00) != null) {
            r0.A02.dismiss();
        }
    }

    @Override // X.AbstractC659532f
    public void A02() {
        AnonymousClass2MM r0;
        super.A02();
        StatusPlaybackProgressView statusPlaybackProgressView = this.A02;
        if (statusPlaybackProgressView != null) {
            if (statusPlaybackProgressView.A03 == this.A0J) {
                statusPlaybackProgressView.A03 = null;
            }
            statusPlaybackProgressView.invalidate();
        }
        AnonymousClass32V A0B2 = A0B();
        if (A0B2 instanceof C71493Pe) {
            C71493Pe r1 = (C71493Pe) A0B2;
            r1.A0E();
            r1.A0B();
            AnonymousClass2MM r02 = r1.A01;
            if (r02 != null) {
                r02.A02.dismiss();
            }
        } else if (!(A0B2 instanceof C71463Pb) && !(A0B2 instanceof C71453Pa) && (r0 = ((AnonymousClass3PY) A0B2).A00) != null) {
            r0.A02.dismiss();
        }
    }

    @Override // X.AbstractC659532f
    public void A03() {
        super.A03();
        A0F();
        if (super.A04) {
            this.A0N.A01();
            this.A0M.A01();
        }
    }

    @Override // X.AbstractC659532f
    public void A04() {
        super.A04();
        A0G();
        if (super.A04) {
            this.A0N.A03();
        }
    }

    @Override // X.AbstractC659532f
    public void A05() {
        super.A05();
        AbstractC74123aA r0 = (AbstractC74123aA) this;
        this.A06 = r0.A0G.A0K(r0.A03);
        C04600Kz r2 = this.A0L;
        r2.A01 = 0;
        r2.A00 = 0;
        if (A0P(true)) {
            r2.A03();
        }
        A0J();
        A0H();
    }

    @Override // X.AbstractC659532f
    public void A06() {
        super.A06();
        this.A0N.A01();
        this.A0L.A01();
        StringBuilder sb = new StringBuilder("playbackPage/stopPlayback page=");
        sb.append(this);
        sb.append("; host=");
        sb.append(this.A0I.A00);
        Log.i(sb.toString());
        this.A05 = false;
        this.A04 = false;
        StatusPlaybackProgressView statusPlaybackProgressView = this.A02;
        if (statusPlaybackProgressView.A03 == this.A0J) {
            statusPlaybackProgressView.A03 = null;
        }
        statusPlaybackProgressView.invalidate();
        A0B().A05();
        A0I();
        A0I();
    }

    @Override // X.AbstractC659532f
    public void A08(Rect rect) {
        super.A06.set(rect);
        AbstractC659732h A0C2 = A0C();
        A0C2.A01.setPadding(rect.left, 0, rect.right, rect.bottom);
        A0C2.A05.setPadding(rect.left, 0, rect.right, rect.bottom);
        this.A00.A0C(A0A().getResources().getDimensionPixelSize(R.dimen.status_footer_peek_height) + rect.bottom);
        ViewGroup viewGroup = A0C2.A08;
        viewGroup.setPadding(rect.left, viewGroup.getPaddingTop(), rect.right, A0C2.A08.getPaddingBottom());
        AnonymousClass32V A0B2 = A0B();
        if (A0B2 instanceof C71453Pa) {
            C71453Pa r7 = (C71453Pa) A0B2;
            int dimensionPixelSize = r7.A01().getResources().getDimensionPixelSize(R.dimen.status_text_h_padding);
            int dimensionPixelSize2 = r7.A01().getResources().getDimensionPixelSize(R.dimen.status_text_v_padding);
            r7.A02.setPadding(rect.left + dimensionPixelSize, rect.top + dimensionPixelSize2, rect.right + dimensionPixelSize, rect.bottom + dimensionPixelSize2);
            View view = r7.A00;
            if (view != null) {
                view.setPadding(rect.left + dimensionPixelSize, rect.top + dimensionPixelSize2, dimensionPixelSize + rect.right, dimensionPixelSize2 + rect.bottom);
            }
        }
    }

    @Override // X.AbstractC659532f
    public void A09(View view) {
        boolean z;
        super.A09(view);
        AbstractC659732h r5 = this.A01;
        if (r5 != null) {
            String str = null;
            r5.A0F.setOnClickListener(null);
            r5.A0F.setClickable(false);
            ((ReadMoreTextView) r5.A0F).A02 = new C71573Pm(this, r5);
            this.A00 = new StatusPlaybackPageItem$1(this);
            BottomSheetBehavior bottomSheetBehavior = this.A00;
            ((C14270lr) r5.A08.getLayoutParams()).A00(bottomSheetBehavior);
            bottomSheetBehavior.A0E = new C71633Ps(this);
            StatusPlaybackPageItem$3 statusPlaybackPageItem$3 = new StatusPlaybackPageItem$3(this);
            ((C14270lr) r5.A03.getLayoutParams()).A00(statusPlaybackPageItem$3);
            statusPlaybackPageItem$3.A0E = new C71643Pt(this, r5);
            r5.A0E.setMax(100);
            r5.A09.addView(A0B().A02());
            if (!(A0B() instanceof C71453Pa)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                String A0D2 = A0D();
                if (A0D2 == null) {
                    AbstractC007503q r1 = ((AbstractC74123aA) this).A03;
                    if (r1 instanceof C05490Ot) {
                        A0D2 = ((C05490Ot) r1).A04;
                    }
                }
                str = A0D2;
            }
            r5.A0F.setCaptionText(C003701u.A08(str, 1024));
            r5.A02.setVisibility(r5.A0F.getVisibility());
            PointF pointF = new PointF();
            AtomicLong atomicLong = new AtomicLong();
            r5.A07.setOnTouchListener(new View$OnTouchListenerC659132b(this, pointF, atomicLong));
            A0B().A02().setOnClickListener(new ViewOnClickEBaseShape1S0400000_I1(this, atomicLong, r5, pointF, 6));
            return;
        }
        throw null;
    }

    public Context A0A() {
        View view = super.A00;
        if (view != null) {
            return view.getContext();
        }
        throw null;
    }

    public AnonymousClass32V A0B() {
        AbstractC74123aA r14 = (AbstractC74123aA) this;
        AnonymousClass32V r11 = r14.A00;
        if (r11 == null) {
            AnonymousClass32W r0 = r14.A05;
            AbstractC007503q r13 = r14.A03;
            C74113a9 r12 = new C74113a9(r14);
            if (r0 != null) {
                byte b = r13.A0m;
                if (b != 0) {
                    if (b != 1) {
                        if (b != 3) {
                            if (b != 13) {
                                if (b != 25) {
                                    switch (b) {
                                        case 27:
                                            break;
                                        case 28:
                                            break;
                                        case 29:
                                            break;
                                        default:
                                            r11 = new C71463Pb(r0.A0B, r0.A06, r0.A02, r0.A04, r0.A07, r0.A08, r0.A0D, r12, r13);
                                            break;
                                    }
                                    r14.A00 = r11;
                                }
                            }
                            r11 = new C74093a5(r0.A0B, r0.A02, r0.A0H, r0.A01, r0.A0A, r0.A05, r0.A00, r0.A0C, r0.A07, r0.A08, r0.A0D, r0.A0G, r0.A0I, r0.A0F, r0.A03, r0.A0E, r12, r13);
                            r14.A00 = r11;
                        }
                        r11 = new C71493Pe(r0.A0B, r0.A02, r0.A0H, r0.A01, r0.A0A, r0.A05, r0.A00, r0.A0C, r0.A07, r0.A08, r0.A0D, r0.A0G, r0.A0I, r0.A0F, r0.A03, r0.A0E, r12, r13);
                        r14.A00 = r11;
                    }
                    r11 = new AnonymousClass3PY(r0.A0B, r0.A02, r0.A00, r0.A0C, r0.A07, r0.A08, r0.A0D, r0.A0G, r0.A03, r12, r13);
                    r14.A00 = r11;
                }
                r11 = new C71453Pa(r0.A0B, r0.A02, r0.A04, r0.A07, r0.A08, r0.A0D, r0.A09, r12, r13);
                r14.A00 = r11;
            } else {
                throw null;
            }
        }
        return r11;
    }

    public AbstractC659732h A0C() {
        if (this instanceof C75033c0) {
            return ((C75033c0) this).A0R();
        }
        AbstractC659732h r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C71683Px r02 = new C71683Px();
        this.A01 = r02;
        return r02;
    }

    public String A0D() {
        AbstractC007503q r2 = ((AbstractC74123aA) this).A03;
        if ((r2 instanceof AnonymousClass0Z8) || !(r2 instanceof AnonymousClass0M3)) {
            return null;
        }
        return ((AnonymousClass0M3) r2).A0v();
    }

    public void A0E() {
        this.A03 = true;
        C74103a6 r1 = (C74103a6) this.A0I;
        StatusPlaybackContactFragment statusPlaybackContactFragment = r1.A01;
        AnonymousClass0XM r3 = statusPlaybackContactFragment.A0R;
        r3.A02.A01(new RunnableEBaseShape0S0310000_I0(r3, statusPlaybackContactFragment.A06, r1.A00, true, 7), 51);
    }

    public void A0F() {
        if (this.A05 && !this.A04) {
            StringBuilder sb = new StringBuilder("playbackPage/pausePlayback page=");
            sb.append(this);
            sb.append("; host=");
            sb.append(this.A0I.A00);
            Log.i(sb.toString());
            this.A04 = true;
            AnonymousClass32V A0B2 = A0B();
            if (A0B2 instanceof C71493Pe) {
                C71493Pe r2 = (C71493Pe) A0B2;
                r2.A0H("pausePlayback");
                if (r2.A02 != null) {
                    r2.A0H("pausePlayback/player not null");
                    r2.A02.A05();
                }
                DoodleView doodleView = r2.A0D;
                if (doodleView != null) {
                    doodleView.A0V = false;
                    doodleView.invalidate();
                }
                r2.A0B();
                AnonymousClass2MM r0 = r2.A01;
                if (r0 != null) {
                    r0.A02.dismiss();
                }
            } else if (A0B2 instanceof C71463Pb) {
                ((C71463Pb) A0B2).A05.A02();
            } else if (!(A0B2 instanceof C71453Pa)) {
                AnonymousClass3PY r22 = (AnonymousClass3PY) A0B2;
                r22.A08.A02();
                r22.A02 = false;
            } else {
                ((C71453Pa) A0B2).A06.A02();
            }
            this.A0M.A03();
        }
    }

    public void A0G() {
        if (super.A04 && this.A05 && !super.A02 && this.A00.A0B == 4 && !((ReadMoreTextView) this.A01.A0F).A05 && !A0B().A08()) {
            StringBuilder sb = new StringBuilder("playbackPage/resumePlayback page=");
            sb.append(this);
            sb.append("; host=");
            sb.append(this.A0I.A00);
            Log.i(sb.toString());
            this.A04 = false;
            A0B().A03();
            this.A0M.A01();
            A0I();
        }
    }

    public void A0H() {
        if (!super.A04 || this.A05 || !A0B().A07()) {
            StringBuilder sb = new StringBuilder("playbackPage/startPlayback not possible page=");
            sb.append(this);
            sb.append("; host=");
            sb.append(this.A0I.A00);
            Log.w(sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder("playbackPage/startPlayback page=");
        sb2.append(this);
        sb2.append("; host=");
        sb2.append(this.A0I.A00);
        Log.i(sb2.toString());
        this.A05 = true;
        this.A04 = false;
        A0B().A04();
        if (!C007603r.A08()) {
            this.A02.setProgressProvider(this.A0J);
        }
        A0I();
        this.A0L.A01();
        this.A0N.A03();
        if (super.A02 || !super.A03 || this.A00.A0B != 4 || ((ReadMoreTextView) this.A01.A0F).A05 || A0B().A08()) {
            A0F();
        }
    }

    public final void A0I() {
        if (super.A00 != null) {
            this.A08.removeCallbacks(this.A0P);
            if (this.A01.A08.getVisibility() != 0) {
                AlphaAnimation A022 = AnonymousClass008.A02(0.0f, 1.0f, 300);
                if (this.A01.A01.getVisibility() != 0) {
                    this.A01.A01.startAnimation(A022);
                    this.A01.A01.setVisibility(0);
                }
                if (this.A01.A0F.getVisibility() == 0 && this.A01.A02.getVisibility() != 0) {
                    this.A01.A02.startAnimation(A022);
                    this.A01.A02.setVisibility(0);
                }
                if (this.A01.A08.getVisibility() == 4) {
                    this.A01.A08.startAnimation(A022);
                    this.A01.A08.setVisibility(0);
                }
                AnonymousClass32Y A0t = this.A0I.A00.A0t();
                if (A0t != null) {
                    if (A0t.A05.getVisibility() != 0) {
                        AlphaAnimation A023 = AnonymousClass008.A02(0.0f, 1.0f, 300);
                        A0t.A05.startAnimation(A023);
                        A0t.A0C.startAnimation(A023);
                        A0t.A05.setVisibility(0);
                        A0t.A0C.setVisibility(0);
                    }
                    super.A00.setSystemUiVisibility(1792);
                    return;
                }
                throw null;
            }
            return;
        }
        throw null;
    }

    public void A0K(int i) {
        AbstractC659732h A0C2 = A0C();
        if (i == 4) {
            A0C2.A06.setVisibility(8);
            A0C2.A0A.setAlpha(1.0f);
            A0G();
        } else if (i != 3) {
            A0F();
        }
    }

    public void A0L(int i) {
        String str;
        StringBuilder A0S = AnonymousClass008.A0S("playbackPage/reportStatusExitStats exit-method=");
        switch (i) {
            case 1:
                str = "SWIPE_DOWN";
                break;
            case 2:
                str = "BACK_ARROW_TAP";
                break;
            case 3:
                str = "BACK_BUTTON_TAP";
                break;
            case 4:
                str = "STATUS_TIMEOUT";
                break;
            case 5:
                str = "STATUS_DISMISSED";
                break;
            case 6:
                str = "BACKWARD_SWIPE";
                break;
            case 7:
                str = "FORWARD_SWIPE";
                break;
            case 8:
                str = "BACKWARD_TAP";
                break;
            case 9:
                str = "FORWARD_TAP";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        A0S.append(str);
        A0S.append("; page=");
        A0S.append(this);
        A0S.append("; host=");
        A0S.append(this.A0I.A00);
        Log.i(A0S.toString());
    }

    public void A0M(int i, boolean z) {
        String str;
        StringBuilder A0S = AnonymousClass008.A0S("playbackPage/reportStatusEnterStats entry-method=");
        switch (i) {
            case 1:
                str = "DIRECT_TAP";
                break;
            case 2:
                str = "BACKWARD_SWIPE";
                break;
            case 3:
                str = "FORWARD_SWIPE";
                break;
            case 4:
                str = "BACKWARD_TAP";
                break;
            case 5:
                str = "FORWARD_TAP";
                break;
            case 6:
                str = "PREVIOUS_STATUS_TIMEOUT";
                break;
            case 7:
                str = "PREVIOUS_STATUS_DISMISSED";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        A0S.append(str);
        A0S.append("; page=");
        A0S.append(this);
        A0S.append("; host=");
        A0S.append(this.A0I.A00);
        Log.i(A0S.toString());
    }

    public final void A0N(boolean z) {
        Drawable drawable;
        ViewGroup viewGroup = A0C().A0A;
        if (z) {
            drawable = C004302a.A03(A0A(), R.drawable.ic_center_shadow);
        } else {
            drawable = null;
        }
        viewGroup.setBackgroundDrawable(drawable);
    }

    public final void A0O(boolean z, boolean z2) {
        AbstractC659732h A0C2 = A0C();
        if (super.A00 == null) {
            throw null;
        } else if (A0C2.A08.getVisibility() != 4 || A0C2.A01.getVisibility() != 4) {
            AlphaAnimation A022 = AnonymousClass008.A02(1.0f, 0.0f, 300);
            if (z) {
                A0C2.A01.startAnimation(A022);
                A0C2.A01.setVisibility(4);
            }
            if (z2) {
                super.A00.setSystemUiVisibility(1798);
                if (A0C2.A02.getVisibility() == 0) {
                    A0C2.A02.startAnimation(A022);
                    A0C2.A02.setVisibility(4);
                }
            }
            if (A0C2.A08.getVisibility() == 0) {
                A0C2.A08.startAnimation(A022);
                A0C2.A08.setVisibility(4);
            }
            AnonymousClass32Y A0t = this.A0I.A00.A0t();
            if (A0t == null) {
                throw null;
            } else if (A0t.A05.getVisibility() != 4) {
                AlphaAnimation A023 = AnonymousClass008.A02(1.0f, 0.0f, 300);
                A0t.A05.startAnimation(A023);
                A0t.A0C.startAnimation(A023);
                A0t.A05.setVisibility(4);
                A0t.A0C.setVisibility(4);
            }
        }
    }

    public boolean A0P(boolean z) {
        AbstractC74123aA r0 = (AbstractC74123aA) this;
        C09140cM r4 = r0.A04;
        AbstractC007503q r1 = r0.A03;
        if (r4 != null) {
            int i = 0;
            if (r1 instanceof AnonymousClass0M3) {
                AnonymousClass0M3 r2 = (AnonymousClass0M3) r1;
                if (!r1.A0n.A02 || ((r2 instanceof AnonymousClass0ZC) && AnonymousClass0FI.A0u((AnonymousClass0ML) r2))) {
                    AnonymousClass0M4 r12 = r2.A02;
                    if (r12 == null) {
                        throw null;
                    } else if (!(r12.A0P || r12.A07 == 1 || r2.A09 == null)) {
                        StringBuilder sb = new StringBuilder("statusdownload/downloadifneeded ");
                        sb.append(z);
                        sb.append(" ");
                        C007303n r5 = r2.A0n;
                        sb.append(r5.A01);
                        sb.append(" ");
                        sb.append(r2.A0G);
                        Log.i(sb.toString());
                        if (z) {
                            AnonymousClass0CH r7 = r4.A02;
                            Iterator it = ((AbstractCollection) r7.A04()).iterator();
                            while (it.hasNext()) {
                                AnonymousClass0M3 r8 = (AnonymousClass0M3) it.next();
                                C007303n r9 = r8.A0n;
                                if (AnonymousClass1VY.A0b(r9.A00) && !r9.equals(r5)) {
                                    r7.A08(r8, false, false);
                                    r4.A03.add(r8);
                                    StringBuilder sb2 = new StringBuilder("statusdownload/cancel ");
                                    sb2.append(r9.A01);
                                    sb2.append(" ");
                                    sb2.append(r8.A0G);
                                    Log.i(sb2.toString());
                                } else if (r9.equals(r5)) {
                                    StringBuilder A0S = AnonymousClass008.A0S("statusdownload/is-current ");
                                    A0S.append(r9.A01);
                                    A0S.append(" ");
                                    A0S.append(r8.A0G);
                                    Log.i(A0S.toString());
                                }
                            }
                            r4.A01(r2, 0);
                            return true;
                        } else if (r4.A00 == null) {
                            if (AnonymousClass0FI.A0e(r2)) {
                                i = 3;
                            }
                            r4.A01(r2, i);
                            return true;
                        } else {
                            r4.A03.add(r2);
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw null;
    }
}
