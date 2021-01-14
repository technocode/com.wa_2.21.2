package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: X.0TZ  reason: invalid class name */
public final class AnonymousClass0TZ {
    public static AnonymousClass0TZ A07;
    public static final PorterDuff.Mode A08 = PorterDuff.Mode.SRC_IN;
    public static final C06380Ta A09 = new C06380Ta();
    public TypedValue A00;
    public AbstractC06440Tg A01;
    public AnonymousClass05V A02;
    public C06540Tt A03;
    public WeakHashMap A04;
    public boolean A05;
    public final WeakHashMap A06 = new WeakHashMap(0);

    public static synchronized PorterDuffColorFilter A00(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (AnonymousClass0TZ.class) {
            C06380Ta r3 = A09;
            int i2 = (i + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) r3.A03(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                r3.A07(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static synchronized AnonymousClass0TZ A01() {
        AnonymousClass0TZ r0;
        synchronized (AnonymousClass0TZ.class) {
            if (A07 == null) {
                AnonymousClass0TZ r3 = new AnonymousClass0TZ();
                A07 = r3;
                if (Build.VERSION.SDK_INT < 24) {
                    C06390Tb r2 = new C06390Tb();
                    AnonymousClass05V r02 = r3.A02;
                    if (r02 == null) {
                        r02 = new AnonymousClass05V();
                        r3.A02 = r02;
                    }
                    r02.put("vector", r2);
                    C06410Td r22 = new C06410Td();
                    AnonymousClass05V r03 = r3.A02;
                    if (r03 == null) {
                        r03 = new AnonymousClass05V();
                        r3.A02 = r03;
                    }
                    r03.put("animated-vector", r22);
                    C06420Te r23 = new C06420Te();
                    AnonymousClass05V r04 = r3.A02;
                    if (r04 == null) {
                        r04 = new AnonymousClass05V();
                        r3.A02 = r04;
                    }
                    r04.put("animated-selector", r23);
                }
            }
            r0 = A07;
        }
        return r0;
    }

    public static void A02(Drawable drawable, C07660Za r5, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        if (!AnonymousClass0WQ.A03(drawable) || drawable.mutate() == drawable) {
            boolean z = r5.A02;
            if (z || r5.A03) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z) {
                    colorStateList = r5.A00;
                } else {
                    colorStateList = null;
                }
                if (r5.A03) {
                    mode = r5.A01;
                } else {
                    mode = A08;
                }
                if (!(colorStateList == null || mode == null)) {
                    porterDuffColorFilter = A00(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public synchronized ColorStateList A03(Context context, int i) {
        ColorStateList colorStateList;
        C06540Tt r0;
        WeakHashMap weakHashMap = this.A04;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (r0 = (C06540Tt) weakHashMap.get(context)) == null) ? null : (ColorStateList) r0.A02(i, null);
        if (colorStateList == null) {
            if (this.A01 != null) {
                C06430Tf r1 = (C06430Tf) this.A01;
                if (i == R.drawable.abc_edit_text_material) {
                    colorStateList2 = AnonymousClass05p.A00(context, R.color.abc_tint_edittext);
                } else if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                    colorStateList2 = AnonymousClass05p.A00(context, R.color.abc_tint_switch_track);
                } else if (i == R.drawable.abc_switch_thumb_material) {
                    int[][] iArr = new int[3][];
                    int[] iArr2 = new int[3];
                    ColorStateList A022 = C13540kQ.A02(context, R.attr.colorSwitchThumbNormal);
                    if (A022 == null || !A022.isStateful()) {
                        iArr[0] = C13540kQ.A02;
                        iArr2[0] = C13540kQ.A00(context, R.attr.colorSwitchThumbNormal);
                        iArr[1] = C13540kQ.A01;
                        iArr2[1] = C13540kQ.A01(context, R.attr.colorControlActivated);
                        iArr[2] = C13540kQ.A03;
                        iArr2[2] = C13540kQ.A01(context, R.attr.colorSwitchThumbNormal);
                    } else {
                        iArr[0] = C13540kQ.A02;
                        iArr2[0] = A022.getColorForState(iArr[0], 0);
                        iArr[1] = C13540kQ.A01;
                        iArr2[1] = C13540kQ.A01(context, R.attr.colorControlActivated);
                        iArr[2] = C13540kQ.A03;
                        iArr2[2] = A022.getDefaultColor();
                    }
                    colorStateList2 = new ColorStateList(iArr, iArr2);
                } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
                    colorStateList2 = C06430Tf.A00(context, C13540kQ.A01(context, R.attr.colorButtonNormal));
                } else if (i == R.drawable.abc_btn_borderless_material) {
                    colorStateList2 = C06430Tf.A00(context, 0);
                } else if (i == R.drawable.abc_btn_colored_material) {
                    colorStateList2 = C06430Tf.A00(context, C13540kQ.A01(context, R.attr.colorAccent));
                } else if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                    colorStateList2 = AnonymousClass05p.A00(context, R.color.abc_tint_spinner);
                } else if (C06430Tf.A02(r1.A04, i)) {
                    colorStateList2 = C13540kQ.A02(context, R.attr.colorControlNormal);
                } else if (C06430Tf.A02(r1.A05, i)) {
                    colorStateList2 = AnonymousClass05p.A00(context, R.color.abc_tint_default);
                } else if (C06430Tf.A02(r1.A03, i)) {
                    colorStateList2 = AnonymousClass05p.A00(context, R.color.abc_tint_btn_checkable);
                } else if (i == R.drawable.abc_seekbar_thumb_material) {
                    colorStateList2 = AnonymousClass05p.A00(context, R.color.abc_tint_seek_thumb);
                }
            }
            if (colorStateList2 != null) {
                if (this.A04 == null) {
                    this.A04 = new WeakHashMap();
                }
                C06540Tt r12 = (C06540Tt) this.A04.get(context);
                if (r12 == null) {
                    r12 = new C06540Tt(10);
                    this.A04.put(context, r12);
                }
                r12.A04(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075 A[Catch:{ Exception -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009b A[Catch:{ Exception -> 0x00a3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable A04(android.content.Context r11, int r12) {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0TZ.A04(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public synchronized Drawable A05(Context context, int i) {
        return A06(context, i, false);
    }

    public synchronized Drawable A06(Context context, int i, boolean z) {
        Drawable A042;
        if (!this.A05) {
            boolean z2 = true;
            this.A05 = true;
            Drawable A052 = A05(context, R.drawable.abc_vector_test);
            if (A052 != null) {
                if (!(A052 instanceof AnonymousClass0V9) && !"android.graphics.drawable.VectorDrawable".equals(A052.getClass().getName())) {
                    z2 = false;
                }
                if (z2) {
                }
            }
            this.A05 = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        A042 = A04(context, i);
        if (A042 == null) {
            TypedValue typedValue = this.A00;
            if (typedValue == null) {
                typedValue = new TypedValue();
                this.A00 = typedValue;
            }
            context.getResources().getValue(i, typedValue, true);
            long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
            A042 = A08(context, j);
            if (A042 == null) {
                A042 = null;
                if (this.A01 != null && i == R.drawable.abc_cab_background_top_material) {
                    A042 = new LayerDrawable(new Drawable[]{A05(context, R.drawable.abc_cab_background_internal_bg), A05(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
                }
                if (A042 != null) {
                    A042.setChangingConfigurations(typedValue.changingConfigurations);
                    A09(context, j, A042);
                }
            }
        }
        if (A042 == null) {
            A042 = C004302a.A03(context, i);
        }
        if (A042 != null) {
            A042 = A07(context, i, z, A042);
        }
        if (A042 != null) {
            AnonymousClass0WQ.A02(A042);
        }
        return A042;
    }

    public final Drawable A07(Context context, int i, boolean z, Drawable drawable) {
        PorterDuff.Mode mode;
        ColorStateList A032 = A03(context, i);
        if (A032 != null) {
            if (AnonymousClass0WQ.A03(drawable)) {
                drawable = drawable.mutate();
            }
            drawable = C002001d.A0d(drawable);
            C002001d.A2b(drawable, A032);
            if (!(this.A01 == null || i != R.drawable.abc_switch_thumb_material || (mode = PorterDuff.Mode.MULTIPLY) == null)) {
                C002001d.A2c(drawable, mode);
            }
        } else {
            if (this.A01 != null) {
                if (i == R.drawable.abc_seekbar_track_material) {
                    LayerDrawable layerDrawable = (LayerDrawable) drawable;
                    Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                    int A012 = C13540kQ.A01(context, R.attr.colorControlNormal);
                    PorterDuff.Mode mode2 = C06340Sv.A02;
                    C06430Tf.A01(findDrawableByLayerId, A012, mode2);
                    C06430Tf.A01(layerDrawable.findDrawableByLayerId(16908303), C13540kQ.A01(context, R.attr.colorControlNormal), mode2);
                    C06430Tf.A01(layerDrawable.findDrawableByLayerId(16908301), C13540kQ.A01(context, R.attr.colorControlActivated), mode2);
                    return drawable;
                } else if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                    LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                    Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                    int A002 = C13540kQ.A00(context, R.attr.colorControlNormal);
                    PorterDuff.Mode mode3 = C06340Sv.A02;
                    C06430Tf.A01(findDrawableByLayerId2, A002, mode3);
                    C06430Tf.A01(layerDrawable2.findDrawableByLayerId(16908303), C13540kQ.A01(context, R.attr.colorControlActivated), mode3);
                    C06430Tf.A01(layerDrawable2.findDrawableByLayerId(16908301), C13540kQ.A01(context, R.attr.colorControlActivated), mode3);
                    return drawable;
                }
            }
            if (A0A(context, i, drawable) || !z) {
                return drawable;
            }
            return null;
        }
        return drawable;
    }

    public final synchronized Drawable A08(Context context, long j) {
        C015008i r3 = (C015008i) this.A06.get(context);
        if (r3 == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) r3.A03(j, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            r3.A06(j);
        }
        return null;
    }

    public final synchronized void A09(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            WeakHashMap weakHashMap = this.A06;
            C015008i r1 = (C015008i) weakHashMap.get(context);
            if (r1 == null) {
                r1 = new C015008i();
                weakHashMap.put(context, r1);
            }
            r1.A08(j, new WeakReference(constantState));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0A(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0TZ.A0A(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
