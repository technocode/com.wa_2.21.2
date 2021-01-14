package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0ZZ  reason: invalid class name */
public class AnonymousClass0ZZ {
    public static ConcurrentHashMap A0A = new ConcurrentHashMap();
    public static ConcurrentHashMap A0B = new ConcurrentHashMap();
    public static final RectF A0C = new RectF();
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = -1.0f;
    public int A03 = 0;
    public TextPaint A04;
    public boolean A05 = false;
    public boolean A06 = false;
    public int[] A07 = new int[0];
    public final Context A08;
    public final TextView A09;

    public AnonymousClass0ZZ(TextView textView) {
        this.A09 = textView;
        this.A08 = textView.getContext();
    }

    public static Object A00(Object obj, String str, Object obj2) {
        try {
            return A01(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to invoke TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return obj2;
        }
    }

    public static Method A01(String str) {
        try {
            Method method = (Method) A0B.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                A0B.put(str, method);
            }
            return method;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return null;
        }
    }

    public static final int[] A02(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int i2 = iArr[i];
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
            i++;
        } while (i < length);
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Number) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    public void A03() {
        boolean booleanValue;
        int measuredWidth;
        StaticLayout staticLayout;
        TextDirectionHeuristic textDirectionHeuristic;
        CharSequence transformation;
        TextView textView = this.A09;
        if ((!(textView instanceof C07670Zb)) && this.A03 != 0) {
            if (this.A06) {
                if (textView.getMeasuredHeight() > 0 && textView.getMeasuredWidth() > 0) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        booleanValue = textView.isHorizontallyScrollable();
                    } else {
                        booleanValue = ((Boolean) A00(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
                    }
                    if (booleanValue) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (textView.getMeasuredWidth() - textView.getTotalPaddingLeft()) - textView.getTotalPaddingRight();
                    }
                    int height = (textView.getHeight() - textView.getCompoundPaddingBottom()) - textView.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = A0C;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            int length = this.A07.length;
                            if (length != 0) {
                                int i = length - 1;
                                int i2 = 1;
                                int i3 = 0;
                                while (i2 <= i) {
                                    int i4 = (i2 + i) >> 1;
                                    int i5 = this.A07[i4];
                                    CharSequence text = textView.getText();
                                    TransformationMethod transformationMethod = textView.getTransformationMethod();
                                    if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null)) {
                                        text = transformation;
                                    }
                                    int maxLines = textView.getMaxLines();
                                    TextPaint textPaint = this.A04;
                                    if (textPaint == null) {
                                        this.A04 = new TextPaint();
                                    } else {
                                        textPaint.reset();
                                    }
                                    this.A04.set(textView.getPaint());
                                    this.A04.setTextSize((float) i5);
                                    Layout.Alignment alignment = (Layout.Alignment) A00(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                                    int round = Math.round(rectF.right);
                                    if (Build.VERSION.SDK_INT >= 23) {
                                        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.A04, round);
                                        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
                                        int i6 = maxLines;
                                        if (maxLines == -1) {
                                            i6 = Integer.MAX_VALUE;
                                        }
                                        hyphenationFrequency.setMaxLines(i6);
                                        try {
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                textDirectionHeuristic = textView.getTextDirectionHeuristic();
                                            } else {
                                                textDirectionHeuristic = (TextDirectionHeuristic) A00(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
                                            }
                                            obtain.setTextDirection(textDirectionHeuristic);
                                        } catch (ClassCastException unused) {
                                            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                                        }
                                        staticLayout = obtain.build();
                                    } else {
                                        staticLayout = new StaticLayout(text, this.A04, round, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
                                    }
                                    if ((maxLines == -1 || (staticLayout.getLineCount() <= maxLines && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == text.length())) && ((float) staticLayout.getHeight()) <= rectF.bottom) {
                                        i3 = i2;
                                        i2 = i4 + 1;
                                    } else {
                                        i3 = i4 - 1;
                                        i = i3;
                                    }
                                }
                                float f = (float) this.A07[i3];
                                if (f != textView.getTextSize()) {
                                    A05(0, f);
                                }
                            } else {
                                throw new IllegalStateException("No available text sizes to choose from.");
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.A06 = true;
        }
    }

    public final void A04(float f, float f2, float f3) {
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder("Minimum auto-size text size (");
            sb.append(f);
            sb.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 <= f) {
            StringBuilder sb2 = new StringBuilder("Maximum auto-size text size (");
            sb2.append(f2);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(f);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        } else if (f3 > 0.0f) {
            this.A03 = 1;
            this.A01 = f;
            this.A00 = f2;
            this.A02 = f3;
            this.A05 = false;
        } else {
            StringBuilder sb3 = new StringBuilder("The auto-size step granularity (");
            sb3.append(f3);
            sb3.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public void A05(int i, float f) {
        Resources resources;
        boolean z;
        Context context = this.A08;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        TextView textView = this.A09;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            if (Build.VERSION.SDK_INT >= 18) {
                z = textView.isInLayout();
            } else {
                z = false;
            }
            if (textView.getLayout() != null) {
                this.A06 = false;
                try {
                    Method A012 = A01("nullLayouts");
                    if (A012 != null) {
                        A012.invoke(textView, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!z) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean A06() {
        if (!(!(this.A09 instanceof C07670Zb)) || this.A03 != 1) {
            this.A06 = false;
            return false;
        }
        if (!this.A05 || this.A07.length == 0) {
            float f = this.A00;
            float f2 = this.A01;
            float f3 = this.A02;
            int floor = ((int) Math.floor((double) ((f - f2) / f3))) + 1;
            int[] iArr = new int[floor];
            for (int i = 0; i < floor; i++) {
                iArr[i] = Math.round((((float) i) * f3) + f2);
            }
            this.A07 = A02(iArr);
        }
        this.A06 = true;
        return true;
    }

    public final boolean A07() {
        int[] iArr = this.A07;
        int length = iArr.length;
        boolean z = false;
        if (length > 0) {
            z = true;
        }
        this.A05 = z;
        if (z) {
            this.A03 = 1;
            this.A01 = (float) iArr[0];
            this.A00 = (float) iArr[length - 1];
            this.A02 = -1.0f;
        }
        return z;
    }
}
