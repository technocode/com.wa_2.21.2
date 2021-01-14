package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I1_1;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.VoiceNoteSeekBar;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ClippingLayout;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1Oe  reason: invalid class name and case insensitive filesystem */
public class C27131Oe {
    public static int A1K;
    public static int A1L;
    public static int A1M;
    public static SoundPool A1N;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public AnimatorSet A0B;
    public ObjectAnimator A0C;
    public PowerManager.WakeLock A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public ViewGroup A0I;
    public ImageButton A0J;
    public ImageView A0K;
    public TextView A0L;
    public TextView A0M;
    public TextView A0N;
    public TextView A0O;
    public TextView A0P;
    public ActivityC004902h A0Q;
    public C222210o A0R;
    public AbstractC02370Bs A0S = new C39201r7(this);
    public C26281Kf A0T;
    public AbstractC004502c A0U;
    public VoiceNoteSeekBar A0V;
    public C52162ag A0W;
    public AnonymousClass02N A0X;
    public C56892jM A0Y;
    public AbstractC007503q A0Z;
    public AnonymousClass1Y0 A0a;
    public ClippingLayout A0b;
    public ClippingLayout A0c;
    public AnonymousClass37X A0d;
    public File A0e;
    public Runnable A0f = new RunnableEBaseShape6S0100000_I1_1(this, 40);
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public final Rect A0l = new Rect();
    public final Handler A0m = new Handler(Looper.getMainLooper());
    public final Handler A0n = new Handler(Looper.getMainLooper());
    public final Handler A0o = new AnonymousClass1Oa(this, Looper.getMainLooper());
    public final AnonymousClass0AV A0p;
    public final AnonymousClass0GG A0q;
    public final C26481Lc A0r;
    public final AnonymousClass088 A0s;
    public final AnonymousClass02M A0t;
    public final C000300f A0u;
    public final C04360Kb A0v;
    public final C40991uH A0w;
    public final AbstractC07200Wh A0x = new C41051uN(this);
    public final AnonymousClass00C A0y;
    public final AnonymousClass03P A0z;
    public final AnonymousClass00S A10;
    public final AnonymousClass00D A11;
    public final AnonymousClass01X A12;
    public final C04270Js A13;
    public final AnonymousClass0ET A14;
    public final AnonymousClass00Y A15;
    public final AnonymousClass0CP A16;
    public final C04420Kh A17;
    public final AnonymousClass022 A18;
    public final AnonymousClass0AL A19;
    public final AnonymousClass35I A1A;
    public final AnonymousClass00T A1B;
    public final AnonymousClass0LH A1C = new C41061uO(this);
    public final AnonymousClass0JO A1D;
    public final AnonymousClass0Fh A1E;
    public final Runnable A1F = new RunnableC27121Od(this);
    public final Runnable A1G = new RunnableEBaseShape6S0100000_I1_1(this, 47);
    public final Runnable A1H = new RunnableEBaseShape6S0100000_I1_1(this, 43);
    public final boolean A1I;
    public final boolean A1J;

    public boolean A0O() {
        return true;
    }

    public C27131Oe(ActivityC004902h r8, AbstractC004502c r9, View view, AnonymousClass00S r11, AnonymousClass02M r12, AnonymousClass00T r13, AnonymousClass088 r14, AnonymousClass00Y r15, C000300f r16, C04360Kb r17, AnonymousClass0CP r18, AnonymousClass0JO r19, AnonymousClass0Fh r20, AnonymousClass03P r21, AnonymousClass01X r22, AnonymousClass0AL r23, AnonymousClass0GG r24, AnonymousClass0ET r25, AnonymousClass00C r26, C04270Js r27, C40991uH r28, AnonymousClass00D r29, AnonymousClass0AV r30, C26481Lc r31, C04420Kh r32, AnonymousClass022 r33, boolean z, boolean z2) {
        this.A0Q = r8;
        this.A0U = r9;
        this.A0H = view;
        this.A10 = r11;
        this.A0t = r12;
        this.A1B = r13;
        this.A0s = r14;
        this.A15 = r15;
        this.A0u = r16;
        this.A0v = r17;
        this.A16 = r18;
        this.A1D = r19;
        this.A1E = r20;
        this.A0z = r21;
        this.A12 = r22;
        this.A19 = r23;
        this.A0q = r24;
        this.A14 = r25;
        this.A0y = r26;
        this.A13 = r27;
        this.A11 = r29;
        this.A0w = r28;
        this.A0p = r30;
        this.A0r = r31;
        this.A17 = r32;
        this.A18 = r33;
        this.A1I = z;
        this.A1J = z2;
        this.A1A = AnonymousClass35I.A00();
        ((ImageView) view.findViewById(R.id.voice_cancel_animation)).setImageResource(R.drawable.recording_mic_red);
        ((ImageView) view.findViewById(R.id.voice_cancel_trashcan_lid)).setImageResource(R.drawable.rec_bucket_lid);
        ((ImageView) view.findViewById(R.id.voice_cancel_trashcan_body)).setImageResource(R.drawable.rec_bucket_body);
        this.A0O = (TextView) view.findViewById(R.id.voice_note_info);
        ImageView imageView = (ImageView) view.findViewById(R.id.voice_note_btn_slider);
        this.A0K = imageView;
        imageView.setImageResource(R.drawable.input_mic_white_large);
        this.A0K.setBackgroundResource(R.drawable.input_circle_large);
        this.A0K.setPadding(0, 0, 0, 0);
        this.A0P = (TextView) view.findViewById(R.id.voice_note_tip);
        PowerManager A0C2 = r21.A0C();
        if (A0C2 == null) {
            Log.w("voicenoterecordingui pm=null");
        } else {
            this.A0D = C002001d.A0f(A0C2, 6, "voicenote");
        }
        if (A1N == null) {
            SoundPool soundPool = new SoundPool(1, 1, 0);
            A1N = soundPool;
            A1L = soundPool.load(r8, R.raw.voice_note_start, 0);
            A1M = A1N.load(r8, R.raw.voice_note_stop, 0);
            A1K = A1N.load(r8, R.raw.voice_note_error, 0);
        }
        this.A0c = (ClippingLayout) view.findViewById(R.id.voice_note_clipping_layout);
        this.A0L = (TextView) view.findViewById(R.id.entry);
        this.A0M = (TextView) view.findViewById(R.id.voice_note_slide_to_cancel);
        this.A0I = (ViewGroup) view.findViewById(R.id.voice_note_draft_layout);
        this.A0V = (VoiceNoteSeekBar) view.findViewById(R.id.voice_note_draft_seekbar);
        TextView textView = (TextView) view.findViewById(R.id.voice_note_draft_time);
        this.A0N = textView;
        AnonymousClass0Q7.A0W(textView, 2);
        this.A0F = view.findViewById(R.id.input_layout);
        this.A0b = (ClippingLayout) view.findViewById(R.id.footer);
        this.A0E = this.A0F.findViewById(R.id.entry);
        if (r22.A0M()) {
            this.A0M.setCompoundDrawablesWithIntrinsicBounds(R.drawable.voice_note_slide_to_cancel, 0, 0, 0);
        } else {
            this.A0M.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new C06470Tj(r22, C004302a.A03(r8, R.drawable.voice_note_slide_to_cancel)), (Drawable) null);
        }
        View findViewById = view.findViewById(R.id.voice_note_slide_to_cancel_scroller);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC27101Ob(this, findViewById));
        ((ViewGroup) view.findViewById(R.id.voice_recorder_decor)).addView(new C27111Oc(r8), -1, -1);
        C222510r r0 = new C222510r(new C33431gl(Choreographer.getInstance()));
        C222210o r6 = new C222210o(r0);
        Map map = r0.A02;
        String str = r6.A0C;
        if (!map.containsKey(str)) {
            map.put(str, r6);
            this.A0R = r6;
            r6.A05 = new C222310p(440.0d, 21.0d);
            this.A0G = view.findViewById(R.id.quoted_message_preview_container);
            this.A03 = ((float) ViewConfiguration.get(r8).getScaledTouchSlop()) * 1.5f;
            r19.A01(this.A1C);
            return;
        }
        throw new IllegalArgumentException("spring is already registered");
    }

    public static Animation A00(boolean z) {
        AlphaAnimation alphaAnimation;
        ScaleAnimation scaleAnimation;
        AnimationSet animationSet = new AnimationSet(true);
        if (z) {
            alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        } else {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        }
        alphaAnimation.setDuration(160);
        animationSet.addAnimation(alphaAnimation);
        if (z) {
            scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        } else {
            scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        }
        scaleAnimation.setDuration(160);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setDuration(160);
        return animationSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0176, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x017a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
        // Method dump skipped, instructions count: 435
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27131Oe.A01():void");
    }

    public void A02() {
        A0N(false, false, true);
        A05();
        this.A1D.A00(this.A1C);
    }

    public void A03() {
        if (this.A0a.A08()) {
            this.A0a.A03();
        }
        A08();
        this.A0n.removeCallbacks(this.A1G);
    }

    public void A04() {
        TelephonyManager A0F2 = this.A0z.A0F();
        if (A0F2 != null && A0F2.getCallState() != 0) {
            this.A0U.APo(R.string.error_voice_messages_disabled_during_cellular_call);
        } else if (AnonymousClass0Fh.A01()) {
            this.A0U.APo(R.string.error_voice_messages_disabled_during_call);
        } else {
            Log.i("voicenote/startvoicenote");
            AnonymousClass00C r1 = this.A0y;
            if (r1.A09(this.A0x)) {
                if (r1.A02() < ((long) ((this.A0u.A06(AbstractC000400g.A3a) << 10) << 10))) {
                    C28051Sr.A1Z(this.A15, this.A0Q, this.A0U, 7);
                } else if (this.A0q.A0H(UserJid.of(this.A0X))) {
                    C002001d.A2O(this.A0Q, 106);
                } else if (this.A0d != null) {
                    Log.e("voicenote/startvoicenote/inprogress");
                } else {
                    this.A0E.setFocusable(false);
                    C28301Tu.A03();
                    if (this.A1J) {
                        int rotation = this.A0Q.getWindowManager().getDefaultDisplay().getRotation();
                        int i = this.A0Q.getResources().getConfiguration().orientation;
                        if (i != 1) {
                            if (i == 2) {
                                if (rotation == 0 || rotation == 1) {
                                    this.A0Q.setRequestedOrientation(0);
                                } else {
                                    this.A0Q.setRequestedOrientation(8);
                                }
                            }
                        } else if (rotation == 0 || rotation == 1) {
                            this.A0Q.setRequestedOrientation(1);
                        } else {
                            this.A0Q.setRequestedOrientation(9);
                        }
                    }
                    PowerManager.WakeLock wakeLock = this.A0D;
                    if (wakeLock != null) {
                        wakeLock.acquire();
                    }
                    AnonymousClass35I r5 = this.A1A;
                    AudioManager A092 = r5.A03.A09();
                    if (A092 != null) {
                        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = r5.A01;
                        if (onAudioFocusChangeListener == null) {
                            onAudioFocusChangeListener = AnonymousClass35A.A00;
                            r5.A01 = onAudioFocusChangeListener;
                        }
                        A092.requestAudioFocus(onAudioFocusChangeListener, 3, 2);
                    }
                    A0I(false);
                    A0C();
                    this.A08 = A1N.play(A1L, 1.0f, 1.0f, 0, 0, 1.0f);
                    TextView textView = this.A0O;
                    AnonymousClass01X r6 = this.A12;
                    textView.setText(C002001d.A1W(r6, 0));
                    this.A06 = 0;
                    this.A00 = 1.0f;
                    View findViewById = this.A0H.findViewById(R.id.voice_note_pulse);
                    findViewById.setVisibility(0);
                    if (this.A0C == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, "alpha", 0.0f, 1.0f);
                        this.A0C = ofFloat;
                        ofFloat.setInterpolator(new AnonymousClass1K7(this));
                        this.A0C.setDuration(500L);
                        this.A0C.setRepeatMode(2);
                        this.A0C.setRepeatCount(-1);
                    }
                    this.A0C.start();
                    this.A0K.setVisibility(0);
                    float width = ((float) this.A0K.getWidth()) / 5.5f;
                    if (r6.A02().A06) {
                        width = -width;
                    }
                    this.A0K.setTranslationX(width);
                    ImageView imageView = this.A0K;
                    imageView.setTranslationY((float) (imageView.getHeight() / 4));
                    this.A0K.setScaleX(0.5f);
                    this.A0K.setScaleY(0.5f);
                    this.A0K.requestFocus();
                    this.A0R.A06.clear();
                    C222210o r0 = this.A0R;
                    AnonymousClass27W r12 = new AnonymousClass27W(this, 0);
                    if (r0 != null) {
                        r0.A06.add(r12);
                        this.A0R.A00(1.0d);
                        this.A0H.findViewById(R.id.buttons).setVisibility(4);
                        this.A0H.findViewById(R.id.emoji_picker_btn).setVisibility(0);
                        View findViewById2 = this.A0H.findViewById(R.id.voice_cancel_trashcan);
                        findViewById2.clearAnimation();
                        findViewById2.setVisibility(8);
                        View findViewById3 = this.A0H.findViewById(R.id.voice_cancel_animation);
                        findViewById3.clearAnimation();
                        findViewById3.setVisibility(8);
                        View findViewById4 = this.A0H.findViewById(R.id.voice_cancel_trashcan_lid);
                        findViewById4.clearAnimation();
                        findViewById4.setVisibility(8);
                        this.A0H.findViewById(R.id.voice_note_slide_to_cancel_layout).setVisibility(0);
                        View findViewById5 = this.A0H.findViewById(R.id.voice_note_slide_to_cancel_animation);
                        findViewById5.setVisibility(0);
                        findViewById5.post(new RunnableEBaseShape6S0200000_I1_1(this, findViewById5, 14));
                        View findViewById6 = this.A0H.findViewById(R.id.voice_note_layout);
                        findViewById6.setVisibility(0);
                        findViewById6.setClickable(true);
                        AnonymousClass0Q7.A0W(findViewById6, 2);
                        float f = -1.0f;
                        if (r6.A0M()) {
                            f = 1.0f;
                        }
                        TranslateAnimation translateAnimation = new TranslateAnimation(1, f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
                        translateAnimation.setDuration(160);
                        findViewById6.startAnimation(translateAnimation);
                        View findViewById7 = this.A0H.findViewById(R.id.input_layout_content);
                        findViewById7.clearAnimation();
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimation.setDuration(160);
                        alphaAnimation.setFillBefore(true);
                        alphaAnimation.setFillAfter(true);
                        findViewById7.startAnimation(alphaAnimation);
                        this.A0H.findViewById(R.id.voice_recorder_decor).setVisibility(0);
                        findViewById7.setFocusable(false);
                        AnonymousClass0Q7.A0W(findViewById7, 4);
                        AnonymousClass088 r02 = this.A0s;
                        this.A0d = new AnonymousClass37X(AnonymousClass089.A01(r02.A07(), C02230Bd.A0N()).getAbsolutePath());
                        this.A13.A00 = true;
                        this.A09 = SystemClock.elapsedRealtime();
                        try {
                            this.A0d.A00.prepare();
                            C40991uH r13 = this.A0w;
                            if (r13 != null) {
                                Log.i("voicenote/voicenotestarted");
                                AnonymousClass00E.A01();
                                Iterator it = r13.A00.iterator();
                                while (true) {
                                    AnonymousClass0AY r14 = (AnonymousClass0AY) it;
                                    if (!r14.hasNext()) {
                                        break;
                                    }
                                    ((AnonymousClass1OV) r14.next()).A00();
                                }
                                this.A0O.removeCallbacks(this.A0f);
                                this.A0O.postDelayed(this.A0f, 340);
                                this.A0j = false;
                                this.A0g = false;
                                if (this.A1I) {
                                    this.A0H.findViewById(R.id.voice_note_lock_container).setVisibility(0);
                                    View view = this.A0H;
                                    if (view != null && this.A0T == null) {
                                        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.voice_note_lock_container);
                                        C26281Kf r03 = new C26281Kf(this.A0Q);
                                        this.A0T = r03;
                                        r03.setVisibility(4);
                                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                                        int i2 = 83;
                                        if (r6.A0M()) {
                                            i2 = 85;
                                        }
                                        layoutParams.gravity = i2;
                                        viewGroup.addView(this.A0T, layoutParams);
                                    }
                                    this.A0h = false;
                                    this.A0k = false;
                                    this.A0m.postDelayed(this.A1F, 1500);
                                    return;
                                }
                                return;
                            }
                            throw null;
                        } catch (Exception unused) {
                            A0N(false, false, true);
                            this.A0U.APo(R.string.error_setup_recorder);
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
    }

    public void A05() {
        this.A0n.removeCallbacks(this.A1G);
        if (this.A0a != null) {
            this.A0J.setOnClickListener(null);
            A03();
            this.A0a.A05();
            this.A0a = null;
        }
    }

    public final void A06() {
        this.A0H.findViewById(R.id.voice_note_pulse).setVisibility(4);
        ObjectAnimator objectAnimator = this.A0C;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        View findViewById = this.A0H.findViewById(R.id.voice_cancel_trashcan);
        findViewById.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(213);
        translateAnimation.setStartOffset(640);
        translateAnimation.setFillBefore(true);
        findViewById.startAnimation(translateAnimation);
        View findViewById2 = this.A0H.findViewById(R.id.voice_cancel_animation);
        findViewById2.setVisibility(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new DecelerateInterpolator(1.1f));
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -3.0f);
        translateAnimation2.setDuration(640);
        translateAnimation2.setRepeatMode(2);
        translateAnimation2.setRepeatCount(1);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(640);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.61f, 1.0f, 0.61f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(320);
        scaleAnimation.setStartOffset(960);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(translateAnimation2);
        View findViewById3 = this.A0H.findViewById(R.id.voice_cancel_trashcan_lid);
        AnimationSet animationSet2 = new AnimationSet(true);
        TranslateAnimation translateAnimation3 = new TranslateAnimation(1, 0.0f, 1, -0.3f, 1, 0.0f, 1, 0.0f);
        translateAnimation3.setDuration(160);
        translateAnimation3.setStartOffset(746);
        translateAnimation3.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(0.0f, -60.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation2.setDuration(160);
        rotateAnimation2.setStartOffset(746);
        rotateAnimation2.setFillAfter(true);
        animationSet2.addAnimation(rotateAnimation2);
        animationSet2.addAnimation(translateAnimation3);
        animationSet2.setFillAfter(true);
        findViewById3.setVisibility(0);
        findViewById3.startAnimation(animationSet2);
        View findViewById4 = this.A0H.findViewById(R.id.emoji_picker_btn);
        findViewById4.setVisibility(4);
        findViewById2.startAnimation(animationSet);
        animationSet.setAnimationListener(new C41081uQ(this, findViewById2, findViewById, findViewById3, findViewById4));
    }

    public final void A07() {
        this.A0K.setTranslationX(this.A04);
        ((ClippingLayout) this.A0H.findViewById(R.id.footer)).setClipBounds(null);
        this.A0c.setClipBounds(null);
    }

    public final void A08() {
        ImageButton imageButton = this.A0J;
        AnonymousClass01X r2 = this.A12;
        imageButton.setImageDrawable(new C06470Tj(r2, C004302a.A03(this.A0Q, R.drawable.inline_audio_play)));
        this.A0J.setContentDescription(r2.A06(R.string.play));
    }

    public final void A09() {
        VoiceNoteSeekBar voiceNoteSeekBar;
        boolean z;
        int progress;
        if (this.A0a != null && (voiceNoteSeekBar = this.A0V) != null) {
            if (voiceNoteSeekBar.getProgress() != 0 || this.A0a.A08()) {
                z = false;
                progress = this.A0V.getProgress();
            } else {
                z = true;
                progress = this.A0V.getMax();
            }
            AnonymousClass01X r4 = this.A12;
            int i = R.string.voice_message_time_elapsed;
            if (z) {
                i = R.string.unsent_voice_message;
            }
            this.A0V.setContentDescription(r4.A0D(i, C002001d.A1X(r4, (long) progress)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (X.C002001d.A3R(r5.A0z, r5.A18, ((com.whatsapp.MentionableEntry) r0).getStringText()) == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A() {
        /*
            r5 = this;
            android.view.View r1 = r5.A0H
            r0 = 2131362171(0x7f0a017b, float:1.8344115E38)
            android.view.View r4 = r1.findViewById(r0)
            android.view.View r0 = r5.A0E
            if (r0 == 0) goto L_0x001e
            X.03P r2 = r5.A0z
            X.022 r1 = r5.A18
            com.whatsapp.MentionableEntry r0 = (com.whatsapp.MentionableEntry) r0
            java.lang.String r0 = r0.getStringText()
            boolean r0 = X.C002001d.A3R(r2, r1, r0)
            r3 = 1
            if (r0 != 0) goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            r2 = 8
            r1 = 0
            r0 = 2131364301(0x7f0a09cd, float:1.8348435E38)
            android.view.View r0 = r4.findViewById(r0)
            if (r3 == 0) goto L_0x0041
            r0.setVisibility(r1)
            r0 = 2131364885(0x7f0a0c15, float:1.834962E38)
            android.view.View r0 = r4.findViewById(r0)
            r0.setVisibility(r2)
        L_0x0038:
            r4.setVisibility(r1)
            android.view.View r0 = r5.A0F
            r0.requestFocus()
            return
        L_0x0041:
            r0.setVisibility(r2)
            r0 = 2131364885(0x7f0a0c15, float:1.834962E38)
            android.view.View r0 = r4.findViewById(r0)
            r0.setVisibility(r1)
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27131Oe.A0A():void");
    }

    public final void A0B() {
        if (this.A1I) {
            this.A0m.removeCallbacks(this.A1F);
            View view = this.A0H;
            if (view != null && view.getKeepScreenOn()) {
                this.A0H.setKeepScreenOn(false);
            }
            if (this.A0i) {
                this.A0i = false;
                this.A0p.A00(this.A0S);
            }
        }
    }

    public final void A0C() {
        try {
            if (Settings.System.getInt(this.A0Q.getContentResolver(), "haptic_feedback_enabled") != 0) {
                ((Vibrator) this.A0Q.getSystemService("vibrator")).vibrate(75);
            }
        } catch (Settings.SettingNotFoundException e) {
            Log.e("voicenote/vibrate", e);
        }
    }

    public final void A0D(int i, int i2, float f, float f2) {
        AnonymousClass01X r4 = this.A12;
        String A062 = r4.A06(i2);
        if (!A0P()) {
            C002001d.A2R(this.A0Q, this.A0z, A062);
        }
        this.A0P.setBackgroundDrawable(new C06470Tj(r4, this.A0Q.getResources().getDrawable(i)));
        this.A0P.setText(A062);
        this.A0P.setTranslationY(f);
        this.A0P.setTranslationX(f2);
        this.A0P.setVisibility(0);
        this.A0P.setAlpha(0.0f);
        this.A0P.animate().alpha(1.0f).setDuration(320).start();
        AnonymousClass02M r0 = this.A0t;
        Runnable runnable = this.A1H;
        Handler handler = r0.A02;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 3500);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (java.lang.Math.abs(r15) <= r22.A03) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r11 >= 0.0f) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(android.view.View r23, android.view.MotionEvent r24, boolean r25) {
        /*
        // Method dump skipped, instructions count: 723
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27131Oe.A0E(android.view.View, android.view.MotionEvent, boolean):void");
    }

    public void A0F(File file, boolean z) {
        if (file == null) {
            throw null;
        } else if (this.A0X != null) {
            File A0I2 = C02230Bd.A0I(this.A0Q, this.A0s, this.A18, file, AnonymousClass1XO.A0D, 1);
            if (!file.renameTo(A0I2)) {
                StringBuilder sb = new StringBuilder("voicenote/sendvoicenotefile/failed to rename ");
                sb.append(file);
                sb.append(" to ");
                sb.append(A0I2);
                Log.e(sb.toString());
                A0I2 = file;
            }
            AnonymousClass0M4 r4 = new AnonymousClass0M4();
            r4.A0F = A0I2;
            AnonymousClass0M3 A052 = this.A16.A05(this.A0X, r4, (byte) 2, 1, null, null, this.A0Z, null, null, z, 0, null);
            C52162ag r0 = this.A0W;
            if (r0 != null) {
                C05420Ol A0B2 = r0.A0B();
                A052.A0H = A0B2;
                if (A0B2 == null) {
                    A052.A0P(1024);
                } else {
                    A052.A0O(1024);
                }
            }
            if (A052.A00 == 0) {
                A052.A00 = C02230Bd.A08(file);
            }
            this.A0v.A07(new C40531tQ(Collections.singletonList(A052)), null);
        } else {
            throw null;
        }
    }

    public void A0G(File file, boolean z) {
        if (file != null) {
            try {
                AnonymousClass1Y0 A002 = AnonymousClass1Y0.A00(file, 3);
                this.A0a = A002;
                A002.A04();
            } catch (IOException e) {
                this.A0a = null;
                Log.e("voicenoterecordingui/showvoicenotepreview/ error creating audio player for voice note preview ", e);
            }
            AnonymousClass1Y0 r0 = this.A0a;
            if (r0 != null) {
                int A022 = r0.A02();
                this.A0J = (ImageButton) this.A0H.findViewById(R.id.voice_note_draft_playback_btn);
                A08();
                this.A0J.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 39));
                this.A0N.setText(C002001d.A1W(this.A12, (long) (A022 / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)));
                this.A0V.setMax(A022);
                this.A0V.setProgress(0);
                A09();
                this.A0H.findViewById(R.id.voice_note_layout).setVisibility(8);
                this.A0H.findViewById(R.id.input_layout_content).setVisibility(4);
                this.A0H.findViewById(R.id.voice_note_cancel_btn).setVisibility(8);
                this.A0H.findViewById(R.id.buttons).setVisibility(0);
                this.A0H.findViewById(R.id.voice_note_btn).setVisibility(8);
                View findViewById = this.A0H.findViewById(R.id.send);
                findViewById.setVisibility(0);
                AnonymousClass0Q7.A0d(findViewById, new C41001uI(this));
                this.A0K.setVisibility(8);
                C26281Kf r02 = this.A0T;
                if (r02 != null) {
                    r02.setVisibility(4);
                }
                this.A0I.setVisibility(0);
                this.A0I.setClickable(true);
                this.A0H.findViewById(R.id.voice_note_draft_discard_btn).setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 40));
                this.A0V.setOnSeekBarChangeListener(new AnonymousClass1OW(this));
                if (z) {
                    this.A1B.ANF(new RunnableEBaseShape6S0100000_I1_1(this, 42));
                }
                this.A0e = file;
                return;
            }
            return;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        if (X.C002001d.A3R(r15.A0z, r15.A18, ((com.whatsapp.MentionableEntry) r0).getStringText()) == false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(boolean r16) {
        /*
        // Method dump skipped, instructions count: 188
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27131Oe.A0H(boolean):void");
    }

    public void A0I(boolean z) {
        if (this.A0P.getVisibility() == 0) {
            AnonymousClass02M r0 = this.A0t;
            r0.A02.removeCallbacks(this.A1H);
            if (z) {
                this.A0P.setVisibility(8);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(320);
                this.A0P.startAnimation(alphaAnimation);
                return;
            }
            this.A0P.clearAnimation();
            this.A0P.setVisibility(8);
        }
    }

    public void A0J(boolean z) {
        this.A0k = true;
        this.A0H.findViewById(R.id.voice_note_btn).setVisibility(8);
        this.A0H.findViewById(R.id.buttons).setVisibility(0);
        AnonymousClass0AV r3 = this.A0p;
        if (r3.A00.A00() >= 16.0d) {
            View view = this.A0H;
            if (view != null && !view.getKeepScreenOn()) {
                this.A0H.setKeepScreenOn(true);
            }
            if (!this.A0i) {
                this.A0i = true;
                r3.A01(this.A0S);
            }
        }
        View findViewById = this.A0H.findViewById(R.id.send);
        findViewById.setScaleX(0.0f);
        findViewById.setScaleY(0.0f);
        findViewById.setVisibility(0);
        findViewById.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200).setListener(new AnonymousClass1OY(this, z, findViewById)).start();
    }

    public final void A0K(boolean z) {
        this.A0H.findViewById(R.id.voice_recorder_decor).setVisibility(8);
        if (this.A1I) {
            C26281Kf r0 = this.A0T;
            if (r0 != null) {
                r0.A00();
            }
            this.A0H.findViewById(R.id.voice_note_lock_container).setVisibility(8);
            this.A0H.findViewById(R.id.send).setEnabled(!TextUtils.isEmpty(this.A0L.getText().toString().trim()));
            this.A0H.findViewById(R.id.voice_note_cancel_btn).setVisibility(8);
        }
        this.A0R.A06.clear();
        C222210o r9 = this.A0R;
        if (r9.A08.A00 == 0.0d || !z) {
            r9.A00(0.0d);
            this.A0K.setVisibility(4);
            this.A0K.setScaleX(0.0f);
            this.A0K.setScaleY(0.0f);
            A0A();
        } else {
            r9.A06.add(new AnonymousClass29n(this, (int) this.A0K.getTranslationX()));
            this.A0R.A00(0.0d);
        }
        View findViewById = this.A0H.findViewById(R.id.voice_note_layout);
        findViewById.setVisibility(8);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(160);
        findViewById.startAnimation(alphaAnimation);
        View findViewById2 = this.A0H.findViewById(R.id.input_layout_content);
        findViewById2.clearAnimation();
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(160);
        alphaAnimation2.setFillBefore(true);
        alphaAnimation2.setFillAfter(true);
        findViewById2.startAnimation(alphaAnimation2);
        ((ClippingLayout) this.A0H.findViewById(R.id.footer)).setClipBounds(null);
        this.A0c.setClipBounds(null);
        View findViewById3 = this.A0H.findViewById(R.id.voice_note_pulse);
        findViewById3.clearAnimation();
        ((ImageView) findViewById3).getDrawable().setAlpha(255);
    }

    public final void A0L(boolean z, int i) {
        AnonymousClass008.A1H("voicenote/onrecordingstopped ", z);
        this.A0Y.A01 = true;
        if (z) {
            AnonymousClass0M4 r4 = new AnonymousClass0M4();
            r4.A0L = true;
            File A012 = this.A0Y.A01();
            r4.A0F = A012;
            AnonymousClass0AL r2 = this.A19;
            AnonymousClass02N r3 = this.A0X;
            if (r3 != null) {
                AnonymousClass0M3 A032 = r2.A03(r3, r4, this.A0A, 1, (byte) 2, 0, A012.getName(), r4.A0F.length(), 1, this.A0Z);
                A032.A00 = i;
                C52162ag r1 = this.A0W;
                if (r1 != null) {
                    C05420Ol A0B2 = r1.A0B();
                    A032.A0H = A0B2;
                    if (A0B2 == null) {
                        A032.A0P(1024);
                    } else {
                        A032.A0O(1024);
                    }
                }
                C04360Kb r13 = this.A0v;
                C56862jJ r22 = this.A0Y.A00;
                if (r13 != null) {
                    r13.A08(new C40531tQ(Collections.singletonList(A032)), null, null, r22, false);
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        } else {
            C04420Kh r42 = this.A17;
            C56892jM r32 = this.A0Y;
            if (r42 != null) {
                StringBuilder A0S2 = AnonymousClass008.A0S("app/mediajobmanager/cancelVoiceNoteUpload: ");
                A0S2.append(r32.A01());
                Log.i(A0S2.toString());
                r42.A07.A07(r32.A00);
            } else {
                throw null;
            }
        }
        this.A0Y = null;
    }

    public final void A0M(boolean z, long j) {
        try {
            this.A0d.A00.stop();
        } catch (Exception e) {
            if (!z || j < 1000) {
                StringBuilder A0S2 = AnonymousClass008.A0S("voicenote/stopandreleasevoicerecorder/stop ");
                A0S2.append(e.toString());
                Log.i(A0S2.toString());
            } else {
                Log.e("voicenote/stopandreleasevoicerecorder/stop ", e);
            }
        }
        try {
            this.A0d.A00.close();
        } catch (Exception e2) {
            Log.e("voicenote/stopandreleasevoicerecorder/release", e2);
        }
        C40991uH r1 = this.A0w;
        if (r1 != null) {
            Log.i("voicenote/voicenotestopped");
            AnonymousClass00E.A01();
            Iterator it = r1.A00.iterator();
            while (true) {
                AnonymousClass0AY r12 = (AnonymousClass0AY) it;
                if (r12.hasNext()) {
                    AnonymousClass1OV r13 = (AnonymousClass1OV) r12.next();
                    if (r13 instanceof C39801s8) {
                        ((C39801s8) r13).A00.invalidateOptionsMenu();
                    }
                } else {
                    return;
                }
            }
        } else {
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a6, code lost:
        if (r0 <= 99) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00af, code lost:
        if (r22 != false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b3, code lost:
        if (r2 < 1000) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        if (r0 > 99) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bb, code lost:
        if (r21.A0Y == null) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bd, code lost:
        A0L(false, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c0, code lost:
        r21.A13.A00 = false;
        r21.A0d = null;
        r21.A0Q.setRequestedOrientation(-1);
        r11 = r21.A1A;
        r9 = r11.A03.A09();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d5, code lost:
        if (r9 == null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d7, code lost:
        r4 = r11.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d9, code lost:
        if (r4 != null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00db, code lost:
        r4 = X.AnonymousClass35A.A00;
        r11.A01 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00df, code lost:
        r9.abandonAudioFocus(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e2, code lost:
        r4 = r21.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e4, code lost:
        if (r4 == null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ea, code lost:
        if (r4.isHeld() == false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ec, code lost:
        r21.A0D.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f1, code lost:
        A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f4, code lost:
        if (r22 == false) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f8, code lost:
        if (r2 < 1000) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fc, code lost:
        if (r0 <= 99) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fe, code lost:
        android.os.SystemClock.sleep(50);
        X.C27131Oe.A1N.play(X.C27131Oe.A1M, 1.0f, 1.0f, 0, 0, 1.0f);
        r21.A14.A03(1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011b, code lost:
        if (r21.A0Y == null) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011d, code lost:
        A0L(true, (int) (r2 / 1000));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0125, code lost:
        if ((r21 instanceof X.C58702mM) != false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0129, code lost:
        if ((r21 instanceof X.C40351t8) != false) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012d, code lost:
        if ((r21 instanceof X.C39691rw) == false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012f, code lost:
        r2 = ((X.C39691rw) r21).A00;
        r1 = r2.A0w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0139, code lost:
        if ((r1.A00 instanceof X.C52162ag) == false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013b, code lost:
        r2.A1M = null;
        r1.A00 = null;
        r2.A0i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0143, code lost:
        r1 = r21.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0145, code lost:
        if (r1 == 0) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0147, code lost:
        r21.A0O.postDelayed(new java.lang.RunnableEBaseShape1S0101000_I1(r21, r1, 7), 2000);
        r21.A07 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        r21.A0E.setFocusable(true);
        r21.A0E.setFocusableInTouchMode(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0161, code lost:
        ((X.C40351t8) r21).A00.A0U();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0169, code lost:
        ((X.C58702mM) r21).A00.A0T();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0171, code lost:
        A0F(r8, r23);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x017a, code lost:
        if (r22 == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x017e, code lost:
        if (r2 >= 1000) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0180, code lost:
        X.C27131Oe.A1N.play(X.C27131Oe.A1K, 1.0f, 1.0f, 0, 0, 1.0f);
        r21.A14.A03(3, r0);
        r4 = (float) r21.A0Q.getResources().getDimensionPixelSize(com.google.android.search.verification.client.R.dimen.voice_note_duration_tip_translation_x);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b1, code lost:
        if (r21.A12.A02().A06 == false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b3, code lost:
        r4 = -r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b4, code lost:
        A0D(com.google.android.search.verification.client.R.drawable.tooltip_ptt, com.google.android.search.verification.client.R.string.voice_message_tip, 0.0f, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b7, code lost:
        if (r8 == null) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01bd, code lost:
        if (r8.exists() == false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c3, code lost:
        if (r8.delete() != false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c5, code lost:
        r1 = X.AnonymousClass008.A0S("voicenote/failed to delete file ");
        r1.append(r8.getAbsolutePath());
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d9, code lost:
        if (r8 == null) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01df, code lost:
        if (r0 <= 0) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e1, code lost:
        r21.A14.A03(2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01eb, code lost:
        if (r8.exists() == false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f1, code lost:
        if (r8.delete() != false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01f3, code lost:
        r1 = X.AnonymousClass008.A0S("voicenote/failed to delete file ");
        r1.append(r8.getAbsolutePath());
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0207, code lost:
        if (r22 != false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0N(boolean r22, boolean r23, boolean r24) {
        /*
        // Method dump skipped, instructions count: 527
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27131Oe.A0N(boolean, boolean, boolean):void");
    }

    public boolean A0P() {
        return this.A0d != null;
    }

    public boolean A0Q() {
        if (!TextUtils.isEmpty(this.A0L.getText().toString().trim()) || !A0O()) {
            return false;
        }
        A04();
        return true;
    }
}
