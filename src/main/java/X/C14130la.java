package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0la  reason: invalid class name and case insensitive filesystem */
public class C14130la {
    public int A00 = -1;
    public int A01;
    public C14210li A02;
    public ArrayList A03 = new ArrayList();

    public C14130la(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C14240ll.A0s);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.A01 = obtainStyledAttributes.getResourceId(index, this.A01);
            } else if (index == 1) {
                this.A00 = obtainStyledAttributes.getResourceId(index, this.A00);
                String resourceTypeName = context.getResources().getResourceTypeName(this.A00);
                context.getResources().getResourceName(this.A00);
                if ("layout".equals(resourceTypeName)) {
                    C14210li r1 = new C14210li();
                    this.A02 = r1;
                    r1.A03(context, this.A00);
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
