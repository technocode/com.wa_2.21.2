package com.whatsapp.videoplayback;

import X.AbstractC33811hQ;
import X.AbstractC669536o;
import X.AbstractC669636p;
import X.AbstractC669736q;
import X.AnonymousClass01X;
import X.AnonymousClass12Q;
import X.AnonymousClass12R;
import X.C28051Sr;
import X.C72373Sp;
import X.View$OnClickListenerC72383Sq;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Formatter;
import java.util.Locale;

public class ExoPlaybackControlView extends FrameLayout {
    public AlphaAnimation A00;
    public AbstractC33811hQ A01;
    public AbstractC669536o A02;
    public AbstractC669636p A03;
    public AbstractC669736q A04;
    public Long A05;
    public boolean A06 = true;
    public boolean A07;
    public boolean A08 = true;
    public final FrameLayout A09;
    public final FrameLayout A0A;
    public final ImageButton A0B;
    public final ImageView A0C;
    public final LinearLayout A0D;
    public final SeekBar A0E;
    public final TextView A0F;
    public final TextView A0G;
    public final AnonymousClass12Q A0H = new AnonymousClass12Q();
    public final AnonymousClass01X A0I = AnonymousClass01X.A00();
    public final View$OnClickListenerC72383Sq A0J;
    public final Runnable A0K = new RunnableEBaseShape13S0100000_I1_8(this, 33);
    public final Runnable A0L = new RunnableEBaseShape13S0100000_I1_8(this, 35);
    public final StringBuilder A0M;
    public final Formatter A0N;

    public ExoPlaybackControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        StringBuilder sb = new StringBuilder();
        this.A0M = sb;
        this.A0N = new Formatter(sb, Locale.getDefault());
        this.A0J = new View$OnClickListenerC72383Sq(this);
        LayoutInflater.from(context).inflate(R.layout.wa_exoplayer_playback_control_view, this);
        this.A0A = (FrameLayout) findViewById(R.id.main_controls);
        this.A0F = (TextView) findViewById(R.id.time);
        this.A0G = (TextView) findViewById(R.id.time_current);
        this.A0E = (SeekBar) findViewById(R.id.mediacontroller_progress);
        this.A0C = (ImageView) findViewById(R.id.back);
        this.A0D = (LinearLayout) findViewById(R.id.footerView);
        this.A0E.setOnSeekBarChangeListener(this.A0J);
        this.A0E.setMax(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        this.A09 = (FrameLayout) findViewById(R.id.control_frame);
        this.A0B = (ImageButton) findViewById(R.id.play);
        this.A09.setOnClickListener(this.A0J);
        A04();
        A03();
        A05();
        if (this.A0I.A02().A06) {
            if (!isInEditMode()) {
                this.A0C.setRotationY(180.0f);
            }
            if (Build.VERSION.SDK_INT < 17) {
                this.A0E.setRotationY(180.0f);
            }
        }
        onConfigurationChanged(getResources().getConfiguration());
    }

    public void A00() {
        AbstractC33811hQ r0;
        if (this.A00 == null) {
            AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(1.5f);
            AlphaAnimation alphaAnimation = new AlphaAnimation(getAlpha(), 0.0f);
            this.A00 = alphaAnimation;
            alphaAnimation.setDuration(250);
            this.A00.setInterpolator(accelerateInterpolator);
            this.A00.setAnimationListener(new C72373Sp(this));
            if (A07()) {
                FrameLayout frameLayout = this.A0A;
                frameLayout.setVisibility(4);
                AbstractC669736q r1 = this.A04;
                if (r1 != null) {
                    r1.ALl(frameLayout.getVisibility());
                }
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.exo_player_controls_down);
                loadAnimation.setDuration(250);
                loadAnimation.setInterpolator(accelerateInterpolator);
                Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.exo_player_back_button_up);
                loadAnimation2.setDuration(250);
                loadAnimation2.setInterpolator(accelerateInterpolator);
                this.A0C.startAnimation(loadAnimation2);
                frameLayout.startAnimation(this.A00);
                this.A0D.startAnimation(loadAnimation);
            }
            if (this.A06) {
                FrameLayout frameLayout2 = this.A09;
                if (frameLayout2.getVisibility() == 0 && (r0 = this.A01) != null && r0.A8P()) {
                    if (this.A01.A8R() == 3 || this.A01.A8R() == 2) {
                        frameLayout2.setVisibility(4);
                        frameLayout2.startAnimation(this.A00);
                    }
                }
            }
        }
    }

    public void A01() {
        FrameLayout frameLayout = this.A0A;
        frameLayout.setVisibility(0);
        AbstractC669736q r1 = this.A04;
        if (r1 != null) {
            r1.ALl(frameLayout.getVisibility());
        }
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(1.5f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, getAlpha());
        alphaAnimation.setDuration(250);
        alphaAnimation.setInterpolator(decelerateInterpolator);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.exo_player_controls_up);
        loadAnimation.setDuration(250);
        loadAnimation.setInterpolator(decelerateInterpolator);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.exo_player_back_button_down);
        loadAnimation2.setDuration(250);
        loadAnimation2.setInterpolator(decelerateInterpolator);
        FrameLayout frameLayout2 = this.A09;
        if (frameLayout2.getVisibility() == 4 && this.A06) {
            frameLayout2.setVisibility(0);
            frameLayout2.startAnimation(alphaAnimation);
            this.A0B.sendAccessibilityEvent(8);
        }
        frameLayout.startAnimation(alphaAnimation);
        this.A0D.startAnimation(loadAnimation);
        this.A0C.startAnimation(loadAnimation2);
        A04();
        A03();
        A05();
    }

    public void A02() {
        if (this.A06) {
            this.A09.setVisibility(0);
        }
        this.A0A.setVisibility(4);
        A04();
        A03();
        A05();
    }

    public final void A03() {
        AnonymousClass12R r2;
        if (A07()) {
            if (this.A05 == null) {
                AbstractC33811hQ r0 = this.A01;
                if (r0 != null) {
                    r2 = r0.A5q();
                } else {
                    r2 = null;
                }
                boolean z = false;
                if (r2 != null && !r2.A0D()) {
                    int A5r = this.A01.A5r();
                    AnonymousClass12Q r02 = this.A0H;
                    r2.A0A(A5r, r02);
                    z = r02.A03;
                }
                this.A0E.setEnabled(z);
                return;
            }
            this.A0E.setEnabled(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r0.A8P() == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r4 = this;
            android.widget.FrameLayout r0 = r4.A09
            int r1 = r0.getVisibility()
            r0 = 4
            if (r1 != r0) goto L_0x000a
            return
        L_0x000a:
            X.1hQ r0 = r4.A01
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.A8P()
            r3 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.widget.ImageButton r2 = r4.A0B
            r0 = 2131231748(0x7f080404, float:1.8079586E38)
            if (r3 == 0) goto L_0x0020
            r0 = 2131231746(0x7f080402, float:1.8079582E38)
        L_0x0020:
            r2.setImageResource(r0)
            X.01X r1 = r4.A0I
            r0 = 2131887233(0x7f120481, float:1.9409067E38)
            if (r3 == 0) goto L_0x002d
            r0 = 2131887232(0x7f120480, float:1.9409065E38)
        L_0x002d:
            java.lang.String r0 = r1.A07(r0)
            r2.setContentDescription(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.videoplayback.ExoPlaybackControlView.A04():void");
    }

    public final void A05() {
        SeekBar seekBar;
        int A8R;
        int i;
        long A50;
        int i2;
        long A67;
        if (A07()) {
            long j = 0;
            if (this.A05 == null) {
                AbstractC33811hQ r0 = this.A01;
                if (r0 == null) {
                    A67 = 0;
                } else {
                    A67 = r0.A67();
                }
                String A18 = C28051Sr.A18(this.A0M, this.A0N, A67);
                TextView textView = this.A0F;
                if (textView.getText() == null || !A18.equals(textView.getText().toString())) {
                    textView.setText(A18);
                }
            }
            if (this.A08) {
                AbstractC33811hQ r02 = this.A01;
                if (r02 == null) {
                    A50 = 0;
                } else {
                    A50 = r02.A50();
                }
                seekBar = this.A0E;
                long duration = getDuration();
                if (duration == -9223372036854775807L || duration == 0) {
                    i2 = 0;
                } else {
                    i2 = (int) ((A50 * 1000) / duration);
                }
                seekBar.setSecondaryProgress(i2);
            } else {
                seekBar = this.A0E;
                seekBar.setSecondaryProgress(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
            }
            AbstractC33811hQ r03 = this.A01;
            if (r03 != null) {
                j = r03.A5n();
            }
            if (!this.A07) {
                String A182 = C28051Sr.A18(this.A0M, this.A0N, j);
                TextView textView2 = this.A0G;
                if (textView2.getText() == null || !A182.equals(textView2.getText().toString())) {
                    textView2.setText(A182);
                }
            }
            if (!this.A07) {
                long duration2 = getDuration();
                if (duration2 == -9223372036854775807L || duration2 == 0) {
                    i = 0;
                } else {
                    i = (int) ((j * 1000) / duration2);
                }
                seekBar.setProgress(i);
            }
            Runnable runnable = this.A0L;
            removeCallbacks(runnable);
            AbstractC33811hQ r1 = this.A01;
            if (r1 != null && (A8R = r1.A8R()) != 1 && A8R != 4) {
                long j2 = 1000;
                if (this.A01.A8P() && A8R == 3) {
                    long j3 = 1000 - (j % 1000);
                    j2 = j3 < 200 ? 1000 + j3 : j3;
                }
                postDelayed(runnable, j2);
            }
        }
    }

    public void A06(int i) {
        Runnable runnable = this.A0K;
        removeCallbacks(runnable);
        AbstractC33811hQ r0 = this.A01;
        if (r0 != null && r0.A8P()) {
            postDelayed(runnable, (long) i);
        }
        if (this.A00 != null) {
            clearAnimation();
            this.A00 = null;
        }
    }

    public boolean A07() {
        return this.A0A.getVisibility() == 0;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.A01 == null || keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 21) {
            if (keyCode != 22) {
                if (keyCode == 85) {
                    AbstractC33811hQ r1 = this.A01;
                    r1.AOo(!r1.A8P());
                } else if (keyCode == 126) {
                    this.A01.AOo(true);
                } else if (keyCode != 127) {
                    switch (keyCode) {
                        case 87:
                            AbstractC33811hQ r0 = this.A01;
                            if (r0 != null) {
                                AnonymousClass12R A5q = r0.A5q();
                                if (A5q != null) {
                                    int A5r = this.A01.A5r();
                                    if (A5r >= A5q.A01() - 1) {
                                        A5q.A0B(A5r, this.A0H, false, 0);
                                        break;
                                    } else {
                                        this.A01.ANX(A5r + 1);
                                        break;
                                    }
                                }
                            } else {
                                throw null;
                            }
                            break;
                        case 88:
                            AbstractC33811hQ r02 = this.A01;
                            if (r02 != null) {
                                AnonymousClass12R A5q2 = r02.A5q();
                                if (A5q2 != null) {
                                    int A5r2 = this.A01.A5r();
                                    A5q2.A0A(A5r2, this.A0H);
                                    if (A5r2 > 0 && this.A01.A5n() <= 3000) {
                                        this.A01.ANX(A5r2 - 1);
                                        break;
                                    } else {
                                        this.A01.ANW(0);
                                        break;
                                    }
                                }
                            } else {
                                throw null;
                            }
                            break;
                        case 89:
                            break;
                        case 90:
                            break;
                        default:
                            return false;
                    }
                } else {
                    this.A01.AOo(false);
                }
                A01();
                return true;
            }
            AbstractC33811hQ r4 = this.A01;
            if (r4 != null) {
                r4.ANW(Math.min(r4.A5n() + 15000, this.A01.A67()));
                A01();
                return true;
            }
            throw null;
        }
        AbstractC33811hQ r42 = this.A01;
        if (r42 != null) {
            r42.ANW(Math.max(r42.A5n() - 5000, 0L));
            A01();
            return true;
        }
        throw null;
    }

    public long getDuration() {
        Long l = this.A05;
        if (l != null) {
            return l.longValue();
        }
        AbstractC33811hQ r0 = this.A01;
        if (r0 == null) {
            return -9223372036854775807L;
        }
        return r0.A67();
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
        TextView textView = this.A0G;
        textView.setPadding(textView.getPaddingLeft(), i, textView.getPaddingRight(), i);
        SeekBar seekBar = this.A0E;
        seekBar.setPadding(seekBar.getPaddingLeft(), i, seekBar.getPaddingRight(), i);
        TextView textView2 = this.A0F;
        textView2.setPadding(textView2.getPaddingLeft(), i, textView2.getPaddingRight(), i);
    }

    public void setDuration(long j) {
        Long valueOf = Long.valueOf(j);
        this.A05 = valueOf;
        this.A0F.setText(C28051Sr.A18(this.A0M, this.A0N, valueOf.longValue()));
        A05();
        A03();
    }

    public void setPlayButtonClickListener(AbstractC669536o r1) {
        this.A02 = r1;
    }

    public void setPlayControlVisibility(int i) {
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        this.A06 = z;
        this.A09.setVisibility(i);
    }

    public void setPlayer(AbstractC33811hQ r3) {
        AbstractC33811hQ r1 = this.A01;
        if (r1 != null) {
            r1.AMe(this.A0J);
        }
        this.A01 = r3;
        if (r3 != null) {
            r3.A1n(this.A0J);
        }
        A04();
        A03();
        A05();
    }

    public void setSeekbarStartTrackingTouchListener(AbstractC669636p r1) {
        this.A03 = r1;
    }

    public void setStreaming(boolean z) {
        this.A08 = z;
    }

    public void setVisibilityListener(AbstractC669736q r1) {
        this.A04 = r1;
    }
}
