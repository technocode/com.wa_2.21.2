package X;

import android.content.Context;
import android.os.Build;
import android.view.ViewOutlineProvider;

/* renamed from: X.1pJ  reason: invalid class name and case insensitive filesystem */
public class C38091pJ implements AnonymousClass11B {
    @Override // X.AnonymousClass11B
    public void A2D(Context context, Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        C33451gn r13 = (C33451gn) obj;
        AnonymousClass29Y r14 = (AnonymousClass29Y) obj2;
        AnonymousClass06Q r1 = r14.A02;
        if (r1 != null) {
            int i3 = Build.VERSION.SDK_INT;
            AnonymousClass05r r4 = r14.A01;
            AnonymousClass27B r132 = (AnonymousClass27B) r13;
            if (i3 > 20) {
                float f = r1.A02;
                if (f != 0.0f) {
                    r132.setElevation(f);
                }
                if (r1.A0A) {
                    if (r1.A01 != 0.0f) {
                        r132.setOutlineProvider(new C25381Gt(r1));
                        if (r1.A00 != 0.0f || !C008805h.A1M(r1.A05)) {
                            C25401Gv r0 = r132.A00;
                            r0.A04 = true;
                            r0.A0B.setLayerType(2, null);
                            C25401Gv r5 = r132.A00;
                            C009405x r2 = r1.A09;
                            if (r2 != C009405x.A02) {
                                i = r2.A00(r4).intValue();
                            } else {
                                i = r1.A04;
                                if (i == 0) {
                                    i = r2.A00(r4).intValue();
                                }
                            }
                            r5.A00(i, r1.A00(r4), r1.A00, r1.A01, r1.A05);
                            return;
                        }
                        r132.setClipToOutline(true);
                    }
                } else if (r1.A01 != 0.0f) {
                    r132.setOutlineProvider(new C25391Gu());
                }
            } else if (r1.A0A) {
                C25401Gv r02 = r132.A00;
                r02.A04 = true;
                r02.A0B.setLayerType(2, null);
                C25401Gv r52 = r132.A00;
                C009405x r22 = r1.A09;
                if (r22 != C009405x.A02) {
                    i2 = r22.A00(r4).intValue();
                } else {
                    i2 = r1.A04;
                    if (i2 == 0) {
                        i2 = r22.A00(r4).intValue();
                    }
                }
                r52.A00(i2, r1.A00(r4), r1.A00, r1.A01, r1.A05);
            }
        }
    }

    @Override // X.AnonymousClass11B
    public boolean APd(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    @Override // X.AnonymousClass11B
    public void AQj(Context context, Object obj, Object obj2, Object obj3) {
        C33451gn r5 = (C33451gn) obj;
        if (((AnonymousClass29Y) obj2).A02 != null) {
            AnonymousClass27B r52 = (AnonymousClass27B) r5;
            C25401Gv r0 = r52.A00;
            r0.A04 = false;
            r0.A0B.setLayerType(0, null);
            if (Build.VERSION.SDK_INT >= 21) {
                r52.setElevation(0.0f);
                r52.setClipToOutline(false);
                r52.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            }
        }
    }
}
