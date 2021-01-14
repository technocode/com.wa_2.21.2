package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2Ma  reason: invalid class name and case insensitive filesystem */
public class C48392Ma {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public RectF A02 = new RectF();
    public Vibrator A03;
    public AbstractC48582Mw A04;
    public Map A05 = new HashMap();
    public boolean A06 = false;
    public boolean A07 = false;
    public final float A08;
    public final Handler A09;
    public final ViewGroup A0A;

    public C48392Ma(ViewGroup viewGroup, Handler handler) {
        this.A0A = viewGroup;
        this.A09 = handler;
        this.A08 = (float) viewGroup.getResources().getDimensionPixelSize(R.dimen.media_guideline_snapping_distance);
        this.A03 = (Vibrator) viewGroup.getContext().getSystemService("vibrator");
    }

    public float A00(PointF pointF, float f, AbstractC48582Mw r14) {
        if (this.A04 != r14) {
            this.A04 = r14;
            A01();
        }
        AnonymousClass2c9 r5 = (AnonymousClass2c9) this.A05.get(3);
        float f2 = r14.A00;
        boolean z = r5.A03;
        boolean z2 = false;
        if (z) {
            float f3 = r5.A00 + f;
            if (AnonymousClass2c9.A00(f3) != -1) {
                r5.A00 = f3;
                f = 0.0f;
            } else {
                f = f3 - f2;
                r5.A00 = 0.0f;
                r5.A03 = false;
                z = false;
            }
        } else {
            float f4 = f;
            if (Math.abs(f) > 180.0f) {
                f4 = f < 0.0f ? 360.0f + f : 360.0f - f;
            }
            float f5 = f2 % 45.0f;
            if (f5 != 0.0f) {
                int i = (f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1));
                float f6 = f5 + f4;
                if (i <= 0 ? f6 >= 0.0f || f6 <= -45.0f : f6 <= 0.0f || f6 >= 45.0f) {
                    float f7 = f2 + f;
                    if (AnonymousClass2c9.A00(f7) != -1) {
                        r5.A03 = true;
                        z = true;
                        r5.A00 = f7;
                        if (f7 < 0.0f) {
                            z2 = true;
                        }
                        float abs = Math.abs(f7 % 45.0f);
                        if (abs >= 38.0f) {
                            abs = 45.0f - abs;
                            z2 = !z2;
                        } else if (abs > 7.0f) {
                            throw new IllegalArgumentException(Float.toString(f7));
                        }
                        if (!z2) {
                            abs = -abs;
                        }
                        f = (f7 + abs) - f2;
                    }
                }
            }
        }
        int A002 = AnonymousClass2c9.A00(f2 + f);
        if (A002 != -1) {
            r5.A01 = A002;
        }
        r5.A02 = pointF;
        if (z) {
            if (this.A06 && A002 == 2) {
                ((AnonymousClass2MZ) this.A05.get(2)).A00();
            } else if (this.A07 && A002 == 0) {
                ((AnonymousClass2MZ) this.A05.get(1)).A00();
            }
            r5.A01();
            return f;
        }
        r5.A00();
        return f;
    }

    public final void A01() {
        AnonymousClass2c9 r2 = (AnonymousClass2c9) this.A05.get(3);
        if (r2 != null) {
            r2.A00 = 0.0f;
            r2.A03 = false;
        }
        this.A06 = false;
        this.A07 = false;
        this.A01 = 0.0f;
        this.A00 = 0.0f;
    }
}
