package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: X.2ci  reason: invalid class name and case insensitive filesystem */
public class C53212ci extends AbstractC48582Mw {
    public final Paint A00 = new Paint(1);
    public final Path A01 = new Path();
    public final PointF A02 = new PointF();
    public final PointF A03 = new PointF();
    public final RectF A04 = new RectF();
    public final RectF A05 = new RectF();
    public final PointF[] A06 = {new PointF(), new PointF(), new PointF(), new PointF(), new PointF(), new PointF(), new PointF()};

    public C53212ci() {
        super.A00 = 110.0f;
        this.A00.setStyle(Paint.Style.FILL);
        this.A00.setColor(-31);
        super.A03.setStyle(Paint.Style.STROKE);
    }

    @Override // X.AbstractC48582Mw
    public float A00() {
        return (super.A00() * 3.0f) / 2.0f;
    }

    @Override // X.AbstractC48582Mw
    public void A09(Canvas canvas) {
        RectF rectF = super.A04;
        rectF.sort();
        Path path = this.A01;
        path.reset();
        float centerX = rectF.centerX() + ((float) (Math.cos(Math.toRadians((double) super.A00)) * ((double) rectF.width()) * 0.8999999761581421d));
        float centerY = rectF.centerY() + ((float) (Math.sin(Math.toRadians((double) super.A00)) * ((double) rectF.height()) * 0.8999999761581421d));
        RectF rectF2 = this.A04;
        rectF2.set(rectF);
        float width = (centerX - rectF2.left) - (rectF2.width() / 2.0f);
        float height = (centerY - rectF2.top) - (rectF2.height() / 2.0f);
        float height2 = rectF2.height() / rectF2.width();
        float min = Math.min(rectF2.width() / 6.0f, rectF2.height() / 6.0f);
        float f = min * 2.0f;
        PointF[] pointFArr = this.A06;
        PointF pointF = pointFArr[0];
        pointF.x = centerX;
        pointF.y = centerY;
        if (width >= 0.0f || height < 0.0f) {
            if (width < 0.0f || height < 0.0f) {
                if (width >= 0.0f || height >= 0.0f) {
                    if (width < 0.0f || height >= 0.0f) {
                        PointF pointF2 = pointFArr[1];
                        float f2 = rectF2.left;
                        pointF2.x = f2;
                        pointF2.y = rectF2.top;
                        pointFArr[2].x = rectF2.width() + f2;
                        pointFArr[2].y = rectF2.top;
                        pointFArr[3].x = rectF2.width() + rectF2.left;
                        pointFArr[3].y = rectF2.height() + rectF2.top;
                        PointF pointF3 = pointFArr[4];
                        pointF3.x = rectF2.left;
                        pointF3.y = rectF2.height() + rectF2.top;
                        PointF pointF4 = pointFArr[5];
                        float f3 = rectF2.left;
                        pointF4.x = f3;
                        float f4 = rectF2.top;
                        pointF4.y = f4;
                        PointF pointF5 = pointFArr[6];
                        pointF5.x = f3;
                        pointF5.y = f4;
                    } else if ((-width) * height2 >= height) {
                        pointFArr[1].x = ((rectF2.width() * 4.0f) / 6.0f) + rectF2.left;
                        pointFArr[1].y = rectF2.top;
                        pointFArr[2].x = rectF2.width() + rectF2.left;
                        pointFArr[2].y = rectF2.top;
                        pointFArr[3].x = rectF2.width() + rectF2.left;
                        pointFArr[3].y = rectF2.height() + rectF2.top;
                        PointF pointF6 = pointFArr[4];
                        pointF6.x = rectF2.left;
                        pointF6.y = rectF2.height() + rectF2.top;
                        PointF pointF7 = pointFArr[5];
                        float f5 = rectF2.left;
                        pointF7.x = f5;
                        pointF7.y = rectF2.top;
                        pointFArr[6].x = ((rectF2.width() * 3.0f) / 6.0f) + f5;
                        pointFArr[6].y = rectF2.top;
                    } else {
                        pointFArr[1].x = rectF2.width() + rectF2.left;
                        pointFArr[1].y = ((rectF2.height() * 3.0f) / 6.0f) + rectF2.top;
                        pointFArr[2].x = rectF2.width() + rectF2.left;
                        pointFArr[2].y = rectF2.height() + rectF2.top;
                        PointF pointF8 = pointFArr[3];
                        pointF8.x = rectF2.left;
                        pointF8.y = rectF2.height() + rectF2.top;
                        PointF pointF9 = pointFArr[4];
                        float f6 = rectF2.left;
                        pointF9.x = f6;
                        pointF9.y = rectF2.top;
                        pointFArr[5].x = rectF2.width() + f6;
                        pointFArr[5].y = rectF2.top;
                        pointFArr[6].x = rectF2.width() + rectF2.left;
                        pointFArr[6].y = ((rectF2.height() * 2.0f) / 6.0f) + rectF2.top;
                    }
                } else if (width * height2 >= height) {
                    pointFArr[1].x = ((rectF2.width() * 3.0f) / 6.0f) + rectF2.left;
                    pointFArr[1].y = rectF2.top;
                    pointFArr[2].x = rectF2.width() + rectF2.left;
                    pointFArr[2].y = rectF2.top;
                    pointFArr[3].x = rectF2.width() + rectF2.left;
                    pointFArr[3].y = rectF2.height() + rectF2.top;
                    PointF pointF10 = pointFArr[4];
                    pointF10.x = rectF2.left;
                    pointF10.y = rectF2.height() + rectF2.top;
                    PointF pointF11 = pointFArr[5];
                    float f7 = rectF2.left;
                    pointF11.x = f7;
                    pointF11.y = rectF2.top;
                    pointFArr[6].x = ((rectF2.width() * 2.0f) / 6.0f) + f7;
                    pointFArr[6].y = rectF2.top;
                } else {
                    PointF pointF12 = pointFArr[1];
                    pointF12.x = rectF2.left;
                    pointF12.y = ((rectF2.height() * 2.0f) / 6.0f) + rectF2.top;
                    PointF pointF13 = pointFArr[2];
                    float f8 = rectF2.left;
                    pointF13.x = f8;
                    pointF13.y = rectF2.top;
                    pointFArr[3].x = rectF2.width() + f8;
                    pointFArr[3].y = rectF2.top;
                    pointFArr[4].x = rectF2.width() + rectF2.left;
                    pointFArr[4].y = rectF2.height() + rectF2.top;
                    PointF pointF14 = pointFArr[5];
                    pointF14.x = rectF2.left;
                    pointF14.y = rectF2.height() + rectF2.top;
                    PointF pointF15 = pointFArr[6];
                    pointF15.x = rectF2.left;
                    pointF15.y = ((rectF2.height() * 3.0f) / 6.0f) + rectF2.top;
                }
            } else if (width * height2 < height) {
                pointFArr[1].x = ((rectF2.width() * 3.0f) / 6.0f) + rectF2.left;
                pointFArr[1].y = rectF2.height() + rectF2.top;
                PointF pointF16 = pointFArr[2];
                pointF16.x = rectF2.left;
                pointF16.y = rectF2.height() + rectF2.top;
                PointF pointF17 = pointFArr[3];
                float f9 = rectF2.left;
                pointF17.x = f9;
                pointF17.y = rectF2.top;
                pointFArr[4].x = rectF2.width() + f9;
                pointFArr[4].y = rectF2.top;
                pointFArr[5].x = rectF2.width() + rectF2.left;
                pointFArr[5].y = rectF2.height() + rectF2.top;
                pointFArr[6].x = ((rectF2.width() * 4.0f) / 6.0f) + rectF2.left;
                pointFArr[6].y = rectF2.height() + rectF2.top;
            } else {
                pointFArr[1].x = rectF2.width() + rectF2.left;
                pointFArr[1].y = ((rectF2.height() * 4.0f) / 6.0f) + rectF2.top;
                pointFArr[2].x = rectF2.width() + rectF2.left;
                pointFArr[2].y = rectF2.height() + rectF2.top;
                PointF pointF18 = pointFArr[3];
                pointF18.x = rectF2.left;
                pointF18.y = rectF2.height() + rectF2.top;
                PointF pointF19 = pointFArr[4];
                float f10 = rectF2.left;
                pointF19.x = f10;
                pointF19.y = rectF2.top;
                pointFArr[5].x = rectF2.width() + f10;
                pointFArr[5].y = rectF2.top;
                pointFArr[6].x = rectF2.width() + rectF2.left;
                pointFArr[6].y = ((rectF2.height() * 3.0f) / 6.0f) + rectF2.top;
            }
        } else if ((-width) * height2 < height) {
            pointFArr[1].x = ((rectF2.width() * 2.0f) / 6.0f) + rectF2.left;
            pointFArr[1].y = rectF2.height() + rectF2.top;
            PointF pointF20 = pointFArr[2];
            pointF20.x = rectF2.left;
            pointF20.y = rectF2.height() + rectF2.top;
            PointF pointF21 = pointFArr[3];
            float f11 = rectF2.left;
            pointF21.x = f11;
            pointF21.y = rectF2.top;
            pointFArr[4].x = rectF2.width() + f11;
            pointFArr[4].y = rectF2.top;
            pointFArr[5].x = rectF2.width() + rectF2.left;
            pointFArr[5].y = rectF2.height() + rectF2.top;
            pointFArr[6].x = ((rectF2.width() * 3.0f) / 6.0f) + rectF2.left;
            pointFArr[6].y = rectF2.height() + rectF2.top;
        } else {
            PointF pointF22 = pointFArr[1];
            pointF22.x = rectF2.left;
            pointF22.y = ((rectF2.height() * 3.0f) / 6.0f) + rectF2.top;
            PointF pointF23 = pointFArr[2];
            float f12 = rectF2.left;
            pointF23.x = f12;
            pointF23.y = rectF2.top;
            pointFArr[3].x = rectF2.width() + f12;
            pointFArr[3].y = rectF2.top;
            pointFArr[4].x = rectF2.width() + rectF2.left;
            pointFArr[4].y = rectF2.height() + rectF2.top;
            PointF pointF24 = pointFArr[5];
            pointF24.x = rectF2.left;
            pointF24.y = rectF2.height() + rectF2.top;
            PointF pointF25 = pointFArr[6];
            pointF25.x = rectF2.left;
            pointF25.y = ((rectF2.height() * 4.0f) / 6.0f) + rectF2.top;
        }
        PointF pointF26 = pointFArr[0];
        path.moveTo(pointF26.x, pointF26.y);
        int i = 0;
        do {
            PointF pointF27 = this.A02;
            PointF pointF28 = pointFArr[i];
            pointF27.set(pointF28.x, pointF28.y);
            PointF pointF29 = this.A03;
            i++;
            PointF pointF30 = pointFArr[i % 7];
            pointF29.set(pointF30.x, pointF30.y);
            float f13 = pointF27.x;
            if (f13 == rectF2.left) {
                float f14 = pointF27.y;
                if (f14 == rectF2.top) {
                    RectF rectF3 = this.A05;
                    rectF3.set(f13, f14, f13 + f, f14 + f);
                    path.arcTo(rectF3, 180.0f, 90.0f, false);
                    f13 = pointF27.x + min;
                    pointF27.x = f13;
                }
            }
            float f15 = pointF29.x;
            float f16 = rectF2.left;
            if (f15 == f16) {
                float f17 = pointF29.y;
                if (f17 == rectF2.top) {
                    pointF29.y = f17 + min;
                }
            }
            if (f13 == rectF2.width() + f16) {
                float f18 = pointF27.y;
                if (f18 == rectF2.top) {
                    float f19 = pointF27.x;
                    RectF rectF4 = this.A05;
                    rectF4.set(f19 - f, f18, f19, f18 + f);
                    path.arcTo(rectF4, -90.0f, 90.0f, false);
                    pointF27.y += min;
                }
            }
            if (pointF29.x == rectF2.width() + rectF2.left && pointF29.y == rectF2.top) {
                pointF29.x -= min;
            }
            if (pointF27.x == rectF2.width() + rectF2.left) {
                if (pointF27.y == rectF2.height() + rectF2.top) {
                    float f20 = pointF27.x;
                    float f21 = pointF27.y;
                    RectF rectF5 = this.A05;
                    rectF5.set(f20 - f, f21 - f, f20, f21);
                    path.arcTo(rectF5, 0.0f, 90.0f, false);
                    pointF27.x -= min;
                }
            }
            if (pointF29.x == rectF2.width() + rectF2.left) {
                if (pointF29.y == rectF2.height() + rectF2.top) {
                    pointF29.y -= min;
                }
            }
            if (pointF27.x == rectF2.left) {
                if (pointF27.y == rectF2.height() + rectF2.top) {
                    float f22 = pointF27.x;
                    float f23 = pointF27.y;
                    RectF rectF6 = this.A05;
                    rectF6.set(f22, f23 - f, f22 + f, f23);
                    path.arcTo(rectF6, 90.0f, 90.0f, false);
                    pointF27.y -= min;
                }
            }
            if (pointF29.x == rectF2.left) {
                if (pointF29.y == rectF2.height() + rectF2.top) {
                    pointF29.x += min;
                }
            }
            path.lineTo(pointF29.x, pointF29.y);
        } while (i < 7);
        canvas.drawPath(path, this.A00);
        canvas.drawPath(path, super.A03);
    }

    @Override // X.AbstractC48582Mw
    public void A0E(RectF rectF, float f, float f2, float f3, float f4) {
        float f5 = (f2 + f4) / 2.0f;
        float f6 = (((f3 - f) * 2.0f) / 3.0f) / 2.0f;
        super.A0E(rectF, f, f5 - f6, f3, f5 + f6);
    }
}
