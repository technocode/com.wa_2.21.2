package X;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.0pw  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC16520pw {
    public int A00 = -1;
    public View A01;
    public AnonymousClass0VT A02;
    public RecyclerView A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C16510pv A07 = new C16510pv();

    public PointF A00(int i) {
        AnonymousClass0VT r1 = this.A02;
        if (r1 instanceof AbstractC07830Zt) {
            return ((AbstractC07830Zt) r1).A2v(i);
        }
        StringBuilder A0S = AnonymousClass008.A0S("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
        A0S.append(AbstractC07830Zt.class.getCanonicalName());
        Log.w("RecyclerView", A0S.toString());
        return null;
    }

    public final void A01() {
        if (this.A05) {
            this.A05 = false;
            C30521bU r0 = (C30521bU) this;
            r0.A01 = 0;
            r0.A00 = 0;
            r0.A02 = null;
            this.A03.A0z.A07 = -1;
            this.A01 = null;
            this.A00 = -1;
            this.A04 = false;
            AnonymousClass0VT r1 = this.A02;
            if (r1.A06 == this) {
                r1.A06 = null;
            }
            this.A02 = null;
            this.A03 = null;
        }
    }

    public void A02(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        PointF A002;
        RecyclerView recyclerView = this.A03;
        if (!this.A05 || this.A00 == -1 || recyclerView == null) {
            A01();
        }
        if (this.A04 && this.A01 == null && this.A02 != null && (A002 = A00(this.A00)) != null) {
            float f = A002.x;
            if (!(f == 0.0f && A002.y == 0.0f)) {
                recyclerView.A0e((int) Math.signum(f), (int) Math.signum(A002.y), null);
            }
        }
        boolean z = false;
        this.A04 = false;
        View view = this.A01;
        if (view != null) {
            if (this.A03 != null) {
                AbstractC11910hD A012 = RecyclerView.A01(view);
                if (A012 != null) {
                    i3 = A012.A01();
                } else {
                    i3 = -1;
                }
                if (i3 == this.A00) {
                    View view2 = this.A01;
                    C16510pv r4 = this.A07;
                    C30521bU r7 = (C30521bU) this;
                    if (r7 instanceof AnonymousClass245) {
                        AnonymousClass245 r72 = (AnonymousClass245) r7;
                        AbstractC30661bi r1 = r72.A00;
                        RecyclerView recyclerView2 = r1.A01;
                        if (recyclerView2 != null) {
                            int[] A032 = r1.A03(recyclerView2.A0S, view2);
                            int i7 = A032[0];
                            int i8 = A032[1];
                            int ceil = (int) Math.ceil(((double) r72.A03(Math.max(Math.abs(i7), Math.abs(i8)))) / 0.3356d);
                            if (ceil > 0) {
                                DecelerateInterpolator decelerateInterpolator = ((C30521bU) r72).A04;
                                r4.A02 = i7;
                                r4.A03 = i8;
                                r4.A01 = ceil;
                                r4.A05 = decelerateInterpolator;
                                r4.A06 = true;
                            }
                        }
                    } else if (!(r7 instanceof AnonymousClass243)) {
                        if (r7 instanceof C59492nl) {
                            i4 = -1;
                        } else if (!(r7 instanceof AnonymousClass277)) {
                            PointF pointF = r7.A02;
                            if (pointF != null) {
                                float f2 = pointF.x;
                                if (f2 != 0.0f) {
                                    i4 = -1;
                                    if (f2 > 0.0f) {
                                        i4 = 1;
                                    }
                                }
                            }
                            i4 = 0;
                        } else {
                            i4 = ((AnonymousClass277) r7).A00;
                        }
                        AnonymousClass0VT r11 = ((AbstractC16520pw) r7).A02;
                        int i9 = 0;
                        if (r11 == null || !r11.A0d()) {
                            i5 = 0;
                        } else {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                            int A033 = AnonymousClass0VT.A03(view2) - marginLayoutParams.leftMargin;
                            int A042 = AnonymousClass0VT.A04(view2) + marginLayoutParams.rightMargin;
                            int A0D = r11.A0D();
                            int A0E = r11.A03 - r11.A0E();
                            if (i4 == -1) {
                                i5 = A0D - A033;
                            } else if (i4 == 0) {
                                int i10 = A0D - A033;
                                if (i10 > 0) {
                                    i5 = i10;
                                } else {
                                    int i11 = A0E - A042;
                                    i5 = 0;
                                    if (i11 < 0) {
                                        i5 = i11;
                                    }
                                }
                            } else if (i4 == 1) {
                                i5 = A0E - A042;
                            } else {
                                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
                            }
                        }
                        if (r7 instanceof C59442ng) {
                            i6 = -1;
                        } else if (!(r7 instanceof AnonymousClass277)) {
                            PointF pointF2 = r7.A02;
                            if (pointF2 != null) {
                                float f3 = pointF2.y;
                                if (f3 != 0.0f) {
                                    int i12 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
                                    i6 = -1;
                                    if (i12 > 0) {
                                        i6 = 1;
                                    }
                                }
                            }
                            i6 = 0;
                        } else {
                            i6 = ((AnonymousClass277) r7).A00;
                        }
                        AnonymousClass0VT r112 = ((AbstractC16520pw) r7).A02;
                        if (r112 != null && r112.A0e()) {
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                            int A052 = AnonymousClass0VT.A05(view2) - marginLayoutParams2.topMargin;
                            int A022 = AnonymousClass0VT.A02(view2) + marginLayoutParams2.bottomMargin;
                            int A0F = r112.A0F();
                            int A0C = r112.A00 - r112.A0C();
                            if (i6 == -1) {
                                i9 = A0F - A052;
                            } else if (i6 == 0) {
                                int i13 = A0F - A052;
                                if (i13 > 0) {
                                    i9 = i13;
                                } else {
                                    int i14 = A0C - A022;
                                    if (i14 < 0) {
                                        i9 = i14;
                                    }
                                }
                            } else if (i6 == 1) {
                                i9 = A0C - A022;
                            } else {
                                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
                            }
                        }
                        int ceil2 = (int) Math.ceil(((double) r7.A03((int) Math.sqrt((double) ((i9 * i9) + (i5 * i5))))) / 0.3356d);
                        if (ceil2 > 0) {
                            DecelerateInterpolator decelerateInterpolator2 = r7.A04;
                            r4.A02 = -i5;
                            r4.A03 = -i9;
                            r4.A01 = ceil2;
                            r4.A05 = decelerateInterpolator2;
                            r4.A06 = true;
                        }
                    } else {
                        AnonymousClass243 r73 = (AnonymousClass243) r7;
                        AnonymousClass244 r12 = r73.A00;
                        int[] A034 = r12.A03(((AbstractC30661bi) r12).A01.A0S, view2);
                        int i15 = A034[0];
                        int i16 = A034[1];
                        int ceil3 = (int) Math.ceil(((double) r73.A03(Math.max(Math.abs(i15), Math.abs(i16)))) / 0.3356d);
                        if (ceil3 > 0) {
                            DecelerateInterpolator decelerateInterpolator3 = ((C30521bU) r73).A04;
                            r4.A02 = i15;
                            r4.A03 = i16;
                            r4.A01 = ceil3;
                            r4.A05 = decelerateInterpolator3;
                            r4.A06 = true;
                        }
                    }
                    r4.A00(recyclerView);
                    A01();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.A01 = null;
                }
            } else {
                throw null;
            }
        }
        if (this.A05) {
            C16510pv r6 = this.A07;
            C30521bU r74 = (C30521bU) this;
            if (((AbstractC16520pw) r74).A03.A0S.A0A() == 0) {
                r74.A01();
            } else {
                int i17 = r74.A00;
                int i18 = i17 - i;
                if (i17 * i18 <= 0) {
                    i18 = 0;
                }
                r74.A00 = i18;
                int i19 = r74.A01;
                int i20 = i19 - i2;
                if (i19 * i20 <= 0) {
                    i20 = 0;
                }
                r74.A01 = i20;
                if (i18 == 0 && i20 == 0) {
                    PointF A003 = r74.A00(((AbstractC16520pw) r74).A00);
                    if (A003 != null) {
                        float f4 = A003.x;
                        if (!(f4 == 0.0f && A003.y == 0.0f)) {
                            float f5 = A003.y;
                            float sqrt = (float) Math.sqrt((double) ((f5 * f5) + (f4 * f4)));
                            float f6 = f4 / sqrt;
                            A003.x = f6;
                            float f7 = f5 / sqrt;
                            A003.y = f7;
                            r74.A02 = A003;
                            r74.A00 = (int) (f6 * 10000.0f);
                            r74.A01 = (int) (f7 * 10000.0f);
                            int A035 = r74.A03(SearchActionVerificationClientService.NOTIFICATION_ID);
                            int i21 = (int) (((float) r74.A00) * 1.2f);
                            int i22 = (int) (((float) r74.A01) * 1.2f);
                            LinearInterpolator linearInterpolator = r74.A05;
                            r6.A02 = i21;
                            r6.A03 = i22;
                            r6.A01 = (int) (((float) A035) * 1.2f);
                            r6.A05 = linearInterpolator;
                            r6.A06 = true;
                        }
                    }
                    r6.A04 = ((AbstractC16520pw) r74).A00;
                    r74.A01();
                }
            }
            if (r6.A04 >= 0) {
                z = true;
            }
            r6.A00(recyclerView);
            if (!z) {
                return;
            }
            if (this.A05) {
                this.A04 = true;
                recyclerView.A10.A01();
                return;
            }
            A01();
        }
    }
}
