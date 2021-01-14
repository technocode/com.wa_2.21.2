package X;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.search.verification.client.R;
import com.whatsapp.BoundedLinearLayout;
import com.whatsapp.components.CircularRevealView;
import com.whatsapp.conversation.ConversationAttachmentContentView;
import java.lang.ref.WeakReference;

/* renamed from: X.2HD  reason: invalid class name */
public class AnonymousClass2HD extends PopupWindow {
    public int A00;
    public int A01;
    public ViewTreeObserver.OnGlobalLayoutListener A02 = new AnonymousClass2HA(this);
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final View A07;
    public final FrameLayout.LayoutParams A08;
    public final FrameLayout A09;
    public final BoundedLinearLayout A0A;
    public final AnonymousClass02M A0B;
    public final CircularRevealView A0C;
    public final ConversationAttachmentContentView A0D;
    public final C06170Sb A0E;
    public final WeakReference A0F;

    public AnonymousClass2HD(Activity activity, AnonymousClass02M r8, C06170Sb r9, View view, AnonymousClass02N r11, boolean z, AnonymousClass2Z6 r13) {
        super(activity);
        this.A0B = r8;
        this.A0E = r9;
        this.A07 = view;
        this.A0F = new WeakReference(activity);
        AnonymousClass2HB r1 = new AnonymousClass2HB(this, activity, activity);
        this.A09 = r1;
        r1.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        activity.getLayoutInflater().inflate(R.layout.attachment_picker, (ViewGroup) this.A09, true);
        this.A0C = (CircularRevealView) AnonymousClass0Q7.A0D(this.A09, R.id.paper_clip_layout);
        this.A0A = (BoundedLinearLayout) AnonymousClass0Q7.A0D(this.A09, R.id.content);
        this.A08 = (FrameLayout.LayoutParams) this.A0C.getLayoutParams();
        this.A06 = this.A0C.getResources().getDimensionPixelSize(R.dimen.attach_popup_bottom_padding_old);
        this.A0C.setVisibility(0);
        setContentView(this.A09);
        setBackgroundDrawable(new BitmapDrawable());
        setWidth(-1);
        setHeight(-2);
        setAnimationStyle(0);
        setTouchable(true);
        setFocusable(true);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        setTouchInterceptor(new View$OnTouchListenerC47202Gw(this, activity));
        ConversationAttachmentContentView conversationAttachmentContentView = (ConversationAttachmentContentView) AnonymousClass0Q7.A0D(this.A0C, R.id.conversation_content_view);
        this.A0D = conversationAttachmentContentView;
        conversationAttachmentContentView.A0A = r11;
        conversationAttachmentContentView.A0C = z;
        conversationAttachmentContentView.A09 = r13;
        conversationAttachmentContentView.A06();
    }

    public static final AnimationSet A00(int i, boolean z, boolean z2) {
        float f = 0.0f;
        float f2 = 1.0f;
        float f3 = 0.0f;
        if (z2) {
            f2 = 0.0f;
            f3 = 1.0f;
        }
        float f4 = (float) i;
        float f5 = 0.0f;
        if (z) {
            f5 = 1.0f;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 0, f4, 1, f5);
        if (!z2) {
            f = 1.0f;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, 1.0f - f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(300);
        return animationSet;
    }

    public static void A01(AnonymousClass2HD r2) {
        r2.A0C.A01(false);
        super.dismiss();
    }

    public final int A02(Activity activity) {
        int measuredHeight;
        int measuredHeight2;
        FrameLayout frameLayout = this.A09;
        frameLayout.measure(0, 0);
        View view = this.A07;
        view.measure(0, 0);
        if (C06170Sb.A01(view) && (Build.VERSION.SDK_INT < 24 || !activity.isInMultiWindowMode())) {
            return 0;
        }
        ConversationAttachmentContentView conversationAttachmentContentView = this.A0D;
        if (conversationAttachmentContentView.A0D) {
            measuredHeight = view.getMeasuredHeight();
            measuredHeight2 = conversationAttachmentContentView.A01(view);
        } else {
            measuredHeight = view.getMeasuredHeight();
            measuredHeight2 = frameLayout.getMeasuredHeight();
        }
        return -(measuredHeight2 + measuredHeight);
    }

    public void A03() {
        A04();
        this.A0C.A01(false);
        super.dismiss();
    }

    public final void A04() {
        if (this.A04) {
            this.A04 = false;
            this.A09.getViewTreeObserver().removeOnGlobalLayoutListener(this.A02);
        }
    }

    public final void A05() {
        int[] iArr = new int[2];
        this.A07.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        CircularRevealView circularRevealView = this.A0C;
        circularRevealView.getLocationOnScreen(iArr2);
        int i = (iArr[0] + this.A00) - iArr2[0];
        if (this.A03) {
            int measuredHeight = this.A09.getMeasuredHeight();
            circularRevealView.A01 = i;
            circularRevealView.A02 = measuredHeight;
        } else {
            circularRevealView.A01 = i;
            circularRevealView.A02 = 0;
        }
        if (this.A05) {
            FrameLayout frameLayout = this.A09;
            circularRevealView.A01 = frameLayout.getMeasuredWidth() / 2;
            circularRevealView.A02 = frameLayout.getMeasuredHeight() / 2;
        }
    }

    public /* synthetic */ void A06() {
        super.dismiss();
    }

    public final void A07(Activity activity, boolean z, int i, int i2) {
        int i3;
        BoundedLinearLayout boundedLinearLayout;
        ConversationAttachmentContentView conversationAttachmentContentView;
        CircularRevealView circularRevealView;
        FrameLayout.LayoutParams layoutParams;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        this.A03 = z;
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.A05 = false;
        int[] iArr = new int[2];
        View view = this.A07;
        view.getLocationOnScreen(iArr);
        int height = view.getHeight() + iArr[1];
        this.A01 = iArr[0];
        if (Build.VERSION.SDK_INT < 28 || (rootWindowInsets = view.getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            i3 = 0;
        } else {
            i3 = displayCutout.getSafeInsetTop();
        }
        if (!z) {
            boundedLinearLayout = this.A0A;
            boundedLinearLayout.A00 = Integer.MAX_VALUE;
            boundedLinearLayout.A01 = Integer.MAX_VALUE;
            circularRevealView = this.A0C;
            circularRevealView.setPadding(circularRevealView.getPaddingLeft(), circularRevealView.getPaddingTop(), circularRevealView.getPaddingRight(), 0);
            conversationAttachmentContentView = this.A0D;
            if (conversationAttachmentContentView.A0D) {
                conversationAttachmentContentView.A06 = 0;
                layoutParams = this.A08;
                layoutParams.height = -1;
                int i4 = height + i2;
                boundedLinearLayout.getLayoutParams().height = (point.y + i3) - i4;
                showAtLocation(view, 8388661, 0, i4);
            } else if (defaultDisplay.getRotation() == 0 || defaultDisplay.getRotation() == 2) {
                layoutParams = this.A08;
                layoutParams.height = -1;
                int i5 = height + i2;
                boundedLinearLayout.getLayoutParams().height = (point.y + i3) - i5;
                showAtLocation(view, 8388661, 0, i5);
            } else {
                FrameLayout frameLayout = this.A09;
                frameLayout.measure(0, 0);
                boundedLinearLayout.getLayoutParams().height = -2;
                layoutParams = this.A08;
                layoutParams.height = -2;
                showAtLocation(view, 8388661, 0, (point.y / 2) - (frameLayout.getMeasuredHeight() / 2));
                this.A05 = true;
            }
        } else {
            boundedLinearLayout = this.A0A;
            conversationAttachmentContentView = this.A0D;
            boundedLinearLayout.A00 = conversationAttachmentContentView.A01(view);
            boundedLinearLayout.A01 = conversationAttachmentContentView.A00(view);
            circularRevealView = this.A0C;
            circularRevealView.setPadding(circularRevealView.getPaddingLeft(), circularRevealView.getPaddingTop(), circularRevealView.getPaddingRight(), this.A06);
            boundedLinearLayout.getLayoutParams().height = -2;
            layoutParams = this.A08;
            layoutParams.height = -2;
            if (conversationAttachmentContentView.A0D) {
                conversationAttachmentContentView.A06 = conversationAttachmentContentView.getResources().getDimensionPixelOffset(R.dimen.attach_popup_corner_radius);
            }
            if (Build.VERSION.SDK_INT >= 19) {
                showAsDropDown(view, 0, i2, 8388661);
            } else {
                showAsDropDown(view, 0, i2);
            }
        }
        circularRevealView.forceLayout();
        circularRevealView.A04 = i;
        if (z || (this.A05 && !conversationAttachmentContentView.A0D)) {
            boundedLinearLayout.measure(0, 0);
            int measuredWidth = boundedLinearLayout.getMeasuredWidth();
            int dimensionPixelSize = (int) (((float) point.x) - (((C002301g.A0K.A00 * 4.0f) + ((float) (activity.getResources().getDimensionPixelSize(R.dimen.input_layout_buttons_positioning_margin) + (activity.getResources().getDimensionPixelSize(R.dimen.input_layout_buttons_size) + activity.getResources().getDimensionPixelSize(R.dimen.input_layout_buttons_margin))))) * 2.0f));
            if ((defaultDisplay.getRotation() == 1 || defaultDisplay.getRotation() == 3) && dimensionPixelSize > measuredWidth) {
                layoutParams.width = dimensionPixelSize;
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            } else {
                layoutParams.width = -1;
                int dimensionPixelSize2 = activity.getResources().getDimensionPixelSize(R.dimen.attach_popup_horizontal_margin);
                layoutParams.rightMargin = dimensionPixelSize2;
                layoutParams.leftMargin = dimensionPixelSize2;
            }
            boundedLinearLayout.setBackgroundDrawable(C004302a.A03(activity, R.drawable.ib_attach_panel));
        } else {
            layoutParams.width = -1;
            if (conversationAttachmentContentView.A0D) {
                circularRevealView.setBackgroundColor(C004302a.A00(activity, R.color.attachmentPickerBackgroundColor));
            } else {
                circularRevealView.setBackgroundColor(C004302a.A00(activity, R.color.primary_surface));
            }
            circularRevealView.A03 = C004302a.A00(activity, R.color.attach_popup_background);
        }
        circularRevealView.setVisibility(0);
        circularRevealView.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2HC(this, z, i));
        if (i > 0) {
            conversationAttachmentContentView.A07(i, z);
        }
    }

    public void dismiss() {
        if (isShowing()) {
            A05();
            int[] iArr = new int[2];
            this.A07.getLocationOnScreen(iArr);
            AnimationSet A002 = A00(this.A00 + iArr[0], this.A03, false);
            CircularRevealView circularRevealView = this.A0C;
            circularRevealView.A04 = 300;
            circularRevealView.A0C = false;
            int i = Build.VERSION.SDK_INT;
            if (i >= 18 || (!this.A03 && !this.A05)) {
                if (!circularRevealView.A0B) {
                    circularRevealView.A01(true);
                }
                if (i < 21 && !this.A03 && !this.A05) {
                    this.A0A.startAnimation(A002);
                }
            } else if (!circularRevealView.A0B) {
                circularRevealView.A00();
                circularRevealView.setBackgroundColor(0);
                A002.setDuration((long) circularRevealView.A04);
                A002.setAnimationListener(circularRevealView.A09);
                circularRevealView.startAnimation(A002);
            }
        }
        A04();
        AnonymousClass02M r4 = this.A0B;
        r4.A02.postDelayed(new RunnableEBaseShape8S0100000_I1_3(this, 46), 300);
    }
}
