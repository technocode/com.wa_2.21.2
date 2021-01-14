package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0Td  reason: invalid class name and case insensitive filesystem */
public class C06410Td implements AbstractC06400Tc {
    @Override // X.AbstractC06400Tc
    public Drawable A3J(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            Resources resources = context.getResources();
            AnonymousClass24Q r0 = new AnonymousClass24Q(context);
            r0.inflate(resources, xmlPullParser, attributeSet, theme);
            return r0;
        } catch (Exception e) {
            Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
            return null;
        }
    }
}
