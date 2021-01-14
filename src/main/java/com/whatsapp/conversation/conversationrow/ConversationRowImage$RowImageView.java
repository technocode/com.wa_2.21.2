package com.whatsapp.conversation.conversationrow;

import X.AbstractC59162nB;
import X.AnonymousClass01X;
import X.AnonymousClass0M4;
import X.AnonymousClass2ID;
import X.AnonymousClass31y;
import X.AnonymousClass35X;
import X.C002001d;
import X.C004302a;
import X.C02780Dk;
import X.C06470Tj;
import X.C08490bD;
import X.C28051Sr;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.search.verification.client.R;

public class ConversationRowImage$RowImageView extends C08490bD {
    public int A00;
    public int A01;
    public Bitmap A02;
    public Drawable A03;
    public AnonymousClass0M4 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Matrix A0B = new Matrix();
    public final RectF A0C = new RectF();
    public final RectF A0D = new RectF();
    public final AnonymousClass01X A0E;
    public final AnonymousClass35X A0F;

    public ConversationRowImage$RowImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass35X r0;
        AnonymousClass01X r4 = null;
        if (isInEditMode()) {
            r0 = null;
        } else {
            if (AnonymousClass35X.A03 == null) {
                synchronized (AnonymousClass35X.class) {
                    if (AnonymousClass35X.A03 == null) {
                        AnonymousClass35X.A03 = new AnonymousClass35X(AnonymousClass01X.A00(), AnonymousClass31y.A00());
                    }
                }
            }
            r0 = AnonymousClass35X.A03;
        }
        this.A0F = r0;
        this.A0E = !isInEditMode() ? AnonymousClass01X.A00() : r4;
        A01();
    }

    public final void A00() {
        if (this.A02 != null && !this.A06) {
            RectF rectF = this.A0C;
            rectF.set(0.0f, 0.0f, (float) this.A01, (float) this.A00);
            int i = this.A00;
            int i2 = this.A01;
            if (i > i2) {
                float f = (float) i2;
                rectF.bottom = f;
                int i3 = this.A04.A03;
                if (i3 <= 0) {
                    i3 = i / 3;
                }
                if (i3 > i2 / 3) {
                    float min = Math.min((float) i, ((2.0f * f) / 3.0f) + ((float) i3));
                    rectF.bottom = min;
                    float f2 = min - f;
                    rectF.top = f2;
                    if (f2 < 0.0f) {
                        rectF.top = 0.0f;
                        rectF.bottom = f;
                    }
                }
            } else {
                int i4 = i * 24;
                if (i2 * 10 > i4) {
                    int i5 = i4 / 10;
                    rectF.left = (float) ((i2 - i5) >> 1);
                    rectF.right = (float) ((i5 + i2) >> 1);
                }
            }
            RectF rectF2 = this.A0D;
            rectF2.set(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight());
            Matrix matrix = this.A0B;
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            setImageMatrix(matrix);
        }
    }

    public final void A01() {
        Drawable A0N;
        if (this.A0F != null) {
            if (this.A08) {
                if (this.A09) {
                    Context context = getContext();
                    A0N = C004302a.A03(context, R.drawable.balloon_live_location_outgoing_frame);
                    int A002 = C004302a.A00(context, R.color.bubbleOutgoingTint);
                    if (A0N == null) {
                        throw null;
                    } else if (A002 != 0) {
                        A0N = C002001d.A0e(A0N, A002);
                    }
                } else {
                    A0N = C28051Sr.A0O(getContext());
                }
            } else if (this.A09) {
                Context context2 = getContext();
                A0N = C004302a.A03(context2, R.drawable.balloon_live_location_incoming_frame);
                int A003 = C004302a.A00(context2, R.color.bubbleIncomingTint);
                if (A0N == null) {
                    throw null;
                } else if (A003 != 0) {
                    A0N = C002001d.A0e(A0N, A003);
                }
            } else {
                A0N = C28051Sr.A0N(getContext());
            }
            this.A03 = A0N;
        }
    }

    public void onDraw(Canvas canvas) {
        Drawable drawable;
        super.onDraw(canvas);
        if (!isInEditMode()) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Context context = getContext();
            if (context != null) {
                AnonymousClass35X r8 = this.A0F;
                if (r8 != null) {
                    if (this.A05) {
                        Drawable drawable2 = r8.A00;
                        if (drawable2 == null) {
                            drawable2 = new C06470Tj(r8.A01, context.getResources().getDrawable(R.drawable.balloon_media_botshade));
                            r8.A00 = drawable2;
                        }
                        if (this.A0E.A0M()) {
                            drawable2.setBounds(width - drawable2.getIntrinsicWidth(), height - drawable2.getIntrinsicHeight(), width, height);
                        } else {
                            drawable2.setBounds(paddingLeft, height - drawable2.getIntrinsicHeight(), drawable2.getIntrinsicWidth() + paddingLeft, height);
                        }
                        drawable2.draw(canvas);
                    }
                    if (!this.A06 && (drawable = this.A03) != null) {
                        drawable.setBounds(paddingLeft, paddingTop, width, height);
                        this.A03.draw(canvas);
                        return;
                    }
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00();
    }

    public void onMeasure(int i, int i2) {
        int A042;
        int i3;
        if (isInEditMode()) {
            setMeasuredDimension(800, 600);
            return;
        }
        if (this.A06) {
            View decorView = C02780Dk.A00(getContext()).getWindow().getDecorView();
            A042 = View.MeasureSpec.getSize(i);
            i3 = decorView.getHeight() > 0 ? Math.min(decorView.getHeight() << 1, (this.A00 * A042) / this.A01) : (this.A00 * A042) / this.A01;
        } else {
            A042 = (AbstractC59162nB.A04(getContext()) * 72) / 100;
            if (View.MeasureSpec.getMode(i) != 0) {
                A042 = Math.min(A042, View.MeasureSpec.getSize(i));
            }
            i3 = (this.A00 * A042) / this.A01;
            if (i3 > A042) {
                i3 = A042;
            } else {
                int i4 = A042 * 10;
                if (i4 > i3 * 24) {
                    i3 = i4 / 24;
                }
            }
        }
        if (View.MeasureSpec.getMode(i2) != 0) {
            i3 = Math.min(View.MeasureSpec.getSize(i2), i3);
        }
        if (this.A0A) {
            i3 = Math.min(i3, (A042 * 100) / 191);
        }
        setMeasuredDimension(A042, i3);
    }

    public void setFullWidth(boolean z) {
        this.A06 = z;
    }

    public void setHasLabels(boolean z) {
        this.A07 = z;
    }

    @Override // X.C08490bD
    public void setImageBitmap(Bitmap bitmap) {
        this.A02 = bitmap;
        if (bitmap == null) {
            super.setImageDrawable(null);
        } else {
            super.setImageDrawable(new AnonymousClass2ID(this, getContext().getResources(), bitmap));
        }
        A00();
    }

    public void setOutgoing(boolean z) {
        if (this.A08 != z) {
            this.A08 = z;
            A01();
        }
    }

    public void setPaddingOnTopOnly(boolean z) {
        if (z != this.A09) {
            this.A09 = z;
            A01();
        }
    }

    public void setTemplateImageRatio(boolean z) {
        this.A0A = z;
    }
}
