package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0Tb  reason: invalid class name and case insensitive filesystem */
public class C06390Tb implements AbstractC06400Tc {
    @Override // X.AbstractC06400Tc
    public Drawable A3J(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            Resources resources = context.getResources();
            AnonymousClass0V9 r0 = new AnonymousClass0V9();
            r0.inflate(resources, xmlPullParser, attributeSet, theme);
            return r0;
        } catch (Exception e) {
            Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
            return null;
        }
    }
}
