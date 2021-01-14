package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.05p  reason: invalid class name */
public final class AnonymousClass05p {
    public static final Object A00 = new Object();
    public static final ThreadLocal A01 = new ThreadLocal();
    public static final WeakHashMap A02 = new WeakHashMap(0);

    public static ColorStateList A00(Context context, int i) {
        WeakHashMap weakHashMap;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        int next;
        C07690Zd r2;
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        Object obj = A00;
        synchronized (obj) {
            weakHashMap = A02;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(context);
            colorStateList = null;
            if (!(sparseArray == null || sparseArray.size() <= 0 || (r2 = (C07690Zd) sparseArray.get(i)) == null)) {
                if (r2.A01.equals(context.getResources().getConfiguration())) {
                    colorStateList2 = r2.A00;
                } else {
                    sparseArray.remove(i);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        Resources resources = context.getResources();
        ThreadLocal threadLocal = A01;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            z = false;
        }
        if (!z) {
            Resources resources2 = context.getResources();
            XmlResourceParser xml = resources2.getXml(i);
            try {
                Resources.Theme theme = context.getTheme();
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        colorStateList = AnonymousClass0N2.A0S(resources2, xml, asAttributeSet, theme);
                    }
                } while (next != 1);
                throw new XmlPullParserException("No start tag found");
            } catch (Exception e) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList == null) {
            return C004302a.A02(context, i);
        }
        synchronized (obj) {
            SparseArray sparseArray2 = (SparseArray) weakHashMap.get(context);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap.put(context, sparseArray2);
            }
            sparseArray2.append(i, new C07690Zd(colorStateList, context.getResources().getConfiguration()));
        }
        return colorStateList;
    }

    public static Drawable A01(Context context, int i) {
        return AnonymousClass0TZ.A01().A05(context, i);
    }
}
