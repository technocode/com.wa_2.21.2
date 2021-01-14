package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: X.2Mw  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC48582Mw {
    public static float A05 = 12.0f;
    public static float A06 = 24.0f;
    public static float A07 = 24.0f;
    public static float A08 = 32.0f;
    public static float A09 = 96.0f;
    public static float A0A = 96.0f;
    public float A00;
    public long A01;
    public boolean A02;
    public final Paint A03;
    public final RectF A04 = new RectF();

    public AbstractC48582Mw() {
        Paint paint = new Paint(1);
        this.A03 = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.A03.setStrokeJoin(Paint.Join.ROUND);
        this.A03.setStrokeCap(Paint.Cap.ROUND);
    }

    public float A00() {
        return this.A03.getStrokeWidth();
    }

    public C48572Mv A01() {
        if (!(this instanceof C53232ck)) {
            return new C48572Mv(this.A04, this.A00, this.A03.getColor(), A00());
        }
        C53232ck r1 = (C53232ck) this;
        return new C53222cj(((AbstractC48582Mw) r1).A04, ((AbstractC48582Mw) r1).A00, ((AbstractC48582Mw) r1).A03.getColor(), r1.A00(), r1.A07, r1.A04);
    }

    public String A02() {
        if (this instanceof C53242cl) {
            return "thinking-bubble";
        }
        if (this instanceof C53232ck) {
            return "text";
        }
        if (this instanceof C53212ci) {
            return "speech-bubble-rect";
        }
        if (this instanceof C53202ch) {
            return "speech-bubble-oval";
        }
        if (this instanceof C53192cg) {
            return "rect";
        }
        if (this instanceof C53182cf) {
            return "pen";
        }
        if (this instanceof C53172ce) {
            return "oval";
        }
        if (this instanceof AnonymousClass2cZ) {
            return "arrow";
        }
        if (this instanceof C59472nj) {
            return "sticker";
        }
        if (this instanceof C59462ni) {
            return "emoji";
        }
        if (this instanceof C59452nh) {
            return "digital-clock";
        }
        if (this instanceof C60502pa) {
            return "svg";
        }
        if (!(this instanceof C60492pZ)) {
            return !(this instanceof C60482pY) ? "" : "analog-clock";
        }
        return "location";
    }

    public void A03() {
        if (this instanceof C60492pZ) {
            RectF rectF = this.A04;
            if (rectF.height() < A05) {
                float width = rectF.width() / rectF.height();
                rectF.set(rectF.centerX() - ((A05 * width) / 2.0f), rectF.centerY() - (A05 / 2.0f), ((A05 * width) / 2.0f) + rectF.centerX(), (A05 / 2.0f) + rectF.centerY());
            }
        } else if (!(this instanceof C59452nh)) {
            RectF rectF2 = this.A04;
            if (rectF2.width() < A05) {
                rectF2.set(rectF2.centerX() - (A05 / 2.0f), rectF2.top, (A05 / 2.0f) + rectF2.centerX(), rectF2.bottom);
            }
            if (rectF2.height() < A05) {
                rectF2.set(rectF2.left, rectF2.centerY() - (A05 / 2.0f), rectF2.right, (A05 / 2.0f) + rectF2.centerY());
            }
        } else {
            C59452nh r1 = (C59452nh) this;
            float f = (A05 * r1.A00) / 116.0f;
            RectF rectF3 = ((AbstractC48582Mw) r1).A04;
            if (rectF3.height() < A05 || rectF3.width() < f) {
                float f2 = f / 2.0f;
                rectF3.set(rectF3.centerX() - f2, rectF3.centerY() - (A05 / 2.0f), rectF3.centerX() + f2, (A05 / 2.0f) + rectF3.centerY());
            }
        }
    }

    public void A04() {
        if (this instanceof C59452nh) {
            ((C59452nh) this).A0N.A00 = false;
        } else if (this instanceof C60492pZ) {
            ((C60492pZ) this).A0H.A00 = false;
        } else if (this instanceof C60482pY) {
            ((C60482pY) this).A0F.A00 = false;
        }
    }

    public void A05(float f) {
        if (this instanceof C60492pZ) {
            RectF rectF = this.A04;
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            rectF.set(centerX - ((centerX - rectF.left) * f), centerY - ((centerY - rectF.top) * f), centerX - ((centerX - rectF.right) * f), centerY - ((centerY - rectF.bottom) * f));
            A03();
        } else if (!(this instanceof C59452nh)) {
            RectF rectF2 = this.A04;
            float centerX2 = rectF2.centerX();
            float centerY2 = rectF2.centerY();
            rectF2.set(centerX2 - ((centerX2 - rectF2.left) * f), centerY2 - ((centerY2 - rectF2.top) * f), centerX2 - ((centerX2 - rectF2.right) * f), centerY2 - ((centerY2 - rectF2.bottom) * f));
            A03();
        } else {
            RectF rectF3 = this.A04;
            float centerX3 = rectF3.centerX();
            float centerY3 = rectF3.centerY();
            rectF3.set(centerX3 - ((centerX3 - rectF3.left) * f), centerY3 - ((centerY3 - rectF3.top) * f), centerX3 - ((centerX3 - rectF3.right) * f), centerY3 - ((centerY3 - rectF3.bottom) * f));
            A03();
        }
    }

    public void A06(float f) {
        if (this instanceof C53242cl) {
            this.A03.setStrokeWidth((f * 3.0f) / 5.0f);
        } else if (this instanceof C53212ci) {
            this.A03.setStrokeWidth((f * 2.0f) / 3.0f);
        } else if (!(this instanceof C53202ch)) {
            this.A03.setStrokeWidth(f);
        } else {
            this.A03.setStrokeWidth((f * 2.0f) / 3.0f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r9 == 2) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r9 == 2) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0093, code lost:
        if (r9 == 2) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(float r8, int r9) {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC48582Mw.A07(float, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        if (r7 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(int r19) {
        /*
        // Method dump skipped, instructions count: 411
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC48582Mw.A08(int):void");
    }

    public void A09(Canvas canvas) {
        float degrees;
        C48562Mu[] r9;
        C48562Mu[] r10;
        Picture picture;
        TextPaint textPaint;
        float width;
        float f;
        float f2;
        Picture picture2;
        Paint paint;
        C48562Mu r92;
        C48562Mu r93;
        if (this instanceof C53242cl) {
            C53242cl r3 = (C53242cl) this;
            RectF rectF = ((AbstractC48582Mw) r3).A04;
            rectF.sort();
            canvas.save();
            Matrix matrix = r3.A00;
            RectF rectF2 = r3.A05;
            matrix.setRectToRect(new RectF(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom), rectF, Matrix.ScaleToFit.CENTER);
            Path path = r3.A04;
            path.reset();
            path.setFillType(Path.FillType.WINDING);
            r3.A02.transform(matrix, path);
            Paint paint2 = r3.A01;
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(-31);
            path.close();
            canvas.drawPath(path, paint2);
            path.reset();
            path.setFillType(Path.FillType.WINDING);
            r3.A03.transform(matrix, path);
            Paint paint3 = ((AbstractC48582Mw) r3).A03;
            paint3.setStyle(Paint.Style.STROKE);
            canvas.drawPath(path, paint3);
            canvas.restore();
            r3.A0H(canvas, 1.3f, 1.0f);
            r3.A0H(canvas, 1.7f, 0.5f);
        } else if (this instanceof C53232ck) {
            C53232ck r2 = (C53232ck) this;
            if (!TextUtils.isEmpty(r2.A07)) {
                RectF rectF3 = ((AbstractC48582Mw) r2).A04;
                rectF3.sort();
                canvas.save();
                float f3 = ((AbstractC48582Mw) r2).A00;
                if (Math.abs(f3) < 3.0f) {
                    f3 = 0.0f;
                }
                canvas.rotate(f3, rectF3.centerX(), rectF3.centerY());
                float width2 = rectF3.width() / r2.A01;
                canvas.translate(((rectF3.width() / 2.0f) + rectF3.left) - ((((float) r2.A05.getWidth()) * width2) / 2.0f), rectF3.top);
                canvas.scale(width2, width2, 0.0f, 0.0f);
                if (r2.A04 == 3) {
                    TextPaint textPaint2 = r2.A06;
                    textPaint2.setStrokeWidth(textPaint2.getTextSize() / 12.0f);
                    r2.A06.setStyle(Paint.Style.STROKE);
                    r2.A06.setColor(-16777216);
                    r2.A05.draw(canvas);
                    r2.A06.setStrokeWidth(0.0f);
                    r2.A06.setStyle(Paint.Style.FILL);
                    r2.A06.setColor(-1);
                    r2.A05.draw(canvas);
                } else {
                    r2.A06.setColor(((AbstractC48582Mw) r2).A03.getColor());
                    r2.A05.draw(canvas);
                }
                canvas.restore();
            }
        } else if (this instanceof C53202ch) {
            C53202ch r7 = (C53202ch) this;
            RectF rectF4 = r7.A04;
            rectF4.sort();
            Paint paint4 = ((AbstractC48582Mw) r7).A03;
            paint4.setStyle(Paint.Style.STROKE);
            Matrix matrix2 = r7.A00;
            matrix2.reset();
            matrix2.setRotate(((AbstractC48582Mw) r7).A00, 0.0f, 0.0f);
            matrix2.postScale(rectF4.width() / 2000.0f, rectF4.height() / 2000.0f);
            matrix2.postTranslate(rectF4.centerX(), rectF4.centerY());
            Path path2 = r7.A03;
            path2.reset();
            path2.setFillType(Path.FillType.WINDING);
            Path path3 = r7.A02;
            path3.transform(matrix2, path2);
            Paint paint5 = r7.A01;
            paint5.setStyle(Paint.Style.FILL);
            paint5.setColor(-31);
            path2.close();
            canvas.drawPath(path2, paint5);
            path2.reset();
            path2.setFillType(Path.FillType.WINDING);
            path3.transform(matrix2, path2);
            canvas.drawPath(path2, paint4);
        } else if (this instanceof C53192cg) {
            RectF rectF5 = this.A04;
            rectF5.sort();
            canvas.save();
            canvas.rotate(this.A00, rectF5.centerX(), rectF5.centerY());
            canvas.drawRect(rectF5, this.A03);
            canvas.restore();
        } else if (this instanceof C53182cf) {
            C53182cf r4 = (C53182cf) this;
            if (!r4.A09) {
                ArrayList arrayList = r4.A08;
                if (arrayList.size() > 0) {
                    canvas.drawPoint(((PointF) arrayList.get(0)).x, ((PointF) arrayList.get(0)).y, ((AbstractC48582Mw) r4).A03);
                }
                canvas.drawPath(r4.A06, ((AbstractC48582Mw) r4).A03);
            } else if (r4.A05) {
                r4.A04.A02(canvas, 0);
            }
        } else if (this instanceof C53172ce) {
            RectF rectF6 = this.A04;
            rectF6.sort();
            canvas.save();
            canvas.rotate(this.A00, rectF6.centerX(), rectF6.centerY());
            canvas.drawOval(rectF6, this.A03);
            canvas.restore();
        } else if (this instanceof AnonymousClass2cZ) {
            canvas.save();
            float f4 = this.A00;
            RectF rectF7 = this.A04;
            canvas.rotate(f4, rectF7.centerX(), rectF7.centerY());
            float f5 = rectF7.left;
            float f6 = rectF7.bottom;
            float f7 = rectF7.right;
            float f8 = rectF7.top;
            Paint paint6 = this.A03;
            canvas.drawLine(f5, f6, f7, f8, paint6);
            if (f7 == f5) {
                degrees = 90.0f;
            } else {
                degrees = (float) Math.toDegrees(Math.atan((double) ((f8 - f6) / (f7 - f5))));
            }
            canvas.save();
            canvas.translate(f7, f8);
            int i = 150;
            if (f5 > f7) {
                i = 30;
            }
            canvas.rotate(degrees + ((float) i));
            canvas.drawLine(0.0f, 0.0f, paint6.getStrokeWidth() * 5.0f, 0.0f, paint6);
            int i2 = 60;
            if (f5 > f7) {
                i2 = -60;
            }
            canvas.rotate((float) i2);
            canvas.drawLine(0.0f, 0.0f, paint6.getStrokeWidth() * 5.0f, 0.0f, paint6);
            canvas.restore();
            canvas.restore();
        } else if (this instanceof C59472nj) {
            C59472nj r32 = (C59472nj) this;
            if (r32.A02 != null) {
                canvas.save();
                Drawable drawable = r32.A02;
                if (drawable instanceof C71913Qu) {
                    C71913Qu r22 = (C71913Qu) drawable;
                    r32.A0J(canvas, r22);
                    r22.draw(canvas);
                    r22.A06 = true;
                    if (!r22.A07) {
                        r22.start();
                    }
                } else {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                    r32.A0I(canvas, bitmapDrawable.getBitmap().getWidth(), bitmapDrawable.getBitmap().getHeight());
                    bitmapDrawable.draw(canvas);
                }
                canvas.restore();
            }
        } else if (this instanceof C59462ni) {
            C59462ni r72 = (C59462ni) this;
            BitmapDrawable bitmapDrawable2 = r72.A00;
            if (bitmapDrawable2 != null) {
                RectF rectF8 = ((AbstractC48582Mw) r72).A04;
                bitmapDrawable2.setBounds((int) rectF8.left, (int) rectF8.top, (int) rectF8.right, (int) rectF8.bottom);
                canvas.save();
                canvas.rotate(((AbstractC48582Mw) r72).A00, rectF8.centerX(), rectF8.centerY());
                r72.A00.draw(canvas);
                canvas.restore();
            }
        } else if (this instanceof C59452nh) {
            C59452nh r8 = (C59452nh) this;
            AbstractC48612Mz r1 = r8.A0L;
            float A002 = r1.A00();
            boolean booleanValue = r8.A01.booleanValue();
            if (r1.A01 && r1.A00 >= 0.0f) {
                booleanValue = !booleanValue;
            }
            canvas.save();
            RectF rectF9 = ((AbstractC48582Mw) r8).A04;
            rectF9.sort();
            canvas.rotate(((AbstractC48582Mw) r8).A00, rectF9.centerX(), rectF9.centerY());
            canvas.scale(rectF9.width() / r8.A00, rectF9.height() / 116.0f, rectF9.left, rectF9.top);
            canvas.translate(rectF9.left, rectF9.top);
            canvas.scale(A002, A002, r8.A00 / 2.0f, 58.0f);
            if (booleanValue) {
                r9 = r8.A0P;
            } else {
                r9 = r8.A0Q;
            }
            for (C48562Mu r0 : r9) {
                canvas.drawRoundRect(r0.A03, r0.A00, r0.A01, r0.A02);
            }
            if (booleanValue) {
                r8.A0J(canvas, r8.A0E, r8.A0C);
            } else {
                r8.A0J(canvas, r8.A0I, r8.A0G);
            }
            canvas.restore();
            if (!r8.A0O) {
                r8.A0N.A01(canvas, ((AbstractC48582Mw) r8).A00, rectF9);
            }
        } else if (this instanceof C60502pa) {
            C60502pa r82 = (C60502pa) this;
            if (r82.A03 != null) {
                RectF rectF10 = ((AbstractC48582Mw) r82).A04;
                rectF10.sort();
                canvas.save();
                canvas.rotate(((AbstractC48582Mw) r82).A00, rectF10.centerX(), rectF10.centerY());
                if (r82.A06) {
                    canvas.scale(-1.0f, 1.0f, rectF10.centerX(), rectF10.centerY());
                }
                long j = ((AbstractC48582Mw) r82).A01;
                if (j != 0) {
                    int i3 = r82.A00;
                    if (i3 == 1) {
                        float sin = (((float) Math.sin((((double) ((r82.A02 + j) % 1000)) * 6.283185307179586d) / 1000.0d)) * 0.02f) + 1.0f;
                        canvas.scale(sin, sin, rectF10.centerX(), rectF10.centerY());
                    } else if (i3 == 2) {
                        long j2 = r82.A02 + j;
                        canvas.rotate(((float) Math.sin((((double) (((j2 * 10) / 12) % 1000)) * 6.283185307179586d) / 1000.0d)) * 2.2f, rectF10.centerX(), rectF10.centerY());
                        canvas.translate(rectF10.centerX(), rectF10.centerY());
                        canvas.skew(((float) Math.sin((((double) (((j2 * 15) / 12) % 1000)) * 6.283185307179586d) / 1000.0d)) * 0.03f, 0.0f);
                        canvas.translate(-rectF10.centerX(), -rectF10.centerY());
                    } else if (i3 == 3) {
                        long j3 = (r82.A02 + j) % 4000;
                        if (j3 > 3300) {
                            canvas.scale(1.0f, (((float) Math.sin((((double) (4000 - j3)) * 6.283185307179586d) / 700.0d)) * 0.1f) + 1.0f, rectF10.centerX(), rectF10.bottom);
                        }
                    } else if (i3 == 4) {
                        long j4 = r82.A02 + j;
                        canvas.rotate((float) Math.sin((((double) (j4 % 1000)) * 6.283185307179586d) / 1000.0d), rectF10.centerX(), rectF10.bottom);
                        canvas.translate(rectF10.centerX(), rectF10.bottom);
                        canvas.skew(((float) Math.sin((((double) (((j4 * 9) / 12) % 1000)) * 6.283185307179586d) / 1000.0d)) * 0.02f, 0.0f);
                        canvas.translate(-rectF10.centerX(), -rectF10.bottom);
                    }
                }
                canvas.scale(rectF10.width() / ((float) r82.A03.getWidth()), rectF10.height() / ((float) r82.A03.getHeight()), rectF10.left, rectF10.top);
                canvas.translate(rectF10.left, rectF10.top);
                canvas.save();
                canvas.drawPicture(r82.A03);
                canvas.restore();
                canvas.restore();
            }
        } else if (!(this instanceof C60492pZ)) {
            C60482pY r5 = (C60482pY) this;
            boolean z = r5.A0G;
            if (!z) {
                canvas.save();
                RectF rectF11 = ((AbstractC48582Mw) r5).A04;
                canvas.scale(0.67f, 0.67f, rectF11.centerX(), rectF11.centerY());
            }
            AbstractC48612Mz r12 = r5.A0D;
            float A003 = r12.A00();
            boolean booleanValue2 = r5.A0A.booleanValue();
            if (r12.A01 && r12.A00 >= 0.0f) {
                booleanValue2 = !booleanValue2;
            }
            if (booleanValue2) {
                picture2 = r5.A04;
            } else {
                picture2 = r5.A05;
            }
            RectF rectF12 = ((AbstractC48582Mw) r5).A04;
            rectF12.sort();
            canvas.save();
            canvas.rotate(((AbstractC48582Mw) r5).A00, rectF12.centerX(), rectF12.centerY());
            canvas.scale(rectF12.width() / ((float) picture2.getHeight()), rectF12.height() / ((float) picture2.getWidth()), rectF12.left, rectF12.top);
            canvas.translate(rectF12.left, rectF12.top);
            canvas.scale(A003, A003, (float) (picture2.getWidth() >> 1), (float) (picture2.getHeight() >> 1));
            canvas.save();
            canvas.drawPicture(picture2);
            canvas.restore();
            float width3 = (float) (picture2.getWidth() >> 1);
            float height = (float) (picture2.getHeight() >> 1);
            if (booleanValue2) {
                paint = r5.A02;
            } else {
                paint = r5.A03;
            }
            canvas.drawCircle(width3, height, 26.0f, paint);
            canvas.save();
            if (booleanValue2) {
                r92 = r5.A06;
            } else {
                r92 = r5.A08;
            }
            double d = (((double) (r5.A01 * 30)) / 60.0d) + (((((double) (r5.A00 + 9)) % 12.0d) / 12.0d) * 360.0d);
            RectF rectF13 = r5.A0B;
            rectF13.set(r92.A03);
            canvas.rotate((float) ((int) d), (float) (picture2.getWidth() >> 1), (float) (picture2.getHeight() >> 1));
            canvas.drawRoundRect(rectF13, r92.A00, r92.A01, r92.A02);
            canvas.restore();
            canvas.save();
            if (booleanValue2) {
                r93 = r5.A07;
            } else {
                r93 = r5.A09;
            }
            rectF13.set(r93.A03);
            canvas.rotate((float) ((int) (((((double) (r5.A01 + 45)) % 60.0d) / 60.0d) * 360.0d)), (float) (picture2.getWidth() >> 1), (float) (picture2.getHeight() >> 1));
            canvas.drawRoundRect(rectF13, r93.A00, r93.A01, r93.A02);
            canvas.restore();
            canvas.restore();
            if (!z) {
                canvas.restore();
                float width4 = (rectF12.width() * 0.67f) / 2.0f;
                r5.A0F.A01(canvas, ((AbstractC48582Mw) r5).A00, new RectF(rectF12.centerX() - width4, rectF12.centerY() - width4, rectF12.centerX() + width4, rectF12.centerY() + width4));
            }
        } else {
            C60492pZ r73 = (C60492pZ) this;
            AbstractC48612Mz r13 = r73.A0F;
            float A004 = r13.A00();
            boolean z2 = r73.A07;
            if (r13.A01 && r13.A00 >= 0.0f) {
                z2 = !z2;
            }
            canvas.save();
            RectF rectF14 = ((AbstractC48582Mw) r73).A04;
            rectF14.sort();
            canvas.rotate(((AbstractC48582Mw) r73).A00, rectF14.centerX(), rectF14.centerY());
            canvas.scale(rectF14.width() / r73.A02, rectF14.height() / 130.0f, rectF14.left, rectF14.top);
            canvas.translate(rectF14.left, rectF14.top);
            canvas.scale(A004, A004, r73.A02 / 2.0f, 65.0f);
            if (z2) {
                r10 = r73.A08;
            } else {
                r10 = r73.A09;
            }
            for (C48562Mu r02 : r10) {
                canvas.drawRoundRect(r02.A03, r02.A00, r02.A01, r02.A02);
            }
            if (z2) {
                picture = r73.A04;
                textPaint = r73.A0E;
                textPaint.setColor(-1);
            } else {
                picture = r73.A03;
                textPaint = r73.A0E;
                textPaint.setColor(-16777216);
            }
            if (picture == null) {
                width = 0.0f;
            } else {
                width = (float) picture.getWidth();
            }
            float f9 = ((14.0f + width) + r73.A02) / 2.0f;
            float ascent = 65.0f - ((textPaint.ascent() + textPaint.descent()) / 2.0f);
            boolean z3 = r73.A0I;
            if (!z3) {
                canvas.drawText(r73.A05, f9, ascent, textPaint);
            }
            float f10 = 1.6f;
            if (z3) {
                f = 1.6f;
                f2 = r73.A02 - (width * 1.6f);
            } else {
                f = 1.0f;
                f2 = 106.0f;
            }
            float f11 = f2 / 2.0f;
            float f12 = ascent / (f * 2.0f);
            if (picture != null) {
                if (!z3) {
                    f10 = 0.9f;
                }
                canvas.save();
                canvas.translate(f11, f12);
                canvas.scale(f10, f10);
                canvas.drawPicture(picture);
                canvas.restore();
            }
            canvas.restore();
            if (!z3) {
                r73.A0H.A01(canvas, ((AbstractC48582Mw) r73).A00, rectF14);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0099, code lost:
        if (r1 != null) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(android.graphics.Canvas r21) {
        /*
        // Method dump skipped, instructions count: 431
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC48582Mw.A0A(android.graphics.Canvas):void");
    }

    public boolean A0B() {
        if ((this instanceof C53182cf) || (this instanceof C59472nj) || (this instanceof C59462ni) || (this instanceof C59452nh)) {
            return false;
        }
        return !(this instanceof C60502pa) ? !(this instanceof C60492pZ) && !(this instanceof C60482pY) : ((C60502pa) this).A01 != 0;
    }

    public boolean A0C() {
        return !(this instanceof C53232ck) && !(this instanceof C53182cf) && !(this instanceof AbstractC59482nk) && !(this instanceof C59472nj) && !(this instanceof C59462ni) && !(this instanceof C59452nh);
    }

    public boolean A0D() {
        if (!(this instanceof C59472nj)) {
            return (this instanceof C60502pa) && ((C60502pa) this).A00 != 0;
        }
        return true;
    }

    public void A0E(RectF rectF, float f, float f2, float f3, float f4) {
        if (f == f3) {
            f3 += 1.0f;
        }
        if (f2 == f4) {
            f4 += 1.0f;
        }
        RectF rectF2 = this.A04;
        rectF2.set(f, f2, f3, f4);
        rectF2.sort();
        A03();
    }

    public void A0F(JSONObject jSONObject) {
        jSONObject.put("type", A02());
        RectF rectF = this.A04;
        jSONObject.put("l", (int) (rectF.left * 100.0f));
        jSONObject.put("t", (int) (rectF.top * 100.0f));
        jSONObject.put("r", (int) (rectF.right * 100.0f));
        jSONObject.put("b", (int) (rectF.bottom * 100.0f));
        float f = this.A00;
        if (f != 0.0f) {
            jSONObject.put("rotate", (int) (f * 100.0f));
        }
        jSONObject.put("color", this.A03.getColor());
        jSONObject.put("stroke", (int) (A00() * 100.0f));
    }

    public boolean A0G(JSONObject jSONObject) {
        RectF rectF = this.A04;
        rectF.left = ((float) jSONObject.getInt("l")) / 100.0f;
        rectF.top = ((float) jSONObject.getInt("t")) / 100.0f;
        rectF.right = ((float) jSONObject.getInt("r")) / 100.0f;
        rectF.bottom = ((float) jSONObject.getInt("b")) / 100.0f;
        this.A00 = ((float) jSONObject.optInt("rotate", 0)) / 100.0f;
        A08(jSONObject.getInt("color"));
        A06(((float) jSONObject.getInt("stroke")) / 100.0f);
        return true;
    }
}
