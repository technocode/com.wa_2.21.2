package X;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.10m  reason: invalid class name and case insensitive filesystem */
public class Choreographer$FrameCallbackC222010m implements Choreographer.FrameCallback {
    public final /* synthetic */ C33431gl A00;

    public Choreographer$FrameCallbackC222010m(C33431gl r1) {
        this.A00 = r1;
    }

    public void doFrame(long j) {
        C222510r r0;
        C33431gl r02 = this.A00;
        if (r02.A01 && (r0 = ((AbstractC222410q) r02).A00) != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            double d = (double) (uptimeMillis - r02.A00);
            CopyOnWriteArraySet copyOnWriteArraySet = r0.A04;
            Iterator it = copyOnWriteArraySet.iterator();
            if (it.hasNext()) {
                it.next();
                throw null;
            }
            Set<C222210o> set = r0.A03;
            for (C222210o r03 : set) {
                boolean A01 = r03.A01();
                if (!A01 || !r03.A07) {
                    double d2 = d / 1000.0d;
                    if (!A01 || !r03.A07) {
                        if (d2 > 0.064d) {
                            d2 = 0.064d;
                        }
                        double d3 = r03.A04 + d2;
                        r03.A04 = d3;
                        C222310p r04 = r03.A05;
                        double d4 = r04.A01;
                        double d5 = r04.A00;
                        C222110n r05 = r03.A08;
                        double d6 = r05.A00;
                        double d7 = r05.A01;
                        C222110n r06 = r03.A0A;
                        double d8 = r06.A00;
                        double d9 = r06.A01;
                        while (d3 >= 0.001d) {
                            d3 -= 0.001d;
                            r03.A04 = d3;
                            if (d3 < 0.001d) {
                                C222110n r07 = r03.A09;
                                r07.A00 = d6;
                                r07.A01 = d7;
                            }
                            double d10 = r03.A01;
                            double d11 = ((d10 - d8) * d4) - (d5 * d7);
                            double d12 = (d11 * 0.001d * 0.5d) + d7;
                            double d13 = ((d10 - (((d7 * 0.001d) * 0.5d) + d6)) * d4) - (d5 * d12);
                            double d14 = (d13 * 0.001d * 0.5d) + d7;
                            double d15 = ((d10 - (((d12 * 0.001d) * 0.5d) + d6)) * d4) - (d5 * d14);
                            d8 = (d14 * 0.001d) + d6;
                            d9 = (d15 * 0.001d) + d7;
                            d6 = ((((d12 + d14) * 2.0d) + d7 + d9) * 0.16666666666666666d * 0.001d) + d6;
                            d7 = ((((d13 + d15) * 2.0d) + d11 + (((d10 - d8) * d4) - (d5 * d9))) * 0.16666666666666666d * 0.001d) + d7;
                        }
                        r06.A00 = d8;
                        r06.A01 = d9;
                        r05.A00 = d6;
                        r05.A01 = d7;
                        if (d3 > 0.0d) {
                            double d16 = d3 / 0.001d;
                            C222110n r5 = r03.A09;
                            double d17 = 1.0d - d16;
                            double d18 = (r5.A00 * d17) + (d6 * d16);
                            r05.A00 = d18;
                            d6 = d18;
                            double d19 = (r5.A01 * d17) + (d7 * d16);
                            r05.A01 = d19;
                            d7 = d19;
                        }
                        if (r03.A01()) {
                            if (d4 > 0.0d) {
                                double d20 = r03.A01;
                                r03.A03 = d20;
                                r05.A00 = d20;
                            } else {
                                r03.A01 = d6;
                                r03.A03 = d6;
                            }
                            if (0.0d != d7) {
                                r05.A01 = 0.0d;
                                r03.A0B.A00(r03.A0C);
                            }
                            A01 = true;
                        }
                        if (r03.A07) {
                            r03.A07 = false;
                        }
                        boolean z = false;
                        if (A01) {
                            z = true;
                            r03.A07 = true;
                        }
                        Iterator it2 = r03.A06.iterator();
                        while (it2.hasNext()) {
                            C33441gm r52 = (C33441gm) it2.next();
                            AnonymousClass27W r4 = (AnonymousClass27W) r52;
                            C222110n r2 = r03.A08;
                            float f = (float) ((((r2.A00 - 0.0d) / 1.0d) * 0.5d) + 0.5d);
                            C27131Oe r8 = r4.A01;
                            r8.A0K.setScaleX(f);
                            r8.A0K.setScaleY(f);
                            int i = r4.A00;
                            if (i != 0) {
                                float f2 = (float) ((((r2.A00 - 0.0d) / 1.0d) * (((double) i) - 0.0d)) + 0.0d);
                                int width = r8.A0K.getWidth() >> 2;
                                if (r8.A12.A02().A06) {
                                    width = -width;
                                }
                                r8.A0K.setTranslationX(f2 + ((float) width));
                            }
                            if (z && (r52 instanceof AnonymousClass29n)) {
                                C27131Oe r22 = ((AnonymousClass29n) r52).A00;
                                r22.A0K.setVisibility(4);
                                r22.A0A();
                            }
                        }
                    }
                } else {
                    set.remove(r03);
                }
            }
            if (set.isEmpty()) {
                r0.A00 = true;
            }
            Iterator it3 = copyOnWriteArraySet.iterator();
            if (it3.hasNext()) {
                it3.next();
                throw null;
            }
            if (r0.A00) {
                C33431gl r23 = (C33431gl) r0.A01;
                r23.A01 = false;
                r23.A03.removeFrameCallback(r23.A02);
            }
            r02.A00 = uptimeMillis;
            r02.A03.postFrameCallback(r02.A02);
        }
    }
}
