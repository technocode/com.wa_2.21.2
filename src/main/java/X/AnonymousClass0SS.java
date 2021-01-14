package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: X.0SS  reason: invalid class name */
public class AnonymousClass0SS implements LayoutInflater.Factory2 {
    public final AnonymousClass0LW A00;

    public AnonymousClass0SS(AnonymousClass0LW r1) {
        this.A00 = r1;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        int i;
        AnonymousClass0LW r8;
        AnonymousClass0SZ r1;
        if (AnonymousClass0Ts.class.getName().equals(str)) {
            return new AnonymousClass0Ts(context, attributeSet, this.A00);
        }
        AnonymousClass037 r5 = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15330nu.A03);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            ClassLoader classLoader = context.getClassLoader();
            try {
                AnonymousClass05W r7 = AnonymousClass0SZ.A00;
                Class<?> cls = (Class) r7.getOrDefault(attributeValue, null);
                if (cls == null) {
                    cls = Class.forName(attributeValue, false, classLoader);
                    r7.put(attributeValue, cls);
                }
                z = AnonymousClass037.class.isAssignableFrom(cls);
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                if (view != null) {
                    i = view.getId();
                } else {
                    i = 0;
                }
                if (i == -1 && resourceId == -1 && string == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(attributeSet.getPositionDescription());
                    sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                    sb.append(attributeValue);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (resourceId != -1) {
                    r5 = this.A00.A06(resourceId);
                }
                if (r5 == null && string != null) {
                    r5 = this.A00.A0Q.A01(string);
                }
                if (r5 == null && i != -1) {
                    r5 = this.A00.A06(i);
                }
                if (AnonymousClass0LW.A01(2)) {
                    StringBuilder A0S = AnonymousClass008.A0S("onCreateView: id=0x");
                    A0S.append(Integer.toHexString(resourceId));
                    A0S.append(" fname=");
                    A0S.append(attributeValue);
                    A0S.append(" existing=");
                    A0S.append(r5);
                    Log.v("FragmentManager", A0S.toString());
                }
                if (r5 == null) {
                    r8 = this.A00;
                    AnonymousClass037 r0 = r8.A02;
                    if (r0 != null) {
                        r1 = r0.A0H.A07();
                    } else {
                        r1 = r8.A06;
                    }
                    r5 = r1.A00(context.getClassLoader(), attributeValue);
                    r5.A0X = true;
                    int i2 = i;
                    if (resourceId != 0) {
                        i2 = resourceId;
                    }
                    r5.A03 = i2;
                    r5.A02 = i;
                    r5.A0Q = string;
                    r5.A0b = true;
                    r5.A0H = r8;
                    r5.A0F = r8.A04;
                    r5.A0H();
                    r8.A0P(r5);
                    r8.A0d(r5, r8.A00);
                } else if (!r5.A0b) {
                    r5.A0b = true;
                    r8 = this.A00;
                    r5.A0F = r8.A04;
                    r5.A0H();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(attributeSet.getPositionDescription());
                    sb2.append(": Duplicate id 0x");
                    sb2.append(Integer.toHexString(resourceId));
                    sb2.append(", tag ");
                    sb2.append(string);
                    sb2.append(", or parent id 0x");
                    sb2.append(Integer.toHexString(i));
                    sb2.append(" with another fragment for ");
                    sb2.append(attributeValue);
                    throw new IllegalArgumentException(sb2.toString());
                }
                int i3 = r8.A00;
                if (i3 >= 1 || !r5.A0X) {
                    r8.A0d(r5, i3);
                } else {
                    r8.A0d(r5, 1);
                }
                View view2 = r5.A0A;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (r5.A0A.getTag() == null) {
                        r5.A0A.setTag(string);
                    }
                    return r5.A0A;
                }
                throw new IllegalStateException(AnonymousClass008.A0L("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
