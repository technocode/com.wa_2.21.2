package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.util.Log;

/* renamed from: X.2I2  reason: invalid class name */
public abstract class AnonymousClass2I2 extends ViewGroup {
    public static Rect A0Y = new Rect();
    public static Drawable A0Z;
    public static Drawable A0a;
    public static final Rect A0b = new Rect();
    public static final Rect A0c = new Rect();
    public static final Rect A0d = new Rect();
    public float A00;
    public int A01 = -1;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public Paint A07;
    public Rect A08 = new Rect();
    public Drawable A09;
    public Drawable A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public ImageView A0E;
    public ImageView A0F;
    public ImageView A0G;
    public AbstractC007503q A0H;
    public boolean A0I;
    public boolean A0J = true;
    public boolean A0K;
    public boolean A0L;
    public final int A0M;
    public final Drawable A0N;
    public final Drawable A0O;
    public final Drawable A0P;
    public final Drawable A0Q;
    public final Drawable A0R;
    public final AnonymousClass2IC A0S;
    public final C51822a5 A0T;
    public final AnonymousClass03P A0U;
    public final AnonymousClass01X A0V;
    public final C02770Dj A0W;
    public final C04370Kc A0X;

    public boolean A0E() {
        return false;
    }

    public int getBubbleAlpha() {
        return 255;
    }

    public abstract int getCenteredLayoutId();

    public abstract int getIncomingLayoutId();

    public int getMainChildMaxWidth() {
        return 0;
    }

    public abstract int getOutgoingLayoutId();

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public AnonymousClass2I2(Context context, AbstractC007503q r6) {
        super(context);
        C04370Kc A002;
        C02770Dj A003;
        AnonymousClass03P A004;
        AnonymousClass01X A005;
        AnonymousClass2IC A006;
        int incomingLayoutId;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = C04370Kc.A00();
        }
        this.A0X = A002;
        if (isInEditMode()) {
            A003 = null;
        } else {
            A003 = C02770Dj.A00();
        }
        this.A0W = A003;
        if (isInEditMode()) {
            A004 = null;
        } else {
            A004 = AnonymousClass03P.A00();
        }
        this.A0U = A004;
        if (isInEditMode()) {
            A005 = null;
        } else {
            A005 = AnonymousClass01X.A00();
        }
        this.A0V = A005;
        if (!isInEditMode()) {
            AnonymousClass0ET.A00();
        }
        if (isInEditMode()) {
            A006 = null;
        } else {
            A006 = AnonymousClass2IC.A00();
        }
        this.A0S = A006;
        this.A0H = r6;
        AbstractC43421yL rowsContainer = getRowsContainer();
        if (rowsContainer != null) {
            this.A0T = rowsContainer.A5U();
        } else {
            AnonymousClass2IC r0 = this.A0S;
            if (r0 != null) {
                this.A0T = r0.A01;
            } else {
                this.A0T = null;
            }
        }
        Drawable A032 = C004302a.A03(context, R.drawable.balloon_outgoing_normal);
        if (A032 != null) {
            this.A0R = A032;
            Drawable A033 = C004302a.A03(context, R.drawable.balloon_outgoing_normal_ext);
            if (A033 != null) {
                this.A0Q = A033;
                Drawable A034 = C004302a.A03(context, R.drawable.balloon_incoming_normal);
                if (A034 != null) {
                    this.A0P = A034;
                    Drawable A035 = C004302a.A03(context, R.drawable.balloon_incoming_normal_ext);
                    if (A035 != null) {
                        this.A0O = A035;
                        Drawable A036 = C004302a.A03(context, R.drawable.balloon_centered_normal);
                        if (A036 != null) {
                            this.A0N = A036;
                            this.A0R.getPadding(A0d);
                            this.A0P.getPadding(A0c);
                            this.A0P.getPadding(A0b);
                            boolean z = r6.A0n.A02;
                            if (z) {
                                incomingLayoutId = getOutgoingLayoutId();
                            } else {
                                incomingLayoutId = getIncomingLayoutId();
                            }
                            if (LayoutInflater.from(getContext()).inflate(A01() ? getCenteredLayoutId() : incomingLayoutId, (ViewGroup) this, true) != null) {
                                this.A0C = getChildAt(0);
                                this.A0M = (int) (((double) ViewConfiguration.get(context).getScaledTouchSlop()) * 1.8d);
                                if (A0Z == null) {
                                    A0Z = C004302a.A03(getContext(), R.drawable.ic_action_reply).mutate();
                                }
                                if (A0a == null) {
                                    A0a = C004302a.A03(getContext(), R.drawable.forward_background).mutate();
                                    return;
                                }
                                return;
                            }
                            StringBuilder A0S2 = AnonymousClass008.A0S("rootview for conversationRow is null, rightLayout=");
                            A0S2.append(z);
                            throw new RuntimeException(A0S2.toString());
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public boolean A00() {
        AbstractC51572Zg r4 = (AbstractC51572Zg) this;
        Context A0O2 = C002001d.A0O(r4.getContext());
        if (!(A0O2 instanceof Conversation) || ((Conversation) A0O2).A1I() || !r4.A0f() || r4.getMessageCount() != 1 || !AnonymousClass0FI.A0P(r4.A0e, r4.A0r, r4.getFMessage()) || ((AnonymousClass2I2) r4).A0C == null) {
            return false;
        }
        return true;
    }

    public boolean A01() {
        if ((this instanceof C59262nL) || (this instanceof C59252nK) || (this instanceof C59232nI)) {
            return false;
        }
        if (this instanceof C59222nH) {
            return true;
        }
        if ((this instanceof C59212nG) || (this instanceof C59202nF) || (this instanceof C59192nE) || (this instanceof C59182nD) || (this instanceof C59172nC) || (this instanceof C59152nA) || (this instanceof C59142n9) || (this instanceof C60442pR) || (this instanceof C60372pK) || (this instanceof C59132n7) || (this instanceof C59122n6) || (this instanceof C59112n5)) {
            return false;
        }
        if (this instanceof C59102n4) {
            return true;
        }
        if (this instanceof C59092n3) {
            return false;
        }
        if (this instanceof C59082n1) {
            return ((C59082n1) this) instanceof C60402pN;
        }
        if ((this instanceof C59072n0) || (this instanceof C59062mz) || (this instanceof C59052my) || (this instanceof C60462pT) || (this instanceof C60452pS) || (this instanceof C60432pQ) || (this instanceof C60422pP) || (this instanceof C60382pL) || (this instanceof C60362pJ) || (this instanceof C60352pI) || (this instanceof C60342pH)) {
            return false;
        }
        C60332pG r1 = (C60332pG) this;
        if ((r1 instanceof AnonymousClass2r2) || (r1 instanceof C60782qD)) {
            return true;
        }
        return false;
    }

    public final boolean A02(MotionEvent motionEvent) {
        this.A06 = (int) motionEvent.getX();
        boolean z = false;
        this.A0L = false;
        if (this.A05 == 2) {
            this.A05 = 1;
            post(new RunnableEBaseShape9S0100000_I1_4(this, 3));
            invalidate();
            z = true;
        }
        this.A04 = (int) this.A0C.getTranslationX();
        this.A0C.animate().cancel();
        return z;
    }

    public final boolean A03(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        if (this.A05 != 1 && Math.abs(x - this.A06) > this.A0M) {
            this.A05 = 1;
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            cancelLongPress();
            setPressed(false);
        }
        if (this.A05 != 1) {
            return false;
        }
        int max = Math.max(0, ((this.A04 + x) - this.A06) - this.A0M);
        float max2 = (float) Math.max(0, max - (getWidth() / 6));
        int min = Math.min(max, getWidth() / 6);
        double d = (double) max2;
        int width = min + ((int) (d / (((0.75d * d) / ((double) (getWidth() / 6))) + 1.0d)));
        this.A0C.setTranslationX((float) width);
        if (width > getWidth() / 6 && !this.A0L) {
            try {
                if (Settings.System.getInt(getContext().getContentResolver(), "haptic_feedback_enabled") != 0) {
                    C008805h.A1E(this.A0U);
                }
            } catch (Settings.SettingNotFoundException e) {
                Log.e("swipetoreply/vibrate", e);
            }
            this.A0L = true;
        }
        invalidate();
        return true;
    }

    public int A0A() {
        return this.A0C.getBottom();
    }

    public int A0B() {
        return this.A0C.getTop();
    }

    public boolean A0C() {
        if (this instanceof C59242nJ) {
            return ((C59242nJ) this).A0l();
        }
        if ((this instanceof C59062mz) || (this instanceof C59052my)) {
            return true;
        }
        if (this instanceof C60432pQ) {
            return AnonymousClass0FI.A0r(((AbstractC59162nB) this).getFMessage());
        }
        if (this instanceof C60422pP) {
            return AnonymousClass0FI.A0r(((AbstractC59162nB) this).getFMessage());
        }
        if (!(this instanceof C60382pL)) {
            return false;
        }
        return AnonymousClass0FI.A0r(((AbstractC59162nB) this).getFMessage());
    }

    public boolean A0D() {
        if (this instanceof C59262nL) {
            return AnonymousClass0FI.A0j(getFMessage());
        }
        if (this instanceof C59132n7) {
            return AnonymousClass0FI.A0j(getFMessage());
        }
        if (this instanceof C59062mz) {
            return AnonymousClass0FI.A0j(getFMessage());
        }
        if (this instanceof C59052my) {
            return AnonymousClass0FI.A0j(getFMessage());
        }
        if (!(this instanceof AbstractC59032mw)) {
            return false;
        }
        return AnonymousClass0FI.A0j(getFMessage());
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public int getBubbleMarginStart() {
        return C002301g.A0K.A06;
    }

    private int getBubbleSwipeOffset() {
        View view = this.A0C;
        if (view != null) {
            return (int) view.getTranslationX();
        }
        return 0;
    }

    private float getBubbleWidth() {
        int i;
        int i2;
        int i3;
        if (A01()) {
            i3 = 0;
        } else {
            if (this.A0H.A0n.A02) {
                Rect rect = A0d;
                i = rect.left;
                i2 = rect.right;
            } else {
                Rect rect2 = A0c;
                i = rect2.left;
                i2 = rect2.right;
            }
            i3 = i2 + i;
        }
        return (float) (getContentWidth() + i3);
    }

    public int getContentWidth() {
        return this.A0C.getMeasuredWidth();
    }

    public AbstractC007503q getFMessage() {
        return this.A0H;
    }

    public ImageView getQuickActionButton() {
        if (A0D()) {
            return this.A0F;
        }
        if (A0E()) {
            return this.A0G;
        }
        if (A0C()) {
            return this.A0E;
        }
        return null;
    }

    public AbstractC43421yL getRowsContainer() {
        Context A0O2 = C002001d.A0O(getContext());
        if (A0O2 instanceof AbstractC43421yL) {
            return (AbstractC43421yL) A0O2;
        }
        return null;
    }

    private int getSwipeReplyActivationThreshold() {
        return getWidth() / 6;
    }

    public void onDraw(Canvas canvas) {
        boolean z;
        byte b;
        int i;
        Drawable drawable;
        int i2;
        Drawable drawable2;
        Drawable drawable3;
        boolean A0M2;
        boolean z2;
        View view;
        if (this.A0K) {
            if (this.A0A == null) {
                this.A0A = getResources().getDrawable(R.drawable.album_card_top);
            }
            if (this.A09 == null) {
                this.A09 = getResources().getDrawable(R.drawable.album_card_bottom);
            }
            this.A0A.setBounds(0, getPaddingTop() - this.A0A.getIntrinsicHeight(), getWidth(), getPaddingTop());
            this.A0A.draw(canvas);
            this.A09.setBounds(0, getHeight() - getPaddingBottom(), getWidth(), this.A09.getIntrinsicHeight() + (getHeight() - getPaddingBottom()));
            this.A09.draw(canvas);
            super.onDraw(canvas);
            return;
        }
        float f = this.A00;
        if (f > 0.0f) {
            int i3 = this.A0T.A00;
            int i4 = (((int) (((float) (i3 >> 24)) * f)) << 24) | (i3 & 16777215);
            Paint paint = this.A07;
            if (paint == null) {
                paint = new Paint(1);
                this.A07 = paint;
            }
            paint.setColor(i4);
            int i5 = this.A03;
            Rect rect = A0d;
            canvas.drawRect(0.0f, (float) ((i5 - rect.top) - C002301g.A0K.A0F), (float) getWidth(), (float) (this.A02 + rect.bottom + C002301g.A0K.A0E), this.A07);
        }
        if (isSelected() || (((view = this.A0D) == null || view.getVisibility() != 0) && (isPressed() || isFocused() || this.A0I))) {
            z = true;
            C51822a5 r3 = this.A0T;
            if (!(r3 instanceof C59272nN)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), r3.A01);
                z = false;
            }
        } else {
            z = false;
        }
        AbstractC007503q r2 = this.A0H;
        int i6 = r2.A08;
        if (i6 == -1 || ((i6 == 6 && r2.A0m != 8) || (b = r2.A0m) == 21 || b == 22 || b == 36)) {
            Rect rect2 = this.A08;
            int i7 = this.A03;
            Rect rect3 = A0d;
            rect2.set(0, i7 - rect3.top, getWidth(), this.A02 + rect3.bottom);
        } else {
            int bubbleWidth = (int) getBubbleWidth();
            if (A01()) {
                int width = (getWidth() - bubbleWidth) / 2;
                Rect rect4 = this.A08;
                Rect rect5 = A0b;
                rect4.set(width - rect5.left, this.A03 - rect5.top, width + bubbleWidth, this.A02 + rect5.bottom);
                if (z) {
                    drawable3 = C004302a.A03(getContext(), R.drawable.balloon_centered_pressed);
                    if (drawable3 == null) {
                        throw null;
                    }
                } else {
                    drawable3 = this.A0N;
                }
                this.A08.offset(getBubbleMarginStart(), 0);
                if (drawable3 != null && this.A0J) {
                    drawable3.setDither(true);
                    drawable3.setBounds(this.A08);
                    C51822a5 r8 = this.A0T;
                    if (!(r8 instanceof C59272nN)) {
                        A0M2 = r8.A04.A02().A06;
                    } else {
                        A0M2 = r8.A04.A0M();
                    }
                    if (A0M2) {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, this.A08.exactCenterX(), 0.0f);
                        drawable3.draw(canvas);
                        canvas.restore();
                    } else {
                        drawable3.draw(canvas);
                    }
                }
            } else if (this.A0H.A0n.A02) {
                boolean A002 = this.A0T.A00();
                Rect rect6 = this.A08;
                if (A002) {
                    i2 = getWidth() - bubbleWidth;
                } else {
                    i2 = 0;
                }
                int i8 = this.A03;
                Rect rect7 = A0d;
                int i9 = i8 - rect7.top;
                if (A002) {
                    bubbleWidth = getWidth();
                }
                rect6.set(i2, i9, bubbleWidth, this.A02 + rect7.bottom);
                int i10 = this.A01;
                if (i10 == 2 || i10 == 3) {
                    if (z) {
                        drawable2 = C004302a.A03(getContext(), R.drawable.balloon_outgoing_pressed_ext);
                        if (drawable2 == null) {
                            throw null;
                        }
                    } else {
                        drawable2 = this.A0Q;
                    }
                } else if (z) {
                    drawable2 = C004302a.A03(getContext(), R.drawable.balloon_outgoing_pressed);
                    if (drawable2 == null) {
                        throw null;
                    }
                } else {
                    drawable2 = this.A0R;
                }
                Rect rect8 = this.A08;
                int bubbleMarginStart = getBubbleMarginStart();
                if (A002) {
                    bubbleMarginStart = -bubbleMarginStart;
                }
                rect8.offset(bubbleMarginStart + getBubbleSwipeOffset(), 0);
                if (drawable2 != null) {
                    drawable2.setAlpha(getBubbleAlpha());
                    drawable2.setDither(true);
                    drawable2.setBounds(this.A08);
                    if (!A002) {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, this.A08.exactCenterX(), 0.0f);
                        drawable2.draw(canvas);
                        canvas.restore();
                    } else {
                        drawable2.draw(canvas);
                    }
                }
            } else {
                boolean z3 = !this.A0V.A0M();
                Rect rect9 = this.A08;
                if (z3) {
                    i = getWidth() - bubbleWidth;
                } else {
                    i = 0;
                }
                int i11 = this.A03;
                Rect rect10 = A0c;
                int i12 = i11 - rect10.top;
                if (z3) {
                    bubbleWidth = getWidth();
                }
                rect9.set(i, i12, bubbleWidth, this.A02 + rect10.bottom);
                int i13 = this.A01;
                if (i13 == 2 || i13 == 3) {
                    if (z) {
                        drawable = C004302a.A03(getContext(), R.drawable.balloon_incoming_pressed_ext);
                        if (drawable == null) {
                            throw null;
                        }
                    } else {
                        drawable = this.A0O;
                    }
                } else if (z) {
                    drawable = C004302a.A03(getContext(), R.drawable.balloon_incoming_pressed);
                    if (drawable == null) {
                        throw null;
                    }
                } else {
                    drawable = this.A0P;
                }
                Rect rect11 = this.A08;
                int bubbleMarginStart2 = getBubbleMarginStart();
                if (z3) {
                    bubbleMarginStart2 = -bubbleMarginStart2;
                }
                rect11.offset(bubbleMarginStart2 + getBubbleSwipeOffset(), 0);
                if (drawable != null) {
                    drawable.setAlpha(getBubbleAlpha());
                    drawable.setBounds(this.A08);
                    drawable.setDither(true);
                    if (!z3) {
                        drawable.draw(canvas);
                    } else {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, this.A08.exactCenterX(), 0.0f);
                        drawable.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (this.A05 > 0) {
                float bubbleSwipeOffset = ((float) getBubbleSwipeOffset()) / ((float) (getWidth() / 6));
                int min = Math.min(getBubbleSwipeOffset(), getWidth() / 6);
                int top = this.A0C.getTop();
                int bottom = this.A0C.getBottom();
                int dimension = (int) getResources().getDimension(R.dimen.forward_button_padding);
                A0a.getPadding(A0Y);
                int i14 = (top + bottom) / 2;
                A0a.setBounds(((min - A0Z.getIntrinsicWidth()) - dimension) - A0Y.right, (i14 - (A0Z.getIntrinsicHeight() / 2)) - dimension, (min + dimension) - A0Y.right, (A0Z.getIntrinsicHeight() / 2) + i14 + dimension);
                Drawable drawable4 = A0Z;
                drawable4.setBounds((min - drawable4.getIntrinsicWidth()) - A0Y.right, i14 - (A0Z.getIntrinsicHeight() / 2), min - A0Y.right, (A0Z.getIntrinsicHeight() / 2) + i14);
                Drawable drawable5 = A0a;
                int min2 = (int) (Math.min(1.0f, 2.0f * bubbleSwipeOffset) * 255.0f);
                drawable5.setAlpha(min2);
                A0Z.setAlpha(min2);
                A0a.draw(canvas);
                A0Z.draw(canvas);
                ImageView quickActionButton = getQuickActionButton();
                if (quickActionButton != null) {
                    quickActionButton.setTranslationX(this.A0C.getTranslationX());
                    quickActionButton.setAlpha(Math.max(0.0f, 1.0f - (bubbleSwipeOffset * 4.0f)));
                }
                if (this.A05 == 2) {
                    invalidate();
                }
            }
        }
        super.onDraw(canvas);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (A00()) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 2 && A03(motionEvent)) {
                    return true;
                }
            } else if (A02(motionEvent)) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        int paddingLeft;
        int i8;
        int paddingTop = getPaddingTop();
        View view = this.A0B;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0B.getLayoutParams();
            int i9 = paddingTop + marginLayoutParams.topMargin;
            int measuredWidth = this.A0B.getMeasuredWidth();
            int measuredHeight = this.A0B.getMeasuredHeight();
            int measuredWidth2 = (getMeasuredWidth() - measuredWidth) >> 1;
            this.A0B.layout(measuredWidth2, i9, measuredWidth + measuredWidth2, i9 + measuredHeight);
            paddingTop = i9 + measuredHeight + marginLayoutParams.bottomMargin;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A0C.getLayoutParams();
        int i10 = paddingTop + marginLayoutParams2.topMargin;
        AbstractC007503q r4 = this.A0H;
        if (r4.A08 == 6 && r4.A0m != 8) {
            i7 = (getMeasuredWidth() - this.A0C.getMeasuredWidth()) >> 1;
        } else if (A01()) {
            i7 = (getMeasuredWidth() - this.A0C.getMeasuredWidth()) >> 1;
        } else {
            if (!(this.A0T instanceof C59272nN)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 || !this.A0H.A0n.A02) {
                if (this.A0H.A0n.A02 == this.A0V.A0M()) {
                    i5 = (getMeasuredWidth() - getPaddingRight()) - marginLayoutParams2.rightMargin;
                    i6 = this.A0C.getMeasuredWidth();
                    i7 = i5 - i6;
                } else {
                    paddingLeft = getPaddingLeft();
                    i8 = marginLayoutParams2.leftMargin;
                }
            } else if (this.A0V.A0M()) {
                paddingLeft = getPaddingLeft();
                i8 = marginLayoutParams2.rightMargin;
            } else {
                i5 = (getMeasuredWidth() - getPaddingRight()) - marginLayoutParams2.leftMargin;
                i6 = this.A0C.getMeasuredWidth();
                i7 = i5 - i6;
            }
            i7 = i8 + paddingLeft;
        }
        View view2 = this.A0C;
        view2.layout(i7, i10, view2.getMeasuredWidth() + i7, this.A0C.getMeasuredHeight() + i10);
        this.A03 = A0B();
        this.A02 = A0A();
    }

    public void onMeasure(int i, int i2) {
        int mainChildMaxWidth;
        boolean z;
        int i3 = i;
        int i4 = i2;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        View view = this.A0B;
        int i5 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0B.getLayoutParams();
            int i6 = marginLayoutParams.height;
            if (i6 < 0) {
                i6 = i4;
                if (mode2 != 0) {
                    i6 = View.MeasureSpec.makeMeasureSpec(size2 - paddingBottom, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                }
            }
            int i7 = marginLayoutParams.width;
            if (i7 < 0) {
                if (mode != 0) {
                    if (!(this.A0T instanceof C59272nN)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i8 = paddingRight;
                    if (!z) {
                        i8 = 0;
                    }
                    int i9 = ((size - i8) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
                    int i10 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    if (i7 == -1) {
                        i10 = 1073741824;
                    }
                    i7 = View.MeasureSpec.makeMeasureSpec(i9, i10);
                } else {
                    i7 = i3;
                }
            }
            this.A0B.measure(i7, i6);
            paddingBottom = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + this.A0B.getMeasuredHeight() + paddingBottom;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A0C.getLayoutParams();
        int i11 = marginLayoutParams2.height;
        if (i11 >= 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        } else if (mode2 != 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(size2 - paddingBottom, mode2);
        }
        if (mode != 0) {
            int i12 = ((size - paddingRight) - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin;
            int i13 = marginLayoutParams2.width;
            if (i13 >= 0 && i13 < i12) {
                i12 = i13;
            }
            if (!this.A0K && (mainChildMaxWidth = getMainChildMaxWidth()) != 0 && i12 > mainChildMaxWidth) {
                i12 = mainChildMaxWidth;
            }
            if (marginLayoutParams2.width >= 0) {
                i5 = 1073741824;
            }
            i3 = View.MeasureSpec.makeMeasureSpec(i12, i5);
        } else {
            int i14 = marginLayoutParams2.width;
            if (i14 >= 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
            }
        }
        this.A0C.measure(i3, i4);
        setMeasuredDimension(size, this.A0C.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin + paddingBottom);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r1 != 3) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2I2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChildPressed(boolean z) {
        if (this.A0I != z) {
            this.A0I = z;
            invalidate();
        }
    }

    public void setDrawCenteredBubble(boolean z) {
        this.A0J = z;
    }

    public void setFMessage(AbstractC007503q r1) {
        this.A0H = r1;
    }
}
