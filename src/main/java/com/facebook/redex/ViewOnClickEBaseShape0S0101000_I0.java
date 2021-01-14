package com.facebook.redex;

import X.AnonymousClass1Y7;
import X.AnonymousClass2C0;
import X.C002001d;
import X.C006803i;
import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.provider.MediaStore;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.DescribeProblemActivity;
import com.whatsapp.PagerSlidingTabStrip;
import com.whatsapp.Remove;
import java.util.ArrayList;

public class ViewOnClickEBaseShape0S0101000_I0 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public int A00;
    public Object A01;
    public final int A02;

    public ViewOnClickEBaseShape0S0101000_I0(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public final void onClick(View view) {
        Intent labeledIntent;
        switch (this.A02) {
            case 0:
                DescribeProblemActivity describeProblemActivity = (DescribeProblemActivity) this.A01;
                int i = this.A00;
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(new AnonymousClass1Y7(new Intent("android.intent.action.PICK", MediaStore.Images.Media.INTERNAL_CONTENT_URI).setType("image/*")));
                if (describeProblemActivity.A09[i] != null) {
                    arrayList.add(new AnonymousClass1Y7(new Intent(describeProblemActivity, Remove.class), ((AnonymousClass2C0) describeProblemActivity).A01.A06(R.string.title_remove)));
                }
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                Intent intent = ((AnonymousClass1Y7) arrayList.get(0)).A01;
                C006803i.A0S(intent);
                arrayList2.add(intent);
                for (int i2 = 1; i2 < size; i2++) {
                    AnonymousClass1Y7 r11 = (AnonymousClass1Y7) arrayList.get(i2);
                    String str = r11.A02;
                    if (str == null) {
                        labeledIntent = r11.A01;
                    } else {
                        Intent intent2 = r11.A01;
                        labeledIntent = new LabeledIntent(new Intent().setComponent(intent2.resolveActivity(describeProblemActivity.getPackageManager())).setData(intent2.getData()).putExtras(intent2), describeProblemActivity.getPackageName(), str, r11.A00);
                    }
                    C006803i.A0S(labeledIntent);
                    arrayList2.add(labeledIntent);
                }
                describeProblemActivity.startActivityForResult(C002001d.A0S(arrayList2, null, null), i | 16);
                return;
            case 1:
                ((PagerSlidingTabStrip) this.A01).A0N.setCurrentItem(this.A00);
                return;
            default:
                return;
        }
    }
}
