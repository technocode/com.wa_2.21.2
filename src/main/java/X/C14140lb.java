package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0lb  reason: invalid class name and case insensitive filesystem */
public class C14140lb {
    public float A00 = Float.NaN;
    public float A01 = Float.NaN;
    public float A02 = Float.NaN;
    public float A03 = Float.NaN;
    public int A04 = -1;
    public C14210li A05;

    public C14140lb(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C14240ll.A11);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.A04 = obtainStyledAttributes.getResourceId(index, this.A04);
                String resourceTypeName = context.getResources().getResourceTypeName(this.A04);
                context.getResources().getResourceName(this.A04);
                if ("layout".equals(resourceTypeName)) {
                    C14210li r1 = new C14210li();
                    this.A05 = r1;
                    r1.A03(context, this.A04);
                }
            } else if (index == 1) {
                this.A00 = obtainStyledAttributes.getDimension(index, this.A00);
            } else if (index == 2) {
                this.A02 = obtainStyledAttributes.getDimension(index, this.A02);
            } else if (index == 3) {
                this.A01 = obtainStyledAttributes.getDimension(index, this.A01);
            } else if (index == 4) {
                this.A03 = obtainStyledAttributes.getDimension(index, this.A03);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
