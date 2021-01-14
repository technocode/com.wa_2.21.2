package X;

import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import com.whatsapp.doodle.ColorPickerComponent;
import com.whatsapp.doodle.DoodleView;
import com.whatsapp.doodle.TitleBarComponent;

/* renamed from: X.2c0  reason: invalid class name and case insensitive filesystem */
public class C52942c0 implements AnonymousClass2MG {
    public final /* synthetic */ AnonymousClass2MF A00;
    public final /* synthetic */ Runnable A01;

    public C52942c0(AnonymousClass2MF r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    @Override // X.AnonymousClass2MG
    public void AFD() {
        AnonymousClass2MF r5 = this.A00;
        DoodleView doodleView = r5.A04;
        if (!doodleView.A0Y) {
            if (doodleView.A0Z) {
                AnonymousClass2NF r2 = r5.A05.A04;
                r2.A01.removeCallbacks(r2.A05);
                r2.A01.postDelayed(r2.A06, (long) 700);
            } else {
                return;
            }
        }
        Handler handler = r5.A0B;
        Runnable runnable = this.A01;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, (long) 400);
    }

    @Override // X.AnonymousClass2MG
    public void AFE() {
        AnonymousClass2MF r4 = this.A00;
        DoodleView doodleView = r4.A04;
        if (doodleView.A0Y || doodleView.A0Z) {
            r4.A0B.removeCallbacks(this.A01);
            if (r4.A02.getVisibility() != 0) {
                DoodleView doodleView2 = r4.A04;
                AbstractC48582Mw r0 = doodleView2.A0R;
                if (r0 == null) {
                    r4.A0D.A04(true);
                } else if (r0.A0B() || doodleView2.A0Y) {
                    ColorPickerComponent colorPickerComponent = r4.A0D;
                    if (!colorPickerComponent.A05()) {
                        colorPickerComponent.A00();
                    }
                }
                TitleBarComponent titleBarComponent = r4.A0F;
                AlphaAnimation A02 = AnonymousClass008.A02(0.0f, 1.0f, 300);
                View view = titleBarComponent.A0A;
                view.setVisibility(0);
                view.startAnimation(A02);
                r4.A04.setSystemUiVisibility(1280);
                titleBarComponent.A04();
                boolean z = r4.A0I;
                boolean z2 = r4.A0C.A02().A06;
                if (z) {
                    RelativeLayout relativeLayout = titleBarComponent.A0J;
                    View startingViewFromToolbarExtra = titleBarComponent.getStartingViewFromToolbarExtra();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                    layoutParams.addRule(!z2 ? 1 : 0, startingViewFromToolbarExtra.getId());
                    relativeLayout.setLayoutParams(layoutParams);
                }
                r4.A07.A02();
            }
        }
    }

    @Override // X.AnonymousClass2MG
    public boolean AK4(AbstractC48582Mw r8, float f, float f2) {
        boolean z;
        AnonymousClass2MF r5 = this.A00;
        C54212eX r6 = r5.A07;
        if (!(r6 instanceof C59822oL)) {
            z = false;
        } else {
            C59822oL r62 = (C59822oL) r6;
            z = true;
            if (r8 != null) {
                View view = r62.A00.A08;
                float height = ((float) view.getHeight()) / 2.0f;
                float x = (view.getX() + height) - f;
                float y = (view.getY() + height) - f2;
                if ((y * y) + (x * x) > height * height) {
                    z = false;
                }
            }
            r62.A00.A0y();
        }
        if (z) {
            return true;
        }
        if (!(r8 instanceof C53232ck)) {
            return false;
        }
        r5.A05((C53232ck) r8);
        return false;
    }

    @Override // X.AnonymousClass2MG
    public void AK5(AbstractC48582Mw r7, float f, float f2) {
        AnonymousClass2MF r4 = this.A00;
        AnonymousClass2MN r2 = r4.A05;
        AnonymousClass2NF r5 = r2.A04;
        r5.A01.removeCallbacks(r5.A06);
        r5.A01.post(r5.A05);
        r5.A00();
        r5.A00 = false;
        if (r5.A01(f, f2)) {
            AnonymousClass2MF r1 = r2.A02.A00;
            r1.A04.A0E(r7);
            r1.A04();
        }
        if (r2.A01.A0D(AbstractC000400g.A2Q) || r2.A05.A0E(278)) {
            C48392Ma r22 = r2.A03;
            for (AnonymousClass2MZ r0 : r22.A05.values()) {
                r0.A00();
            }
            r22.A01();
        }
        r7.A04();
        r4.A04.A0Z = false;
    }

    @Override // X.AnonymousClass2MG
    public void AK6(AbstractC48582Mw r7) {
        AnonymousClass2MF r1;
        int i;
        boolean A0C = r7.A0C();
        if (A0C || r7.A0B()) {
            AnonymousClass2MF r5 = this.A00;
            r1 = r5;
            ColorPickerComponent colorPickerComponent = r5.A0D;
            colorPickerComponent.A00();
            if (r7.A0B()) {
                int color = r7.A03.getColor();
                if (color != 0) {
                    colorPickerComponent.setColorAndInvalidate(color);
                }
                if (!(r7 instanceof C60502pa)) {
                    i = 1;
                } else {
                    i = ((C60502pa) r7).A01;
                }
                colorPickerComponent.setColorPaletteAndInvalidate(i);
            }
            if (A0C) {
                colorPickerComponent.setSizeAndInvalidate(r5.A04.A01 * r7.A00());
            }
        } else {
            r1 = this.A00;
            r1.A0D.A04(true);
        }
        r1.A04();
        r1.A04.A0Z = true;
    }
}
