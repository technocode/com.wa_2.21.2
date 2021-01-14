package com.whatsapp.voipcalling;

import X.AnonymousClass00E;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass0Q7;
import X.AnonymousClass0QY;
import X.AnonymousClass399;
import X.AnonymousClass39A;
import X.AnonymousClass39Q;
import X.AnonymousClass39R;
import X.C007003k;
import X.C014308b;
import X.C72723Tz;
import X.DialogInterface$OnKeyListenerC672037p;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape9S0100000_I1_7;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaTextView;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.util.Log;

public class MaximizedParticipantVideoDialogFragment extends WaDialogFragment implements AnonymousClass39Q {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public View A04;
    public WaTextView A05;
    public WaTextView A06;
    public C72723Tz A07;
    public VideoCallParticipantView A08;
    public AnonymousClass39R A09;
    public boolean A0A = false;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final DialogInterface.OnDismissListener A0F;
    public final Drawable A0G;
    public final View.OnClickListener A0H;
    public final AnonymousClass01A A0I = AnonymousClass01A.A00();
    public final C014308b A0J = C014308b.A00();
    public final AnonymousClass01X A0K = AnonymousClass01X.A00();
    public final Runnable A0L;

    @Override // X.AnonymousClass39Q
    public void AQy(VideoCallParticipantView videoCallParticipantView, Point point) {
    }

    public MaximizedParticipantVideoDialogFragment(int i, int i2, int i3, int i4, Drawable drawable, DialogInterface.OnDismissListener onDismissListener, View.OnClickListener onClickListener, Runnable runnable) {
        this.A0F = onDismissListener;
        this.A0H = onClickListener;
        this.A0D = i;
        this.A0E = i2;
        this.A0C = i3;
        this.A0B = i4;
        this.A0G = drawable;
        this.A0L = runnable;
    }

    @Override // com.whatsapp.base.WaDialogFragment, X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0f() {
        super.A0f();
        Dialog A0o = A0o();
        if (A0o.getWindow() != null) {
            A0o.getWindow().setLayout(-1, -1);
            A0o.getWindow().setFlags(1024, 1024);
            A0o.getWindow().clearFlags(2);
            A0o.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        View view;
        Dialog dialog = new Dialog(A0A(), R.style.MaximizedVideoCallDialog);
        dialog.setCancelable(true);
        if (dialog.getWindow() != null) {
            dialog.getWindow().requestFeature(1);
        }
        dialog.setContentView(R.layout.group_call_video_maximize_dialog);
        dialog.setOnDismissListener(this.A0F);
        dialog.setOnKeyListener(new DialogInterface$OnKeyListenerC672037p(this));
        if (dialog.getWindow() != null) {
            view = dialog.getWindow().getDecorView();
        } else {
            view = null;
        }
        if (view == null || this.A09 == null) {
            AnonymousClass00E.A08(false, "failed to initialize MaximizedParticipantVideoDialogFragment");
            return dialog;
        }
        this.A08 = (VideoCallParticipantView) AnonymousClass0Q7.A0D(view, R.id.video_view);
        this.A06 = (WaTextView) AnonymousClass0Q7.A0D(view, R.id.name);
        this.A05 = (WaTextView) AnonymousClass0Q7.A0D(view, R.id.name_byline);
        this.A04 = AnonymousClass0Q7.A0D(view, R.id.background_overlay);
        View A0D2 = AnonymousClass0Q7.A0D(view, R.id.container);
        VideoCallParticipantView videoCallParticipantView = this.A08;
        videoCallParticipantView.setLayoutMode(7);
        videoCallParticipantView.A02();
        this.A08.A0M.setOnClickListener(this.A0H);
        VideoCallParticipantView videoCallParticipantView2 = this.A08;
        videoCallParticipantView2.A00 = 1.5f;
        videoCallParticipantView2.A03(A02().getDimensionPixelSize(R.dimen.maximized_video_call_rounded_corner));
        this.A08.setBackgroundColor(-16777216);
        this.A09.A07(this.A08);
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo == null) {
            Log.w("MaximizedParticipantVideoDialogFragment can not get callInfo");
        } else {
            A0x((AnonymousClass0QY) callInfo.participants.get(this.A09.A03), callInfo);
            if (callInfo.self.A06.equals(this.A09.A03)) {
                this.A06.setText(this.A0K.A06(R.string.you));
            } else {
                C007003k A0A2 = this.A0I.A0A(this.A09.A03);
                WaTextView waTextView = this.A06;
                C014308b r1 = this.A0J;
                waTextView.setText(r1.A08(A0A2, false));
                if (TextUtils.isEmpty(A0A2.A0F)) {
                    this.A05.setText(r1.A07(A0A2));
                    this.A05.setVisibility(0);
                }
            }
        }
        A0D2.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 26));
        this.A08.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass399(this));
        A0D2.setBackground(this.A0G);
        return dialog;
    }

    public void A0x(AnonymousClass0QY r4, CallInfo callInfo) {
        AnonymousClass39R r2;
        if (A0U() && r4 != null && (r2 = this.A09) != null && this.A08 != null && r4.A06.equals(r2.A03)) {
            if (!callInfo.callId.equals(Voip.getCurrentCallId())) {
                if (this.A09.A03.equals(callInfo.self.A06)) {
                    this.A09.A02();
                }
                A0y(false);
            } else if (callInfo.participants.size() <= 2) {
                A0y(false);
            } else {
                this.A09.A06(r4, callInfo);
            }
        }
    }

    public void A0y(boolean z) {
        float f;
        float f2;
        if (A0U()) {
            Log.i("voip/MaximizedParticipantVideoDialogFragment/dismissDialog");
            C72723Tz r0 = this.A07;
            if (r0 != null) {
                r0.release();
            }
            AnonymousClass39R r02 = this.A09;
            if (r02 != null) {
                r02.A03();
            }
            this.A0F.onDismiss(((DialogFragment) this).A03);
            RunnableEBaseShape13S0100000_I1_8 runnableEBaseShape13S0100000_I1_8 = new RunnableEBaseShape13S0100000_I1_8(this, 36);
            if (this.A08 == null) {
                throw null;
            } else if (this.A06 == null) {
                throw null;
            } else if (this.A05 != null) {
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(1.5f);
                ViewPropertyAnimator duration = this.A08.animate().setDuration(250);
                if (z) {
                    f = this.A01;
                } else {
                    f = 0.0f;
                }
                ViewPropertyAnimator scaleX = duration.scaleX(f);
                if (z) {
                    f2 = this.A00;
                } else {
                    f2 = 0.0f;
                }
                scaleX.scaleY(f2).translationX((float) this.A02).translationY((float) this.A03).setInterpolator(decelerateInterpolator).setListener(new AnonymousClass39A(runnableEBaseShape13S0100000_I1_8)).start();
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(250);
                this.A06.startAnimation(alphaAnimation);
                if (this.A05.getVisibility() == 0) {
                    this.A05.startAnimation(alphaAnimation);
                }
                A0z(false);
            } else {
                throw null;
            }
        }
    }

    public final void A0z(boolean z) {
        View view = this.A04;
        if (view != null) {
            float f = 0.0f;
            float f2 = 0.4f;
            if (z) {
                f2 = 0.0f;
            }
            view.setAlpha(f2);
            ViewPropertyAnimator duration = this.A04.animate().setDuration(250);
            if (z) {
                f = 0.4f;
            }
            duration.alpha(f);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass39Q
    public VideoPort A9h(VideoCallParticipantView videoCallParticipantView) {
        C72723Tz r1 = this.A07;
        if (r1 != null) {
            return r1;
        }
        C72723Tz r12 = new C72723Tz(videoCallParticipantView.A0C);
        this.A07 = r12;
        return r12;
    }
}
