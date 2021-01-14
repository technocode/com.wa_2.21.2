package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.0To  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC06500To extends View {
    public int A00;
    public Context A01;
    public AbstractC14000lM A02;
    public String A03;
    public HashMap A04;
    public int[] A05;

    public void A05(AnonymousClass0WC r1, boolean z) {
    }

    public void onDraw(Canvas canvas) {
    }

    public AbstractC06500To(Context context) {
        super(context);
        this.A05 = new int[32];
        this.A04 = new HashMap();
        this.A01 = context;
        A04(null);
    }

    public AbstractC06500To(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A05 = new int[32];
        this.A04 = new HashMap();
        this.A01 = context;
        A04(attributeSet);
    }

    public final int A00(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || (resources = this.A01.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void A01() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            A06((ConstraintLayout) parent);
        }
    }

    public void A02() {
        if (this.A02 != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof C06490Tl) {
                ((C06490Tl) layoutParams).A0r = (AnonymousClass0WC) this.A02;
            }
        }
    }

    public final void A03(int i) {
        if (i != getId()) {
            int i2 = this.A00 + 1;
            int[] iArr = this.A05;
            int length = iArr.length;
            if (i2 > length) {
                iArr = Arrays.copyOf(iArr, length << 1);
                this.A05 = iArr;
            }
            int i3 = this.A00;
            iArr[i3] = i;
            this.A00 = i3 + 1;
        }
    }

    public void A04(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C14240ll.A0I);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.A03 = string;
                    setIds(string);
                }
            }
        }
    }

    public void A06(ConstraintLayout constraintLayout) {
        float f;
        int visibility = getVisibility();
        if (Build.VERSION.SDK_INT >= 21) {
            f = getElevation();
        } else {
            f = 0.0f;
        }
        for (int i = 0; i < this.A00; i++) {
            View view = (View) constraintLayout.A08.get(this.A05[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (f > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    view.setTranslationZ(view.getTranslationZ() + f);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (r2 != 0) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        if (r2 == 0) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        if (r4 != null) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC06500To.A07(java.lang.String):void");
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.A05, this.A00);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.A03;
        if (str != null) {
            setIds(str);
        }
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.A03 = str;
        if (str != null) {
            int i = 0;
            this.A00 = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    A07(str.substring(i));
                    return;
                } else {
                    A07(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.A03 = null;
        this.A00 = 0;
        for (int i : iArr) {
            A03(i);
        }
    }
}
