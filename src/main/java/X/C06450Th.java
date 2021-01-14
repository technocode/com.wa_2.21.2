package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

/* renamed from: X.0Th  reason: invalid class name and case insensitive filesystem */
public class C06450Th extends LayoutInflater {
    public static final String[] A01 = {"android.widget.", "android.webkit."};
    public final AnonymousClass01X A00;

    public C06450Th(AnonymousClass01X r1, LayoutInflater layoutInflater, Context context) {
        super(layoutInflater, context);
        this.A00 = r1;
    }

    public LayoutInflater cloneInContext(Context context) {
        return new C06450Th(this.A00, this, context);
    }

    @Override // android.view.LayoutInflater
    public View inflate(int i, ViewGroup viewGroup, boolean z) {
        View inflate = super.inflate(i, viewGroup, z);
        AnonymousClass01X r4 = this.A00;
        if (!(inflate instanceof AbstractC06460Ti)) {
            if (!z || inflate.getTag(R.id.bidilayout_ignore) == null) {
                AnonymousClass0SE.A04(r4, inflate);
            } else if (inflate instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) inflate;
                int childCount = viewGroup2.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    AnonymousClass0SE.A04(r4, viewGroup2.getChildAt(i2));
                }
            }
            inflate.setTag(R.id.bidilayout_ignore, AnonymousClass0SE.A00);
        }
        return inflate;
    }

    @Override // android.view.LayoutInflater
    public View onCreateView(String str, AttributeSet attributeSet) {
        for (String str2 : A01) {
            try {
                View createView = createView(str, str2, attributeSet);
                if (createView != null) {
                    return createView;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.onCreateView(str, attributeSet);
    }
}
