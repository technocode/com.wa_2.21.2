package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1_1;
import com.facebook.redex.ViewOnClickEBaseShape9S0100000_I1_7;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.conversation.ConversationVideoPictureInPictureActivity;
import com.whatsapp.util.Log;
import java.util.Formatter;
import java.util.Locale;

/* renamed from: X.374  reason: invalid class name */
public class AnonymousClass374 extends FrameLayout {
    public AnonymousClass371 A00;
    public AnonymousClass371 A01;
    public AnonymousClass371 A02;
    public AnonymousClass372 A03;
    public AnonymousClass373 A04;
    public AnonymousClass37M A05;
    public boolean A06 = false;
    public boolean A07 = false;
    public boolean A08 = false;
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B = false;
    public final Handler A0C = new Handler(Looper.myLooper(), new C670436z(this));
    public final View A0D;
    public final View A0E;
    public final View A0F;
    public final ViewGroup A0G;
    public final ViewGroup A0H;
    public final AlphaAnimation A0I;
    public final AlphaAnimation A0J;
    public final Animation A0K;
    public final Animation A0L;
    public final ImageButton A0M;
    public final ImageButton A0N;
    public final ImageButton A0O;
    public final ImageButton A0P;
    public final ProgressBar A0Q;
    public final SeekBar A0R;
    public final TextView A0S;
    public final TextView A0T;
    public final C000300f A0U = C000300f.A00();
    public final AnonymousClass03P A0V = AnonymousClass03P.A00();
    public final AnonymousClass01X A0W = AnonymousClass01X.A00();
    public final C670336y A0X;
    public final Runnable A0Y = new RunnableEBaseShape13S0100000_I1_8(this, 34);
    public final StringBuilder A0Z;
    public final Formatter A0a;

    public AnonymousClass374(Context context, C670336y r8) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.inline_window_control_view, this);
        StringBuilder sb = new StringBuilder();
        this.A0Z = sb;
        this.A0a = new Formatter(sb, Locale.getDefault());
        this.A0G = (ViewGroup) findViewById(R.id.controls);
        this.A0M = (ImageButton) findViewById(R.id.close);
        this.A0N = (ImageButton) findViewById(R.id.fullscreen);
        this.A0P = (ImageButton) findViewById(R.id.play_pause);
        this.A0Q = (ProgressBar) findViewById(R.id.minimized_progress_bar);
        View findViewById = findViewById(R.id.footer_view);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(R.id.fullscreen_controls);
        this.A0H = viewGroup;
        this.A0R = (SeekBar) viewGroup.findViewById(R.id.mediacontroller_progress);
        this.A0T = (TextView) this.A0H.findViewById(R.id.time);
        this.A0S = (TextView) this.A0H.findViewById(R.id.time_current);
        this.A0O = (ImageButton) findViewById(R.id.logo_button);
        this.A0E = findViewById(R.id.loading);
        this.A0D = findViewById(R.id.background);
        View findViewById2 = findViewById(R.id.header);
        this.A0F = findViewById2;
        findViewById2.setBackground(C004302a.A03(getContext(), R.drawable.media_view_header_gradient));
        findViewById.setBackground(C004302a.A03(getContext(), R.drawable.media_view_footer_gradient));
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, getAlpha());
        this.A0J = alphaAnimation;
        alphaAnimation.setDuration(250);
        this.A0J.setInterpolator(new DecelerateInterpolator(1.5f));
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.exo_player_controls_up);
        this.A0L = loadAnimation;
        loadAnimation.setDuration(250);
        this.A0L.setInterpolator(new DecelerateInterpolator());
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.exo_player_controls_down);
        this.A0K = loadAnimation2;
        loadAnimation2.setDuration(250);
        this.A0K.setInterpolator(new AccelerateInterpolator());
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(getAlpha(), 0.0f);
        this.A0I = alphaAnimation2;
        alphaAnimation2.setDuration(250);
        this.A0I.setInterpolator(new AccelerateInterpolator(1.5f));
        this.A0I.setAnimationListener(new C72453Sx(this));
        this.A0X = r8;
        onConfigurationChanged(getResources().getConfiguration());
    }

    public void A00() {
        if (!this.A08) {
            ViewGroup viewGroup = this.A0G;
            if (viewGroup.getVisibility() != 4 && this.A05 != null) {
                this.A08 = true;
                viewGroup.startAnimation(this.A0I);
                this.A0H.startAnimation(this.A0K);
                if (this.A09) {
                    int i = 262;
                    if (Build.VERSION.SDK_INT >= 19) {
                        i = 4358;
                    }
                    setSystemUiVisibility(i);
                }
            }
        }
    }

    public void A01() {
        Runnable runnable = this.A0Y;
        removeCallbacks(runnable);
        AnonymousClass37M r0 = this.A05;
        if (r0 != null && r0.A0B()) {
            postDelayed(runnable, 3000);
        }
    }

    public void A02() {
        ViewGroup viewGroup = this.A0G;
        if (viewGroup.getVisibility() != 4 && this.A05 != null) {
            this.A08 = false;
            viewGroup.setVisibility(4);
        }
    }

    public void A03() {
        AnonymousClass37M r0 = this.A05;
        if (r0 != null) {
            if (r0.A0B()) {
                C670336y r02 = this.A0X;
                if (r02 != null) {
                    C63922xE r1 = r02.A06;
                    if (r1.A02) {
                        r1.A00();
                    }
                }
                this.A05.A05();
            }
            if (this.A0G.getVisibility() != 0 && (!C002001d.A3N(this.A0U, this.A0V) || !C02780Dk.A00(getContext()).isInPictureInPictureMode())) {
                A05();
            }
            removeCallbacks(this.A0Y);
            A08();
            A0C(500);
            AnonymousClass373 r03 = this.A04;
            if (r03 != null) {
                ((ConversationVideoPictureInPictureActivity) ((AnonymousClass3T2) r03).A00.A03).A0F();
            }
        }
    }

    public void A04() {
        AnonymousClass37M r0 = this.A05;
        if (r0 != null) {
            if (!r0.A0B()) {
                this.A05.A07();
                C670336y r02 = this.A0X;
                if (r02 != null) {
                    r02.A06.A02();
                }
            }
            A01();
            A08();
            A0C(100);
            AnonymousClass373 r03 = this.A04;
            if (r03 != null) {
                ((ConversationVideoPictureInPictureActivity) ((AnonymousClass3T2) r03).A00.A03).A0E();
            }
        }
    }

    public void A05() {
        ViewGroup viewGroup = this.A0G;
        viewGroup.setVisibility(0);
        A08();
        viewGroup.startAnimation(this.A0J);
        this.A0H.startAnimation(this.A0L);
        setSystemUiVisibility(0);
        A01();
    }

    public void A06() {
        AnonymousClass372 r1 = this.A03;
        if (r1 != null) {
            r1.A00 = true;
            this.A03 = null;
        }
        this.A0A = false;
        this.A0C.removeCallbacksAndMessages(0);
    }

    public final void A07() {
        if (this.A09) {
            ImageButton imageButton = this.A0N;
            imageButton.setContentDescription(this.A0W.A06(R.string.exit_fullscreen));
            imageButton.setImageResource(R.drawable.ic_pip_collapse);
            View view = this.A0F;
            view.setPadding(view.getPaddingLeft(), getResources().getDimensionPixelSize(R.dimen.inline_controls_header_padding), view.getPaddingRight(), view.getPaddingBottom());
        } else {
            ImageButton imageButton2 = this.A0N;
            imageButton2.setContentDescription(this.A0W.A06(R.string.enter_fullscreen));
            imageButton2.setImageResource(R.drawable.ic_pip_expand);
            View view2 = this.A0F;
            view2.setPadding(view2.getPaddingLeft(), 0, view2.getPaddingRight(), view2.getPaddingBottom());
        }
        A01();
    }

    public final void A08() {
        String A062;
        AnonymousClass37M r0 = this.A05;
        if (r0 != null) {
            boolean A0B2 = r0.A0B();
            ImageButton imageButton = this.A0P;
            int i = R.drawable.ic_video_play_conv;
            if (A0B2) {
                i = R.drawable.ic_video_pause_conv;
            }
            imageButton.setImageResource(i);
            if (A0B2) {
                A062 = this.A0W.A06(R.string.pause);
            } else {
                A062 = this.A0W.A06(R.string.play);
            }
            imageButton.setContentDescription(A062);
        }
    }

    public /* synthetic */ void A09() {
        AnonymousClass371 r0 = this.A00;
        if (r0 != null) {
            r0.AE7();
        }
    }

    public /* synthetic */ void A0A() {
        AnonymousClass371 r0 = this.A01;
        if (r0 != null) {
            r0.AE7();
        }
    }

    public /* synthetic */ void A0B() {
        AnonymousClass371 r0 = this.A02;
        if (r0 != null) {
            r0.AE7();
        }
    }

    public void A0C(int i) {
        StringBuilder sb = new StringBuilder("InlineVideoPlaybackControlView delayControlsSync delay=");
        sb.append(i);
        Log.d(sb.toString());
        A06();
        AnonymousClass372 r1 = new AnonymousClass372(this);
        this.A03 = r1;
        postDelayed(new RunnableEBaseShape13S0100000_I1_8(r1, 32), (long) i);
    }

    public void A0D(int i, int i2) {
        AnonymousClass37M r0 = this.A05;
        if (r0 != null && r0.A04() != null) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
            ofObject.setDuration(150L);
            ofObject.addUpdateListener(new C668136a(this));
            ofObject.start();
        }
    }

    public /* synthetic */ void A0E(ValueAnimator valueAnimator) {
        this.A05.A04().setBackgroundColor(((Number) valueAnimator.getAnimatedValue()).intValue());
    }

    public void A0F(AnonymousClass37M r6) {
        A06();
        r6.A05();
        r6.A09(0);
        A08();
        this.A0Q.setProgress(0);
        this.A0R.setProgress(0);
        this.A0S.setText(C28051Sr.A18(this.A0Z, this.A0a, 0));
        A0C(500);
    }

    public /* synthetic */ void A0G(AnonymousClass37M r3) {
        StringBuilder A0S2 = AnonymousClass008.A0S("InlineVideoPlaybackControlView playPauseButton clicked");
        A0S2.append(r3.A0B());
        Log.d(A0S2.toString());
        if (!this.A06) {
            if (r3.A0B()) {
                A03();
            } else {
                A04();
            }
        }
    }

    public /* synthetic */ void A0H(AnonymousClass37M r3) {
        A0F(r3);
        if (this.A0G.getVisibility() != 0) {
            A05();
        }
        C670336y r0 = this.A0X;
        if (r0 != null) {
            C63922xE r1 = r0.A06;
            if (r1.A02) {
                r1.A00();
            }
        }
    }

    public void A0I(AnonymousClass37M r3, boolean z) {
        this.A07 = z;
        if (r3 instanceof C72403Ss) {
            View view = this.A0E;
            int i = 8;
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
        }
        C670336y r0 = this.A0X;
        if (r0 != null) {
            C63922xE r02 = r0.A03;
            if (z) {
                r02.A02();
            } else {
                r02.A00();
            }
        }
    }

    public /* synthetic */ void A0J(AnonymousClass37M r2, boolean z) {
        if (!r2.A0B() || !z) {
            setKeepScreenOn(false);
        } else {
            setKeepScreenOn(true);
        }
    }

    public AnonymousClass37M getPlayer() {
        return this.A05;
    }

    public static int[] getViewIdsToIgnoreScaling() {
        return new int[]{R.id.fullscreen, R.id.close, R.id.logo_button, R.id.play_frame, R.id.loading};
    }

    public void onConfigurationChanged(Configuration configuration) {
        float A002;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            A002 = C28051Sr.A00(getContext(), 20.0f);
        } else {
            A002 = C28051Sr.A00(getContext(), 30.0f);
        }
        int i = (int) A002;
        TextView textView = this.A0S;
        textView.setPadding(textView.getPaddingLeft(), 0, textView.getPaddingRight(), i);
        SeekBar seekBar = this.A0R;
        seekBar.setPadding(seekBar.getPaddingLeft(), 0, seekBar.getPaddingRight(), i);
        TextView textView2 = this.A0T;
        textView2.setPadding(textView2.getPaddingLeft(), 0, textView2.getPaddingRight(), i);
    }

    public void setBlockPlayButtonInput(boolean z) {
        this.A06 = z;
    }

    public void setCloseBtnListener(AnonymousClass371 r4) {
        this.A00 = r4;
        this.A0M.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 19));
    }

    public void setFullscreenButtonClickListener(AnonymousClass371 r4) {
        this.A01 = r4;
        this.A0N.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 18));
    }

    public void setPlayPauseListener(AnonymousClass373 r1) {
        this.A04 = r1;
    }

    public void setPlayer(AnonymousClass37M r6) {
        this.A05 = r6;
        ViewGroup viewGroup = this.A0H;
        viewGroup.setBackground(C004302a.A03(getContext(), R.drawable.media_view_footer_gradient));
        ImageButton imageButton = this.A0P;
        imageButton.setContentDescription(this.A0W.A06(R.string.pause));
        imageButton.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1_1(this, r6, 45));
        this.A0Q.setMax(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        SeekBar seekBar = this.A0R;
        seekBar.setMax(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        seekBar.setOnSeekBarChangeListener(new AnonymousClass370(this, r6));
        r6.A04 = new C72223Sa(this, r6);
        r6.A01 = new C72243Sc(this);
        r6.A00 = new C72233Sb(this, r6);
        Log.d("InlineVideoPlaybackControlView startControlsSync()");
        this.A0A = true;
        int i = 0;
        this.A0C.sendEmptyMessage(0);
        imageButton.setClickable(true);
        imageButton.setVisibility(0);
        this.A0N.setClickable(true);
        A08();
        A07();
        if (!this.A09) {
            i = 8;
        }
        viewGroup.setVisibility(i);
    }

    public void setPlayerElevation(int i) {
        View A042;
        AnonymousClass37M r0 = this.A05;
        if (r0 != null && (A042 = r0.A04()) != null && A042.getParent() != null) {
            AnonymousClass0Q7.A0Q((View) this.A05.A04().getParent().getParent(), (float) i);
        }
    }
}
