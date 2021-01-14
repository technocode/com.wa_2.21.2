package androidx.constraintlayout.widget;

import X.AbstractC06500To;
import X.AbstractC14220lj;
import X.AnonymousClass0WA;
import X.AnonymousClass0WB;
import X.AnonymousClass0WC;
import X.AnonymousClass0WD;
import X.C06490Tl;
import X.C14150lc;
import X.C14160ld;
import X.C14210li;
import X.C14240ll;
import X.C29811aE;
import X.C29851aI;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintLayout extends ViewGroup {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public SparseArray A08 = new SparseArray();
    public SparseArray A09;
    public AnonymousClass0WA A0A;
    public C29851aI A0B;
    public C14150lc A0C;
    public C14210li A0D;
    public ArrayList A0E = new ArrayList(4);
    public HashMap A0F;
    public boolean A0G;

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass0WA r2 = new AnonymousClass0WA();
        this.A0A = r2;
        this.A06 = 0;
        this.A05 = 0;
        this.A04 = Integer.MAX_VALUE;
        this.A03 = Integer.MAX_VALUE;
        this.A0G = true;
        this.A07 = 263;
        this.A0D = null;
        this.A0C = null;
        this.A00 = -1;
        this.A0F = new HashMap();
        this.A02 = -1;
        this.A01 = -1;
        this.A09 = new SparseArray();
        C29851aI r1 = new C29851aI(this);
        this.A0B = r1;
        r2.A0e = this;
        r2.A06 = r1;
        r2.A08.A03 = r1;
        this.A08.put(getId(), this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C14240ll.A0I, 0, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 9) {
                    this.A06 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A06);
                } else if (index == 10) {
                    this.A05 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A05);
                } else if (index == 7) {
                    this.A04 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A04);
                } else if (index == 8) {
                    this.A03 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A03);
                } else if (index == 89) {
                    this.A07 = obtainStyledAttributes.getInt(index, this.A07);
                } else if (index == 38) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.A0C = new C14150lc(getContext(), resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.A0C = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C14210li r10 = new C14210li();
                        this.A0D = r10;
                        Context context2 = getContext();
                        XmlResourceParser xml = context2.getResources().getXml(resourceId2);
                        try {
                            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                                if (eventType == 0) {
                                    xml.getName();
                                } else if (eventType == 2) {
                                    String name = xml.getName();
                                    C14160ld A012 = C14210li.A01(context2, Xml.asAttributeSet(xml));
                                    if (name.equalsIgnoreCase("Guideline")) {
                                        A012.A02.A0y = true;
                                    }
                                    r10.A00.put(Integer.valueOf(A012.A00), A012);
                                }
                            }
                        } catch (XmlPullParserException e) {
                            e.printStackTrace();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    } catch (Resources.NotFoundException unused2) {
                        this.A0D = null;
                    }
                    this.A00 = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        AnonymousClass0WA r0 = this.A0A;
        int i2 = this.A07;
        r0.A01 = i2;
        AnonymousClass0WD.A0F = (i2 & 256) == 256;
    }

    public final AnonymousClass0WC A00(View view) {
        if (view == this) {
            return this.A0A;
        }
        if (view == null) {
            return null;
        }
        return ((C06490Tl) view.getLayoutParams()).A0r;
    }

    public boolean A01() {
        if (Build.VERSION.SDK_INT < 17 || (getContext().getApplicationInfo().flags & 4194304) == 0 || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C06490Tl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r24) {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public void forceLayout() {
        this.A0G = true;
        this.A02 = -1;
        this.A01 = -1;
        super.forceLayout();
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C06490Tl();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C06490Tl(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C06490Tl(layoutParams);
    }

    public int getMaxHeight() {
        return this.A03;
    }

    public int getMaxWidth() {
        return this.A04;
    }

    public int getMinHeight() {
        return this.A05;
    }

    public int getMinWidth() {
        return this.A06;
    }

    public int getOptimizationLevel() {
        return this.A0A.A01;
    }

    private int getPaddingWidth() {
        int max;
        return (Build.VERSION.SDK_INT < 17 || (max = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart())) <= 0) ? Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft()) : max;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            C06490Tl r2 = (C06490Tl) childAt.getLayoutParams();
            AnonymousClass0WC r5 = r2.A0r;
            if (childAt.getVisibility() != 8 || r2.A0x || r2.A0y || isInEditMode) {
                int A022 = r5.A02();
                int A032 = r5.A03();
                childAt.layout(A022, A032, r5.A01() + A022, r5.A00() + A032);
            }
        }
        int size = this.A0E.size();
        if (size > 0) {
            do {
                AbstractC06500To r1 = (AbstractC06500To) this.A0E.get(i5);
                if (r1 instanceof Group) {
                    AnonymousClass0WC r12 = ((C06490Tl) r1.getLayoutParams()).A0r;
                    r12.A09(0);
                    r12.A08(0);
                }
                i5++;
            } while (i5 < size);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 880
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:72)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:46)
        */
    public void onMeasure(int r32, int r33) {
        /*
        // Method dump skipped, instructions count: 4206
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        AnonymousClass0WC A002 = A00(view);
        if ((view instanceof Guideline) && !(A002 instanceof C29811aE)) {
            C06490Tl r0 = (C06490Tl) view.getLayoutParams();
            C29811aE r1 = new C29811aE();
            r0.A0r = r1;
            r0.A0x = true;
            r1.A0I(r0.A0b);
        }
        if (view instanceof AbstractC06500To) {
            AbstractC06500To r12 = (AbstractC06500To) view;
            r12.A02();
            ((C06490Tl) view.getLayoutParams()).A0y = true;
            if (!this.A0E.contains(r12)) {
                this.A0E.add(r12);
            }
        }
        this.A08.put(view.getId(), view);
        this.A0G = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.A08.remove(view.getId());
        AnonymousClass0WC A002 = A00(view);
        ((AnonymousClass0WB) this.A0A).A00.remove(A002);
        A002.A0Z = null;
        this.A0E.remove(view);
        this.A0G = true;
    }

    public void requestLayout() {
        this.A0G = true;
        this.A02 = -1;
        this.A01 = -1;
        super.requestLayout();
    }

    public void setConstraintSet(C14210li r1) {
        this.A0D = r1;
    }

    public void setId(int i) {
        this.A08.remove(getId());
        super.setId(i);
        this.A08.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.A03) {
            this.A03 = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.A04) {
            this.A04 = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.A05) {
            this.A05 = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.A06) {
            this.A06 = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(AbstractC14220lj r1) {
    }

    public void setOptimizationLevel(int i) {
        this.A07 = i;
        this.A0A.A01 = i;
        boolean z = false;
        if ((i & 256) == 256) {
            z = true;
        }
        AnonymousClass0WD.A0F = z;
    }
}
