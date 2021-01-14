package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

/* renamed from: X.3Wa  reason: invalid class name and case insensitive filesystem */
public class C73243Wa extends FrameLayout implements AnonymousClass3BR {
    public int A00;
    public int A01;
    public Object A02;
    public ArrayList A03;
    public final AnonymousClass01X A04 = AnonymousClass01X.A00();

    public C73243Wa(Context context) {
        super(context);
    }

    public void A00(ArrayList arrayList, AnonymousClass3BX r5) {
        this.A03 = arrayList;
        addView((View) arrayList.get(0));
        ((C73263Wc) this.A03.get(0)).A0B = r5;
        this.A00 = 0;
        this.A01 = getResources().getDisplayMetrics().widthPixels;
        int i = 1;
        while (true) {
            ArrayList arrayList2 = this.A03;
            if (i < arrayList2.size()) {
                C73263Wc r1 = (C73263Wc) arrayList2.get(i);
                r1.A0B = r5;
                r1.setX((float) this.A01);
                addView(r1);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // X.AnonymousClass3BR
    public boolean A4L() {
        ArrayList arrayList;
        String inputValue = ((C73263Wc) this.A03.get(this.A00)).getInputValue();
        ArrayList arrayList2 = this.A03;
        int i = this.A00;
        boolean z = false;
        if (((C73263Wc) arrayList2.get(i)).A00 != inputValue.length()) {
            ((View) arrayList2.get(i)).requestFocus();
            return false;
        } else if (i == arrayList2.size() - 1) {
            ((View) arrayList2.get(i)).requestFocus();
            int i2 = 0;
            while (true) {
                ArrayList arrayList3 = this.A03;
                if (i2 >= arrayList3.size()) {
                    return true;
                }
                if (!((C73263Wc) arrayList3.get(i2)).getInputValue().equals(inputValue)) {
                    int i3 = 0;
                    while (true) {
                        arrayList = this.A03;
                        if (i3 >= arrayList.size()) {
                            break;
                        }
                        ((C73263Wc) arrayList.get(i3)).setText("");
                        i3++;
                    }
                    int i4 = this.A00;
                    if (i4 != 0) {
                        ((View) arrayList.get(i4)).animate().x((float) this.A01);
                        ((View) this.A03.get(this.A00 - 1)).animate().x(0.0f);
                        int i5 = this.A00 - 1;
                        this.A00 = i5;
                        ((View) this.A03.get(i5)).requestFocus();
                    }
                    ((C73263Wc) this.A03.get(i2)).A0B.AGM(this, this.A04.A06(R.string.npci_info_pins_dont_match));
                    return false;
                }
                i2++;
            }
        } else {
            if (i < arrayList2.size() - 1) {
                ((View) arrayList2.get(i)).animate().x((float) (-this.A01));
                ((View) this.A03.get(this.A00 + 1)).animate().x(0.0f);
                int i6 = this.A00 + 1;
                this.A00 = i6;
                ((View) this.A03.get(i6)).requestFocus();
                z = true;
            }
            return !z;
        }
    }

    @Override // X.AnonymousClass3BR
    public void AQf(String str, Drawable drawable, View.OnClickListener onClickListener, int i, boolean z, boolean z2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A03;
            if (i2 < arrayList.size()) {
                ((C73263Wc) arrayList.get(i2)).AQf(str, drawable, onClickListener, i, z, z2);
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // X.AnonymousClass3BR
    public boolean AQg() {
        return ((C73263Wc) this.A03.get(this.A00)).AQg();
    }

    @Override // X.AnonymousClass3BR
    public Object getFormDataTag() {
        Object obj = this.A02;
        return obj == null ? ((C73263Wc) this.A03.get(0)).getFormDataTag() : obj;
    }

    @Override // X.AnonymousClass3BR
    public String getInputValue() {
        return ((C73263Wc) this.A03.get(0)).getInputValue();
    }

    public void setFormDataTag(Object obj) {
        this.A02 = obj;
    }

    @Override // X.AnonymousClass3BR
    public void setText(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A03;
            if (i < arrayList.size()) {
                ((C73263Wc) arrayList.get(i)).setText(str);
                i++;
            } else {
                return;
            }
        }
    }
}
