package com.whatsapp.voipcalling;

import X.AbstractC11910hD;
import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass037;
import X.AnonymousClass03C;
import X.AnonymousClass03P;
import X.AnonymousClass0L2;
import X.AnonymousClass0N2;
import X.AnonymousClass0Wn;
import X.AnonymousClass0YX;
import X.AnonymousClass31y;
import X.AnonymousClass38S;
import X.AnonymousClass38X;
import X.AnonymousClass3UH;
import X.AnonymousClass3UT;
import X.AnonymousClass3UV;
import X.C002001d;
import X.C014308b;
import X.C676039g;
import X.C676239j;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.Button;
import com.whatsapp.util.Log;

public class VoipCallControlBottomSheet extends BottomSheetDialogFragment {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public View A04;
    public View A05;
    public View A06;
    public FrameLayout A07;
    public RecyclerView A08;
    public BottomSheetBehavior A09;
    public Button A0A;
    public Button A0B;
    public AnonymousClass0YX A0C;
    public AnonymousClass3UH A0D;
    public VoipCallControlBottomSheetDragIndicator A0E;
    public VoipCallFooter A0F;
    public boolean A0G = true;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final GestureDetector A0K = new GestureDetector(new C676239j(this));
    public final AnonymousClass02M A0L = AnonymousClass02M.A00();
    public final AnonymousClass01A A0M = AnonymousClass01A.A00();
    public final C014308b A0N = C014308b.A00();
    public final AnonymousClass0L2 A0O = AnonymousClass0L2.A01();
    public final AnonymousClass03P A0P = AnonymousClass03P.A00();
    public final AnonymousClass03C A0Q = AnonymousClass03C.A00();
    public final AnonymousClass01X A0R = AnonymousClass01X.A00();
    public final AnonymousClass31y A0S = AnonymousClass31y.A00();
    public final AnonymousClass3UT A0T = new AnonymousClass3UT(this);

    public static Animator A00(View view, float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setInterpolator(AnonymousClass0N2.A0a(0.0f, 0.0f, 0.6f));
        ofFloat.setDuration(750L);
        ofFloat.setRepeatCount(1);
        ofFloat.setRepeatMode(2);
        ofFloat.addUpdateListener(new AnonymousClass38S(view));
        return ofFloat;
    }

    public static void A01(VoipCallControlBottomSheet voipCallControlBottomSheet, int i) {
        if (voipCallControlBottomSheet.A08 != null) {
            AnonymousClass008.A0v("VoipCallControlBottomSheet scroll to position: ", i);
            voipCallControlBottomSheet.A0T.A08(null);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) voipCallControlBottomSheet.A08.A0S;
            int A0s = linearLayoutManager.A0s();
            int A0u = linearLayoutManager.A0u();
            int height = voipCallControlBottomSheet.A08.getChildAt(A0s).getHeight();
            if (i < A0s) {
                voipCallControlBottomSheet.A08.A0c(0, (-(A0s - i)) * height);
            } else if (i >= A0u) {
                int dimensionPixelOffset = voipCallControlBottomSheet.A00().getResources().getDimensionPixelOffset(R.dimen.call_control_participant_list_scrolling_bottom_offset);
                RecyclerView recyclerView = voipCallControlBottomSheet.A08;
                recyclerView.A0c(0, (((i + 1) * height) - recyclerView.getHeight()) + dimensionPixelOffset);
            }
            AbstractC11910hD A0C2 = voipCallControlBottomSheet.A08.A0C(i);
            if (A0C2 != null) {
                View view = A0C2.A0H;
                if (((DialogFragment) voipCallControlBottomSheet).A03 != null) {
                    view.setBackground(new ColorDrawable(voipCallControlBottomSheet.A03));
                    ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view.getBackground(), PropertyValuesHolder.ofInt("alpha", 255, 0));
                    ofPropertyValuesHolder.setTarget(view.getBackground());
                    ofPropertyValuesHolder.setDuration(3000L);
                    ofPropertyValuesHolder.start();
                }
            }
            voipCallControlBottomSheet.A0H = false;
        }
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0Y() {
        super.A0Y();
        Log.i("VoipCallControlBottomSheet onDetach");
        this.A0J = false;
        RecyclerView recyclerView = this.A08;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        this.A09 = null;
        this.A04 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a0, code lost:
        if (r1 == false) goto L_0x00a2;
     */
    @Override // X.AnonymousClass037
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0Z(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallControlBottomSheet.A0Z(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0a(Context context) {
        super.A0a(context);
        try {
            this.A0D = ((AnonymousClass0Wn) context).A56();
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement VoipCallControlBottomSheet$HostProvider");
            throw new ClassCastException(sb.toString());
        }
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            boolean z = bundle2.getBoolean("is_video_call", false);
            int i = R.style.VoipCallControlVoiceBottomSheet;
            if (z) {
                i = R.style.VoipCallControlVideoBottomSheet;
            }
            A0s(0, i);
            return;
        }
        throw null;
    }

    public final CallInfo A0x() {
        AnonymousClass3UH r0 = this.A0D;
        if (r0 != null) {
            return r0.A00.A0W();
        }
        return null;
    }

    public void A0y() {
        BottomSheetBehavior bottomSheetBehavior = this.A09;
        if (bottomSheetBehavior != null && bottomSheetBehavior.A0J) {
            A11();
            this.A09.A0D(5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (r3 == com.whatsapp.voipcalling.Voip.CallState.REJOINING) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r1 == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0080, code lost:
        if (r4.isInLonelyState() != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013f, code lost:
        if (r1 == false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0z() {
        /*
        // Method dump skipped, instructions count: 323
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallControlBottomSheet.A0z():void");
    }

    public final void A10() {
        View view = this.A04;
        if (view != null && view.getContext() != null) {
            View view2 = this.A04;
            view2.setElevation(view2.getContext().getResources().getDimension(R.dimen.call_control_bottom_sheet_elevation));
            this.A04.setClipToOutline(true);
            this.A04.setOutlineProvider(new C676039g(this));
        }
    }

    public final void A11() {
        Dialog dialog = ((DialogFragment) this).A03;
        if (dialog != null && dialog.getWindow() != null) {
            View decorView = ((DialogFragment) this).A03.getWindow().getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4);
        }
    }

    public final void A12() {
        ActivityC004902h A0A2 = A0A();
        if (A0A2 != null && this.A09 != null) {
            if (Build.VERSION.SDK_INT <= 24 || !A0A2.isInPictureInPictureMode()) {
                Point point = new Point();
                Rect rect = new Rect();
                ActivityC004902h A0A3 = A0A();
                if (A0A3 != null) {
                    A0A3.getWindowManager().getDefaultDisplay().getSize(point);
                    A0A().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                }
                float f = (float) (point.y - rect.top);
                this.A01 = (float) ((int) (0.75f * f));
                if (!C002001d.A3H(this.A0P.A0G())) {
                    int dimensionPixelSize = A02().getDimensionPixelSize(R.dimen.call_control_bottom_sheet_btn_stub_height);
                    CallInfo A0x = A0x();
                    if (!this.A0I || (A0x != null && !A0x.isGroupCall)) {
                        View view = this.A05;
                        if (!(view == null || view.getVisibility() == 8)) {
                            dimensionPixelSize += A02().getDimensionPixelSize(R.dimen.call_control_bottom_sheet_call_upgrade_row_height);
                        }
                        this.A09.A0C(dimensionPixelSize);
                        return;
                    }
                    int i = (int) (f * 0.6f);
                    int dimensionPixelSize2 = A02().getDimensionPixelSize(R.dimen.contact_picker_row_height);
                    BottomSheetBehavior bottomSheetBehavior = this.A09;
                    bottomSheetBehavior.A0C(((dimensionPixelSize2 >> 1) - (i % dimensionPixelSize2)) + i);
                }
            }
        }
    }

    public final void A13() {
        View view = this.A04;
        if (view != null && this.A09 != null) {
            boolean z = false;
            view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A04.getLayoutParams();
            if (this.A04.getHeight() != this.A04.getMeasuredHeight() || ((float) this.A04.getMeasuredHeight()) > this.A01) {
                marginLayoutParams.height = Math.min(this.A04.getMeasuredHeight(), (int) this.A01);
                this.A04.setLayoutParams(marginLayoutParams);
            }
            if (!this.A0I || this.A09.A07() < this.A04.getMeasuredHeight()) {
                View view2 = this.A05;
                if (view2 == null || view2.getVisibility() != 0) {
                    z = true;
                }
                this.A0G = z;
                return;
            }
            this.A09.A0C(this.A04.getMeasuredHeight());
            this.A0G = false;
        }
    }

    public final void A14() {
        Dialog dialog = ((DialogFragment) this).A03;
        if (dialog != null && dialog.getWindow() != null) {
            View decorView = ((DialogFragment) this).A03.getWindow().getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r9.A09.A0B != 4) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A15() {
        /*
            r9 = this;
            r3 = r9
            android.view.View r1 = r9.A04
            if (r1 == 0) goto L_0x0038
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r9.A09
            if (r0 == 0) goto L_0x0038
            float r1 = r1.getTranslationY()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0038
            boolean r0 = r9.A0I
            if (r0 != 0) goto L_0x001f
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r9.A09
            int r1 = r0.A0B
            r0 = 4
            r4 = 500(0x1f4, float:7.0E-43)
            if (r1 == r0) goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            r5 = 0
            android.view.View r0 = r9.A04
            float r0 = r0.getTranslationY()
            int r6 = (int) r0
            r2 = 1056964608(0x3f000000, float:0.5)
            r1 = 1068289229(0x3faccccd, float:1.35)
            r0 = 1053609165(0x3ecccccd, float:0.4)
            android.view.animation.Interpolator r8 = X.AnonymousClass0N2.A0a(r2, r1, r0)
            r7 = r5
            r3.A19(r4, r5, r6, r7, r8)
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallControlBottomSheet.A15():void");
    }

    public final void A16() {
        BottomSheetBehavior bottomSheetBehavior = this.A09;
        if (bottomSheetBehavior != null) {
            int i = bottomSheetBehavior.A0B;
            if (i == 3) {
                A1F(false);
                this.A09.A0D(4);
            } else if (!bottomSheetBehavior.A0J) {
            } else {
                if (i == 5) {
                    A14();
                    A1F(true);
                    this.A09.A0D(4);
                    return;
                }
                A11();
                this.A09.A0D(5);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r7 <= 0.0f) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A17(float r7) {
        /*
            r6 = this;
            android.app.Dialog r0 = r6.A03
            if (r0 == 0) goto L_0x0044
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x0044
            boolean r0 = r6.A0G
            r5 = 0
            r1 = 0
            if (r0 == 0) goto L_0x0015
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r4 = 1
            if (r0 > 0) goto L_0x0016
        L_0x0015:
            r4 = 0
        L_0x0016:
            android.app.Dialog r0 = r6.A03
            android.view.Window r3 = r0.getWindow()
            android.view.View r0 = r3.getDecorView()
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            if (r4 == 0) goto L_0x0034
            boolean r0 = r6.A0I
            if (r0 == 0) goto L_0x0034
            float r1 = r6.A00
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            float r1 = r1 * r7
            int r1 = java.lang.Math.round(r1)
        L_0x0034:
            r2.setAlpha(r1)
            if (r4 == 0) goto L_0x0041
            boolean r0 = r6.A0I
            if (r0 != 0) goto L_0x0041
            r0 = 1056964608(0x3f000000, float:0.5)
            float r5 = r7 * r0
        L_0x0041:
            r3.setDimAmount(r5)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallControlBottomSheet.A17(float):void");
    }

    public final void A18(int i) {
        AnonymousClass3UH r2;
        NetworkInfo networkInfo;
        CallInfo A0x = A0x();
        if (A0x == null || (r2 = this.A0D) == null || A00() == null) {
            Log.w("voip/VoipCallControlBottomSheet/failed to get call info when build call action intent");
            return;
        }
        boolean equals = VoipActivityV2.A1s.equals(r2.A00.getIntent().getAction());
        Intent intent = null;
        if (i == 0) {
            ConnectivityManager A0A2 = this.A0P.A0A();
            if (A0A2 != null) {
                networkInfo = A0A2.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (A0x.getConnectedParticipantsCount() == 8) {
                VoipErrorDialogFragment A002 = VoipErrorDialogFragment.A00(7, new AnonymousClass3UV());
                ActivityC004902h A0A3 = A0A();
                if (A0A3 != null) {
                    A002.A0u(A0A3.A04(), null);
                }
            } else {
                int i2 = 3;
                if (networkInfo == null) {
                    VoipErrorDialogFragment A003 = VoipErrorDialogFragment.A00(3, new AnonymousClass3UV());
                    ActivityC004902h A0A4 = A0A();
                    if (A0A4 != null) {
                        A003.A0u(A0A4.A04(), null);
                    }
                } else {
                    Context A004 = A00();
                    if (equals) {
                        i2 = 10;
                    }
                    intent = VoipActivityV2.A04(A004, i2, A0x.callId, true);
                }
            }
        } else if (i == 1) {
            intent = new Intent(A00(), VoipActivityV2.class);
            intent.setAction(VoipActivityV2.A1p);
            intent.putExtra("pendingCall", equals);
            intent.putExtra("call_id", A0x.callId);
            intent.setFlags(268435456);
        }
        this.A0Q.A04(A0x.callId, 27, "joinable call");
        ActivityC004902h A0A5 = A0A();
        if (A0A5 != null && intent != null) {
            A0A5.startActivity(intent);
        }
    }

    public void A19(int i, int i2, int i3, int i4, TimeInterpolator timeInterpolator) {
        BottomSheetBehavior bottomSheetBehavior;
        if (this.A04 != null && (bottomSheetBehavior = this.A09) != null) {
            if (bottomSheetBehavior.A0B != 4) {
                i = 0;
                i2 = 0;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat((float) i3, (float) i4);
            ofFloat.setInterpolator(timeInterpolator);
            ofFloat.setDuration((long) i);
            ofFloat.setStartDelay((long) i2);
            ofFloat.addUpdateListener(new AnonymousClass38X(this));
            ofFloat.start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (r3.isSelfRequestingUpgrade() != false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1A(android.content.DialogInterface r5) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallControlBottomSheet.A1A(android.content.DialogInterface):void");
    }

    public void A1B(MotionEvent motionEvent) {
        int i;
        boolean z = false;
        boolean z2 = false;
        if (this.A09.A0B == 3) {
            z2 = true;
        }
        AnonymousClass3UH r0 = this.A0D;
        if (r0 != null) {
            VoipActivityV2 voipActivityV2 = r0.A00;
            if (voipActivityV2.A1N || voipActivityV2.A0n != null) {
                z = true;
            }
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        ActivityC004902h A0A2 = A0A();
        if (A0A2 != null && !z2) {
            if (Build.VERSION.SDK_INT < 24 || A0A2 == null || !A0A2.isInMultiWindowMode()) {
                i = 25;
                int identifier = A02().getIdentifier("status_bar_height", "dimen", "android");
                if (identifier > 0) {
                    i = A02().getDimensionPixelSize(identifier);
                }
            } else {
                i = 0;
            }
            motionEvent.setLocation(x, ((float) i) + y);
            A0A().dispatchTouchEvent(motionEvent);
        }
        if (!z && !this.A0K.onTouchEvent(motionEvent) && motionEvent.getAction() == 1) {
            VoipCallControlBottomSheetDragIndicator voipCallControlBottomSheetDragIndicator = this.A0E;
            if (voipCallControlBottomSheetDragIndicator != null) {
                float top = ((float) this.A04.getTop()) - y;
                if (voipCallControlBottomSheetDragIndicator.A01 == 0) {
                    voipCallControlBottomSheetDragIndicator.A01 = voipCallControlBottomSheetDragIndicator.getResources().getDimensionPixelSize(R.dimen.call_control_drag_indicator_touch_area_top_offset);
                }
                if (x >= ((float) voipCallControlBottomSheetDragIndicator.getLeft()) && x <= ((float) voipCallControlBottomSheetDragIndicator.getRight()) && top <= ((float) voipCallControlBottomSheetDragIndicator.A01) && voipCallControlBottomSheetDragIndicator.performClick()) {
                    return;
                }
            }
            A16();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r13.isInLonelyState() != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        if (r13.isEitherSideRequestingUpgrade() != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c5, code lost:
        if (com.whatsapp.voipcalling.Voip.A0B(r13.callState) == false) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1C(com.whatsapp.voipcalling.CallInfo r13) {
        /*
        // Method dump skipped, instructions count: 328
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallControlBottomSheet.A1C(com.whatsapp.voipcalling.CallInfo):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r7.isSelfRequestingUpgrade() != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1D(com.whatsapp.voipcalling.CallInfo r7) {
        /*
            r6 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r6.A09
            if (r1 == 0) goto L_0x004b
            if (r7 == 0) goto L_0x004b
            X.3UH r0 = r6.A0D
            if (r0 == 0) goto L_0x004b
            r0 = 4
            r1.A0D(r0)
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r6.A09
            boolean r0 = r6.A0I
            if (r0 != 0) goto L_0x001f
            boolean r0 = r7.videoEnabled
            if (r0 == 0) goto L_0x001f
            boolean r1 = r7.isSelfRequestingUpgrade()
            r0 = 1
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r2.A0J = r0
            r6.A1C(r7)
            r6.A12()
            r6.A13()
            X.3UH r5 = r6.A0D
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r6.A09
            int r4 = r0.A0B
            r3 = 5
            r2 = 1
            r1 = 0
            r0 = 0
            if (r4 == r3) goto L_0x0038
            r0 = 1
        L_0x0038:
            r5.A01(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r6.A08
            if (r0 == 0) goto L_0x0042
            r0.A0X(r1)
        L_0x0042:
            boolean r0 = r7.isGroupCall
            r0 = r0 ^ r2
            r6.A1F(r0)
            r6.A15()
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallControlBottomSheet.A1D(com.whatsapp.voipcalling.CallInfo):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r15.A0A == null) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1E(com.whatsapp.voipcalling.CallInfo r16, boolean r17) {
        /*
        // Method dump skipped, instructions count: 285
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallControlBottomSheet.A1E(com.whatsapp.voipcalling.CallInfo, boolean):void");
    }

    public final void A1F(boolean z) {
        BottomSheetBehavior bottomSheetBehavior;
        View view = this.A04;
        if (view != null && (bottomSheetBehavior = this.A09) != null && !this.A0I) {
            float A072 = ((float) bottomSheetBehavior.A07()) * 0.07f;
            if (z) {
                A072 = -A072;
            }
            view.setTranslationY(A072);
        }
    }

    public final void A1G(boolean z) {
        View view = this.A05;
        if (view != null && this.A09 != null && this.A0E != null) {
            int i = 0;
            boolean z2 = false;
            if (view.getVisibility() == 0) {
                z2 = true;
            }
            if (z != z2) {
                View view2 = this.A05;
                int i2 = 8;
                if (z) {
                    i2 = 0;
                }
                view2.setVisibility(i2);
                VoipCallControlBottomSheetDragIndicator voipCallControlBottomSheetDragIndicator = this.A0E;
                if (z) {
                    i = 8;
                }
                voipCallControlBottomSheetDragIndicator.setVisibility(i);
                this.A09.A0J = !z;
                A12();
                if (z) {
                    this.A09.A0D(4);
                }
            }
        }
    }

    public boolean A1H() {
        int i = ((DialogFragment) this).A02;
        if (i == 0) {
            Bundle bundle = ((AnonymousClass037) this).A06;
            if (bundle == null) {
                throw null;
            } else if (bundle.getBoolean("is_video_call", false)) {
                return true;
            } else {
                return false;
            }
        } else if (i == R.style.VoipCallControlVideoBottomSheet) {
            return true;
        } else {
            return false;
        }
    }
}
