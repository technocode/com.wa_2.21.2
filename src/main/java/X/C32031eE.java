package X;

import android.content.Context;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1eE  reason: invalid class name and case insensitive filesystem */
public final class C32031eE implements AbstractC19220uf, AbstractC19520vA, AbstractC19530vB {
    public float A00 = 19.0f;
    public float A01 = 2.0f;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public AbstractC19070uN A07;
    public AbstractC19080uO A08;
    public AbstractC19090uP A09;
    public AbstractC19100uQ A0A;
    public AbstractC19110uR A0B;
    public AbstractC19120uV A0C;
    public AbstractC19160uZ A0D;
    public C32061eH A0E;
    public C32111eM A0F;
    public C32221eX A0G;
    public C32231eY A0H;
    public C19540vC A0I;
    public C19540vC A0J;
    public C19540vC A0K;
    public C19540vC A0L;
    public boolean A0M = false;
    public boolean A0N;
    public final int A0O;
    public final Context A0P;
    public final Matrix A0Q = new Matrix();
    public final C19250ui A0R;
    public final C19270uk A0S;
    public final AnonymousClass28Y A0T;
    public final C32251ea A0U;
    public final ArrayList A0V = new ArrayList();
    public final List A0W = new ArrayList();
    public final float[] A0X = new float[2];

    @Override // X.AbstractC19220uf
    public boolean AA5(C32311eg r2) {
        return false;
    }

    @Override // X.AbstractC19520vA
    public void ACn(C19540vC r1) {
    }

    @Override // X.AbstractC19520vA
    public void ACp(C19540vC r1) {
    }

    public C32031eE(C32061eH r7, C19130uW r8) {
        this.A0E = r7;
        Context applicationContext = r7.getContext().getApplicationContext();
        this.A0P = applicationContext;
        this.A0R = new C19250ui(this);
        this.A0S = new C19270uk(this);
        Context applicationContext2 = applicationContext.getApplicationContext();
        C19590vH.A02 = applicationContext2;
        C19590vH.A00 = applicationContext2.getResources().getDisplayMetrics().density;
        int i = this.A0P.getResources().getDisplayMetrics().densityDpi >= 320 ? 512 : 256;
        this.A0O = i;
        AnonymousClass28Y r0 = new AnonymousClass28Y(this, new AnonymousClass28Z(this.A0P, i, i));
        A09(r0);
        this.A0T = r0;
        C32251ea r5 = new C32251ea(this.A0E.getContext());
        this.A0U = r5;
        C32021eD r2 = new C32021eD(this);
        r5.A01 = r2;
        if (r5.A00 != null && r5.A03) {
            r2.A00.A0E.invalidate();
        }
        if (r8 != null) {
            this.A0S.A01(r8.A04);
            C19270uk r22 = this.A0S;
            r22.A02 = r8.A05;
            r22.A03 = r8.A06;
            r22.A04 = r8.A08;
            this.A00 = Math.min(Math.max(19.0f, 2.0f), 19.0f);
            this.A01 = Math.min(Math.max(2.0f, 2.0f), 19.0f);
            AnonymousClass28Y r4 = this.A0T;
            int i2 = r8.A02;
            if (i2 != r4.A00) {
                r4.A00 = i2;
                if (i2 == 0) {
                    ((AbstractC19160uZ) r4).A04 = false;
                    r4.A00();
                    r4.A05();
                    C32141eP r02 = r4.A02;
                    ((AbstractC19160uZ) r02).A04 = false;
                    r02.A00();
                    return;
                }
                if (!((AbstractC19160uZ) r4).A04) {
                    boolean z = true;
                    ((AbstractC19160uZ) r4).A04 = true;
                    r4.A00();
                    r4.A05();
                    C32141eP r1 = r4.A02;
                    ((AbstractC19160uZ) r1).A04 = !r4.A01 ? false : z;
                    r1.A00();
                }
                AnonymousClass28Z r12 = r4.A03;
                if (i2 == 5) {
                    r12.A00 = "live_maps";
                } else if (i2 == 6) {
                    r12.A00 = "crowdsourcing_osm";
                } else if (i2 != 7) {
                    r12.A00 = null;
                } else {
                    r12.A00 = "indoor_osm";
                }
                C32031eE r03 = ((AbstractC19160uZ) r4).A0A;
                r03.A03();
                r03.A0E.invalidate();
            }
        }
    }

    public final float A00() {
        return (((float) ((this.A0E.A0F - 0) - this.A05)) / 2.0f) + ((float) 0);
    }

    public final float A01() {
        int i = this.A06;
        return (((float) ((this.A0E.A0D - i) - this.A04)) / 2.0f) + ((float) i);
    }

    public final C07020Vp A02() {
        float[] fArr = this.A0X;
        C32061eH r3 = this.A0E;
        fArr[0] = r3.A04 - A00();
        fArr[1] = r3.A05 - A01();
        r3.A0l.mapVectors(fArr);
        C32061eH r7 = this.A0E;
        double d = r7.A02;
        float f = fArr[0];
        float f2 = (float) r7.A0J;
        return new C07020Vp(new C07040Vr(C19250ui.A00(r7.A03 - ((double) (fArr[1] / f2))), ((d - ((double) (f / f2))) * 360.0d) - 180.0d), r7.getZoom(), 0.0f, r7.A0B);
    }

    public void A03() {
        List list = this.A0W;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC19160uZ r1 = (AbstractC19160uZ) list.get(i);
            if (r1 instanceof AbstractC32091eK) {
                ((AbstractC32091eK) r1).A04();
            }
        }
    }

    public void A04() {
        if (this.A09 != null || !this.A0V.isEmpty()) {
            C07020Vp A022 = A02();
            AbstractC19090uP r0 = this.A09;
            if (r0 != null) {
                r0.ADh(A022);
            }
            ArrayList arrayList = this.A0V;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC19090uP) it.next()).ADh(A022);
                }
            }
        }
    }

    public final void A05() {
        Iterator it = this.A0W.iterator();
        while (it.hasNext()) {
            int i = ((AbstractC19160uZ) it.next()).A03;
            if (i == 1 || i == 2 || i == 4) {
                it.remove();
            }
        }
        this.A0E.invalidate();
    }

    public final void A06() {
        C19540vC r0 = this.A0J;
        if (r0 != null) {
            r0.A01();
        }
        C19540vC r02 = this.A0K;
        if (r02 != null) {
            r02.A01();
        }
        C19540vC r03 = this.A0L;
        if (r03 != null) {
            r03.A01();
        }
        C19540vC r04 = this.A0I;
        if (r04 != null) {
            r04.A01();
        }
    }

    public final void A07(int i, int i2, int i3) {
        C32061eH r6 = this.A0E;
        double d = r6.A02;
        long j = r6.A0J << 1;
        r6.A09(d + ((double) (((long) ((0 - this.A05) - (0 - i2))) / j)), r6.A03 + ((double) (((long) ((this.A06 - this.A04) - (i - i3))) / j)));
        this.A06 = i;
        this.A05 = i2;
        this.A04 = i3;
        r6.requestLayout();
        this.A0E.invalidate();
    }

    public final void A08(C07030Vq r18, int i, AbstractC19070uN r20) {
        if (!this.A0E.A0e) {
            if (i != 0) {
                this.A0T.A07(true);
            }
            A06();
            this.A0M = true;
            float A002 = A00();
            float A012 = A01();
            C32061eH r11 = this.A0E;
            float zoom = r11.getZoom();
            this.A02 = A002;
            this.A03 = A012;
            float f = r18.A03;
            if (f != -2.14748365E9f) {
                zoom = f;
            } else {
                float f2 = r18.A04;
                if (f2 != -2.14748365E9f) {
                    zoom += f2;
                    float f3 = r18.A05;
                    if (!(f3 == -2.14748365E9f && r18.A06 == -2.14748365E9f)) {
                        this.A02 = f3;
                        this.A03 = r18.A06;
                    }
                } else {
                    C19630vL r5 = r18.A09;
                    if (r5 != null) {
                        int i2 = (r11.A0F - 0) - this.A05;
                        int i3 = (r11.A0D - this.A06) - this.A04;
                        if (i2 == 0 && i3 == 0) {
                            throw new IllegalStateException("Error using newLatLngBounds(LatLngBounds, int): Map size can't be 0. Most likely, layout has not yet occured for the map view.  Either wait until layout has occurred or use newLatLngBounds(LatLngBounds, int, int, int) which allows you to specify the map's dimensions.");
                        }
                        int i4 = r18.A07 << 1;
                        if (i2 + i4 > i2) {
                            i2 -= i4;
                        }
                        if (i3 + i4 > i3) {
                            i3 -= i4;
                        }
                        int max = Math.max(0, i2);
                        int max2 = Math.max(0, i3);
                        C07040Vr r4 = r5.A00;
                        float A022 = C19250ui.A02(r4.A01);
                        C07040Vr r52 = r5.A01;
                        float abs = Math.abs(A022 - C19250ui.A02(r52.A01));
                        float abs2 = Math.abs(C19250ui.A01(r52.A00) - C19250ui.A01(r4.A00));
                        float f4 = (float) this.A0O;
                        double log = Math.log((double) ((((float) max) / abs) / f4));
                        double d = C32061eH.A0q;
                        zoom = Math.min((float) (log / d), (float) (Math.log((double) ((((float) max2) / abs2) / f4)) / d));
                    }
                }
            }
            float max3 = Math.max(this.A01, Math.min(this.A00, zoom));
            double d2 = r11.A02;
            double d3 = r11.A03;
            C07040Vr r14 = r18.A08;
            if (!(r14 == null && r18.A09 == null)) {
                if (r14 == null) {
                    r14 = r18.A09.A01();
                }
                d2 = (double) C19250ui.A02(r14.A01);
                d3 = (double) C19250ui.A01(r14.A00);
                float[] fArr = this.A0X;
                fArr[0] = r11.A04 - A002;
                float f5 = r11.A05 - A012;
                fArr[1] = f5;
                if (!(fArr[0] == 0.0f && f5 == 0.0f)) {
                    int i5 = (1 << ((int) max3)) * this.A0O;
                    float f6 = (max3 % 1.0f) + 1.0f;
                    Matrix matrix = this.A0Q;
                    matrix.setScale(f6, f6);
                    matrix.postRotate(this.A0E.A0B);
                    matrix.invert(matrix);
                    matrix.mapVectors(fArr);
                    float f7 = (float) i5;
                    d2 += (double) (fArr[0] / f7);
                    d3 += (double) (fArr[1] / f7);
                }
            }
            C32061eH r112 = this.A0E;
            float f8 = r112.A0B;
            float f9 = r18.A00;
            if (f9 != -2.14748365E9f) {
                float f10 = f9 % 360.0f;
                if (f8 - f10 > 180.0f) {
                    f8 = f10 + 360.0f;
                } else {
                    f8 = f10 - f8 > 180.0f ? f10 - 360.0f : f10;
                }
            }
            double A003 = C32061eH.A00(d2);
            double A013 = r112.A01(d3, (long) ((1 << ((int) max3)) * this.A0O));
            if (i <= 0) {
                if (max3 != r112.getZoom()) {
                    r112.A0J(max3, this.A02, this.A03);
                }
                C32061eH r7 = this.A0E;
                if (!(A003 == r7.A02 && A013 == r7.A03)) {
                    r7.A09(A003, A013);
                }
                if (f8 != r7.A0B) {
                    r7.A0B(f8, A002, A012);
                }
                this.A0E.invalidate();
                A04();
            } else {
                this.A07 = r20;
                float zoom2 = r112.getZoom();
                if (max3 != zoom2) {
                    C19540vC A004 = C19540vC.A00(zoom2, max3);
                    this.A0L = A004;
                    A004.A06(this);
                    A004.A07(this);
                    A004.A05((long) i);
                }
                double d4 = this.A0E.A02;
                if (A003 != d4) {
                    double d5 = A003 - d4;
                    if (d5 > 0.5d) {
                        A003 -= 1.0d;
                    } else if (d5 < -0.5d) {
                        A003 += 1.0d;
                    }
                    C19540vC A005 = C19540vC.A00((float) d4, (float) A003);
                    this.A0J = A005;
                    A005.A06(this);
                    A005.A07(this);
                    A005.A05((long) i);
                }
                double d6 = this.A0E.A03;
                if (A013 != d6) {
                    C19540vC A006 = C19540vC.A00((float) d6, (float) A013);
                    this.A0K = A006;
                    A006.A06(this);
                    A006.A07(this);
                    A006.A05((long) i);
                }
                float f11 = this.A0E.A0B;
                if (f8 != f11) {
                    C19540vC A007 = C19540vC.A00(f11, f8);
                    this.A0I = A007;
                    A007.A06(this);
                    A007.A07(this);
                    A007.A05((long) i);
                }
                C19540vC r0 = this.A0J;
                if (r0 != null) {
                    r0.A03();
                }
                C19540vC r02 = this.A0K;
                if (r02 != null) {
                    r02.A03();
                }
                C19540vC r03 = this.A0L;
                if (r03 != null) {
                    r03.A03();
                }
                C19540vC r04 = this.A0I;
                if (r04 != null) {
                    r04.A03();
                }
            }
            if (this.A0J == null && this.A0K == null && this.A0L == null && this.A0I == null && r20 != null) {
                this.A07 = null;
                r20.AGA();
            }
        }
    }

    public final void A09(AbstractC19160uZ r3) {
        List list = this.A0W;
        int binarySearch = Collections.binarySearch(list, r3, AbstractC19160uZ.A0F);
        if (binarySearch <= 0) {
            list.add(-1 - binarySearch, r3);
            r3.A01();
            this.A0E.invalidate();
        }
    }

    public final void A0A(AbstractC19160uZ r2) {
        this.A0W.remove(r2);
        this.A0E.invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (X.C004302a.A01(r1, "android.permission.ACCESS_FINE_LOCATION") == 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(boolean r3) {
        /*
            r2 = this;
            android.content.Context r1 = r2.A0P
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = X.C004302a.A01(r1, r0)
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r1 = X.C004302a.A01(r1, r0)
            r0 = 0
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            r2.A0N = r0
            r3 = r3 & r0
            X.1ea r0 = r2.A0U
            r0.A01(r3)
            if (r3 == 0) goto L_0x003d
            X.1eY r0 = r2.A0H
            if (r0 != 0) goto L_0x0037
            X.1eY r0 = new X.1eY
            r0.<init>(r2)
            r2.A0H = r0
            r2.A09(r0)
            X.1eY r0 = r2.A0H
            X.0vC r1 = r0.A0E
            boolean r0 = r1.A0I
            if (r0 != 0) goto L_0x0037
            r1.A03()
        L_0x0037:
            X.0uk r0 = r2.A0S
            r0.A00()
            return
        L_0x003d:
            X.1eY r1 = r2.A0H
            if (r1 == 0) goto L_0x0037
            X.0vC r0 = r1.A0E
            r0.A01()
            r1.A00()
            X.1eY r0 = r2.A0H
            r2.A0A(r0)
            r0 = 0
            r2.A0H = r0
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32031eE.A0B(boolean):void");
    }

    @Override // X.AbstractC19220uf
    public boolean AA3(C32311eg r2) {
        AbstractC19100uQ r0 = this.A0A;
        if (r0 == null) {
            return false;
        }
        r0.AGk(r2);
        return true;
    }

    @Override // X.AbstractC19220uf
    public boolean AA4(C32311eg r3) {
        AbstractC19120uV r0 = this.A0C;
        return r0 != null && r0.AHT(r3);
    }

    @Override // X.AbstractC19220uf
    public void AA6(C32311eg r1) {
        A0A(r1);
        A09(r1);
    }

    @Override // X.AbstractC19520vA
    public void ACj(C19540vC r3) {
        if (r3 == this.A0J) {
            this.A0J = null;
        } else if (r3 == this.A0K) {
            this.A0K = null;
        } else if (r3 == this.A0L) {
            this.A0L = null;
        } else if (r3 == this.A0I) {
            this.A0I = null;
        }
        r3.A02();
        if (this.A0J == null && this.A0K == null && this.A0L == null && this.A0I == null) {
            this.A0M = false;
            AbstractC19070uN r0 = this.A07;
            if (r0 != null) {
                this.A07 = null;
                r0.ADq();
            }
            A04();
        }
    }

    @Override // X.AbstractC19520vA
    public void ACl(C19540vC r3) {
        if (r3 == this.A0J) {
            this.A0J = null;
        } else if (r3 == this.A0K) {
            this.A0K = null;
        } else if (r3 == this.A0L) {
            this.A0L = null;
        } else if (r3 == this.A0I) {
            this.A0I = null;
        }
        r3.A02();
        if (this.A0M && this.A0J == null && this.A0K == null && this.A0L == null && this.A0I == null) {
            this.A0M = false;
            AbstractC19070uN r0 = this.A07;
            if (r0 != null) {
                this.A07 = null;
                r0.AGA();
            }
            A04();
        }
    }

    @Override // X.AbstractC19530vB
    public void ACr(C19540vC r6) {
        C19540vC r0 = this.A0J;
        if (r6 == r0) {
            C32061eH r4 = this.A0E;
            r4.A09((double) r0.A00, r4.A03);
            r4.invalidate();
            return;
        }
        C19540vC r02 = this.A0K;
        if (r6 == r02) {
            C32061eH r42 = this.A0E;
            r42.A09(r42.A02, (double) r02.A00);
            r42.invalidate();
        } else if (r6 == this.A0L) {
            this.A0E.A0I(r6.A00, this.A02, this.A03);
            this.A0E.invalidate();
        } else if (r6 == this.A0I) {
            this.A0E.A0B(r6.A00, A00(), A01());
            this.A0E.invalidate();
        }
    }
}
