package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0Te  reason: invalid class name and case insensitive filesystem */
public class C06420Te implements AbstractC06400Tc {
    @Override // X.AbstractC06400Tc
    public Drawable A3J(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            return AnonymousClass23K.A00(context, context.getResources(), xmlPullParser, attributeSet, theme);
        } catch (Exception e) {
            Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
            return null;
        }
    }
}
