package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.os.Vibrator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.google.android.search.verification.client.R;
import com.whatsapp.doodle.DoodleView;
import com.whatsapp.util.Log;

/* renamed from: X.2c7  reason: invalid class name and case insensitive filesystem */
public class GestureDetector$OnGestureListenerC52962c7 implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public final C14890n3 A00;
    public final DoodleView A01;
    public final AnonymousClass2MV A02;
    public final AnonymousClass2MW A03;
    public final AnonymousClass2MX A04;

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public GestureDetector$OnGestureListenerC52962c7(DoodleView doodleView) {
        this.A01 = doodleView;
        this.A00 = new C14890n3(doodleView.getContext(), this);
        AnonymousClass2MX r2 = new AnonymousClass2MX(doodleView.getContext(), this);
        this.A04 = r2;
        if (Build.VERSION.SDK_INT >= 19) {
            r2.setQuickScaleEnabled(false);
        }
        this.A03 = new AnonymousClass2MW(this);
        this.A02 = new AnonymousClass2MV(this, doodleView.getContext());
    }

    public void A00(PointF pointF, PointF pointF2) {
        PointF pointF3;
        float f;
        float f2;
        int i;
        DoodleView doodleView = this.A01;
        AbstractC48582Mw r1 = doodleView.A0R;
        if (!(r1 == null || (r1 instanceof C53182cf))) {
            if (!(pointF.x == 0.0f && pointF.y == 0.0f)) {
                if (r1 != null) {
                    PointF A032 = doodleView.A03(new PointF(r1.A04.centerX(), r1.A04.centerY()));
                    doodleView.A0A();
                    AnonymousClass2MN r8 = doodleView.A0O;
                    boolean z = false;
                    if (doodleView.A04 != 1.0f) {
                        z = true;
                    }
                    AbstractC48582Mw r9 = doodleView.A0R;
                    if ((r8.A01.A0D(AbstractC000400g.A2Q) || r8.A05.A0E(278)) && !z) {
                        C48392Ma r7 = r8.A03;
                        if (r7.A04 != r9) {
                            r7.A04 = r9;
                            r7.A01();
                        }
                        float f3 = pointF.x;
                        float f4 = pointF.y;
                        PointF pointF4 = new PointF(r7.A02.centerX(), r7.A02.centerY());
                        if (r7.A06) {
                            f = r7.A00;
                        } else {
                            f = A032.x;
                        }
                        float f5 = f + f3;
                        if (r7.A07) {
                            f2 = r7.A01;
                        } else {
                            f2 = A032.y;
                        }
                        PointF pointF5 = new PointF(f5, f2 + f4);
                        if (r7.A07) {
                            float centerY = r7.A02.centerY();
                            float f6 = r7.A08;
                            if (centerY + f6 < pointF5.y || r7.A02.centerY() - f6 > pointF5.y) {
                                r7.A07 = false;
                                f4 += r7.A01 - A032.y;
                                r7.A01 = 0.0f;
                            } else {
                                r7.A01 += f4;
                                f4 = 0.0f;
                            }
                        } else {
                            float f7 = A032.y;
                            float f8 = pointF4.y;
                            if ((f7 <= f8 && pointF.y + f7 >= f8) || (f7 >= f8 && pointF.y + f7 <= f8)) {
                                r7.A07 = true;
                                r7.A01 = pointF5.y;
                                f4 = f8 - f7;
                            }
                        }
                        if (r7.A06) {
                            float centerX = r7.A02.centerX();
                            float f9 = r7.A08;
                            if (centerX + f9 < pointF5.x || r7.A02.centerX() - f9 > pointF5.x) {
                                r7.A06 = false;
                                f3 += r7.A00 - A032.x;
                                r7.A00 = 0.0f;
                            } else {
                                r7.A00 += f3;
                                f3 = 0.0f;
                            }
                        } else {
                            float f10 = A032.x;
                            float f11 = pointF4.x;
                            if ((f10 <= f11 && pointF.x + f10 >= f11) || (f10 >= f11 && pointF.x + f10 <= f11)) {
                                r7.A06 = true;
                                r7.A00 = pointF5.x;
                                f3 = f11 - f10;
                            }
                        }
                        pointF3 = new PointF(f3, f4);
                        PointF pointF6 = new PointF(A032.x + pointF3.x, A032.y + pointF3.y);
                        AnonymousClass2c9 r3 = (AnonymousClass2c9) r7.A05.get(3);
                        if (r3.A03) {
                            r7.A00(pointF6, 0.0f, r9);
                        }
                        float f12 = pointF.x;
                        float f13 = pointF.y;
                        boolean z2 = false;
                        if (Math.sqrt((double) ((f13 * f13) + (f12 * f12))) > 200.0d) {
                            z2 = true;
                        }
                        for (AnonymousClass2MZ r6 : r7.A05.values()) {
                            if (!(r6 instanceof AnonymousClass2c9)) {
                                i = ((AnonymousClass2c8) r6).A00;
                            } else {
                                i = 3;
                            }
                            if (i != 1) {
                                if (i == 2) {
                                    if (!r7.A06 || z2 || (r3.A03 && r3.A01 == 2)) {
                                        r6.A00();
                                    } else {
                                        r6.A01();
                                    }
                                }
                            } else if (!r7.A07 || z2 || (r3.A03 && r3.A01 == 0)) {
                                r6.A00();
                            } else {
                                r6.A01();
                            }
                        }
                    } else {
                        pointF3 = pointF;
                    }
                    AnonymousClass2NF r72 = r8.A04;
                    boolean A012 = r72.A01(pointF2.x, pointF2.y);
                    boolean z3 = r72.A00;
                    if (A012) {
                        if (!z3) {
                            AnonymousClass2NE r32 = r72.A04;
                            r32.A00 = r72.A03.getContext().getResources().getColor(R.color.trashHoverBackground);
                            r32.invalidateSelf();
                            Vibrator vibrator = r72.A02;
                            if (vibrator != null) {
                                try {
                                    vibrator.vibrate(3);
                                } catch (NullPointerException e) {
                                    Log.e("Vibrator is broken on this device.", e);
                                }
                            }
                        }
                    } else if (z3) {
                        r72.A00();
                    }
                    r72.A00 = A012;
                    float[] fArr = doodleView.A0o;
                    fArr[0] = pointF3.x;
                    fArr[1] = pointF3.y;
                    Matrix matrix = doodleView.A0b;
                    matrix.reset();
                    matrix.setRotate((float) (-doodleView.A0A));
                    matrix.mapPoints(fArr);
                    AbstractC48582Mw r4 = doodleView.A0R;
                    float f14 = fArr[0];
                    float f15 = doodleView.A00 * doodleView.A04;
                    r4.A04.offset(f14 / f15, fArr[1] / f15);
                    doodleView.invalidate();
                    return;
                }
                throw null;
            }
        }
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        DoodleView doodleView = this.A01;
        if (!doodleView.A0Y) {
            doodleView.A0S = null;
            doodleView.A0Q = null;
            if (doodleView.A0R != null && (!doodleView.A0U.A01.isEmpty())) {
                C48592Mx r0 = doodleView.A0U;
                if (r0.A01.indexOf(doodleView.A0R) != doodleView.A0U.A01.size() - 1) {
                    C48592Mx r3 = doodleView.A0U;
                    AbstractC48582Mw r2 = doodleView.A0R;
                    r3.A00.A00.add(new C53262cn(r2, r3.A01.indexOf(r2)));
                    C48592Mx r02 = doodleView.A0U;
                    r02.A01.remove(doodleView.A0R);
                    C48592Mx r03 = doodleView.A0U;
                    r03.A01.add(doodleView.A0R);
                    doodleView.A0X = false;
                    doodleView.invalidate();
                }
            }
        }
        return false;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float f = ((AnonymousClass2MX) scaleGestureDetector).A00;
        DoodleView doodleView = this.A01;
        AbstractC48582Mw r7 = doodleView.A0R;
        if (r7 == null) {
            return true;
        }
        if (r7 instanceof C53212ci) {
            int i = 0;
            if (Math.abs(f) < 1.0f) {
                i = 1;
            }
            r7.A07(scaleFactor, i ^ 1);
        } else if (r7 instanceof C53192cg) {
            int i2 = 0;
            if (Math.abs(Math.tan(Math.atan((double) f) - Math.toRadians((double) r7.A00))) < 1.0d) {
                i2 = 1;
            }
            r7.A07(scaleFactor, 1 ^ i2);
        } else if (!(r7 instanceof C53172ce)) {
            r7.A05(scaleFactor);
        } else {
            int i3 = 0;
            if (Math.abs(Math.tan(Math.atan((double) f) - Math.toRadians((double) r7.A00))) < 1.0d) {
                i3 = 1;
            }
            r7.A07(scaleFactor, 1 ^ i3);
        }
        doodleView.invalidate();
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.A01.A0a = true;
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.A01.A0a = false;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        DoodleView doodleView = this.A01;
        if (doodleView.A0Y || doodleView.A0U.A01.size() == 1) {
            return false;
        }
        C48592Mx r0 = doodleView.A0U;
        if (r0.A01.indexOf(doodleView.A0R) == doodleView.A0U.A01.size() - 1) {
            return false;
        }
        doodleView.A0B(motionEvent.getX(), motionEvent.getY());
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        DoodleView doodleView = this.A01;
        if (doodleView.A0Y) {
            return false;
        }
        doodleView.A0R = doodleView.A04(motionEvent);
        if (doodleView.A0U.A01.size() != 1) {
            C48592Mx r0 = doodleView.A0U;
            if (r0.A01.indexOf(doodleView.A0R) != doodleView.A0U.A01.size() - 1) {
                return false;
            }
        }
        doodleView.A0B(motionEvent.getX(), motionEvent.getY());
        return false;
    }
}
