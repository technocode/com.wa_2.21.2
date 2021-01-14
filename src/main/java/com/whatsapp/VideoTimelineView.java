package com.whatsapp;

import X.AnonymousClass01X;
import X.AnonymousClass0JW;
import X.AnonymousClass1OD;
import X.AnonymousClass1OE;
import X.AnonymousClass2PF;
import X.C002001d;
import X.C07990aH;
import X.C11120fk;
import X.C54252eb;
import X.C54262ec;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.gallerypicker.MediaPreviewFragment;
import com.whatsapp.gallerypicker.VideoPreviewFragment;
import java.io.File;
import java.util.ArrayList;

public class VideoTimelineView extends View {
    public float A00 = 1.0f;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05 = 12.0f;
    public float A06 = 12.0f;
    public int A07 = -1;
    public int A08 = 855638016;
    public int A09;
    public int A0A;
    public int A0B = -1;
    public int A0C = -1;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public AnonymousClass1OD A0H;
    public AnonymousClass1OE A0I;
    public AnonymousClass0JW A0J;
    public File A0K;
    public ArrayList A0L;
    public final Paint A0M = new Paint(1);
    public final Rect A0N = new Rect();
    public final RectF A0O = new RectF();

    public VideoTimelineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C07990aH.A2T);
            this.A00 = obtainStyledAttributes.getDimension(1, 1.0f);
            this.A07 = obtainStyledAttributes.getInteger(0, -1);
            this.A05 = obtainStyledAttributes.getDimension(5, 12.0f);
            this.A0B = obtainStyledAttributes.getInteger(3, -1);
            this.A06 = obtainStyledAttributes.getDimension(6, 12.0f);
            this.A0C = obtainStyledAttributes.getInteger(4, -1);
            this.A08 = obtainStyledAttributes.getInteger(2, 855638016);
            obtainStyledAttributes.recycle();
        }
    }

    public final int A00(long j) {
        long paddingLeft = (long) getPaddingLeft();
        return Math.min(getPaddingLeft() + getTimelineWidth(), Math.max(getPaddingLeft(), (int) (((((long) getTimelineWidth()) * j) / this.A0D) + paddingLeft)));
    }

    public final long A01(float f) {
        return Math.min(this.A0D, Math.max((long) (((f - ((float) getPaddingLeft())) * ((float) this.A0D)) / ((float) getTimelineWidth())), 0L));
    }

    public final void A02(float f) {
        int i;
        if (this.A01 != f && (i = this.A0A) != 0) {
            float f2 = f - this.A02;
            long j = 0;
            if (i == 1) {
                long A012 = A01(this.A03 + f2);
                long j2 = this.A0G;
                long min = Math.min(A012, j2);
                this.A0F = min;
                long j3 = this.A0E;
                if (j2 - min > j3) {
                    this.A0G = min + j3;
                }
            } else if (i == 2) {
                long A013 = A01(this.A04 + f2);
                long j4 = this.A0F;
                long max = Math.max(A013, j4);
                this.A0G = max;
                long j5 = this.A0E;
                if (max - j4 > j5) {
                    this.A0F = max - j5;
                }
            } else if (i == 3) {
                long j6 = this.A0G - this.A0F;
                long A014 = A01(this.A03 + f2);
                this.A0F = A014;
                if (A014 == 0) {
                    this.A0G = A014 + j6;
                } else {
                    long A015 = A01(this.A04 + f2);
                    this.A0G = A015;
                    if (A015 == this.A0D) {
                        this.A0F = A015 - j6;
                    }
                }
            }
            this.A01 = f;
            invalidate();
            AnonymousClass1OD r5 = this.A0H;
            if (r5 != null) {
                long j7 = this.A0F;
                long j8 = this.A0G;
                C54252eb r52 = (C54252eb) r5;
                if (r52.A00.A0J.A0B()) {
                    r52.A00.A0v();
                }
                VideoPreviewFragment videoPreviewFragment = r52.A00;
                videoPreviewFragment.A03 = j7;
                videoPreviewFragment.A04 = j8;
                if (j7 - 200 <= 0 && j8 + 200 >= videoPreviewFragment.A0I.A04) {
                    j8 = 0;
                } else if (j8 - j7 < 1000) {
                    j8 = Math.min(j7 + 1000, videoPreviewFragment.A0I.A04);
                    j = Math.max(0L, j8 - 1000);
                } else {
                    j = j7;
                }
                ((AnonymousClass2PF) videoPreviewFragment.A0A()).APH(((MediaPreviewFragment) videoPreviewFragment).A00, j, j8);
                videoPreviewFragment.A0J.A09((int) j7);
                videoPreviewFragment.A0r();
                TextView textView = videoPreviewFragment.A0F;
                StringBuilder sb = new StringBuilder();
                AnonymousClass01X r2 = videoPreviewFragment.A0U;
                sb.append(C002001d.A1W(r2, videoPreviewFragment.A03 / 1000));
                sb.append(" - ");
                sb.append(C002001d.A1W(r2, videoPreviewFragment.A04 / 1000));
                textView.setText(sb.toString());
                videoPreviewFragment.A0w();
            }
        }
    }

    private int getTimelineHeight() {
        return Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom());
    }

    private int getTimelineWidth() {
        return Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight());
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass0JW r0 = this.A0J;
        if (r0 != null) {
            r0.A00.cancel(true);
            this.A0J = null;
        }
        this.A0L = null;
    }

    public void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        float f2;
        super.onDraw(canvas);
        if (this.A0K != null) {
            int timelineWidth = getTimelineWidth();
            int timelineHeight = getTimelineHeight();
            if (timelineHeight > 0 && timelineWidth > 0) {
                if (this.A09 != timelineWidth) {
                    this.A09 = timelineWidth;
                    this.A0L = null;
                    AnonymousClass0JW r0 = this.A0J;
                    if (r0 != null) {
                        r0.A00.cancel(true);
                        this.A0J = null;
                    }
                }
                if (this.A0L != null) {
                    float f3 = ((float) timelineWidth) / ((float) (timelineWidth / timelineHeight));
                    RectF rectF = this.A0O;
                    rectF.top = (float) getPaddingTop();
                    rectF.bottom = (float) (getPaddingTop() + timelineHeight);
                    for (int i3 = 0; i3 < this.A0L.size(); i3++) {
                        float paddingLeft = (((float) i3) * f3) + ((float) getPaddingLeft());
                        rectF.left = paddingLeft;
                        rectF.right = paddingLeft + f3;
                        Bitmap bitmap = (Bitmap) this.A0L.get(i3);
                        if (bitmap != null) {
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            Rect rect = this.A0N;
                            if (width > height) {
                                rect.top = 0;
                                rect.bottom = height;
                                int i4 = (width - height) / 2;
                                rect.left = i4;
                                rect.right = i4 + height;
                            } else {
                                rect.left = 0;
                                rect.right = width;
                                int i5 = (height - width) / 2;
                                rect.top = i5;
                                rect.bottom = i5 + width;
                            }
                            canvas.drawBitmap(bitmap, rect, rectF, this.A0M);
                        }
                    }
                } else if (this.A0J == null) {
                    int i6 = timelineWidth / timelineHeight;
                    this.A0L = new ArrayList(i6);
                    C11120fk r13 = new C11120fk(this, this.A0K, i6, ((float) timelineWidth) / ((float) i6), (float) timelineHeight);
                    this.A0J = r13;
                    ((AnonymousClass0JW) r13).A00.execute(new Void[0]);
                }
                if (this.A0H != null) {
                    float A002 = (float) A00(this.A0F);
                    float A003 = (float) A00(this.A0G);
                    Paint paint = this.A0M;
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(this.A08);
                    RectF rectF2 = this.A0O;
                    rectF2.set((float) getPaddingLeft(), (float) getPaddingTop(), A002, (float) (getHeight() - getPaddingBottom()));
                    canvas.drawRect(rectF2, paint);
                    rectF2.set(A003, (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
                    canvas.drawRect(rectF2, paint);
                    AnonymousClass1OE r3 = this.A0I;
                    if (r3 != null) {
                        C54262ec r32 = (C54262ec) r3;
                        if (r32.A00.A0J.A0B()) {
                            VideoPreviewFragment videoPreviewFragment = r32.A00;
                            videoPreviewFragment.A02 = (long) videoPreviewFragment.A0J.A01();
                        }
                        long j = r32.A00.A02;
                        if (j >= 0 && j >= this.A0F && j <= this.A0G) {
                            paint.setColor(this.A07);
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setStrokeWidth(this.A00 / 2.0f);
                            float A004 = (float) A00(j);
                            canvas.drawLine(A004, (float) getPaddingTop(), A004, (float) (getHeight() - getPaddingBottom()), paint);
                        }
                        if (((C54262ec) this.A0I).A00.A0J.A0B()) {
                            invalidate();
                        }
                    }
                    paint.setColor(this.A07);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(this.A00);
                    rectF2.set(A002 - 1.0f, (float) getPaddingTop(), 1.0f + A003, (float) (getHeight() - getPaddingBottom()));
                    canvas.drawRect(rectF2, paint);
                    paint.setStyle(Paint.Style.FILL);
                    if (this.A0A == 1) {
                        i = this.A0C;
                    } else {
                        i = this.A0B;
                    }
                    paint.setColor(i);
                    int i7 = timelineHeight / 2;
                    float paddingTop = (float) (getPaddingTop() + i7);
                    if (this.A0A == 1) {
                        f = this.A06;
                    } else {
                        f = this.A05;
                    }
                    canvas.drawCircle(A002, paddingTop, f, paint);
                    if (this.A0A == 2) {
                        i2 = this.A0C;
                    } else {
                        i2 = this.A0B;
                    }
                    paint.setColor(i2);
                    float paddingTop2 = (float) (getPaddingTop() + i7);
                    if (this.A0A == 2) {
                        f2 = this.A06;
                    } else {
                        f2 = this.A05;
                    }
                    canvas.drawCircle(A003, paddingTop2, f2, paint);
                }
            }
        } else if (isInEditMode()) {
            Paint paint2 = this.A0M;
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(this.A08);
            RectF rectF3 = this.A0O;
            rectF3.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
            canvas.drawRect(rectF3, paint2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r1 != 3) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009d, code lost:
        if ((r9 / ((float) getWidth())) <= 0.5f) goto L_0x00f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
        // Method dump skipped, instructions count: 327
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VideoTimelineView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMaxTrim(long j) {
        this.A0E = j;
    }

    public void setTrimListener(AnonymousClass1OD r1) {
        this.A0H = r1;
    }

    public void setVideoPlayback(AnonymousClass1OE r1) {
        this.A0I = r1;
    }
}
