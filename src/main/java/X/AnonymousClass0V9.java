package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0V9  reason: invalid class name */
public class AnonymousClass0V9 extends AnonymousClass0VA {
    public static final PorterDuff.Mode A08 = PorterDuff.Mode.SRC_IN;
    public ColorFilter A00;
    public PorterDuffColorFilter A01;
    public AnonymousClass0VB A02;
    public boolean A03;
    public boolean A04;
    public final Matrix A05;
    public final Rect A06;
    public final float[] A07;

    public AnonymousClass0V9() {
        this.A03 = true;
        this.A07 = new float[9];
        this.A05 = new Matrix();
        this.A06 = new Rect();
        this.A02 = new AnonymousClass0VB();
    }

    public AnonymousClass0V9(AnonymousClass0VB r3) {
        this.A03 = true;
        this.A07 = new float[9];
        this.A05 = new Matrix();
        this.A06 = new Rect();
        this.A02 = r3;
        this.A01 = A01(r3.A03, r3.A07);
    }

    public static AnonymousClass0V9 A00(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            AnonymousClass0V9 r2 = new AnonymousClass0V9();
            Drawable A0c = C002001d.A0c(resources, i, theme);
            ((AnonymousClass0VA) r2).A00 = A0c;
            new AnonymousClass0VC(A0c.getConstantState());
            return r2;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    AnonymousClass0V9 r0 = new AnonymousClass0V9();
                    r0.inflate(resources, xml, asAttributeSet, theme);
                    return r0;
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (XmlPullParserException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (IOException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    public PorterDuffColorFilter A01(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public boolean canApplyTheme() {
        Drawable drawable = super.A00;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    public void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.A06;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.A00;
            if (colorFilter == null) {
                colorFilter = this.A01;
            }
            Matrix matrix = this.A05;
            canvas.getMatrix(matrix);
            float[] fArr = this.A07;
            matrix.getValues(fArr);
            boolean z = false;
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) rect.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) rect.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate((float) rect.left, (float) rect.top);
                if (Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && C002001d.A07(this) == 1) {
                    canvas.translate((float) rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                AnonymousClass0VB r1 = this.A02;
                Bitmap bitmap = r1.A04;
                if (!(bitmap != null && min == bitmap.getWidth() && min2 == r1.A04.getHeight())) {
                    r1.A04 = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    r1.A0A = true;
                }
                if (!this.A03) {
                    this.A02.A00(min, min2);
                } else {
                    AnonymousClass0VB r9 = this.A02;
                    if (!(!r9.A0A && r9.A02 == r9.A03 && r9.A06 == r9.A07 && r9.A0B == r9.A09 && r9.A00 == r9.A08.A05)) {
                        r9.A00(min, min2);
                        AnonymousClass0VB r12 = this.A02;
                        r12.A02 = r12.A03;
                        r12.A06 = r12.A07;
                        r12.A00 = r12.A08.A05;
                        r12.A0B = r12.A09;
                        r12.A0A = false;
                    }
                }
                AnonymousClass0VB r8 = this.A02;
                if (r8.A08.A05 < 255) {
                    z = true;
                }
                if (z || colorFilter != null) {
                    if (r8.A05 == null) {
                        Paint paint2 = new Paint();
                        r8.A05 = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    r8.A05.setAlpha(r8.A08.A05);
                    r8.A05.setColorFilter(colorFilter);
                    paint = r8.A05;
                } else {
                    paint = null;
                }
                canvas.drawBitmap(r8.A04, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = super.A00;
        if (drawable == null) {
            return this.A02.A08.A05;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    public int getChangingConfigurations() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.A02.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = super.A00;
        if (drawable == null) {
            return this.A00;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = super.A00;
        if (drawable != null && Build.VERSION.SDK_INT >= 24) {
            return new AnonymousClass0VC(drawable.getConstantState());
        }
        this.A02.A01 = getChangingConfigurations();
        return this.A02;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.A02.A08.A00;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.A02.A08.A01;
    }

    public int getOpacity() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        ColorStateList A0S;
        Drawable drawable = super.A00;
        if (drawable == null) {
            AnonymousClass0VB r9 = this.A02;
            r9.A08 = new AnonymousClass0VD();
            TypedArray A0T = AnonymousClass0N2.A0T(resources, theme, attributeSet, AnonymousClass0VE.A0B);
            AnonymousClass0VB r15 = this.A02;
            AnonymousClass0VD r7 = r15.A08;
            int A072 = AnonymousClass0N2.A07(A0T, xmlPullParser, "tintMode", 6, -1);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            int i = 3;
            if (A072 == 3) {
                mode = PorterDuff.Mode.SRC_OVER;
            } else if (A072 != 5) {
                if (A072 != 9) {
                    switch (A072) {
                        case 14:
                            mode = PorterDuff.Mode.MULTIPLY;
                            break;
                        case 15:
                            mode = PorterDuff.Mode.SCREEN;
                            break;
                        case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                            mode = PorterDuff.Mode.ADD;
                            break;
                    }
                } else {
                    mode = PorterDuff.Mode.SRC_ATOP;
                }
            }
            r15.A07 = mode;
            if (AnonymousClass0N2.A1m(xmlPullParser, "tint")) {
                TypedValue typedValue = new TypedValue();
                A0T.getValue(1, typedValue);
                int i2 = typedValue.type;
                if (i2 != 2) {
                    if (i2 < 28 || i2 > 31) {
                        Resources resources2 = A0T.getResources();
                        try {
                            XmlResourceParser xml = resources2.getXml(A0T.getResourceId(1, 0));
                            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                            do {
                                next = xml.next();
                                if (next == 2) {
                                    A0S = AnonymousClass0N2.A0S(resources2, xml, asAttributeSet, theme);
                                }
                            } while (next != 1);
                            throw new XmlPullParserException("No start tag found");
                        } catch (Exception e) {
                            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                        }
                    } else {
                        A0S = ColorStateList.valueOf(typedValue.data);
                    }
                    if (A0S != null) {
                        r15.A03 = A0S;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Failed to resolve attribute at index ");
                    sb.append(1);
                    sb.append(": ");
                    sb.append(typedValue);
                    throw new UnsupportedOperationException(sb.toString());
                }
            }
            boolean z = r15.A09;
            if (AnonymousClass0N2.A1m(xmlPullParser, "autoMirrored")) {
                z = A0T.getBoolean(5, z);
            }
            r15.A09 = z;
            r7.A03 = AnonymousClass0N2.A01(A0T, xmlPullParser, "viewportWidth", 7, r7.A03);
            float A012 = AnonymousClass0N2.A01(A0T, xmlPullParser, "viewportHeight", 8, r7.A02);
            r7.A02 = A012;
            if (r7.A03 <= 0.0f) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(A0T.getPositionDescription());
                sb2.append("<vector> tag requires viewportWidth > 0");
                throw new XmlPullParserException(sb2.toString());
            } else if (A012 > 0.0f) {
                r7.A01 = A0T.getDimension(3, r7.A01);
                float dimension = A0T.getDimension(2, r7.A00);
                r7.A00 = dimension;
                if (r7.A01 <= 0.0f) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(A0T.getPositionDescription());
                    sb3.append("<vector> tag requires width > 0");
                    throw new XmlPullParserException(sb3.toString());
                } else if (dimension > 0.0f) {
                    r7.setAlpha(AnonymousClass0N2.A01(A0T, xmlPullParser, "alpha", 4, r7.getAlpha()));
                    String string = A0T.getString(0);
                    if (string != null) {
                        r7.A0A = string;
                        r7.A0E.put(string, r7);
                    }
                    A0T.recycle();
                    r9.A01 = getChangingConfigurations();
                    r9.A0A = true;
                    AnonymousClass0VB r4 = this.A02;
                    AnonymousClass0VD r2 = r4.A08;
                    ArrayDeque arrayDeque = new ArrayDeque();
                    arrayDeque.push(r2.A0F);
                    int eventType = xmlPullParser.getEventType();
                    int depth = xmlPullParser.getDepth() + 1;
                    boolean z2 = true;
                    for (int i3 = 1; eventType != i3 && (xmlPullParser.getDepth() >= depth || eventType != i); i3 = 1) {
                        if (eventType == 2) {
                            String name = xmlPullParser.getName();
                            AnonymousClass0VF r6 = (AnonymousClass0VF) arrayDeque.peek();
                            if ("path".equals(name)) {
                                AnonymousClass0VH r72 = new AnonymousClass0VH();
                                TypedArray A0T2 = AnonymousClass0N2.A0T(resources, theme, attributeSet, AnonymousClass0VE.A0A);
                                r72.A0B = null;
                                if (AnonymousClass0N2.A1m(xmlPullParser, "pathData")) {
                                    String string2 = A0T2.getString(0);
                                    if (string2 != null) {
                                        ((AnonymousClass0VI) r72).A02 = string2;
                                    }
                                    String string3 = A0T2.getString(2);
                                    if (string3 != null) {
                                        ((AnonymousClass0VI) r72).A03 = AnonymousClass0N2.A1q(string3);
                                    }
                                    r72.A09 = AnonymousClass0N2.A0c(A0T2, xmlPullParser, theme, "fillColor", 1);
                                    r72.A00 = AnonymousClass0N2.A01(A0T2, xmlPullParser, "fillAlpha", 12, r72.A00);
                                    int A073 = AnonymousClass0N2.A07(A0T2, xmlPullParser, "strokeLineCap", 8, -1);
                                    Paint.Cap cap = r72.A07;
                                    if (A073 == 0) {
                                        cap = Paint.Cap.BUTT;
                                    } else if (A073 == 1) {
                                        cap = Paint.Cap.ROUND;
                                    } else if (A073 == 2) {
                                        cap = Paint.Cap.SQUARE;
                                    }
                                    r72.A07 = cap;
                                    int A074 = AnonymousClass0N2.A07(A0T2, xmlPullParser, "strokeLineJoin", 9, -1);
                                    Paint.Join join = r72.A08;
                                    if (A074 == 0) {
                                        join = Paint.Join.MITER;
                                    } else if (A074 == 1) {
                                        join = Paint.Join.ROUND;
                                    } else if (A074 == 2) {
                                        join = Paint.Join.BEVEL;
                                    }
                                    r72.A08 = join;
                                    r72.A02 = AnonymousClass0N2.A01(A0T2, xmlPullParser, "strokeMiterLimit", 10, r72.A02);
                                    r72.A0A = AnonymousClass0N2.A0c(A0T2, xmlPullParser, theme, "strokeColor", 3);
                                    r72.A01 = AnonymousClass0N2.A01(A0T2, xmlPullParser, "strokeAlpha", 11, r72.A01);
                                    r72.A03 = AnonymousClass0N2.A01(A0T2, xmlPullParser, "strokeWidth", 4, r72.A03);
                                    r72.A04 = AnonymousClass0N2.A01(A0T2, xmlPullParser, "trimPathEnd", 6, r72.A04);
                                    r72.A05 = AnonymousClass0N2.A01(A0T2, xmlPullParser, "trimPathOffset", 7, r72.A05);
                                    r72.A06 = AnonymousClass0N2.A01(A0T2, xmlPullParser, "trimPathStart", 5, r72.A06);
                                    ((AnonymousClass0VI) r72).A01 = AnonymousClass0N2.A07(A0T2, xmlPullParser, "fillType", 13, ((AnonymousClass0VI) r72).A01);
                                }
                                A0T2.recycle();
                                r6.A0C.add(r72);
                                String str = ((AnonymousClass0VI) r72).A02;
                                if (str != null) {
                                    r2.A0E.put(str, r72);
                                }
                                r4.A01 |= ((AnonymousClass0VI) r72).A00;
                                z2 = false;
                            } else if ("clip-path".equals(name)) {
                                AnonymousClass0VL r73 = new AnonymousClass0VL();
                                if (AnonymousClass0N2.A1m(xmlPullParser, "pathData")) {
                                    TypedArray A0T3 = AnonymousClass0N2.A0T(resources, theme, attributeSet, AnonymousClass0VE.A08);
                                    String string4 = A0T3.getString(0);
                                    if (string4 != null) {
                                        r73.A02 = string4;
                                    }
                                    String string5 = A0T3.getString(1);
                                    if (string5 != null) {
                                        r73.A03 = AnonymousClass0N2.A1q(string5);
                                    }
                                    r73.A01 = AnonymousClass0N2.A07(A0T3, xmlPullParser, "fillType", 2, 0);
                                    A0T3.recycle();
                                }
                                r6.A0C.add(r73);
                                String str2 = r73.A02;
                                if (str2 != null) {
                                    r2.A0E.put(str2, r73);
                                }
                                r4.A01 = r73.A00 | r4.A01;
                            } else if ("group".equals(name)) {
                                AnonymousClass0VF r5 = new AnonymousClass0VF();
                                TypedArray A0T4 = AnonymousClass0N2.A0T(resources, theme, attributeSet, AnonymousClass0VE.A09);
                                r5.A09 = null;
                                r5.A02 = AnonymousClass0N2.A01(A0T4, xmlPullParser, "rotation", 5, r5.A02);
                                r5.A00 = A0T4.getFloat(1, r5.A00);
                                r5.A01 = A0T4.getFloat(2, r5.A01);
                                r5.A03 = AnonymousClass0N2.A01(A0T4, xmlPullParser, "scaleX", 3, r5.A03);
                                r5.A04 = AnonymousClass0N2.A01(A0T4, xmlPullParser, "scaleY", 4, r5.A04);
                                r5.A05 = AnonymousClass0N2.A01(A0T4, xmlPullParser, "translateX", 6, r5.A05);
                                r5.A06 = AnonymousClass0N2.A01(A0T4, xmlPullParser, "translateY", 7, r5.A06);
                                String string6 = A0T4.getString(0);
                                if (string6 != null) {
                                    r5.A08 = string6;
                                }
                                r5.A02();
                                A0T4.recycle();
                                r6.A0C.add(r5);
                                arrayDeque.push(r5);
                                String str3 = r5.A08;
                                if (str3 != null) {
                                    r2.A0E.put(str3, r5);
                                }
                                r4.A01 = r5.A07 | r4.A01;
                            }
                        } else if (eventType == i && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                        eventType = xmlPullParser.next();
                        i = 3;
                    }
                    if (!z2) {
                        this.A01 = A01(r9.A03, r9.A07);
                        return;
                    }
                    throw new XmlPullParserException("no path defined");
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(A0T.getPositionDescription());
                    sb4.append("<vector> tag requires height > 0");
                    throw new XmlPullParserException(sb4.toString());
                }
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(A0T.getPositionDescription());
                sb5.append("<vector> tag requires viewportHeight > 0");
                throw new XmlPullParserException(sb5.toString());
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return C002001d.A3G(drawable);
        }
        return this.A02.A09;
    }

    public boolean isStateful() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        AnonymousClass0VB r0 = this.A02;
        if (r0 == null) {
            return false;
        }
        AnonymousClass0VD r1 = r0.A08;
        if (r1.A09 == null) {
            r1.A09 = Boolean.valueOf(r1.A0F.A00());
        }
        if (r1.A09.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.A02.A03;
        return colorStateList != null && colorStateList.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.A04 && super.mutate() == this) {
            this.A02 = new AnonymousClass0VB(this.A02);
            this.A04 = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        AnonymousClass0VB r2 = this.A02;
        ColorStateList colorStateList = r2.A03;
        if (!(colorStateList == null || (mode = r2.A07) == null)) {
            this.A01 = A01(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        AnonymousClass0VD r1 = r2.A08;
        if (r1.A09 == null) {
            r1.A09 = Boolean.valueOf(r1.A0F.A00());
        }
        if (r1.A09.booleanValue()) {
            boolean A012 = r2.A08.A0F.A01(iArr);
            r2.A0A |= A012;
            if (A012) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
            return;
        }
        AnonymousClass0VD r1 = this.A02.A08;
        if (r1.A05 != i) {
            r1.A05 = i;
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            C002001d.A2d(drawable, z);
        } else {
            this.A02.A09 = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.A00 = colorFilter;
        invalidateSelf();
    }

    @Override // X.AbstractC05200No
    public void setTint(int i) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            C002001d.A2Z(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // X.AbstractC05200No
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            C002001d.A2b(drawable, colorStateList);
            return;
        }
        AnonymousClass0VB r1 = this.A02;
        if (r1.A03 != colorStateList) {
            r1.A03 = colorStateList;
            this.A01 = A01(colorStateList, r1.A07);
            invalidateSelf();
        }
    }

    @Override // X.AbstractC05200No
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            C002001d.A2c(drawable, mode);
            return;
        }
        AnonymousClass0VB r1 = this.A02;
        if (r1.A07 != mode) {
            r1.A07 = mode;
            this.A01 = A01(r1.A03, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
